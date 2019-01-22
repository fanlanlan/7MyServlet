import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServletLife extends HttpServlet{
	@Override
	public void init(ServletConfig config){
		System.out.println("======init========");
	}
	@Override
	public void service(HttpServletRequest req,HttpServletResponse resp){
		System.out.println("=======service=======");
	}
	@Override
	public void destroy (){
		System.out.println("======destory========");
	}
}
