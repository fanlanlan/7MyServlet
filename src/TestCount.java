import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class TestCount extends HttpServlet{
	private int count;
	public void service(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.setContentType("test/html");
		resp.setCharacterEncoding("UTF-8");
		synchronized(this){
		PrintWriter pw = resp.getWriter();
		count ++;
		pw.println("<h1>"+count+"</h1>");
		pw.flush();
		}
	}
	
	

}
