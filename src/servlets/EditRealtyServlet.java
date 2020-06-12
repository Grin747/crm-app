package servlets;

import cruds.RealtyCrud;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit-realty")
public class EditRealtyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = (Integer) request.getAttribute("realty_id");
        if (id == null) {
            response.sendRedirect("/signin");
            return;
        }
        RealtyCrud.get(id);
    }
}
