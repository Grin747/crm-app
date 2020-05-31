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

        /*String[] tables = new String[] {"owner"};

        for (String t: tables) {
            ArrayList<Attribute> items = AttribCrud.select(t);
        }*/

        ArrayList<Attribute> owners = AttribCrud.select("owner");
        request.setAttribute("owners", owners);

        ArrayList<Attribute> streets = AttribCrud.select("street");
        request.setAttribute("streets", streets);

        ArrayList<Attribute> res_complexes = AttribCrud.select("res_complex");
        request.setAttribute("res_complexes", res_complexes);

        ArrayList<Attribute> districts = AttribCrud.select("district");
        request.setAttribute("districts", districts);

        ArrayList<Attribute> cities = AttribCrud.select("city");
        request.setAttribute("cities", cities);

        ArrayList<Attribute> own_types = AttribCrud.select("own_type");
        request.setAttribute("own_types", own_types);

        ArrayList<Attribute> docs_types = AttribCrud.select("docs_type");
        request.setAttribute("docs_types", docs_types);

        ArrayList<Attribute> obj_types = AttribCrud.select("obj_type");
        request.setAttribute("obj_types", obj_types);

        ArrayList<Attribute> square_units = AttribCrud.select("square_unit");
        request.setAttribute("square_units", square_units);

        getServletContext().getRequestDispatcher("/admin/dict.jsp").forward(request, response);
    }
}
