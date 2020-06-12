package servlets;

import cruds.RealtorCrud;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/salaries")
public class SalaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer sal = (Integer) request.getAttribute("salary");
        Integer id = (Integer) request.getAttribute("id");
        RealtorCrud.updateSalary(id, sal);
        response.sendRedirect("/salaries");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("realtors", RealtorCrud.select());
        request.getRequestDispatcher("/admin/salaries.jsp").forward(request, response);
    }
}
