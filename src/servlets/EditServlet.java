package servlets;

import cruds.DistrictCrud;
import entities.District;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            District district = DistrictCrud.selectOne(id);
            if(district!=null) {
                request.setAttribute("district", district);
                getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
            }
            else {
                getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            }
        }
        catch(Exception ex) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            District district = new District(id, name);
            DistrictCrud.update(district);
            response.sendRedirect(request.getContextPath() + "/index");
        }
        catch(Exception ex) {

            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}