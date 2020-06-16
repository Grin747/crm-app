package servlets;

import cruds.AttribCrud;
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
        Integer id = Integer.decode(request.getParameter("id"));
        Integer usr_id = (Integer) request.getSession().getAttribute("id");
        if (usr_id == null) {
            response.sendRedirect("/signin");
            return;
        }
        request.setAttribute("realty", RealtyCrud.get(id));
        request.setAttribute("res_complexes", AttribCrud.select("res_complex"));
        request.setAttribute("cities", AttribCrud.select("city"));
        request.setAttribute("districts", AttribCrud.select("district"));
        request.setAttribute("streets", AttribCrud.select("street"));
        request.setAttribute("docs_types", AttribCrud.select("docs_type"));
        request.setAttribute("obj_types", AttribCrud.select("obj_type"));
        request.setAttribute("own_types", AttribCrud.select("own_type"));
        request.setAttribute("units", AttribCrud.select("square_unit"));
        request.setAttribute("owners", AttribCrud.select("owner"));

        request.getRequestDispatcher("/realtor/edit-realty.jsp").forward(request, response);
    }
}
