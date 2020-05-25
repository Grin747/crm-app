package servlets;

import cruds.AttribCrud;
import entities.Attribute;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/dict")
public class DictServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Attribute> districts = AttribCrud.select("district");
        request.setAttribute("districts", districts);

        ArrayList<Attribute> objTypes = AttribCrud.select("objType");
        request.setAttribute("objTypes", objTypes);

        getServletContext().getRequestDispatcher("/dict.jsp").forward(request, response);
    }
}
