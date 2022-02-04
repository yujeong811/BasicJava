package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성 단계
		 * 1. Connection 생성 (DB연결)
		 * 2. Statement 생성 (쿼리 작성)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출 (select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기
		 */
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  // jdbc:oracle:thin: jdbc의 버전 정보 / localhost:1521:xe 오라클 호스트 이름, 포트, SID
		String user = "LYJ98";
		String password = "java";
		
		Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
		
	    //DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스, 서로 다른 것들끼리의 상호작용을 도와주는 것
	    try {
			con = DriverManager.getConnection(url, user, password);  // 연결 완료
			
			String sql = "select * from member"; // sql문 작성
			ps = con.prepareStatement(sql);  // 문자열을 오라클에 적합한 형태로 바꿔서 return 해줌
			
			// select 인 경우 --> 조회결과를 return
			rs = ps.executeQuery(); // 쿼리 실행
			
			// insert, update, delete  --> int타입(영향을 받은 행의 수)을 return
//			int result = ps.executeUpdate();
//			result : 영향을 받은 행의 수
			
			while (rs.next()) { // 결과를 하나씩 꺼내야 함 --> next() 메서드 사용 : 첫번째 행의 결과 가져옴. 반복할때마다 두번째, 세번째 행 .... 행이 없을때까지 while문 반복
				// 두 종류로 가능
				// get() 메서드로 가져옴, 타입에 따라서 메서드 다름
				String memId = rs.getString(1);  // 파라미터 : 컬럼의 인덱스
				String memPass = rs.getString("MEM_PASS"); // 파라미터 : 컬럼명
				
				System.out.println("MEM_ID : " + memId + " / MEM_PASS : " + memPass);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 사용한 객체 닫기  rs -> ps -> con 순서대로 닫기 : 순서대로 열었기 때문에 역순으로 닫음
			if(rs != null) try { rs.close(); } catch(Exception e) {} // null이 아닐때 실행 null일때 실행하면 nullpointexception이 발생
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}
}

