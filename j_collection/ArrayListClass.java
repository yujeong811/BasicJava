package j_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) { // 모두가 똑같이 사용하는 공통된 다수의 데이터를 만들어 놓은 컬렉션 -> 배열의 발전된 형태
		/*
		 * Collection Framework
		 * - List  // interface, 배열과 비슷하게 생김 인덱스 순서대로 데이터 저장
		 * - Map   // interface, 데이터를 저장할때 사용자가 설정한 키에 저장
		 * - Set   // interface, 중복된 값은 저장되지 않음  
		 * 
		 * ArrayList의 주요 메서드 // 사용이유 : 읽는 속도가 빠르기 때문
		 * - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다. // 크기가 유동적으로 변하는 배열
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가한다. // 인덱스를 지정해서 저장함(원래 있던 애들 한칸씩 뒤로 밀림)
		 * - Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다. // 수정하는 메서드, 인덱스를 지정해 Object obj로 덮어씀
		 * - Object get(int index) : 지정된 위치의 객체를 반환한다. //값을 읽는 메서드
		 * - int size() : 저장된 객체의 수를 반환한다. // length와 같음
		 * - Object remove(int index) : 지정된 위치의 객체를 제거한다. // 지정된 인덱스 삭제하면 뒤에 있던 애들 한칸씩 앞으로 옴
		 */
           
		ArrayList sample = new ArrayList(); // 타입 상관없이 아무거나 저장 가능, 하지만 값을 꺼낼때 무슨 타입인지 몰라서 불편
		
		sample.add("abc");	
		sample.add(100);	
		sample.add(new Scanner(System.in));
		
		ArrayList<Integer> list = new ArrayList<Integer>(); // integer만 저장할 수 있다. (타입지정)
		
		list.add(10);
//		list.add("abc");
		list.add(new Integer(20)); 
		
		/*
		 * Wrapper 클래스
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer // 자동으로 형변환됨
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 * - char : Character
		 * - boolean : Boolean
		 */
		
		System.out.println(list.add(30)); // boolean타입의 값이 return됨 --> 값이 잘 저장되었으면 true
		System.out.println(list);
		
		list.add(1, 40); // 1번 인덱스에 40을 저장 --> 기존에 1번 인덱스에 있던 애 뒤로 밀려남
		System.out.println(list);
		
		// set
		int before = list.set(2, 50);
		System.out.println("before : " + before);
		System.out.println(list);
		
		// get
		int get = list.get(2);
		System.out.println(get);
		
//		for(int i = 0; i < list.size(); i++) { 
//			System.out.println((i + " : " + list.remove(i))); // 값을 지우면서 뒤에 있는 값들이 앞으로 오기 때문에 for문이 두번 돔
//		}
//		System.out.println(list);
	
		for(int i = list.size() - 1; i >= 0; i--) { // 뒤에서부터 지우기 때문에 다 잘 지워짐
			System.out.println(i + " : " + list.remove(i));
		}
		
		//list에 1~100사이의 랜덤값을 10개 저장해주세요.
		//list에 저장된 값의 합계와 평균을 구해주세요.
		
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < 10; i++) {
		    list.add((int) (Math.random() * 100) + 1);
		    sum += list.get(i);
		}
		avg = (double)sum / list.size();
		
		System.out.println(list);
		System.out.println("합계 : " + sum + ", 평균 : " + avg);	
		
		//list에서 최소값과 최대값을 구해주세요.
        
		int min = list.get(0);
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}

			if (min > list.get(i)) {
				min = list.get(i);
			
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		//list를 오름차순으로 정렬해주세요.
		for(int i = 0; i < list.size() - 1; i++) {
			min = i;
			for(int j = i + 1; j < list.size(); j++) {
				if (list.get(min) > list.get(j)) {
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
			
			//한줄로 표현
			list.set(i, list.set(min, list.get(i)));
		} 
		System.out.println(list);
			
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<Integer>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++) {
			ArrayList<Integer> list3 = list2.get(i);
			for(int j = 0; j < list3.size(); j++) {
				System.out.println(list3.get(j));
			}
		}
		
		Integer integer = list2.get(0).get(1);
		System.out.println(integer);
		System.out.println();
		
		//학생 3명의 5과목에 대한 0~100점의 랜덤한 점수를 2차원 ArrayList에 저장해주세요.
		list2 = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < 3; i++) {
			list2.add(new ArrayList<Integer>()); //3명의 학생 저장공간 만들기
			for(int j = 0; j < 5; j++) {
			    list2.get(i).add((int)(Math.random() * 101)); //  list2.get(i) = list2.add(new ArrayList<Integer>());
			}
		}
		System.out.println(list2);
		
		//각 학생별 합계와 평균을 구해주세요.
		
		ArrayList<Integer> ssum = new ArrayList<Integer>();
		ArrayList<Double> aavg = new ArrayList<Double>();

		for(int i = 0; i < 3; i++) {
			sum = 0;
			for(int j = 0; j < 5; j++) {		
				sum += list2.get(i).get(j);
			}
			ssum.add(sum);
			aavg.add((double)(sum) / 5);
		}
		
		System.out.println("합계 : " + ssum + ", 평균 : " + aavg);

	}

}
