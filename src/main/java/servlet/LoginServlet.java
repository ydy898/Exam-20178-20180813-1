package servlet;


import entity.Film;
import services.Service;
import services.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
	private Service service = new ServiceImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("username");
		boolean flag = service.login(userName);
		if(flag){
			request.setAttribute("flag", true);
			request.getRequestDispatcher("./login.jsp").forward(request, response);
		}else{
			response.sendRedirect("./error.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
