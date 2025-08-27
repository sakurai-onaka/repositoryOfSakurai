package jp.co.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTraining06 {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER_NAME = "education";
	private static final String PASSWORD = "systemsss";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			updateDept();
		} catch (Exception e) {

		}
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		return con;
	}

	public static void updateDept() throws IOException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			System.out.println("部署を変更します。\n");
			System.out.println("部署 NO を入力してください。");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int inputDeptNo = Integer.parseInt(br.readLine());
			System.out.println("部署名を入力してください。");
			String inputDeptName = br.readLine();
			System.out.println("場所を入力してください。 ");
			String inputDeptLoc = br.readLine();

			con = getConnection();
			String sql = "update dept set dname = ? ,loc = ? where deptno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(3, inputDeptNo);
			ps.setString(1, inputDeptName);
			ps.setString(2, inputDeptLoc);
			int cnt = ps.executeUpdate();
			if (cnt != 0) {
				System.out.println("部署を変更しました。 ");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
