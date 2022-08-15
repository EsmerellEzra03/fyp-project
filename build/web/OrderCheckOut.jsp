<%-- 
    Document   : OrderCheckOut
    Created on : Jul 5, 2021, 6:26:26 PM
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
    
    
    
    
    
    <%@include file="Customerprofile.jsp"%>     
<body style="background-color:blanchedalmond">
        
<%!String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/delivereat";%>
<%!String user = "root";%>
<%!String psw = "admin";%>
<form action="#">
<%
String cartId=(String)session.getAttribute("cart_id");
String totalAmount="";    
Connection con = null;

PreparedStatement ps = null;
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);

String query="SELECT SUM(food_price) FROM `cart` WHERE cart_id=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(cartId));
            ResultSet rs1 = pstmt.executeQuery(); 
            
   while(rs1.next())
{
 totalAmount = rs1.getString(1); 
    
            
}          
            
String sql = "SELECT * FROM customer";

ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery(); 
%>

</form>

<div class="container" style="background-color:#EF9B0F; margin-top:20px;">   
    <form method="post" action="processOrder.jsp" >
        
   
        
        
    <div class="form-group">
       <label for="orderDate">Delivery  Date</label>
       <input type="date" class="form-control" id="" name="order_date" placeholder="OrderDate" required="required">
    </div>   
       
        
    <div class="form-group">
       <label for="orderTime">Delivery Time</label>
       <input type="time" class="form-control" id="" name="order_time" placeholder="OrderTime" required="required">
    </div>       
        
        
    <div class="form-group">
      <label for="cartId">Cart Id</label>
      <input type="text" class="form-control" id="" name="cart_id" placeholder="CartId" value="<%=cartId%>">
    </div>
        
    
    <div class="form-group">        
        <label>Customer Name:</label>
        <select id="custId" name="custId">
<%
while(rs.next())
{
String cname = rs.getString("custname"); 
String cId= rs.getString("custId");
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
        <label for="Delivery Address">Delivery Address</label>
        <input type="text" class="form-control" id="" name="deliv_addr" placeholder="Delivery Address">
    </div>
    
     <div class="form-group">
        <label for="Contact No">Contact No</label>
        <input type="text" class="form-control" id="" name="contact_no" placeholder="Contact No">
    </div>
     
      <div class="form-group">
        <label>Payment Method</label>
        <select class="form-control" name="payment_method" id="" placeholder="Choose one">
                    <option value="Cash On Delivery">Cash On Delivery</option>
                    <option value="Visa Card">Visa Card</option>
                   
        </select>             
    </div>
     
     
      <div class="form-group">
        <label for="CardNo">Card No</label>
        <input type="text" class="form-control" id="" name="card_no" placeholder="4561-4561-4561-4561">
      </div><!-- comment -->
      
      

    <div class="form-group">
        <label hidden>Status:</label>
        <select class="form-control" name="status" id="payment_type" placeholder="Choose one" hidden="">
                    <option value="Pending">Pending</option>
                   
        </select>             
    </div>
   
  
  
    <div class="form-group">
        <label><!-- Select DeliveryMen --></label>
            <select id="deliveryMen" type="hidden" name="deliveryMen" style="visibility:hidden;">
<%
while(rs2.next())
{
String deliveryMenName = rs2.getString("deliv_name"); 
String deliveryMenId= rs2.getString("deliv_menId");
%>
<option value="<%=deliveryMenName%>"><%=deliveryMenName%></option>
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
       
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
    </body>
    
    
    
</html>
