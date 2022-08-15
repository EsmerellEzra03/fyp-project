<%-- 
    Document   : ProcessOrderAdmin
    Created on : Jul 7, 2021, 6:37:42 PM
    Author     : User
--%>

<%@page import="com.deliver.eat.dao.OrderDao"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%



//String cart_id= "c" + cartNo;
int order_id =Integer.parseInt(request.getParameter("order_id"));
int cart_id =Integer.parseInt(request.getParameter("cart_id"));
int custId =Integer.parseInt(request.getParameter("custId"));
String total_amount=request.getParameter("total_amount");
String order_date=request.getParameter("order_date");
String order_time=request.getParameter("order_time");
String status=request.getParameter("status");
String deliveryMen=request.getParameter("deliveryMen");

OrderDao orderdao= new OrderDao();



try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/delivereat", "root", "admin");
Statement st=conn.createStatement();

if (status == "Delivered")
{
    boolean i = orderdao.updateOrderStatusDelivered(order_id);
}



response.sendRedirect("OrderCheckOut.jsp");


}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
