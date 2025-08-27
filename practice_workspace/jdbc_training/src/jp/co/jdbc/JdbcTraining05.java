package jp.co.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTraining05 {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER_NAME = "education";
	private static final String PASSWORD = "systemsss";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			selectSal();
		} catch (Exception e) {

		}
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		return con;
	}

	public static void selectSal() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("部署を新規登録します。");
			System.out.println("部署名を入力してください。 ");
			String inputDeptName = br.readLine();
			System.out.println("場所を入力してください。");
			String inputDeptLocation = br.readLine();

			con = getConnection();
			String sql = "insert into dept values(dept_seq.nextval,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputDeptName);
			ps.setString(2, inputDeptLocation);
			ps.executeUpdate();

			System.out.println("部署を登録しました。");

		} catch (Exception e) {
			System.out.println("接続に失敗しました。");
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

}
