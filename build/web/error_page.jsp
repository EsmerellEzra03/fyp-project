<%-- 
    Document   : error
    Created on : Jun 28, 2021, 2:20:59 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry! Something Went Wrong</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background {
         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);
            }
        </style>
         
    </head>
    <body>
        <div class="container text-center">
            <img src="img/error.png" alt="alt" class="img-fluid"/>
            <h3 class="display-3">Sorry! Something Went Wrong...</h3>
          
            <%=exception%>
            <a href="index.jsp" class="btn primary-background btn-lg text-white mt-3">HOME</a>
            
        </div>
        
        
    </body>
</html>
