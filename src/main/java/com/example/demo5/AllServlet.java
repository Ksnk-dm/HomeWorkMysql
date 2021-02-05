package com.example.demo5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AllServlet", value = "/AllServlet")
public class AllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Apart> parts = DataBase.select();
        request.setAttribute("apart", parts);
        getServletContext().getRequestDispatcher("/insert.jsp").forward(request, response);

    }

}
