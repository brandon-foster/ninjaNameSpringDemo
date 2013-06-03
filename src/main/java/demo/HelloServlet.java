package demo;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Basic servlet that sends Hello World
 * 
 * @author Michael Irwin
 */
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 3794563180416930442L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletOutputStream os = resp.getOutputStream();
		os.write("<!DOCTYPE html><html><body><h1>Hello world!</h1></body></html>".getBytes());
	}
	
	
}
