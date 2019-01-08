package cn.nancy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.nancy.pojo.User;
import cn.nancy.service.LoginService;
import cn.nancy.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class loginServlet
 * 请求转发学习：
 *    作用：实现多个servlet联动操作，避免代码冗余，明确servlet职责
 *    使用：req.getRequestDispatcher("要转发的路径").forward(req, resp);
 *    地址：写Servlet别名
 *    注意请求转发后return结束即可。
 ***/
@WebServlet(name = "login", urlPatterns = { "/login" })
public class loginServlet extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) 
		  throws ServletException, IOException {
	  //设置post请求编码格式
	  req.setCharacterEncoding("utf-8");
	  //设置响应编码格式
	  resp.setContentType("text/html;charset=utf-8");
	  String uname = req.getParameter("uname");
	  
	  //解决乱码
	  uname = new String(uname.getBytes("iso8859-1"),"utf-8");
	  String pwd = req.getParameter("pwd");
	  System.out.println(uname+":"+pwd);
	  //获取业务层对象
	  LoginService ls = new LoginServiceImpl();
	  User u = ls.checkLoginService(uname, pwd);
	  System.out.println(u);
	  if(u!=null) {
		  //resp.getWriter().write("登陆成功");
		  //req.getRequestDispatcher("main").forward(req, resp);
		  resp.sendRedirect("/04Login/main");
		  return ;
	  }else {
		//resp.getWriter().write("登陆失败");
		  req.setAttribute("str", "用户名或者密码错误");
		  //使用请求转发
		  req.getRequestDispatcher("Page").forward(req, resp);
		  return ;
	}
  }
}
