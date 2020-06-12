package servlets;

import cruds.DealCrud;
import cruds.RealtorCrud;
import cruds.RealtyCrud;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cabinet")
public class CabinetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().setAttribute("id", null);
        response.sendRedirect("/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = (Integer) request.getSession().getAttribute("id");
        if(id == null){
            response.sendRedirect("/signin");
            return;
        }
        request.setAttribute("deals", DealCrud.getInfo(id));
        request.setAttribute("realtor", RealtorCrud.get(id));
        request.setAttribute("realties", RealtyCrud.getByRealtor(id));
        request.getRequestDispatcher("/realtor/cabinet.jsp").forward(request, response);
    }
}
