package servlets;

import cruds.RealtyCrud;
import entities.Realty;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/details")
public class RealtyInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.decode(request.getParameter("id"));
        request.setAttribute("realty", RealtyCrud.get(id));
        request.getRequestDispatcher("/realty-info.jsp").forward(request, response);
    }
}
