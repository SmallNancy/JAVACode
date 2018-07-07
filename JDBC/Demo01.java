package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo01 {
	public static void main(String[] args) {
		Connection conn = null;
			//装载MySql驱动
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				long start =System.currentTimeMillis();
				
				/**
				 * 建立连接(连接对象内部其实包含了Socket对象，是一个远程连接，比较耗时)
				 * mysql 8.0以上版本需要useSSL=false&serverTimezone=UTC，才可以
				 */
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?useSSL=false&serverTimezone=UTC","root","123456");
				long end = System.currentTimeMillis();
				System.out.println(conn);
				System.out.println("建立连接耗时：" + (end-start) + "ms");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
