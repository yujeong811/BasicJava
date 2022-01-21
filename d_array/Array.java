package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입니다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경할 수 없다.
		 */

		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//기본값이 저장된다.
		
		/*
		 * 변수 = 100번지(주소)
		 * 
		 * 100번지
		 * {0, 0, 0, 0, 0}  첫번째 값의 주소가 100번지 
		 */
		
		array = new int[] {10, 2, 3, 4, 5}; //이 경우, []안에 숫자 넣으면 안됨
		
		int[] array2 = {1, 2, 3, 4, 5}; //이 경우, 변수 선언과 초기화를 해줘야 함
		
		array[0] = 10; //변수명 뒤에 '[0]' 부분 -> 인덱스(순서)
		// 0부터 시작 
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		System.out.println(array[0]); //인덱스를 지정하지 않고 출력하면 배열의 주소 출력됨  ex)[I@75a1cd57
                                      //꼭 인덱스 지정하여 출력
		
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println();
		
		for(int i = 0; i < array.length; i++) { //array.length : 배열의 길이 -> 5
			array[i] = (i + 1) * 10;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
 
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		
		int[] ten = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		
		for(int i = 0; i < ten.length; i++) {
			ten[i] = (int)(Math.random() * 100) + 1; 
//			System.out.println(ten[i]);
		}
		System.out.println(Arrays.toString(ten)); //배열에 있는 모든 값을 문자열로 묶어서 출력
		System.out.println();
		
		//배열에 저장된 모든 값의 합계와 평균을 출력해주세요.
		
		int sum = 0;
	
//		sum += ten[0];
//		sum += ten[1];
//		sum += ten[2];
//		sum += ten[3];
		
		for(int i = 0; i < ten.length; i++) {
			sum += ten[i];
		}
		double avg = (double)sum / ten.length; // 둘 중 하나는 double이어야 함
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		
//		1.문제에 대한 해결방법을 생각
//		2.생각한 해결방법을 코드로 표현 <반복학습>
		

		//배열에 저장된 값들 중 최솟값과 최댓값을 출력해주세요.
		
//		1. 최솟값을 저장할 변수를 만들고 배열의 첫번째 값을 저장한다.
//		2. 최댓값을 저장할 변수를 만들고 배열의 첫번째 값을 저장한다.
//		3. 변수에 저장된 값과 배열의 모든 인덱스의 값을 비교하기 위한 for문을 만든다.
//		4. 최솟값이 저장된 변수와 배열의 값을 비교해서 더 작은 값을 찾으면 변수에 저장한다.
//		5. 최댓값이 저장된 변수와 배열의 값을 비교해서 더 큰 값을 찾으면 변수에 저장한다. 
		
		int max = ten[0];
		int min = ten[0];
		
		for(int i = 0; i < ten.length; i++) {
			if(max < ten[i]) {
				max = ten[i];
			}
			if(min > ten[i]) {
				min = ten[i];
			}
		}
		
		System.out.println("최댓값 : " + max + ", " + "최솟값 : " + min);
		System.out.println();
		
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열의 값을 섞어주세요.
		
		//1. 배열의 인덱스 0~9 사이의 랜덤값을 발생시켜서 인덱스로 사용
		//2. 랜덤인덱스와 0번 인덱스의 값과 자리 바꿈 -> 여러번 반복
		
		for (int i = 0; i < shuffle.length * 10; i++) {  // 여러번 반복하려고 *10 해줌
			int ran = (int) (Math.random() * shuffle.length);
//			int temp = shuffle[ran]; // temp에 shuffle[ran]값을 대입 -> 그냥 대입하면 shuffle[ran]값이 바뀜
//			shuffle[ran] = shuffle[0];
//			shuffle[0] = temp;
			int temp = shuffle[0];
			shuffle[0] =shuffle[ran];
			shuffle[ran] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		int[] count = new int[10]; // 1~10 사이의 각 숫자가 생성된 횟수를 저장할 주소 만듦
		
		for (int i = 0; i < 500; i++) {  // 1~10 사이의 랜덤값 500번 생성하기 위한 반복문
			int ran = (int) (Math.random() * 10) + 1; // 1~10 사이의 랜덤값 생성
			for (int j = 0; j < count.length; j++) { // 1~10 사이의 랜덤값 각각의 횟수 구하기 위한 값 비교를 반복
				if (ran == j+1) { // 1~10까지 각각 비교
					count[j]++; // 1~10까지 나온 횟수 각각 더해줌
				}
			}
		}
		System.out.println(Arrays.toString(count)); 
		
//		int[] counts = new int[10];  // --> 선생님 풀이
//		for (int i = 0; i < 500; i++) {  // 1~10 사이의 랜덤값 500번 생성하기 위한 반복문
//			int random = (int) (Math.random() * 10) + 1; // 1
//			counts[random - 1]++; // 0~9 인덱스에 각각 횟수 넣어주기
//		}
	}
}

		
		

