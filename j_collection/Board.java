package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호, 제목, 내용, 작성자, 작성일
		 * 
		 * 목룍 - 조회(상세), 등록
		 * 조회 - 수정, 삭제
		 */

//		ArrayList<HashMap<String, Object>> boardTable = new ArrayList<HashMap<String, Object>>();
//		HashMap<String, Object> board = new HashMap<String, Object>();
//		board.put("작성자", "이유정");
//		board.put("제목", "JAVA");
//		board.put("번호", 1);
//		board.put("작성일", new Date());
//		board.put("내용", "혼자 공부하는 JAVA");
//		boardTable.add(board);
//
//		while (true) {
//			int count = 1; // 게시판 번호
//			System.out.println("1.조회하기 2.등록하기 ");
//			// 게시판 목록 출력
//			System.out.println("제목 / 작성자 / 작성일");
//			Object getNum = null;
//			Object getTitle = null;
//			Object getWriter = null;
//			Object getDate = null;
//			for (int i = 0; i < boardTable.size(); i++) {
//				board = boardTable.get(i);
//				for (String key : board.keySet()) {
//					if (key.equals("번호")) {
//						board.put(key, i + 1);
//						getNum = board.get(key);
//					} else if (key.equals("제목")) {
//						getTitle = board.get(key);
//					} else if (key.equals("작성자")) {
//						getWriter = board.get(key);
//					} else if (key.equals("작성일")) {
//						getDate = board.get(key);
//					}
//				}
//				System.out.print(i + 1 + "." + getTitle + "\t");
//				System.out.print(getWriter + "\t");
//				System.out.print(getDate);
//				System.out.println();
//			}
//			int input = ScanUtil.nextInt();
//			if (input == 2) { // 등록
//				board = new HashMap<String, Object>();
//				board.put("번호", count);
//				System.out.println("제목을 입력하세요");
//				String str = ScanUtil.nextLine();
//				board.put("제목", str);
//				System.out.println("내용을 입력하세요");
//				str = ScanUtil.nextLine();
//				board.put("내용", str);
//				System.out.println("작성자을 입력하세요");
//				str = ScanUtil.nextLine();
//				board.put("작성자", str);
//				board.put("작성일", new Date());
//
//				boardTable.add(board);
//				System.out.println(boardTable);
//
//			} else if (input == 1) { // 상세조회
//				System.out.println("조회하고 싶은 글의 번호를 입력해주세요");
//				input = ScanUtil.nextInt();
//				Object getMore = null;
//				for (int i = 0; i < boardTable.size(); i++) {
//					board = boardTable.get(i);
//					for (String key : board.keySet()) {
//						if (i == input - 1) {
//							if (key.equals("번호")) {
//								getNum = board.get(key);
//							} else if (key.equals("제목")) {
//								getTitle = board.get(key);
//							} else if (key.equals("작성자")) {
//								getWriter = board.get(key);
//							} else if (key.equals("작성일")) {
//								getDate = board.get(key);
//							} else if (key.equals("내용")) {
//								getMore = board.get(key);
//							}
//						}
//					}
//				}
//				System.out.println("==================== 상세 조회 =======================");
//				System.out.println("1.수정 2.삭제 3.나가기(아무키나)");
//				System.out.println(getNum + "." + getTitle + "\t");
//				System.out.println("작성자 : " + getWriter + "\t 작성일:" + getDate);
//				System.out.println(getMore);
//				System.out.println("======================================================");
//				int num = ScanUtil.nextInt();
//				if(num == 1) {//수정
//				    System.out.println(getNum +"번 게시글 수정");
//					System.out.println("제목을 입력하세요");
//					String str = ScanUtil.nextLine();
//					board.put("제목", str);
//					System.out.println("내용을 입력하세요");
//					str = ScanUtil.nextLine();
//					board.put("내용", str);
//					System.out.println("작성자을 입력하세요");
//					str = ScanUtil.nextLine();
//					board.put("작성자", str);
//					board.put("수정일", new Date());
//					System.out.println("수정 완료");
//				}else if(num == 2) {//삭제 
//					System.out.println(getNum +"번 게시글 삭제");
//				    boardTable.remove(input - 1);
//					System.out.println("삭제 완료");
//				}
//			}
//
//		}
		new Board().start();
	}
	
	ArrayList<HashMap<String, Object>> boardTable = new ArrayList<HashMap<String, Object>>();
	SimpleDateFormat format = new SimpleDateFormat("MM-dd"); // 날짜 월, 일만 나오게
	
	void start() {
		while (true) {
			System.out.println("=====================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			for (int i = boardTable.size() - 1; i >= 0; i--) {  //최근에 등록한 게시물이 맨 위로 오도록
				System.out.println("------------------------------------");
				HashMap<String, Object> board = boardTable.get(i);
				System.out.println(board.get("BOARD_NO") + "\t" + board.get("TITLE") + "\t" + board.get("USER_NAME") +
						           "\t" + format.format(board.get("REG_DATE")));
			}
			System.out.println("=====================================");
			
			System.out.print("1. 조회   2. 등록   0. 종료>");
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

	private void insert() { // 등록
		HashMap<String, Object> board = new HashMap<String, Object>();
		
		int max = 0;
		for(int i = 0; i < boardTable.size(); i++) {  // 현재 게시판에서 가장 큰 번호 구하기
			if(max < (int)boardTable.get(i).get("BOARD_NO")) {
				max = (int)boardTable.get(i).get("BOARD_NO");
			}
		}
		
		board.put("BOARD_NO", max + 1); // 현재 게시판에서 가장 큰 번호 + 1 
		
		System.out.print("제목>");
		board.put("TITLE", ScanUtil.nextLine());
		
		System.out.print("내용>");	
		board.put("CONTENT", ScanUtil.nextLine());
		
		System.out.print("작성자>");	
		board.put("USER_NAME", ScanUtil.nextLine());
		
		board.put("REG_DATE", new Date()); // 현재 날짜 저장
		
		boardTable.add(board);
		System.out.println(boardTable);
		System.out.println("게시글이 등록되었습니다.");
	}

	private void read() { // 조회
		System.out.print("조회할 게시물 번호>");
		int boardNo = ScanUtil.nextInt(); 
		
		HashMap<String, Object> board = null;	
		for(int i = 0; i < boardTable.size(); i++) {  // 사용자가 입력한 번호와 테이블에 있는 번호 중 같은 걸 찾아서 변수 board에 저장
			if(boardNo == (int)(boardTable.get(i).get("BOARD_NO"))) {
				board = boardTable.get(i);
				break; // 덜 돌기 위해서 찾으면 break걸기
			}
		}
		
		System.out.println("===================================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("-----------------------------------");
		System.out.println("작성자\t: " + board.get("USER_NAME"));
		System.out.println("-----------------------------------");
		System.out.println("작성일\t: " + format.format(board.get("REG_DATE")));
		System.out.println("-----------------------------------");
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("-----------------------------------");
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("===================================");
		
		System.out.print("1.수정   2.삭제   0.목록>");
		int input = ScanUtil.nextInt();

		switch (input) {
		case 1:
			update(board); // 파라미터 넣는 이유 : 뭘 수정할것인지 생각 -> board 필요
			break;
		case 2:
			delete(board);
			break;
		case 0:
			break;
		}
	}

	private void delete(HashMap<String, Object> board) { // 테이블에 있는 내용을 찾아서 삭제
		System.out.print("정말 삭제 하시겠습니까?(Y/N)>");
		String input = ScanUtil.nextLine();

		if (input.equals("Y")) {
			for (int i = 0; i < boardTable.size(); i++) {
				if (board.get("BOARD_NO") == boardTable.get(i).get("BOARD_NO")) {
					boardTable.remove(i);
					System.out.println("게시글이 삭제되었습니다.");
					break;
				}
			}
		}
	}

	private void update(HashMap<String, Object> board) { // 덮어쓰기식으로 수정
		System.out.print("제목>");
		board.put("TITLE", ScanUtil.nextLine());
		System.out.print("내용>");
		board.put("CONTENT", ScanUtil.nextLine());

		System.out.println("게시글이 수정되었습니다.");
	}
}
