<%-- 
    Document   : adminLogin_page
    Created on : Jun 28, 2021, 2:41:55 AM
    Author     : User
--%>

<%@page import="com.deliver.eat.entities.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <!-- css -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background {
         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);
            }
            </style>
        
        
        
        
    </head>
    <body style="background-color:blanchedalmond">
        
        <!<!-- navbar -->
        
        
        
        
          <%@include file="normal_navbar.jsp"%>
        <main class="d-flex align-items-center primary-background banner-background " style="height:90vh; "">
            
            <div class="container" >
                <div class="row">
                    <div class="col-md-4 offset-md-4">
                      
                        <div class="card" style="background-color:#EF9B0F;">
                            <div class="card-header  text-white text-center" style="background-color:#EF9B0F;">
                                <span class="fa fa-user-plus fa-3x text-white" ></span>
                                    
                                <br>   
                                <p>Login here</p>
                            </div>
                            
                           <%
                             Message m=(Message)session.getAttribute("msg");  
                           if (m!=null){
                               %>
                               <div class="alert <%=m.getCssClass()%>" role="alert">
                                <%=m.getContent()%>
                                </div>
                          <%
                              session.removeAttribute("msg");
                           }

                           
                           
                           %>
                            
                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                        
                            <div class="card-body">
                                <form action="AdminLoginServlet" method="POST">
  <div class="form-group">
    <label for="exampleInputEmail1">Admin Name</label>
    <input name="adname" required type="text" class="form-control" id="admin_name" aria-describedby="emailHelp" placeholder="Enter Name">
    <small id="emailHelp" class="form-text text-white">We'll never share your details with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input  name="adpassword" required type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  
                                    <div class="container text-center">
  <button type="submit" class="btn btn-primary  text-muted" style="background-color:blanchedalmond">LOG IN</button>
                                    </div>
                                    
                                    <div class="mt-4">
					<div class="d-flex justify-content-center links">
                                            New at work? <a class="ml-2" href="adminRegister_Page.jsp">Sign Up</a>
</form>
                                
                            </div>
                            
                            
                        </div>
                        
                        
                        </form>

                    </div>
                    
                </div>
                </div>
        </main>