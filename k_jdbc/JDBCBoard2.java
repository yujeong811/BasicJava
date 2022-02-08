package k_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import e_oop.ScanUtil;

public class JDBCBoard2 {

	public static void main(String[] args) {

		new JDBCBoard2().start();
	}
	
	private void start() {
		while (true) {
			String sql = "SELECT A.BOARD_NO "
					+ "        , A.TITLE"
					+ "        , B.MEM_NAME"
					+ "        , TO_CHAR(A.REG_DATE, 'MM/DD') AS REG_DATE"
					+ "     FROM TB_JDBC_BOARD A"
					+ "     LEFT OUTER JOIN MEMBER B ON A.MEM_ID = B.MEM_ID" 
					+ "    ORDER BY A.BOARD_NO DESC";
			// inner join을 사용하는 경우는 많지 않음 90%로 이상이 outer join
			// 주로 조회하고 싶은 데이터가 기준이 됨 -> 그래서 left를 사용
			List<Map<String, Object>> boardList = JDBCUtil.selectList(sql);		
			
			System.out.println("--------------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("--------------------------------------");
			for(Map<String, Object> board : boardList) { // 순서대로 하나씩 꺼내서 출력
				System.out.println(board.get("BOARD_NO")
						  + "\t" + board.get("TITLE")
						  + "\t" + board.get("MEM_NAME")
						  + "\t" + board.get("REG_DATE"));
			}
			System.out.println("--------------------------------------");
			
			System.out.print("1. 조회  2. 등록  0. 종료>");
			int input = ScanUtil.nextInt();
			switch(input) {
			case 1:
				read();
				break;
			case 2:
				insert();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
		}
	}

	private void insert() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("아이디>");
		String memId = ScanUtil.nextLine();
		
		String sql = "INSERT INTO TB_JDBC_BOARD "
				+ "   VALUES ("
				+ "       (SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
				+ "       , ?, ?, ?, SYSDATE"
				+ ")";
		
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(memId);
		
		if(0 < JDBCUtil.update(sql, param)) {
			System.out.println("게시글이 등록되었습니다.");
		} else {
			System.out.println("게시글이 등록되지 않았습니다.");
		}
	}

	private void read() {
		System.out.println("게시글 번호>");
		int boardNo = ScanUtil.nextInt();
		
		String sql = "SELECT A.BOARD_NO "
				+ "        , A.TITLE"
				+ "        , A.CONTENT"
				+ "        , B.MEM_NAME"
				+ "        , TO_CHAR(A.REG_DATE, 'MM/DD') AS REG_DATE"
				+ "     FROM TB_JDBC_BOARD A"
				+ "     LEFT OUTER JOIN MEMBER B ON A.MEM_ID = B.MEM_ID"
				+ "    WHERE A.BOARD_NO =?";
		
		List<Object> param =  new ArrayList<Object>();
		param.add(boardNo);
		
		Map<String, Object> board = JDBCUtil.selectOne(sql, param);
		System.out.println("--------------------------------------");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("작성자\t: " + board.get("MEM_NAME"));
		System.out.println("작성일\t: " + board.get("REG_DATE"));
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("--------------------------------------");
		
		System.out.print("1. 수정   2. 삭제   0. 목록");
		int input = ScanUtil.nextInt();
		switch(input) {
		case 1:
			update(boardNo);
			break;
		case 2:
			delete(boardNo);
			break;	
		}
	}

	private void update(int boardNo) {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();

		String sql = "UPDATE TB_JDBC_BOARD"
				+ "      SET TITLE = ?"
				+ "        , CONTENT = ?"
				+ "    WHERE BOARD_NO = ?";
		
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(boardNo);
		
		if(0 < JDBCUtil.update(sql, param)) {
			System.out.println("게시글이 수정되었습니다.");
		} else {
			System.out.println("게시글이 수정되지 않았습니다.");
		}
	}
	
	private void delete(int boardNo) {
		System.out.println("정말 삭제하시겠습니까?(Y/N)>");
		String yn = ScanUtil.nextLine();
		
		if(yn.equals("Y")) {
			String sql = "DELETE FROM TB_JDBC_BOARD"
					+ "    WHERE BOARD_NO = ?";
			
			List<Object> param = new ArrayList<Object>();
			param.add(boardNo);
			
			if(0 < JDBCUtil.update(sql, param)) {
				System.out.println("게시글이 삭제되었습니다.");
			} else {
				System.out.println("게시글이 삭제되지 않았습니다.");
			}
		}
		
	}

}
