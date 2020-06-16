package servlets;

import cruds.AttribCrud;
import cruds.RealtyCrud;
import entities.Realty;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/add-realty")
public class CreateRealtyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = (Integer) request.getSession().getAttribute("id");
        Realty realty = new Realty(id);

        try {
            realty.setIn_price(Integer.parseInt(request.getParameter("in_price")));
            realty.setCash_price(Integer.parseInt(request.getParameter("cash_price")));
            realty.setMort_price(Integer.parseInt(request.getParameter("mort_price")));

            realty.setCity(Integer.parseInt(request.getParameter("city")));
            realty.setStreet(Integer.parseInt(request.getParameter("street")));
            realty.setDistrict(Integer.parseInt(request.getParameter("district")));
            realty.setRes_complex(Integer.parseInt(request.getParameter("res_complex")));
            realty.setBuilding(request.getParameter("building"));

            realty.setSquare(Float.parseFloat(request.getParameter("square")));
            realty.setSquare_unit(Integer.parseInt(request.getParameter("square_unit")));
            realty.setRoom_count(Integer.parseInt(request.getParameter("room_count")));
            realty.setFloor(Integer.parseInt(request.getParameter("floor")));

            realty.setObj_type(Integer.parseInt(request.getParameter("obj_type")));
            realty.setOwn_type(Integer.parseInt(request.getParameter("own_type")));
            realty.setDocs_type(Integer.parseInt(request.getParameter("docs_type")));

            realty.setOwner(Integer.parseInt(request.getParameter("owner")));

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Date d;
            try {
                d = format.parse(request.getParameter("delivery_date"));
            } catch (ParseException ex) {
                d = null;
            }
            realty.setDelivery_date(d);
            realty.setComment(request.getParameter("comment"));
        } catch (Exception ex) {
            ex.printStackTrace();
            response.sendRedirect("/add-realty");
        } finally {
            RealtyCrud.add(realty);
            response.sendRedirect("/cabinet");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = (Integer) request.getSession().getAttribute("id");
        if(id == null) response.sendRedirect("/signin");
        request.setAttribute("res_complexes", AttribCrud.select("res_complex"));
        request.setAttribute("cities", AttribCrud.select("city"));
        request.setAttribute("districts", AttribCrud.select("district"));
        request.setAttribute("streets", AttribCrud.select("street"));
        request.setAttribute("docs_types", AttribCrud.select("docs_type"));
        request.setAttribute("obj_types", AttribCrud.select("obj_type"));
        request.setAttribute("own_types", AttribCrud.select("own_type"));
        request.setAttribute("units", AttribCrud.select("square_unit"));
        request.setAttribute("owners", AttribCrud.select("owner"));

        getServletContext().getRequestDispatcher("/realtor/add-realty.jsp").forward(request, response);
    }
}
