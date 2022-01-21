package d_array;

import java.util.Arrays;

public class Score_me {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0 ~ 100 사이의 랜덤한 점수로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle		Java		합계		평균		석차
		 * 홍길동		90		90		90		90		90		90			90			630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90			630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90			630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90			630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90			630		90.00	1
		 * 과목합계	450		450		450		450		450		450			450			
		 * 과목평균  	90.00   90.00 	90.00	90.00	90.00	90.00		90.00
		 */
	
		System.out.print("이름\t\t국어\t\t영어\t\t수학\t\t사회\t\t과학\t\tOracle\t\tJava\t\t합계\t\t평균\t\t석차");
		System.out.println();

		String[] name = { "강동주", "강정인", "강현수", "곽성상", "김기웅",
	              			  "김민지", "김형돈", "노혜지", "박태정", "서난희",
	              			  "예현의", "오지현", "오혜지", "유정민", "이병진",
	              			  "이수민", "이슬기", "이유정", "이의찬", "이정규",
	              			  "이종민", "장문석", "정다영", "최민규", "최혁진" };
		
		int[][] score = new int[25][7];
		int[] hap = new int[25];
		double[] hapavg = new double[25];
		int[] total = new int[7];
		double[] avg = new double[7];
		int[] rank = new int[25];
		
//		for(int i = 0; i < rank.length; i++) {
//			rank[i] = 1;
//		}
//		
//		for(int i = 0; i < rank.length; i++) {
//			for(int j = 0; j < rank.length; j++) {
//				if(hapavg[i] < hapavg[j]) {
//					rank[i]++;
//				}
//			}
//		}
		
		for(int i = 0; i < score.length; i++) { // 25
			for(int j = 0; j < score[i].length; j++) { // 7
				score[i][j] = (int)(Math.random() * 101);
				hap[i] += score[i][j]; 
				hapavg[i] = hap[i] / 7.0;
				hapavg[i] = Math.round(hapavg[i] * 100) / 100.0;
				total[j] += score[i][j];
				avg[j] = total[j] / 25.0;	
				avg[j] = Math.round(avg[j] * 100) / 100.0;
			}
			System.out.println(name[i] + "\t\t" + score[i][0] + "\t\t" + score[i][1] + "\t\t" + score[i][2] + "\t\t" + score[i][3] +
					"\t\t" + score[i][4]+ "\t\t" + score[i][5] + "\t\t" + score[i][6] + "\t\t" + hap[i] + "\t\t" + hapavg[i] + "\t\t");
		}

		
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < rank.length; j++) {
				if(hapavg[i] < hapavg[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.print("과목합계\t\t");
		System.out.print(total[0] + "\t\t" + total[1] + "\t\t" + total[2] + "\t\t" + total[3] + "\t\t" + total[4] + "\t\t" + total[5] + "\t\t" + total[6]);
		System.out.println();
		System.out.print("과목평균\t\t");
		System.out.print(avg[0] + "\t\t" + avg[1] + "\t\t" + avg[2] + "\t\t" + avg[3] + "\t\t" + avg[4] + "\t\t" + avg[5] + "\t\t" + avg[6]);
		
	}
}
