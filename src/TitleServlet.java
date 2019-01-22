import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 显示页面的标题
 * @author Administrator
 *
 */
public class TitleServlet extends HttpServlet{
@Override
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	//设置相应类型和编码
	
	resp.setContentType("text/html");
	ServletContext ctx = super.getServletContext();
	String encoding = ctx.getInitParameter("encoding");
	req.setCharacterEncoding(encoding);
	resp.setCharacterEncoding(encoding);
	
	PrintWriter pw = resp.getWriter();
	pw.println("<h1>我是标题</h1>");
	
	
	}
	
}
