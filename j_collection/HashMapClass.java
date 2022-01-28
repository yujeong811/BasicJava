package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass { // 테이블 구조를 표현할 때 사용 (컬럼명 = 키)

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 저장된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다. 
		 */
		
		HashMap<String, Object> map = new HashMap<String, Object> ();
	    
		map.put("age", 10); // age : key, 10 : 값
		map.put("name", "홍길동");
		map.put("date", new Date());

		System.out.println(map);  // 출력되는 순서 알 수 없음. 저장한 순서대로 출력되지 않음
		
		map.put("name", "이순신"); // 새로운 값으로 덮어씌움
		
		System.out.println(map);
		
		map.remove("date");
		
		System.out.println(map); 
		
		Object value = map.get("name"); // 저장된 값을 얻을 수 있음
		
		System.out.println(((String)value).substring(0, 2)); // 형변환 후에 사용 가능
		
		String value2 = (String)map.get("name");
		
		Set<String> keys = map.keySet(); // 키값을 String으로 설정했기 때문에 꺼내쓸때 String
		// 값을 하나씩 꺼낼수 있는 메서드가 존재하지 않는 문제가 있음
		
		for(String key : keys) { // 변수 : 여러개의 데이터(배열, set, ArrayList 등)
			System.out.println(key + " : " + map.get(key)); 
		}
		
		ArrayList<HashMap<String, Object>> lprodTable = new ArrayList<HashMap<String,Object>>(); // LPROD 테이블
		
		HashMap<String, Object> lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		lprodTable.add(lprod);
		
		lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");
		lprodTable.add(lprod);
		
		lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 3);
		lprod.put("LPROD_GU", "P201");
		lprod.put("LPROD_NM", "여성캐주얼");
		lprodTable.add(lprod);
		
		System.out.println(lprodTable);
		for(int i = 0; i < lprodTable.size(); i++) {
			lprod = lprodTable.get(i);
			for(String Key : lprod.keySet()) {
				System.out.println(lprod.get(Key) + "\t");
			}
			System.out.println();
		}
	}

}
