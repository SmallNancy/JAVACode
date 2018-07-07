package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo01 {
	public static void main(String[] args) {
		Connection conn = null;
			//װ��MySql����
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				long start =System.currentTimeMillis();
				
				/**
				 * ��������(���Ӷ����ڲ���ʵ������Socket������һ��Զ�����ӣ��ȽϺ�ʱ)
				 * mysql 8.0���ϰ汾��ҪuseSSL=false&serverTimezone=UTC���ſ���
				 */
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?useSSL=false&serverTimezone=UTC","root","123456");
				long end = System.currentTimeMillis();
				System.out.println(conn);
				System.out.println("�������Ӻ�ʱ��" + (end-start) + "ms");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
