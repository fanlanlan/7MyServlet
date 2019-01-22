import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestMyServlet extends HttpServlet {
	//被服务器Tomcat调用
	public void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{

		Date date = new Date();

		resp.setContentType("test/html");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html><body><cernter>");
		pw.println("<font color='red' size='5'>"+date+"</font>");
		pw.println("<cernter><body><html>");
	}
	

}
