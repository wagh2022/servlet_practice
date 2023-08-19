package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class firstservlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h2>welcome to servlet</h2>");
		
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String course=req.getParameter("course");
		String condition=req.getParameter("condition");
		String gender=req.getParameter("gender");
	if(condition!=null) {
		if(condition.equals("checked")) {
			out.println("<h2>Name :"+name+"</h2>");
			out.println("<h2>password :"+password+"</h2>");
			out.println("<h2>e-mail :"+email+"</h2>");
			out.println("<h2>course :"+course+"</h2>");
			out.println("<h2>gender :"+gender+"</h2>");
			
		}
		
		else {
			out.println("you have not accept terms and condition");
		}
	}
	else {
		
		out.println("you have not accept terms snd condition");
	}
	}

}
