package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * PreparedStatement用法
 * 防止SQL注入
 * @author Small
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		Connection conn = null;
			//装载MySql驱动
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher?useSSL=false&serverTimezone=UTC","root","123456");
				//VALUES(?,?) 占位符,防止SQL注入
				String sql ="INSERT INTO department(id,depName) VALUES(?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setObject(1, 05);//传入值,第一个参数
				ps.setObject(2, "hello");//传入值,第2个参数
				ps.execute();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
