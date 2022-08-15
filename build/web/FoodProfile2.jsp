<%-- 
    Document   : AuniPart2
    Created on : Jul 9, 2021, 10:16:55 PM
    Author     : User
--%>

<%@page import="com.deliver.eat.entities.Food"%>
<%@page import="com.deliver.eat.dao.FoodDao"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.deliver.eat.entities.Restaurant"%>
<%@page import="java.util.List"%>
<%@page import="com.deliver.eat.dao.RestaurantDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/delivereat";%>
<%!String user = "root";%>
<%!String psw = "admin";%>

<%
Connection con = null;
PreparedStatement ps = null;
int cid=0;
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql = "SELECT MAX(cart_id) FROM cart WHERE status='checkedout'";
ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery(); 

while(rs.next())
{
 cid = rs.getInt(1); 
}
}
catch(SQLException sqe)
{ 
out.println(sqe);
}
int newcid = cid + 1;
%>

<% 
FoodDao pd = new FoodDao();
List<Food> foods = pd.selectAllFoods();
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
    
    <%@include file="Customerprofile.jsp"%>
    <body style="background-color:blanchedalmond">
        <header>
         
        </header>
                
                <br>
                <div class="row">
                    <div class="container">
                        <div class="card-header my-3">DELIVEREAT </div> 
                        <h3 class="text-center">List of Menus</h3>
                        <hr>
             
                    <div class="container text-right">
                       
                    </div>
                    <br>
                     <fieldset class="form-group">
          <label hidden>CART ID:</label>
          <input type="text" value="<%=newcid%>" id="cid" name="cart_id" required="required" hidden="hidden"><!-- comment -->                             
        </fieldset>
                    <table class="table table-bordered " style="border-color:black; border-width:2px; margin-left:15%">
                        <thead style="border-color:blanchedalmond; border-width:2px;">
                            <tr style="border-color:blanchedalmond; border-width:2px;">
                                 <th style="border-color:blanchedalmond; border-width:2px;"> </th><!-- comment -->
                                
                                    <th style="border-color:blanchedalmond; border-width:2px;"></th>
                                   
                            </tr>
                        </thead>
                        
                        <tbody>
                           
                          
                                      <%
                                          if(!foods.isEmpty()) { 
                                          for (Food p:foods) {
                                     %>
                                     <tr>
                                        <form method="post" action="processFoodProfile.jsp">
                                           <input type="hidden" name="cart_id"  value="<%=newcid%>">
                                
                                    
                                    
                                    
                                    <td style="border-color:blanchedalmond; border-width:2px; background-color:#ffb03b">
                                        <h6 class="price" style="color:black">Name: <input style="border:0px; width:200px; background-color:#ffb03b;" type="text" value="<%=p.getFoodName()%>"  name="food_name" required="required" readonly="readonly"></h6>
                                        <h5 class="card-title" style="font-size:15px;"> Category: <%=p.getFoodCategory()%></h5>
                                        <h6 class="price">Price: <input style="border:0px; background-color:#ffb03b;" type="text" value="<%=p.getFoodPrice()%>"  name="food_price" required="required" readonly="readonly">
                                        <h5 class="card-title" style="font-size:15px;"> Restaurant: <%=p.getRestId()%></h5>
                                            </td>
                                    
                                    
                                    
                                    
                                    <td style="border-color:blanchedalmond; border-width:2px; ">
                                           <input class="btn btn-dark"  type="submit" value="Add to Cart"></a>  
                                    </td>
                                </tr>
                                      </form>
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
