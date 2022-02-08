package k_jdbc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class Practice {
	
	public static void main(String[] args) {
		
		new Practice().start();
	}

	List<Map<String, Object>> boardTable = new ArrayList<Map<String, Object>>();
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	void start() {
		while (true) {
			System.out.println("=======================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			
			String sql = "select * from TB_JDBC_BOARD";
			
			boardTable = JDBCUtil.selectList(sql);
			
			for(int i = boardTable.size() - 1; i >= 0; i--) {
				System.out.println("---------------------------------------");
				Map<String, Object> board = boardTable.get(i);
				System.out.println(board.get("BOARD_NO") + "\t" + board.get("TITLE") + "\t"
				                   + board.get("MEM_ID") + "\t" + format.format(board.get("REG_DATE")));
			}
			
			System.out.println("=======================================");
			
			System.out.println("1. 조회   2. 등록   0. 종료>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
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
		String sql = "insert into TB_JDBC_BOARD values ((SELECT NVL(MAX(BOARD_NO), 0) + 1 from TB_JDBC_BOARD), ?, ?, ?, sysdate)";
		
		ArrayList<Object> param = new ArrayList<Object>();
		
		System.out.print("제목>");
		param.add(ScanUtil.nextLine());
		
		System.out.print("내용>");
		param.add(ScanUtil.nextLine());
		
		System.out.print("작성자>");
		param.add(ScanUtil.nextLine());
		
		int result = JDBCUtil.update(sql, param);
		
		System.out.println(result + " 개의 게시글이 추가되었습니다.");
		System.out.println();
	}

	private void read() {
		String sql = "select * "
				+ " from TB_JDBC_BOARD "
				+ " where BOARD_NO = ? ";
		
		System.out.print("조회할 게시물 번호>");
		int boardNo = ScanUtil.nextInt();
		
		ArrayList<Object> param = new ArrayList<Object>();
		
		param.add(boardNo);
		
		Map<String,Object> board = JDBCUtil.selectOne(sql, param);
		
		System.out.println("===================================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("-----------------------------------");
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("-----------------------------------");
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("-----------------------------------");
		System.out.println("작성자\t: " + board.get("MEM_ID"));
		System.out.println("-----------------------------------");
		System.out.println("작성일\t: " + format.format(board.get("REG_DATE")));
		System.out.println("===================================");
		
		System.out.print("1. 수정   2. 삭제   0. 목록>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1:
			update(boardNo);
			break;
		case 2:
			delete(boardNo);
			break;
		case 0:
			break;
		}
		
	}

	private void delete(int boardNo) {
		System.out.println("정말 삭제 하시겠습니까?(Y/N)>");
		String input = ScanUtil.nextLine();
		
		if (input.equals("Y")) {
			String sql = "delete "
					+ " from TB_JDBC_BOARD "
					+ " where BOARD_NO = ?";
			
			ArrayList<Object> param = new ArrayList<Object>();
			param.add(boardNo);
			
			int result = JDBCUtil.update(sql, param);
			System.out.println(result + " 개의 게시글이 삭제되었습니다.");
			System.out.println();
		}
	}

	private void update(int boardNo) {
		String sql = "update TB_JDBC_BOARD"
			     + " set TITLE = ?"
			     + " , CONTENT = ?"
			     + " where BOARD_NO = ?";
		
		ArrayList<Object> param = new ArrayList<Object>();
		System.out.print("제목>");
		param.add(ScanUtil.nextLine());
		
		System.out.print("내용>");
		param.add(ScanUtil.nextLine());
		param.add(boardNo);
		
		int result = JDBCUtil.update(sql, param);
		System.out.println(result + " 개의 게시글이 수정되었습니다.");
		System.out.println();
	}
}
