package com.example.demo5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddApartServlet", value = "/AddApartServlet")
public class AddApartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String distr = request.getParameter("distr");
            String adrs = request.getParameter("adrs");
            int area = Integer.parseInt(request.getParameter("area"));
            int rooms = Integer.parseInt(request.getParameter("rooms"));
            int price = Integer.parseInt(request.getParameter("price"));
            Apart apart = new Apart(distr, adrs, area, rooms, price);
            DataBase.insert(apart);
            request.setAttribute("added", "add");
            getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);

        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
        }
    }
}
