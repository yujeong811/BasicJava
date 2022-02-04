package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "LYJ98";
	private static String password = "java";
	
	private static Connection con = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	/*
	 * Map<String, Object> selectOne(String sql) : 조회결과가 한줄만 나오는 경우, 물음표 없을 때 사용
	 * Map<String, Object> selectOne(String sql, List<Object> param) : sql문 안에 물음표가 있을 때 사용, 'List<Object> param' : 물음표에 들어갈 값을 순서대로 ArrayList에 담아서 넘김
	 * List<Map<String, Object>> selectList(String sql) : 조회결과가 여러줄일 경우, 물음표 없을 때 사용
	 * List<Map<String, Object>> selectList(String sql, List<Object> param) : sql문 안에 물음표가 있을 때 사용
	 * int update(String sql) : select를 제외한 나머지를 사용하는 메서드, 물음표 없을 때 사용
	 * int update(String sql, List<Object> param) : sql문 안에 물음표가 있을 때 사용
	 */
	
	
	public static List<Map<String, Object>> selectList(String sql, List<Object> param) {
	    List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(); 
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i)); // 물음표의 인덱스는 1부터 시작하기 때문에 i + 1
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(map);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			if(rs != null) try { rs.close(); } catch(Exception e) {} 
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return list;
		
	}
	
}
