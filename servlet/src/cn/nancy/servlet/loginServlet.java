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
 * ����ת��ѧϰ��
 *    ���ã�ʵ�ֶ��servlet��������������������࣬��ȷservletְ��
 *    ʹ�ã�req.getRequestDispatcher("Ҫת����·��").forward(req, resp);
 *    ��ַ��дServlet����
 *    ע������ת����return�������ɡ�
 ***/
@WebServlet(name = "login", urlPatterns = { "/login" })
public class loginServlet extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) 
		  throws ServletException, IOException {
	  //����post��������ʽ
	  req.setCharacterEncoding("utf-8");
	  //������Ӧ�����ʽ
	  resp.setContentType("text/html;charset=utf-8");
	  String uname = req.getParameter("uname");
	  
	  //�������
	  uname = new String(uname.getBytes("iso8859-1"),"utf-8");
	  String pwd = req.getParameter("pwd");
	  System.out.println(uname+":"+pwd);
	  //��ȡҵ������
	  LoginService ls = new LoginServiceImpl();
	  User u = ls.checkLoginService(uname, pwd);
	  System.out.println(u);
	  if(u!=null) {
		  //resp.getWriter().write("��½�ɹ�");
		  //req.getRequestDispatcher("main").forward(req, resp);
		  resp.sendRedirect("/04Login/main");
		  return ;
	  }else {
		//resp.getWriter().write("��½ʧ��");
		  req.setAttribute("str", "�û��������������");
		  //ʹ������ת��
		  req.getRequestDispatcher("Page").forward(req, resp);
		  return ;
	}
  }
}
