<%-- 
    Document   : OrderProcessing
    Created on : Jul 7, 2021, 6:15:36 PM
    Author     : User
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background {
         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);
       
            }
        </style>
    </head>
    
    
    
    
    
      
<body style="background-color:blanchedalmond">
        
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/delivereat";%>
<%!String user = "root";%>
<%!String psw = "admin";%>
<form action="#">
<%
String cartId=(String)session.getAttribute("cart_id");
String totalAmount="";    
Connection con = null;

PreparedStatement ps = null;
PreparedStatement ps1 = null;
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
            
String sql_1 = "SELECT * FROM orders WHERE status='Pending' or status='Confirmed'";

ps = con.prepareStatement(sql_1);
ResultSet rs = ps.executeQuery(); 



%>

</form>

    <div class="container">   
    <form method="post" action="ProcessOrderAdmin.jsp" >
        
    <div class="form-group"> 
       <label for="orderId">Order Id</label>
       <!--<input type="text" class="form-control" id="" name="order_id" placeholder="Enter order_id">-->
       <select style="width:150px;" id="order_id" name="order_id">
<%
while(rs.next())
{

String order_id= rs.getString("order_id");
%>
<option  value="<%=order_id%>"><%=order_id%></option>
<%
}
%>
        </select>
    </div>
        
        
    <div class="form-group">
       <label for="orderDate">Order Date</label>
       <input type="date" class="form-control" id="" name="order_date" placeholder="OrderDate" required="required">
    </div>   
       
        
    <div class="form-group">
       <label for="orderTime">Order Time</label>
       <input type="time" class="form-control" id="" value ="" name="order_time" placeholder="OrderTime" required="required">
    </div>       
        
        
    <div class="form-group">
      <label for="cartId">Cart Id</label>
      <input type="text" class="form-control" id="" name="cart_id" placeholder="CartId" value="<%=cartId%>">
    </div>
        
    
    <div class="form-group">        
        <label>Customer Name:</label>
        <select id="custId" name="custId">
<%
    String sql = "SELECT * FROM customer";

ps1 = con.prepareStatement(sql);
ResultSet rs1 = ps1.executeQuery(); 
while(rs1.next())
{
String cname = rs1.getString("custname"); 
String cId= rs1.getString("custId");
%>
<option value="<%=cId%>"><%=cname%></option>
<%
}
%>
        </select>
</p>
<%
    
    String sql2 = "SELECT * From deliverymen";
    ps=con.prepareStatement(sql2);
    ResultSet rs2=ps.executeQuery();
    
    %>
</div>                                                
                                            
        

    <div class="form-group">
        <label for="totalAmount">Total Amount</label>
        <input type="text" class="form-control" id="" name="total_amount" placeholder="amount" value="<%=totalAmount%>">
    </div>

    <div class="form-group">
        <label>Status:</label>
        <select class="form-control" name="status" id="payment_type" placeholder="Choose one">
                    <option value="Confirmed"> Confirmed/Assigned </option>
                    <option value="Delivered"> Delivered </option>
        </select>             
    </div>
   
  
  
    <div class="form-group">
        <label>Select DeliveryMen:</label>
            <select id="deliveryMen" name="deliveryMen">
<%
while(rs2.next())
{
String deliveryMenName = rs2.getString("deliv_name"); 
String deliveryMenId= rs2.getString("deliv_menId");
%>
<option value="<%=deliveryMenId%>"><%=deliveryMenName%></option>
<%
}
%>
        </select>
</p>
<%
}
catch(SQLException sqe)
{ 
out.println(sqe);
}
%>
    </div>
        
    
        <button type="submit" class="btn btn-primary">Submit Order</button>
</form>
  
  <%
      if ((session.getAttribute("order_id") != "")) 
      { 
          %>
          
          <%
      }
  %>
    </div>      
        
