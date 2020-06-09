package servlets;

import cruds.RealtorCrud;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signin")
public class SignInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String phone = request.getParameter("login");
        String pass = request.getParameter("password");
        Integer id = RealtorCrud.auth(phone, pass);
        if (id == 0){
            response.sendRedirect("/signin");
        } else {
            request.getSession().setAttribute("id", id);
            response.sendRedirect("/cabinet");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/realtor/signin.jsp").forward(request, response);
    }
}
