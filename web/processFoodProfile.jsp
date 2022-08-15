<%-- 
    Document   : processFoodProfile
    Created on : Jul 3, 2021, 11:34:40 PM
    Author     : User
--%>

<%@page import="com.deliver.eat.entities.Cart"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%



//String cart_id= "c" + cartNo;
int cart_id=Integer.parseInt(request.getParameter("cart_id"));
String food_name=request.getParameter("food_name");
String food_price=request.getParameter("food_price");


try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/delivereat", "root", "admin");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into cart(cart_id,food_name,food_price,status) values ("+cart_id+",'"+food_name+"','"+food_price+"','pending')");
response.sendRedirect("FoodCart2.jsp");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>


