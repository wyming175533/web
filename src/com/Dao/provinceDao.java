package com.Dao;

import com.empty.province;

import java.sql.*;

public class provinceDao {


    public province queryProvinceNameById(Integer provinceid){
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="";
        String name="";
        province pr=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","3333");
            sql="select * from province where id=?";
            ps=conn.prepareStatement(sql);
            ps.setInt(1,provinceid);
            rs=ps.executeQuery();
            while(rs.next()){
                pr=new province();
                pr.setId(rs.getInt("id"));
                pr.setName(rs.getString("name"));
                pr.setJiancheng(rs.getString("jiancheng"));
                pr.setShenghui(rs.getString("shenghui"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if( rs != null){
                    rs.close();
                }
                if( ps != null){
                    ps.close();
                }
                if( conn != null){
                    conn.close();
                }

            }catch(Exception e){
                e.printStackTrace();
            }

        }
        return pr;
    }
}
