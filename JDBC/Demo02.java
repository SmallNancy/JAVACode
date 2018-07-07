package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Statement用法
 * 测试SQL注入
 * @author Small
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Connection conn = null;
			//装载MySql驱动
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				/**
				 * 建立连接(连接对象内部其实包含了Socket对象，是一个远程连接，比较耗时)
				 * mysql 8.0以上版本需要useSSL=false&serverTimezone=UTC，才可以
				 */
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher?useSSL=false&serverTimezone=UTC","root","123456");
				Statement stmt = conn.createStatement();
				String sql = "INSERT INTO department(id,depName) VALUES(06,'调研部')";
				stmt.execute(sql);
				System.out.println(conn);
				//测试SQL注入
//				String sql = "delete from department where id=6";
//				stmt.execute(sql);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
