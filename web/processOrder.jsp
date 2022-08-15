<%-- 
    Document   : processOrder
    Created on : Jul 5, 2021, 6:34:51 PM
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
//int order_id =Integer.parseInt(request.getParameter("order_id"));
int cart_id =Integer.parseInt(request.getParameter("cart_id"));
int custId =Integer.parseInt(request.getParameter("custId"));
String total_amount=request.getParameter("total_amount");
String order_date=request.getParameter("order_date");
String order_time=request.getParameter("order_time");
String status=request.getParameter("status");
String deliveryMen=request.getParameter("deliveryMen");
String deliv_addr=request.getParameter("deliv_addr");
String contact_no=request.getParameter("contact_no");
String payment_method=request.getParameter("payment_method");
String card_no=request.getParameter("card_no");

OrderDao orderdao= new OrderDao();



try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/delivereat", "root", "admin");
Statement st=conn.createStatement();




int i=st.executeUpdate("insert into orders(cart_id,custId,total_amount,order_date,order_time,status,deliveryMen,deliv_addr,contact_no,payment_method,card_no) values ("+cart_id+","+custId+",'"+total_amount+"','"+order_date+"','"+order_time+"','"+status+"','"+deliveryMen+"','"+deliv_addr+"','"+contact_no+"','"+payment_method+"','"+card_no+"')");

Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/delivereat", "root", "admin");
PreparedStatement statement= connection.prepareStatement("update cart set status='checkedout' where cart_id=?;");

        statement.setInt(1, cart_id);
        int rowUpdated = statement.executeUpdate();
        
 int orderId=orderdao.getOrderId();
 
 session.setAttribute("order_id",String.valueOf(orderId));
         
response.sendRedirect("OrderByCustomer.jsp");


}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
