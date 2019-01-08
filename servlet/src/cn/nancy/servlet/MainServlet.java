package cn.nancy.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(name = "main", urlPatterns = { "/main" })
public class MainServlet extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) 
		  throws ServletException, IOException {
	  req.setCharacterEncoding("utf-8");
	  resp.setContentType("text/html;charset=utf-8");
	  resp.getWriter().write("<html>");
	  resp.getWriter().write("<head>");
	  resp.getWriter().write("</head>");
	  resp.getWriter().write("<body>");
	  resp.getWriter().write("<h3>欢迎来到"+req.getParameter("uname")+"的世界</h3>");
	  resp.getWriter().write("</body>");
	  resp.getWriter().write("</html>");
  }
}
