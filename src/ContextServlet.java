import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ContextServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//设置编码格式
		resp.setContentType("text/html");
		ServletContext ctx = super.getServletContext();
		String encoding = ctx.getInitParameter("encoding");
		req.setCharacterEncoding(encoding);
		resp.setCharacterEncoding(encoding);
		
		RequestDispatcher dpt = req.getRequestDispatcher("/title");
		dpt.include(req, resp);
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html><body>+我是内容...+</body></html>");	
	}	
}