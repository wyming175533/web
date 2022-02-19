package com.controll;

import com.Dao.provinceDao;
import com.empty.province;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class queryjsonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        String proid=request.getParameter("proid");
        String json="{}";
        if( proid != null && proid.trim().length() > 0 ){
            provinceDao dao=new provinceDao();
            province pr=dao.queryProvinceNameById(Integer.valueOf(proid));
            //需要使用jackson 把  Provice对象转为  json
            ObjectMapper om  = new ObjectMapper();
            json =  om.writeValueAsString(pr);
        }
        PrintWriter out=response.getWriter();
        out.println(json);


    }
}
