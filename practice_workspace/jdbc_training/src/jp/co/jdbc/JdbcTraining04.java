package jp.co.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTraining04 {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER_NAME = "education";
	private static final String PASSWORD = "systemsss";
	
	public static void main(String[] args) {
		try {
			selectSal();
		}catch(Exception e) {
			
		}
	}
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		return con;
	}
	
	public static void selectSal() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("給与の範囲検索をします。");
			System.out.println("最小値");
			String minValue = br.readLine();
			System.out.println("最大値");
			String maxValue = br.readLine();
			
			con = getConnection();
			String sql = "select * from emp where sal >= ? and sal <= ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1,Integer.parseInt(minValue));
			ps.setInt(2,Integer.parseInt(maxValue));
			ResultSet rs = ps.executeQuery();
			
			System.out.println("社員NO\t社員名\t上司\t入社日\t給与\t職種\t部署");
					
			while(rs.next()) {
				System.out.print(rs.getString("ename")+"\t\t");
				System.out.print(rs.getString("sal")+"\t\t");
				System.out.print(rs.getString("job")+"\n");
			}
			
		}catch(Exception e) {
			System.out.println("接続に失敗しました。");
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}
