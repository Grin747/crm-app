package servlets;

import cruds.ClientCrud;
import cruds.DealCrud;
import cruds.RealtyCrud;
import entities.Deal;
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

@WebServlet("/add-deal")
public class CreateDealServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date d;
        try {
            d = format.parse(request.getParameter("date"));
        } catch (ParseException ex) {
            response.sendRedirect("/add-deal");
            return;
        }
        Deal deal = new Deal(
                Integer.decode(request.getParameter("client")),
                Integer.decode(request.getParameter("realty")),
                (Integer) request.getSession().getAttribute("id"),
                Integer.decode(request.getParameter("profit")),
                d
        );
        DealCrud.add(deal);
        response.sendRedirect("/cabinet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("clients", ClientCrud.select());
        request.setAttribute("realties", RealtyCrud.getCards());
        request.getRequestDispatcher("/realtor/add-deal.jsp").forward(request, response);
    }
}
