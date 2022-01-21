package d_array;

import java.util.Arrays;

public class MultiDimesionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		 */

		//2차원
		int[][] array2;
		
		//3차원
		int[][][] arry3;
		
		int[][] arr = new int[2][3];
		/*
		 * 변수 = 100번지(주소)
		 * 
		 * 100번지
		 * {200번지, 300번지}
		 * 
		 * 200번지
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0}
		 */
		
		int arr2[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }; //1차원의 길이 : 2, 2차원의 길이 : 3
		int[] arr3[] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3, 3
		
		int[][] arr4 = new int[3][]; //가변 배열
	    arr4[0] = new int[3];
	    arr4[1] = new int[4];
	    arr4[2] = new int[10];
	    
//	    arr[0] = 10; //값을 저장할 수 없다.
	    arr[0] = new int[5]; // 1차원에 값을 저장하려면 배열을 저장해야 한다.
	    arr[0][0] = 10; // 2차원에 값을 저장
	    arr[0][1] = 20;
	    arr[1][0] = 100;
	    
//	    System.out.println(arr[0]); // 주소값 나옴
	    
	    System.out.println(arr[0][1]);
		
	    System.out.println(arr.length); // 1차원의 길이
		System.out.println(arr[0].length); // 2차원의 길이
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) { //1차원에 접근하기 위한 for문
			for (int j = 0; j < arr[i].length; j++) { //2차원에 접근하기 위한 for문
				System.out.println(i + "," + j + " : " + arr[i][j]);
			}
		}
		System.out.println();
		
		
		// 0~100 사이의 랜덤한 정수를 배열에 저장
        // 각 학생의 합계와 평균을 각각의 배열에 저장
		
		int[][] scores = new int[3][5]; // int[학생수][과목수]
		int[] sum = new int[scores.length]; // 합계 -> 3
		double[] avg = new double[scores.length]; // 평균

		for (int i = 0; i < 3; i++) { // 3 : scores.length
			for (int j = 0; j < 5; j++) { // 5 : scores[i].length
				scores[i][j] = (int) (Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				sum[i] += scores[i][j];
			}
			avg[i] = sum[i] / 5.0;
		}
		System.out.println("합계 : " + Arrays.toString(sum));
		System.out.println("평균 : " + Arrays.toString(avg));
		
	}

}
