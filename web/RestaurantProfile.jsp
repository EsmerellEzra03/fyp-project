<%-- 
    Document   : RestaurantProfile
    Created on : Jul 3, 2021, 3:01:46 AM
    Author     : User
--%>

<%@page import="com.deliver.eat.entities.Restaurant"%>
<%@page import="com.deliver.eat.dao.RestaurantDao"%>

<%@page import="java.util.List"%>
<%@page import="com.deliver.eat.DB.ConnectionProvider"%>
<%@page import="com.deliver.eat.dao.FoodDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

RestaurantDao pd = new RestaurantDao();
List<Restaurant> restaurants = pd.selectAllRestaurants();
%>



<!DOCTYPE html>
<html>
    <head>
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Restaurant Profile</title>
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
        
   
    
    
            <div class="container">
            <div class="card-header my-3">All Restaurants </div> 
            
            <div class="row">
        
                                      <%
                                          if(!restaurants.isEmpty()) { 
                                          for (Restaurant p:restaurants) {
                                     %>
                                     
                                     
            <div class="col-md-3 my-3 ">
            <div class="card w-100" style="width: 18rem;">
         
 
                <div class="card-body" style="background-color:#9E6B55; height:200px;" >
          <h5 class="card-title text-white" hidden><%=p.getRestId()%></h5>
          <h6 class="price text-white">Restaurant Name: <%=p.getRestName()%></h6>
          <h6 class="category text-white">Address: <%=p.getRestAddr()%> </h6>
          <h6 class="category text-white">Contact No: <%=p.getRestContact()%> </h6>
    
          
   <div class="mt-3 d-flex justify-content-between">
           
         
   </div>

   </div>
  
            
           </div>
           </div> 
          
          
          <%     
              }       
                }
      %>      
      
              </div>
              </div> 
        
        
 <script src="https://code.jquery.com/jquery-3.6.0.min.js"
 integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
 crossorigin="anonymous"></script>
       
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>
     </body>
</html>
