package servlets;

import cruds.DealCrud;
import cruds.RealtorCrud;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/master-detail")
public class MasterDetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("deals", DealCrud.getInfo(Integer.decode(request.getParameter("realtor"))));
        request.setAttribute("realtors", RealtorCrud.select());
        getServletContext().getRequestDispatcher("/admin/realtors-list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("realtors", RealtorCrud.select());
        getServletContext().getRequestDispatcher("/admin/realtors-list.jsp").forward(request, response);
    }
}
