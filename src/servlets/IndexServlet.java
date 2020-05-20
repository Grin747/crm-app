package servlets;

import cruds.RealtyCrud;
import entities.Realty;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Realty> realties = RealtyCrud.select();
        request.setAttribute("realties", realties);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
