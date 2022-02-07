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

public class JDBCTest {
	
//	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static String user = "LYJ98";
//	private static String password = "java";
//	
//	private static Connection con = null;
//	private static PreparedStatement ps = null;
//	private static ResultSet rs = null;
	
	public static void main(String[] args) {
		// List<Map<String, Object>> selectList(String sql, List<Object> param) 
		String sql = "select * "
				+ " from cart "
				+ " where cart_member = ? "
				+ " and cart_qty > ?";
		
		ArrayList<Object> param = new ArrayList<Object>();
		param.add("a001");
		param.add(5);
		
		List<Map<String, Object>> list = JDBCUtil.selectList(sql, param);
		
		System.out.println("1 : " + list);
		
		// Map<String, Object> selectOne(String sql, List<Object> param)
		sql = "select *"
				+ " from member"
				+ " where mem_id = ?";
		param = new ArrayList<Object>();
		param.add("a001");
		
		Map<String, Object> map = JDBCUtil.selectOne(sql, param);
		
		System.out.println("2 : " + map);
		
		// int update(String sql, List<Object> param) 
		sql = "insert into cart values (?, ?, ?, ?)";
		
		param = new ArrayList<Object>();
		param.add("a001");
		param.add("2005040100001");
		param.add("P201000019");
		param.add(3);
		
		int result = JDBCUtil.update(sql, param);
		System.out.println("영향받은 행 : " + result);
		
	}
	
}
