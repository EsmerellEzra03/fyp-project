

<%@page import="com.deliver.eat.entities.Cart"%>
<%@page import="com.deliver.eat.dao.CartDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.deliver.eat.entities.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.deliver.eat.dao.OrderDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

CartDao pd = new CartDao();
List<Cart> carts = pd.selectAllCarts2();

%>




<!DOCTYPE html>
<html>
    <head>
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  
    
        <style type="text/css">
            .table tbody td{
                vartical-align:middle;
            }
            
            .btn-incre, .btn-decre{
                box-shadow:none;
                font-size:25px;
            }
        </style> 
       </head>
       
       
       <%@include file="DeliveryMenprofile.jsp"%>  
    <body style="background-color:blanchedalmond">
        <div class="container">
            <div class="card-header my-3">DELIVEREAT Order</div> 
            <div class="d-flex py-3"><h3>Order</h3></div>   
                <table class="table table-Loght">
                    <thead>
                        <tr>
                            <th scope="col">Cart ID</th> 
                            <th scope="col">Food Name</th> 
                            <th scope="col">Food Price </th> 
                           
                             
                        </tr>
                    </thead>
                    
                            <tbody>
                                <%
                                   if(!carts.isEmpty()) { 
                                          for (Cart p:carts) {
                                        %>
                                       <tr>
                                <td><%=p.getCartId()%></td>
                                <td><%=p.getFoodName()%></td>
                                <td><%=p.getFoodPrice()%></td>
                                
                                       
                                
                                
                                       <td><a class="btn btn-sm btn-danger" href="deleteCart2?cart_id=<%=p.getCartId()%>">Remove</a></td>
                            </tr>   
                            <%
                                    }
                                }
                                %>
                             
                            </tbody>
                </table>
            
        </div>
        
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
       
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>
    </body>
</html>
