package servlets;

import cruds.DealCrud;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deal-delete")
public class DealDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.decode(request.getParameter("realty_id"));
        DealCrud.delete(id);
        response.sendRedirect(request.getContextPath() + "/cabinet");
    }
}
