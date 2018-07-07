package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * PreparedStatement�÷�
 * ��ֹSQLע��
 * @author Small
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		Connection conn = null;
			//װ��MySql����
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher?useSSL=false&serverTimezone=UTC","root","123456");
				//VALUES(?,?) ռλ��,��ֹSQLע��
				String sql ="INSERT INTO department(id,depName) VALUES(?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setObject(1, 05);//����ֵ,��һ������
				ps.setObject(2, "hello");//����ֵ,��2������
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
