<%-- 
    Document   : FoodCart
    Created on : Jul 2, 2021, 4:51:13 PM
    Author     : User
--%>

<%@page import="com.deliver.eat.dao.FoodDao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.deliver.eat.entities.Cart2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

ArrayList<Cart2> cart_list=(ArrayList<Cart2>) session.getAttribute("cart-list");
List<Cart2> cartFood = null;
if(cart_list != null) {
    FoodDao pDao = new FoodDao();
    cartFood=pDao.getCartFoods(cart_list);
    
    request.setAttribute("cart_list",cart_list);
}




%>




<!DOCTYPE html>
<html>
    <head>
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
       
       
         <%@include file="Customerprofile.jsp"%>
    <body style="background-color:blanchedalmond">
        <div class="container">
            <div class="card-header my-3">DELIVEREAT Cart</div> 
            <div class="d-flex py-3"><h3>FOOD ITEM</h3><a class="mx-3 btn btn-primary">Check Out</a></div>   
                <table class="table table-Loght">
                    <thead>
                        <tr>
                            <th scope="col">ID</th> 
                            <th scope="col">Name</th> 
                            <th scope="col">Category </th> 
                            <th scope="col">Restaurant</th> 
                            <th scope="col">Price</th> 
                            <th scope="col">Buy Now</th> 
                            <th scope="col">Cancel</th> 
                        </tr>
                    </thead>
                    
                            <tbody>
                                <%if(cart_list !=null) {
                                    for(Cart2 c:cartFood) {
                                        %>
                                       <tr>
                                <td><%=c.getFoodId()%></td>
                                 <td><%=c.getFoodName()%></td>
                                <td><%=c.getFoodCategory()%></td>
                                 <td><%=c.getFoodPrice()%></td>
                                 
                                <td>
                                    
                                    <form>
                                        <form action="" method="post" class="form-inline"><!-- comment -->
                                        <input   type="hidden" name="foodId"  value="<%=c.getFoodId()%>" class="form-input">
                                        <div class="form-group d-flex justify-content-between">
                                        <a class="btn btn-sm btn-decre" href=""><i class="fas fa-minus-square"></i></a>
                                        <input type="text" name="quantity" class="form-control" value="1" readonly>
                                        <a class="btn btn-sm btn-incre" href=""><i class="fas fa-plus-square"></i></a>
                                        </div>
                                    </form>
                                </td>
                                
                                        <td><a class="btn btn-sm btn-danger" href="">Remove</td>
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
