

<%@page import="com.deliver.eat.entities.Restaurant"%>
<%@page import="java.util.List"%>
<%@page import="com.deliver.eat.dao.RestaurantDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 

RestaurantDao pd = new RestaurantDao();
List<Restaurant> restaurants = pd.selectAllRestaurants();
%>
<!DOCTYPE html>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
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
                <div class="row">
                    <div class="container">
                        <div class="card-header my-3">DELIVEREAT </div> 
                        <h3 class="text-center">List of Restaurants</h3>
                        <hr>
             
                    <div class="container text-left">
                       
                    </div>
                    <br>
                    <table class="table table-bordered " style="border-color:black; border-width:2px;">
                        <thead style="border-color:black; border-width:2px;">
                            <tr style="border-color:black; border-width:2px;">
                              
                                <th style="border-color:black; border-width:2px;">Restaurant Name</th><!-- comment -->
                                <th style="border-color:black; border-width:2px;">Restaurant Address</th><!-- comment -->
                                <th style="border-color:black; border-width:2px;">Restaurant Contact No</th><!-- comment -->
                              
                            </tr>
                        </thead>
                        
                        <tbody>
                            <%
                                          if(!restaurants.isEmpty()) { 
                                          for (Restaurant p:restaurants) {
                                     %>
                                <tr>
                                    
                                    
                                    <td style="border-color:black; border-width:2px;">
                                              <%=p.getRestName()%>
                                    </td>
                                    
                                    <td style="border-color:black; border-width:2px;">
                                           <%=p.getRestAddr()%>
                                    </td>
                                    
                                    <td style="border-color:black; border-width:2px;">
                                           <%=p.getRestContact()%>
                                    </td>
                                    
                                    
                                    
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
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
<script>        
                </body>
</html>
