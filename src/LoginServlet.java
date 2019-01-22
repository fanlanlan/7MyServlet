import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		resp.setContentType("test/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter pw = resp.getWriter();
		if("fanlanlan".equals(username) && "12345".equals(password)){
			RequestDispatcher dsp = req.getRequestDispatcher("/yes");
			dsp.forward(req, resp);
			/*pw.println("-----------------");*/
		}else{
			/*pw.println("===============");*/
			RequestDispatcher dsp = req.getRequestDispatcher("/no");
			dsp.forward(req, resp);
		}
	}
	
}
