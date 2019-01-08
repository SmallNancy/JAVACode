package cn.nancy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageServlet
 */
@WebServlet(name = "Page", urlPatterns = { "/Page" })
public class PageServlet extends HttpServlet {
 @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) 
		  throws ServletException, IOException {
	 //������Ӧ�����ʽ
	 resp.setContentType("text/html;charset=utf-8");
	 //��ȡ������Ϣ
	 //��������
	 //��Ӧ������
	   //��ȡrequest����������
	 String str=(String) req.getAttribute("str")==null?"":(String) req.getAttribute("str");
	 //�����nullֵ����������ַ������������ִ��str,��ʾ
		resp.getWriter().write("<html>");
		resp.getWriter().write("<head>");
		resp.getWriter().write("</head>");
		resp.getWriter().write("<body>");
		resp.getWriter().write("<font color='red' size='15px'>"+str+"</font>");
		resp.getWriter().write("<form action='login' method='post'>");
		resp.getWriter().write("�û���:<input type='text' name='uname' value=''/><br/>");
		resp.getWriter().write("����:<input type='password' name='pwd' value=''/><br/>");
		resp.getWriter().write("<input type='submit'  value='��¼'/><br/>");
		resp.getWriter().write("</form>");
		resp.getWriter().write("</body>");
		resp.getWriter().write("</html>");
  }
}
