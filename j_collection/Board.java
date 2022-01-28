package j_collection;

import java.util.ArrayList;
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

        ArrayList<HashMap<String, Object>> Table = new ArrayList<HashMap<String,Object>>(); 
		
		HashMap<String, Object> board = new HashMap<String, Object>();
	    System.out.println("============== 목 록 ==============");
		System.out.println(" 제목     이름   번호           작성일");
		board.put("번호", 1);
		board.put("제목", "Java");
//		board.put("내용", "혼자 공부하는 자바");
		board.put("작성자", "이유정");
		board.put("작성일", "2022/01/28");
		Table.add(board);
		
		board = new HashMap<String, Object>();
		board.put("번호", 2);
		board.put("제목", "Oracle");
//		board.put("내용", "혼자 공부하는 오라클");
		board.put("작성자", "강정인");
		board.put("작성일", "2022/02/01");
		Table.add(board);
		
		for(int i = 0; i < Table.size(); i++) {
			board = Table.get(i);
			for(String Key : board.keySet()) {
				System.out.print(board.get(Key) + "\t");
			}
			System.out.println();
		}
		
		System.out.print("                1. 조회      2. 등록>");
		int input = ScanUtil.nextInt();
		
		switch(input) {
		case 1:
			for(int i = 0; i < Table.size(); i++) {
				board = Table.get(i);
				for(String Key : board.keySet()) {
					System.out.println(board.get(Key) + "\t");
				}
				System.out.println();
			}
		case 2:
			
			
			
		}
		
		
	}

}
