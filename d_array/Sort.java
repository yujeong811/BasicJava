package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식 (전체비교)
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식 (바로 옆과 비교)
		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식
		 * 
		 * 1. 석차를 저장할 배열
		 * 2. 1등 저장
		 * 3. for문 두개 생성 후 비교
		 */

		int[] arr = new int[10]; // 10명의 점수 저장할 배열
		for (int i = 0; i < arr.length; i++) { // 10명의 점수 랜덤으로 생성
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));

		// 석차구하기
//		int[] rank = new int[arr.length]; // 10명의 석차 저장할 배열
//		for (int i = 0; i < rank.length; i++) { // 배열에 각각 1 대입
//			rank[i] = 1;
//		}
//
//		for (int i = 0; i < arr.length; i++) { // i가 기준
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(rank));
		
//		Arrays.sort(arr);
		
		// 선택정렬
//		for (int i = 0; i < arr.length - 1; i++) { // 9번 비교하면 비교가 끝나기 때문에 
//			int min = i; // 비교하는 인덱스 범위가 바뀌기 때문에 0말고 i 대입
//			for (int j = i + 1; j < arr.length; j++) { // ex) i가 0이면 j는 1부터 비교하기 때문에 i+1이다
//				if (arr[j] < arr[min]) {
//					min = j; // 인덱스 저장
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		// 버블정렬
	    /* j j+1
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 8,9 
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7
		 * 0,1 1,2 2,3 3,4 4,5 5,6
		 * 0,1 1,2 2,3 3,4 4,5  
		 * 0,1 1,2 2,3 3,4 
		 * 0,1 1,2 2,3 
		 * 0,1 1,2 
		 * 0,1 
		 */
//		for (int i = 0; i < arr.length - 1; i++) { // 9번 반복 비교
//			boolean flag = false; // 자리를 바꿨는지 확인하기 위해 사용
//			for (int j = 0; j < arr.length - 1 - i; j++) { // 9번 반복 비교 - i
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					flag = true; // 자리를 바꿨는지 확인하기 위해 사용
//				}
//			}
//			if (!flag) { // 자리 바꾸지 않는 경우, 아예 끝난 경우
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		// 삽입정렬
		// 3, 41, 27, 25, 38, 3, 27, 49, 19, 34
		// 3, 41, 27, 25, 38, 3, 27, 49, 19, 34
		// 3, 27, 41, 25, 38, 3, 27, 49, 19, 34
		// 3, 25, 27, 41, 38, 3, 27, 49, 19, 34
		// 3, 25, 27, 38, 41, 3, 27, 49, 16, 34
		// 3, 3, 25, 27, 38, 41, 27, 49, 16, 34
		// 3, 3, 25, 27, 27, 38, 41, 49, 16, 34
		// 3, 3, 16, 25, 27, 27, 38, 41, 49, 34
		// 3, 3, 16, 25, 27, 27, 34, 38, 41, 19
		
		/*
		 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		 * 1,0
		 * 2,1 2,0
		 * 3,2 3,1 3,0
		 * 4,3 4,2 4,1 4,0
		 * 5,4 5,3 5,2 5,1 5,0
		 * 6,5 6,4 6,3 6,2 6,1 6,0
		 * 7,6 7,5 7,4 7,3 7,2 7,1 7,0
		 * 8,7 8,6 8,5 8,4 8,3 8,2 8,1 8,0
		 * 9,8 9,7 9,6 9,5 9,4 9,3 9,2 9,1 9,0
		 */
		
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = 0;
			for (j = i - 1; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

