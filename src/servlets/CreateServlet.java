package servlets;

import cruds.DistrictCrud;
import cruds.RealtyCrud;
import entities.District;
import entities.Realty;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create")
public class CreateServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            try {
                Realty realty = new Realty();
                realty.setFloor(Integer.parseInt(request.getParameter("floor")));
                RealtyCrud.insert(realty);
                response.sendRedirect(request.getContextPath()+"/index");
            }
            catch(Exception ex) {

                getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
            }
        }
}
