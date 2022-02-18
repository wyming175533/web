package com.controll;

import java.io.IOException;
import java.io.PrintWriter;

public class bmiServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String name=request.getParameter("name");
        String h=request.getParameter("h");
        String g=request.getParameter("g");

        float he=Float.valueOf(h);
        float ge=Float.valueOf(g);
        float bmi=he/(ge*ge);

        String msg="你的msg值是"+bmi;

        PrintWriter out=response.getWriter();
        out.println(msg);
        out.flush();
        out.close();

    }
}
