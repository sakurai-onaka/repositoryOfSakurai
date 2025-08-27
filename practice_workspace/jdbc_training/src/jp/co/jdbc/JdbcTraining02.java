package jp.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTraining02 {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER_NAME = "education";
	private static final String PASSWORD = "systemsss";
	
	public static void main(String[] args) {
		try {
			selectAllEmployee();
		}catch(Exception e) {
			
		}
	}
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		System.out.println("接続に成功しました。");
		return con;
	}
	
	public static void selectAllEmployee() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			String sql = "select * from emp inner join dept on emp.deptno = dept.deptno";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			System.out.println("社員NO\t社員名\t\t部署");
					
			while(rs.next()) {
				System.out.print(rs.getString("empno")+"\t\t");
				System.out.print(rs.getString("ename")+"\t\t");
				System.out.print(rs.getString("dname")+"\n");
			}
			
		}catch(Exception e) {
			System.out.println("接続に失敗しました。");
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
}
