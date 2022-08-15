<%-- 
    Document   : main_loginPage
    Created on : Jun 28, 2021, 1:30:15 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head><html>
      <style>
body {
        background-color:blanchedalmond;
        background-size: 100%;
      }
      
#boxShadows1{ 
width:1515px;
height:80px;
background-color:white;
box-shadow:10px 10px 5px #666666;
text-align:center;
}

.loginpage {
  position: absolute;
  right:550px;
  top:200px;
  width: 400px;
  height:400px;
  border: 3px solid blanchedalmond;
  box-shadow:1px 1px 10px 1px #666666;
  padding: 10px;
}

.alphabet{
    font-family:'verdana';
    font-size:20px;
    
    
}
.center {
  margin: 0;
  position: absolute;
  top: 31%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
.admin {
  margin: 0;
  position: absolute;
  top: 60%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
.delivery {
  margin: 0;
  position: absolute;
  top: 90%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
    </style>
    <%@include file="main_loginPage_navbar.jsp"%>
    <head>
        
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
    <body>
        
 
 
        
        <div class="loginpage">
            <div class="alphabet"><b>HEY THERE!</b></div>
            <p> We welcome you as?</p><br>
            
            <div class="center">
            <a href="customerLogin_page.jsp">
            <input type="button" value="CUSTOMER" name="customer" style="float:right; width:400px; height:50px; background-color:#EF9B0F; border-width:3px; border-color:darkblue;">
            </a>
                </div>
            
            <br><br><br><p style="text-align:center;">or</p><br>
            
            <div class="admin">
            <a href="adminLogin_page.jsp">
            <input type="button" value="ADMINISTRATOR" name="administrator"  style="float:right; width:400px; height:50px; background-color:#EF9B0F;  border-width:3px; border-color:darkblue;">
            </a>
            </div>
            <br><br><p style="text-align:center;">or</p><br>
            
            <div class="delivery">
            <a href="deliveryMenLogin_page.jsp">
            <input type="button" value="DELIVERYMEN" name="delivermen"  style="float:right; width:400px; height:50px; background-color:#EF9B0F;  border-width:3px; border-color:darkblue;">
            </a>
            </div>
        </div>
     
        
        
        
    </body>
</html>