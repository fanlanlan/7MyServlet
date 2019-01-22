import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 登陆成功页面
 * @author Administrator
 *
 */
public class LoginSuccess extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//设置编码格式
		resp.setContentType("text/html");
		ServletContext ctx = super.getServletContext();
		String encoding = ctx.getInitParameter("encoding");
		req.setCharacterEncoding(encoding);
		resp.setCharacterEncoding(encoding);
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>登陆成功</h1>");
	
	}
	

}
