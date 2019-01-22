import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginFail extends HttpServlet{

	/**
	 * 登录失败页面
	 * @param args
	 */
		@Override
		public void service(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			//设置编码
			resp.setContentType("text/html");
			ServletContext ctx = super.getServletContext();
			String encoding = ctx.getInitParameter("encoding");
			req.setCharacterEncoding(encoding);
			resp.setCharacterEncoding(encoding);
			
			PrintWriter pw = resp.getWriter();
			pw.println("<h1>登录失败</h1>");
		}

}
