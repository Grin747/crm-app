package servlets;

import add.Tools;
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
            realty.setCommission(Integer.parseInt(request.getParameter("commission")));

            realty.setCity(Integer.parseInt(request.getParameter("city")));
            realty.setStreet(Tools.parse(request.getParameter("street")));
            realty.setDistrict(Tools.parse(request.getParameter("district")));
            realty.setRes_complex(Tools.parse(request.getParameter("res_complex")));
            realty.setBuilding(request.getParameter("building"));

            realty.setSquare(Float.parseFloat(request.getParameter("square")));
            realty.setSquare_unit(Integer.parseInt(request.getParameter("square_unit")));
            realty.setRoom_count(Tools.parse(request.getParameter("room_count")));
            realty.setFloor(Tools.parse(request.getParameter("floor")));

            realty.setObj_type(Tools.parse(request.getParameter("obj_type")));
            realty.setDocs_type(Tools.parse(request.getParameter("docs_type")));

            realty.setOwner(Tools.parse(request.getParameter("owner")));

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
        if(id == null) response.sendRedirect("/notfound.jsp");
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
