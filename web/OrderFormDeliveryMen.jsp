<%-- 
    Document   : OrderFormDeliveryMen
    Created on : Jul 9, 2021, 12:29:55 AM
    Author     : User
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
    
<%@include file="DeliveryMenprofile.jsp"%>  
    <body style="background-color:blanchedalmond">
        
        <header>
           
        </header>
                    <br>
                    <div class="container col-md-5">
                        <div class="card">
                            <div class="card-body">
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
String sql = "SELECT * FROM deliverymen";
ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery(); 
%>

</form>
                                
                                <c:if test="${order !=null}">
                                    <form action="updateOrder2" method="post">
                                    </c:if>
                                        
                                    <c:if test="${order == null}">
                                    <form action="insertOrder" method="post">
                                    </c:if>
                                        
                                        <h2>
                                            <c:if test="${order != null}">
                                                Edit Order
                                            </c:if> 
                                                
                                             <c:if test="${order == null}">
                                               Add New Order
                                            </c:if> 
                                                
                                        </h2>
                                        
                                        <c:if test="${order !=null}">
                                            <fieldset class="form-group">
                                                <input type="hidden" name="order_id" value="<c:out value='${order.orderId}'/>" readonly="readonly"/><!-- comment -->                             
                                            </fieldset>
                                        </c:if>
                                        
                                           <fieldset class="form-group">
                                                <label>Cart Id</label><input type="text" value="<c:out value='${order.cartId}'/>"
                                                                                   class="form-control" name="cart_id" readonly="readonly"><!-- comment -->                             
                                            </fieldset>
                                                                                   
                                            <fieldset class="form-group">
                                                <label>Cust Id</label><input type="text" value="<c:out value='${order.custId}'/>"
                                                                                   class="form-control" name="custId" readonly="readonly"><!-- comment -->                             
                                            </fieldset>  
                                                                                   
                                              <fieldset class="form-group">
                                                <label>Total Amount</label><input type="text" value="<c:out value='${order.totalAmount}'/>"
                                                                                   class="form-control" name="total_amount" readonly="readonly"><!-- comment -->                             
                                            </fieldset>                                        
                                       
                                            <fieldset class="form-group">
                                                <label>Order Date</label><input type="date" value="<c:out value='${order.orderDate}'/>"
                                                                                   class="form-control" name="order_date" readonly="readonly" ><!-- comment -->                             
                                            </fieldset>
                                                                                   
                                            <fieldset class="form-group">
                                                <label>Order Time</label><input type="time" value="<c:out value='${order.orderTime}'/>"
                                                                                   class="form-control" name="order_time" readonly="readonly" ><!-- comment -->                             
                                            </fieldset>                                        
                                                                                   
                                                                                   
                                    <fieldset class="form-group">
                                               <div class="form-group">
                                                   <label>Status:</label>
                                                       <select class="form-control" name="status" id="payment_type" placeholder="Choose one">
                                                          <option value="Pending">Pending</option>
                                                          <option value="In Progress/Assigned">In Progress/Assigned</option>
                                                          <option value="Delivered">Delivered</option>
                                                       </select>             
                                                       </div>                            
                                            </fieldset> 
                                           <label>Select Restaurant :</label>
<select id="deliveryMen" name="deliveryMen">
<%
while(rs.next())
{
String Dname = rs.getString("deliv_name"); 
String DId= rs.getString("deliv_menId");
%>
<option value="<%=Dname%>"><%=Dname%></option>
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
                                                
                                            </fieldset> 
                                            
                                            <fieldset class="form-group">
 <label>Delivery Address</label><input type="text" value="<c:out value='${order.deliv_addr}'/>"
                           class="form-control" name="deliv_addr" readonly="readonly" ><!-- comment -->                             
</fieldset> 
                                                                                   
<fieldset class="form-group">
    <label>Contact No</label><input type="text" value="<c:out value='${order.contact_no}'/>"
class="form-control" name="contact_no" readonly="readonly" ><!-- comment -->                             
</fieldset> 
                                                                                   
<fieldset class="form-group">
                                               <div class="form-group">
                                                   <label>Payment Method</label>
                                                       <select class="form-control" name="payment_method" id="payment_type" placeholder="Choose one" readonly="readonly">
                                                          <option value="Cash On Delivery">Cash On Delivery</option>
                                                          <option value="Visa Card">Visa Card</option>
                                                          
                                                       </select>             
                                                       </div>                            
                                            </fieldset> 
                                                                                   
  <fieldset class="form-group">
  <label>Card No</label><input type="text" value="<c:out value='${order.card_no}'/>"
         class="form-control" name="card_no" readonly="readonly"><!-- comment -->                             
  </fieldset> 
                                             <button type="Submit" class="btn btn-success">Save</button>
                                    </form>
                            </div>
                        </div>
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


