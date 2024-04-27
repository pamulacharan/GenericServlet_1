import java.io.*;
import javax.servlet.*;

public class GenericServlet_1 extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<B>Hello! this is GenericServlet Method 2");
		pw.close();
	}
}