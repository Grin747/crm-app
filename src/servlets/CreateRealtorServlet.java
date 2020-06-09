package servlets;

import cruds.RealtorCrud;
import entities.Realtor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/add-realtor")
public class CreateRealtorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Realtor realtor = new Realtor();

        realtor.setName(request.getParameter("name"));
        realtor.setSurname(request.getParameter("surname"));
        realtor.setPatronymic(request.getParameter("patronymic"));
        realtor.setEmail(request.getParameter("email"));
        realtor.setPhone(request.getParameter("phone"));
        realtor.setPassword(request.getParameter("password"));
        realtor.setSalary(Integer.parseInt(request.getParameter("salary")));
        realtor.setHire_date(new Date());

        RealtorCrud.add(realtor);
        response.sendRedirect(request.getContextPath() + "/admin");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/admin/add-realtor.jsp").forward(request, response);
    }
}
