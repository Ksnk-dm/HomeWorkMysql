package com.example.demo5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ParamServlet", value = "/ParamServlet")
public class ParamServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String search = request.getParameter("Search");
        List<Apart> aparts= DataBase.paramDistr(search);
        request.setAttribute("apartparam", aparts);
        getServletContext().getRequestDispatcher("/category/category.jsp").forward(request, response);
    }
}
