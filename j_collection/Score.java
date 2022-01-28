package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100사이의 랜덤한 점수로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		ArrayList<String> stu = new ArrayList<String>(); // 학생 25명
		ArrayList<String> sub = new ArrayList<String>();
		
		ArrayList<ArrayList<Integer>> score = new ArrayList<ArrayList<Integer>>(); 
		
		String[] names = {"강동주", "강정인", "강현수", "곽성상", "김기웅"
						, "김민지", "김형돈", "노혜지", "박태정", "서난희"
						, "예현의", "오지현", "오혜지", "유정민", "이병진"
						, "이수민", "이슬기", "이유정", "이의찬", "이정규"
						, "이종민", "장문석", "정다영", "최민규", "최혁진"};

        String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};	
        
		for (int i = 0; i < 25; i++) {
			stu.add(names[i]);
		}

		for (int i = 0; i < 7; i++) {
			sub.add(subjects[i]);
		}
        
		for (int i = 0; i < 25; i++) {
			score.add(new ArrayList<Integer>());
			for (int j = 0; j < 7; j++) {
				score.get(i).add(j,(int)(Math.random() * 101));
			}
		}
		
		ArrayList<Integer> sum = new ArrayList<Integer>();
		ArrayList<Double> avg = new ArrayList<Double>();
		
		for(int i = 0; i < 25; i++) {
			int s = 0;		
			for (int j = 0; j < 7; j++) {
				s += score.get(i).get(j);
			}
			sum.add(s);
			avg.add(Math.round((double)(s) / 7 * 100) / 100.0);
		}
		
		ArrayList<Integer> subSum = new ArrayList<Integer>();
		ArrayList<Double> subAvg = new ArrayList<Double>();
		
		for(int i = 0; i < 7; i++) {
			int ss = 0;
			for (int j = 0; j < 25; j++) {
				ss += score.get(j).get(i);
			}
			subSum.add(ss);
			subAvg.add(Math.round((double)(ss) / 25 * 100) / 100.0);
		}
		
		ArrayList<Integer> rank = new ArrayList<Integer>();	
		for(int i = 0; i < 25; i++) {
			int count = 1;
			for(int j = 0; j < 25; j++) {
				if (sum.get(i) < sum.get(j)) {
					count++;
				}
			}
			rank.add(count);
		}
		
		for(int i = 0; i < 24; i++) { // 선택정렬
			int min = i;
			for(int j = i + 1; j < 25; j++) {
				if(rank.get(j) < rank.get(min)) {
					min = j; // 자리를 기억한다
				}
					
//			ArrayList<Integer> temp = score.get(i);
//			score.set(i, score.get(min));
//			score.set(min, temp);
			
//			int temp2 = sum.get(i);
//			sum.set(i, sum.get(min));
//			sum.set(min, temp2);
//			
//			
//			double temp3 = avg.get(i);
//			avg.set(i, avg.get(min));
//			avg.set(min, temp3);		
//		
//			int temp4 = rank.get(i);
//			rank.set(i, rank.get(min));
//			rank.set(min, temp4);
//
//			String temp5 = stu.get(i);
//			stu.set(i, stu.get(min));
//			stu.set(min, temp5);
					
			}
			stu.set(i, stu.set(min, stu.get(i)));
			score.set(i, score.set(min, score.get(i)));
			sum.set(i, sum.set(min, sum.get(i)));
			avg.set(i, avg.set(min, avg.get(i)));
			rank.set(i, rank.set(min, rank.get(i)));		
		}
		
		System.out.print("이름\t");
		for(int i = 0; i < 7; i++) {
			System.out.print(sub.get(i) + "\t");
		}
		
		System.out.println("합계\t평균\t석차");
		for(int i = 0; i < 25; i++) {
			System.out.print(stu.get(i) + "\t");
			for(int j = 0; j < 7; j++) {
				System.out.print(score.get(i).get(j) + "\t");
			}
			System.out.println(sum.get(i) + "\t" + avg.get(i) + "\t" + rank.get(i));
		}
		
		System.out.print("과목합계\t");
		for(int i = 0; i < 7; i++) {
			System.out.print(subSum.get(i) + "\t");
		}
		System.out.println();
		
		System.out.print("과목평균\t");
		for(int i = 0; i < 7; i++) {
			System.out.print(subAvg.get(i) + "\t");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
