package com.example.demo5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "DistrServlet", value = "/DistrServlet")
public class DistrServlet extends HttpServlet {
    private  ArrayList<Apart> parts = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("parts", parts);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String distr = request.getParameter("distr");

          parts = DataBase.paramDistr(distr);

            getServletContext().getRequestDispatcher("/category.jsp").forward(request, response);

        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/category.jsp").forward(request, response);
        }
    }}


