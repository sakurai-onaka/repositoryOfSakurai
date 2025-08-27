package jp.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTraining01 {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER_NAME = "education";
	private static final String PASSWORD = "systemsss";
	
	
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = getConnection();
			con.close();
		}catch(Exception e) {
			System.out.println("接続に失敗しました。");
		}
	}
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		System.out.println("接続に成功しました。");
		return con;
	}
}
