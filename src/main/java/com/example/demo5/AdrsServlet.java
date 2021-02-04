package com.example.demo5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AdrsServlet", value = "/AdrsServlet")
public class AdrsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search = request.getParameter("Search");
        ArrayList<Apart> aparts = DataBase.paramStreet(search);
        request.setAttribute("adrsparam", aparts);
        getServletContext().getRequestDispatcher("/category/adrs.jsp").forward(request, response);
    }
}
