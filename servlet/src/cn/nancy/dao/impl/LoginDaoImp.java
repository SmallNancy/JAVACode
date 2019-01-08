package cn.nancy.dao.impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.nancy.dao.LoginDao;
import cn.nancy.pojo.User;

public class LoginDaoImp implements LoginDao{

	@Override
	public User checkLoginDao(String uname, String pwd) {
		//声明jdbc对象
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User u = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01","root", "123456");
				String sql = "select * from user where uname=? and pwd=?;";
				ps = conn.prepareStatement(sql);
				//给占位符赋值
				ps.setString(1, uname);
				ps.setString(2, pwd);
				//执行
				rs = ps.executeQuery();
				//遍历执行结果
				while(rs.next()) {
					u = new User();
					u.setUid(rs.getInt("uid"));
					u.setUname(rs.getString("uname"));
					u.setPwd(rs.getString("pwd"));
				}
		} catch (ClassNotFoundException e) {
			
		} catch(SQLException e) {
			
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return u;
	}

}
