package cn.yang;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		System.out.println("service method");
		super.service(request, response);
	}
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		System.out.println("doGet method");
		PrintWriter pw = response.getWriter();
		pw.write("Hello World");
		pw.close();
	}
}
