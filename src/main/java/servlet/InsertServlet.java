package servlet;

import entity.Film;
import services.Service;
import services.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InsertServlet extends HttpServlet {

	private Service service = new ServiceImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String language = request.getParameter("language");
		Film entity = new Film(title,description, language);
		boolean flag = service.insert(entity);
		if(flag){
			 request.setAttribute("flag", true);
			 request.getRequestDispatcher("./tips.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
