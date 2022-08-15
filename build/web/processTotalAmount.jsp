<%-- 
    Document   : processTotalAmount
    Created on : Jul 6, 2021, 4:25:03 PM
    Author     : User
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/delivereat";%>
<%!String user = "root";%>
<%!String psw = "admin";%>
<form action="#">
<%
Connection con = null;
PreparedStatement ps = null;
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql = "SELECT SUM(food_price) FROM `cart` WHERE cart_id=2";
ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery(); 
%>
<%
while(rs.next())
{
String totalAmount = rs.getString("total_amount"); 

}

}
catch(SQLException sqe)
{ 
out.println(sqe);
}
%>
