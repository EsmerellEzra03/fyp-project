<%-- 
    Document   : Restaurant_List
    Created on : Jun 28, 2021, 8:49:25 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    
       <%@include file="Adminprofile.jsp"%>
    <body style="background-color:blanchedalmond">
        <header>
         
        </header>
                
                <br>
                <div class="row">
                    <div class="container">
                        <h3 class="text-center">List of Restaurants</h3>
                        <hr>
             
                    <div class="container text-left">
                        <a href="<%=request.getContextPath()%>/newRest" class="btn btn-success">Add New Restaurant</a><!-- comment -->
                    </div>
                    <br>
                    <table class="table table-bordered " style="border-color:black; border-width:2px;">
                        <thead style="border-color:black; border-width:2px;">
                            <tr style="border-color:black; border-width:2px;">
                                <th style="border-color:black; border-width:2px;">RESTAURANT ID</th><!-- comment -->
                                <th style="border-color:black; border-width:2px;">Restaurant Name</th><!-- comment -->
                                <th style="border-color:black; border-width:2px;">Restaurant Address</th><!-- comment -->
                                <th style="border-color:black; border-width:2px;">Restaurant Contact No</th><!-- comment -->
                                
                                <th style="border-color:black; border-width:2px;">Actions</th>
                            </tr>
                        </thead>
                        
                        <tbody>
                            <c:forEach var="restaurant" items="${listRestaurant}">
                                <tr>
                                    <td style="border-color:black; border-width:2px;">
                                        <c:out value="${restaurant.restId}"/>
                                    </td>
                                    
                                    <td style="border-color:black; border-width:2px;">
                                        <c:out value="${restaurant.restName}"/>
                                    </td>
                                    
                                    <td style="border-color:black; border-width:2px;">
                                        <c:out value="${restaurant.restAddr}"/>
                                    </td>
                                    
                                    <td style="border-color:black; border-width:2px;">
                                        <c:out value="${restaurant.restContact}"/>
                                    </td>
                                    
                                     
                                    
                                    <td style="border-color:black; border-width:2px;">
                                        <a href="editRest?rest_id=<c:out value='${restaurant.restId}'/>">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp;<!-- comment -->
                                        <a href="deleteRest?rest_id=<c:out value='${restaurant.restId}'/>">Delete</a></td>
                                </tr>
                            </c:forEach>
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
