<%-- 
    Document   : Customerprofile
    Created on : Jul 1, 2021, 3:22:06 AM
    Author     : User
--%>

<%@page import="com.deliver.eat.dao.CustomerDao"%>
<%@page import="com.deliver.eat.entities.Customer"%>
<%@page errorPage="error_page.jsp"%>
<%
    


Customer customer=(Customer)session.getAttribute("currentUser");




session.setAttribute("custId2",String.valueOf(customer.getCustId()));

if (customer==null){
    response.sendRedirect("customerLogin_page.jsp");
}

  


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    
        <title>JSP Page</title>
    </head>
    
    <body style="background-color:blanchedalmond;">
        <!-- navbar -->
     <nav class="navbar navbar-expand-lg navbar-dark text-white" style="background-color:tomato;">
         <a class="navbar-brand text-white"  href="Customerprofile.jsp"><span class=""></span>DELIVEREAT</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <a class="nav-link text-white" href="RestaurantProfile.jsp"> <span class=""></span>Restaurants <span class="sr-only">(current)</span></a>
      </li>
     
      
      
      
       <li class="nav-item active">
           <a class="nav-link text-white" href="FoodProfile2.jsp"> <span class=""></span>Menus <span class="sr-only">(current)</span></a>
       </li><!-- comment -->
     
       <li class="nav-item active">
           <a class="nav-link text-white" href="FoodCart2.jsp"> <span class=""></span>My Cart <span class="sr-only">(current)</span></a>
      </li>
      
       <li class="nav-item active">
           <a class="nav-link text-white" href="OrderByCustomer.jsp"> <span class=""></span>My Orders <span class="sr-only">(current)</span></a>
      </li>

    </ul>
      <ul class="navbar-nav mr-right">
           <li class="nav-item">
         <a class="nav-link text-white" href="#!" data-toggle="modal" data-target="#profile-modal"><span class="fa fa-user-circle"></span><%=customer.getCustname()%></a>
      </li>
           <li class="nav-item">
         <a class="nav-link text-white" href="CustomerLogoutServlet"><span class=""></span>LOGOUT</a>
      </li>
          
      </ul>
  </div>
</nav>

        <!-- end of nav bar -->
        
        
        <!--profile modal -->
       
        <!-- Button trigger modal -->


<!-- Modal -->
<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header primary-background text-white text-center">
        <h5 class="modal-title text-muted" id="exampleModalLabel">DELIVEREAT</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <div class="container text-center">
              <img src="/images/pic.jpg" class="img-fluid" style="border-radius:50%;max-width:150px;" />
              
              <br>
        <h5 class="modal-title mt-3" id="exampleModalLabel"><%=customer.getCustname()%></h5>
        <!--//details-->
        
        
        <div id="profile-details">
        <table class="table">
  
  <tbody>
      <tr>
      <th scope="row">ID :</th>
      <td><%=customer.getCustId()%></td>
      
    </tr>
    
    
    <tr>
      <th scope="row">Name :</th>
      <td><%=customer.getCustname()%></td>
      
    </tr>
    
    
    <tr>
      <th scope="row">Email :</th>
      <td><%=customer.getCustemail()%></td>
      
    </tr>
  
    
    <tr>
          <th scope="row">Address :</th>
      <td><%=customer.getCustaddr()%></td>
      
    </tr>
    
     <tr>
          <th scope="row">Password :</th>
      <td><%=customer.getCustpassword()%></td>
      
    </tr>
    
  </tbody>
</table>
        </div>       
        
   <!--profile edit--> 

   <div id="profile-edit" style="display:none;">
       <h3 class="mt-2">Please Edit Carefully</h3>
       <form action="CustomerEditServlet" method="POST" enctype="multipart/form-data">
           <table class="table">
               
               <tr>
                   <td>ID :</td><!-- comment -->  
                   <td><%=customer.getCustId()%></td><!-- comment -->  
               </tr>
               
               <tr>
                   <td>Name :</td><!-- comment -->  
                   <td><input type="text" class="form-control" name="custname" value="<%=customer.getCustname()%>"><!-- comment -->  
               </tr>
               
               <tr>
                   <td>Email:</td><!-- comment -->  
                   <td><input type="email" class="form-control" name="custemail" value="<%=customer.getCustemail()%>"></td><!-- comment -->  
               </tr>
               
               
               
               
                <tr>
                   <td>Address:</td><!-- comment -->  
                   <td><input type="text" class="form-control" name="custaddr" value="<%=customer.getCustaddr()%>"></td><!-- comment -->  
               </tr>
               
               
               
               
               
               <tr>
                   <td>Password:</td><!-- comment -->  
                   <td><input type="text" class="form-control" name="custpassword" value="<%=customer.getCustpassword()%>"></td><!-- comment -->  
               </tr>
               
               
           
               
               
           </table>
           
           
                       <div class="container">
                           <button type="submit" class="btn btn-outline-primary">Save</button>
                       </div>
           
       </form>
       
       
   </div>



   
        
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        
        <form action="CustomerDeleteServlet" method="POST" enctype="multipart/form-data">
            <button class="btn btn-primary "><a href="CustomerDeleteServlet?=id" style="color:white;">DELETE</a></button>
            
             
       </form>
        
        <button  id="edit-profile-button" type="button" class="btn btn-primary">EDIT</button>
      </div>

             
    </div>
  </div>
</div>
        
        
        
        
         <!--end of profile modal -->
        
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
       
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>

<script>
    $(document).ready(function () {
        let editStatus = false;
        

         $('#edit-profile-button').click(function() 
         {
             //alert("button clicked")
             
          if(editStatus == false) 
          {
          $("#profile-details").hide()
             
          $("#profile-edit").show()
          editStatus=true;
          $(this).text("Back")
          
             }else
             {
          
            $("#profile-details").show()
             
          $("#profile-edit").hide()
         editStatus=false;
          $(this).text("Edit")
             }
         });
        
    });
    
    
    
    
    
    
    
</script>






    </body>
</html>
