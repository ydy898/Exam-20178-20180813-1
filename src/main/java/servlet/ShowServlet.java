package servlet;

import entity.Film;
import services.Service;
import services.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowServlet extends HttpServlet {

    private Service service = new ServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Film> list = service.show();

        if(list!=null){
            request.getSession().setAttribute("list",list) ; //setAttribute
            request.getRequestDispatcher("./show.jsp").forward(request, response);
        }

    }

    //System.out.println(rowCount);


}


