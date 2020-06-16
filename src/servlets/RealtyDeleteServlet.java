package servlets;

import cruds.DealCrud;
import cruds.RealtyCrud;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-realty")
public class RealtyDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.decode(request.getParameter("id"));
        RealtyCrud.delete(id);
        response.sendRedirect(request.getContextPath() + "/cabinet");
    }
}
