<%-- 
    Document   : FoodForm
    Created on : Jun 29, 2021, 5:41:30 PM
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
   
   <%@include file="Adminprofile.jsp"%>
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
String sql = "SELECT * FROM restaurant";
ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery(); 
%>

</form>
                                
                                
                                <c:if test="${food !=null}">
                                    <form action="update" method="post">
                                    </c:if>
                                        
                                    <c:if test="${food == null}">
                                    <form action="insert" method="post">
                                    </c:if>
                                        
                                        <h2>
                                            <c:if test="${food != null}">
                                                Edit Food Item
                                            </c:if> 
                                                
                                             <c:if test="${food == null}">
                                               Add New Food Item
                                            </c:if> 
                                                
                                        </h2>
                                        
                                        <c:if test="${food !=null}">
                                            <fieldset class="form-group">
                                                <input type="hidden" name="food_id" value="<c:out value='${food.foodId}'/>"/><!-- comment -->                             
                                            </fieldset>
                                        </c:if>
                                        
                                        
                                        
                                            <fieldset class="form-group">
                                                
                                                
                                                
                                                <label>Food ID</label><input type="text" value="<c:out value='${food.foodId}'/>"
                                                class="form-control" name="food_id" required="required"><!-- comment -->                             
                                            </fieldset>
                                                                                   
                                            <fieldset class="form-group">
                                                <label>Food Name</label><input type="text" value="<c:out value='${food.foodName}'/>"
                                                                                   class="form-control" name="food_name" required="required"><!-- comment -->                             
                                            </fieldset>
                                            
                                            <fieldset class="form-group">
                                                
                                               <label>Select Restaurant :</label>
<select id="rest-name" name="rest_id">
<%
while(rs.next())
{
String rname = rs.getString("rest_name"); 
String rId= rs.getString("rest_id");
%>
<option value="<%=rname%>"><%=rname%></option>
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
                                                <label>Food Category</label><input type="text" value="<c:out value='${food.foodCategory}'/>"
                                                                                   class="form-control" name="food_category"><!-- comment -->                             
                                            </fieldset> 
                                                                                   
                                    
                                     <fieldset class="form-group">
                                                <label>Food Price</label><input type="text" value="<c:out value='${food.foodPrice}'/>"
                                                                                   class="form-control" name="food_price"><!-- comment -->                             
                                            </fieldset> 
                                   <button type="submit" class="btn btn-success">Save</button></a
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
