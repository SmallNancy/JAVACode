package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Statement�÷�
 * ����SQLע��
 * @author Small
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Connection conn = null;
			//װ��MySql����
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				/**
				 * ��������(���Ӷ����ڲ���ʵ������Socket������һ��Զ�����ӣ��ȽϺ�ʱ)
				 * mysql 8.0���ϰ汾��ҪuseSSL=false&serverTimezone=UTC���ſ���
				 */
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher?useSSL=false&serverTimezone=UTC","root","123456");
				Statement stmt = conn.createStatement();
				String sql = "INSERT INTO department(id,depName) VALUES(06,'���в�')";
				stmt.execute(sql);
				System.out.println(conn);
				//����SQLע��
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
