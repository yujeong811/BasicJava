package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "LYJ98";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select *"
					  + " from cart"
					  + " where cart_member = ?"
					  + " and cart_qty > ?";  
			ps = con.prepareStatement(sql);
			
			// 첫번째 파라미터는 물음표의 순서, 두번째 파라미터는 넣고 싶은 값
			// 물음표에는 값만 들어갈 수 있음. 컬럼명 등은 넣을 수 없음
			ps.setString(1, "a001"); // 첫번째 물음표에 a001을 넣음
			ps.setInt(2, 5); // 두번째 물음표에 5를 넣음
//			ps.setObject(0, sql); // 타입 상관없이 값 넣음
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData(); // 메타데이터 : 데이터에 대한 데이터. 조회된 결과에 대한 데이터
			
		    int columnCount = metaData.getColumnCount(); // 조회된 컬럼의 갯수
		    
			while (rs.next()) {
				for(int i = 1; i <= columnCount; i++) { // 컬럼의 인덱스는 1부터 시작
					System.out.print(rs.getObject(i) + "\t");
				}
				System.out.println();
			}
			
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally { 
			if(rs != null) try { rs.close(); } catch(Exception e) {} 
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}
}
