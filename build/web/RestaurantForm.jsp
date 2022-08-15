<%-- 
    Document   : RestaurantForm
    Created on : Jun 28, 2021, 10:40:21 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*, javax.servlet.*"%>
<%@page import="org.apache.commons.fileupload.*"%>
<%@page import="org.apache.commons.fileupload.disk.*"%>
<%@page import="org.apache.commons.fileupload.servlet.*"%>
<%@page import="org.apache.commons.io.output.*"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.sql.*"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
    
 <%@include file="Adminprofile.jsp"%>
    <body style="background-color:blanchedalmond">
        
        <header>
           
        </header>
                    <br>
                    <div class="container col-md-5">
                        <div class="card">
                            <div class="card-body">
                                
                                <c:if test="${restaurant !=null}">
                                    <form action="updateRest" method="post">
                                    </c:if>
                                        
                                    <c:if test="${restaurant == null}">
                                    <form action="insertRest" method="post">
                                    </c:if>
                                        
                                        <h2>
                                            <c:if test="${restaurant != null}">
                                                Edit Restaurant
                                            </c:if> 
                                                
                                             <c:if test="${restaurant == null}">
                                               Add New Restaurant
                                            </c:if> 
                                                
                                        </h2>
                                        
                                        <c:if test="${restaurant !=null}">
                                            <fieldset class="form-group">
                                                <input type="hidden" name="rest_id" value="<c:out value='${restaurant.restId}'/>"/><!-- comment -->                             
                                            </fieldset>
                                        </c:if>
                                            <fieldset class="form-group">
                                                <label>Restaurant ID</label><input type="text" value="<c:out value='${restaurant.restId}'/>"
                                                                                   class="form-control" name="rest_id" required="required"><!-- comment -->                             
                                            </fieldset>
                                                                                   
                                            <fieldset class="form-group">
                                                <label>Restaurant Name</label><input type="text" value="<c:out value='${restaurant.restName}'/>"
                                                                                   class="form-control" name="rest_name" required="required"><!-- comment -->                             
                                            </fieldset>
                                            
                                            <fieldset class="form-group">
                                                <label>Restaurant Address</label><input type="text" value="<c:out value='${restaurant.restAddr}'/>"
                                                                                   class="form-control" name="rest_addr"><!-- comment -->                             
                                            </fieldset>  
                                            
                                            <fieldset class="form-group">
                                                <label>Restaurant Contact No</label><input type="text" value="<c:out value='${restaurant.restContact}'/>"
                                                                                   class="form-control" name="rest_contact"><!-- comment -->                             
                                            </fieldset>                                
                                              
                                                                                   
                                             <button type="submit" class="btn btn-success">Save</button>
                                    
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
