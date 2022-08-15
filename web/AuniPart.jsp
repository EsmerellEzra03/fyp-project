<%-- 
    Document   : AuniPart
    Created on : Jul 6, 2021, 10:56:49 PM
    Author     : User
--%>


<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.deliver.eat.dao.FoodDao"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.deliver.eat.entities.Food"%>
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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DeliverEat</title>
        <link rel="icon" href="icon.png"/>
        <style>
<!--General-->
    body {
  font-family: "Poppins", sans-serif;
  color: #444444;
}

a {
  text-decoration: none;
  color: #ffb03b;
}

a:hover {
  color: #ffc56e;
  text-decoration: none;
}

h1, h2, h3, h4, h5, h6 {
  font-family: "Satisfy", sans-serif;
}     
<!--General section-->
section {
  padding: 60px 0;
}

.section-bg {
  background-color: white;
}

.section-title {
  text-align: center;
  padding-bottom: 30px;
}

.section-title h2 {
  margin: 15px 0 0 0;
  font-size: 32px;
  font-weight: 700;
  color: #5f5950;
}

.section-title h2 span {
  color: #ffb03b;
}

.section-title p {
  margin: 15px auto 0 auto;
  font-weight: 300;
}

@media (min-width: 1024px) {
  .section-title p {
    width: 50%;
  }
}
<!--Menu-->
.menu #menu-flters {
  padding: 0;
  margin: 50% 50%;
  right:50%;
  left:50%;
  list-style: none;
  text-align: center;
  border-radius: 50px;
}

.menu #menu-flters li {
  cursor: pointer;
  display: inline-block;
  padding: 8px 16px 10px 16px;
  font-size: 14px;
  font-weight: 500;
  line-height: 1;
  color: #444444;
  margin: 0 3px 10px 3px;
  transition: all ease-in-out 0.3s;
  background: #fff;
  border: 2px solid #ffb03b;
  border-radius: 50px;
}

.menu #menu-flters li:hover, .menu #menu-flters li.filter-active {
  color: #fff;
  background: #ffb03b;
}

.menu #menu-flters li:last-child {
  margin-right: 0;
}

.menu .menu-content {
  margin-top: 30px;
  overflow: hidden;
  display: flex;
  justify-content: space-between;
  position: relative;
  font-size: 25px;
}

.menu .menu-content::after {
  content: "......................................................................"
 "...................................................................."
 "....................................................................";
  position: absolute;
  left: 20px;
  right: 0;
  top: -4px;
  z-index: 1;
  color: #dad8d4;
  font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
}

.menu .menu-content a {
  padding-right: 10px;
  background:  #fff;
  position: relative;
  z-index: 7;
  font-weight:1000;
  color: #ff9b08;
}

.menu .menu-content span {
  background: #fff;
  position: relative;
  z-index: 3;
  padding: 0 10px;
  font-weight: 600;
}

.menu .menu-ingredients {
  font-style: italic;
  font-size: 14px;
  font-family: "Comic Neue", sans-serif;
  color: #948c81;
}
</style>
    </head>
    <body style="background-color:blanchedalmond">

    </body>
    <section id="menu" class="menu">
      <div class="container">

        <div class="section-title">
          <h2>Check our tasty <span>Menu</span></h2>
        </div>

        <div class="row">
          <div class="col-lg-12 d-flex justify-content-center">
            <ul id="menu-flters">
              <li data-filter="*" class="filter-active">Show All</li>
             
              
            </ul>
          </div>
        </div>
          
          <fieldset class="">
          <label>CART ID:</label>
          <input type="text" value="<%=newcid%>" id="cid" name="cart_id" required="required"><!-- comment -->                             
        </fieldset>

          
                                      <%
                                          if(!foods.isEmpty()) { 
                                          for (Food p:foods) {
                                     %>
                  <form method="post" action="processFoodProfile.jsp">  
                  <input type="hidden" name="cart_id"  value="<%=newcid%>">                   
                                     
        <div class="row menu-container">

          <div class="col-lg-6 menu-item filter-starters">
            <div class="menu-content">
              <a href=""><h6 class="price">Name: <input style="border:0px; background-color:blanchedalmond" type="text" value="<%=p.getFoodName()%>"  name="food_name" required="required" readonly="readonly"><!-- comment --> </h6></a>
              <span> <h6 class="price">Price: <input style="border:0px; background-color:blanchedalmond; font-size:15px" type="text" value="<%=p.getFoodPrice()%>"  name="food_price" required="required" readonly="readonly"><!-- comment -->    </h6> </span>
            </div>
            <div class="menu-ingredients">
                <%=p.getFoodCategory()%></br>
              <%=p.getFoodId()%>
            </div>
             <div class="mt-3 d-flex justify-content-between">
          <input class="btn btn-dark"  type="submit" value="Add to Cart"></a>  
          </div>

          


         

         

        

          
        

          

        </div>
                  
   <%     
              }       
                }
      %>      
      </div>
    </body>
    

</html>
