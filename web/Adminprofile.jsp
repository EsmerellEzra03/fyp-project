<%-- 
    Document   : Adminprofile
    Created on : Jun 28, 2021, 3:50:20 PM
    Author     : User
--%>

<%@page import="com.deliver.eat.entities.Admin"%>
<%@page errorPage="error_page.jsp"%>
<%
    


Admin admin=(Admin)session.getAttribute("currentUser");

if (admin==null){
    response.sendRedirect("adminLogin_page.jsp");
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
         <a class="navbar-brand text-white"  href="Adminprofile.jsp"><span class=""></span>DELIVEREAT</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <a class="nav-link text-white" href="RestaurantForm.jsp"> <span class=""></span>Restaurants <span class="sr-only">(current)</span></a>
      </li>
     
       <li class="nav-item active">
           <a class="nav-link text-white" href="http://localhost:8080/DeliverEat_1/listRest"> <span class=""></span>Restaurant List <span class="sr-only">(current)</span></a>
      </li>
      
      
       <li class="nav-item active">
           <a class="nav-link text-white" href="FoodForm.jsp"> <span class=""></span>Menus <span class="sr-only">(current)</span></a>
       </li><!-- comment -->
     
       <li class="nav-item active">
           <a class="nav-link text-white" href="http://localhost:8080/DeliverEat_1/listFood"> <span class=""></span>Menu List <span class="sr-only">(current)</span></a>
      </li>
      
      
       <li class="nav-item active">
           <a class="nav-link text-white" href="OrderProfile.jsp"> <span class=""></span>Assign Delivery <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item active">
           <a class="nav-link text-white" href="http://localhost:8080/DeliverEat_1/listOrder"> <span class=""></span>Delivery Orders <span class="sr-only">(current)</span></a>
      </li>

    </ul>
      <ul class="navbar-nav mr-right">
           <li class="nav-item">
         <a class="nav-link text-white" href="#!" data-toggle="modal" data-target="#profile-modal"><span class="fa fa-user-circle"></span><%=admin.getAdname()%></a>
      </li>
           <li class="nav-item">
         <a class="nav-link text-white" href="AdminLogoutServlet"><span class=""></span>LOGOUT</a>
      </li>
          
      </ul>
  </div>
</nav>

        <!-- end of nav bar -->
        
            <div class="container " style="margin-top:200px; margin-left:210px;">
            <div class="row">
        
                                    
                                     
                                     
                <div class="col-md-3 my-3 ">
            <div class="card w-100" style="width: 18rem;">
                 <img class="card-img-top" style="height:160px;" src="/images/addRestaurant.jpg" alt="Why no picture">
                 <div class="card-body">
                     
           <div class="mt-3 d-flex justify-content-between">
           <a href="RestaurantForm.jsp" class="btn btn-dark">Add Restaurant</a>
           </div>
                 </div>
           </div>
           </div> 
          
                                    
            <div class="col-md-3 my-3 ">
            <div class="card w-100" style="width: 18rem;">
                 <img class="card-img-top" style="height:160px;" src="/images/viewRestaurant.jpg" alt="Why no picture">
                 <div class="card-body">
              
            <div class="mt-3 d-flex justify-content-between">
            <a href="http://localhost:8080/DeliverEat_1/listRest" class="btn btn-dark">View Restaurant List</a>
            </div>
                 </div>
           </div>
           </div> 
                
                                          
            <div class="col-md-3 my-3 ">
            <div class="card w-100" style="width: 18rem;">
                 <img class="card-img-top" style="height:160px;"  src="/images/addMenu.jpg" alt="Why no picture">
                 <div class="card-body">
               
            <div class="mt-3 d-flex justify-content-between">
            <a href="FoodForm.jsp" class="btn btn-dark">Add Menu</a>
            </div>
                 </div>
           </div>
           </div> 
            
            <div class="col-md-3 my-3 ">
            <div class="card w-100" style="width: 18rem;">
                 <img class="card-img-top" style="height:160px;" src="/images/viewMenu.jpg" alt="Why no picture">
                 <div class="card-body">
               
             <div class="mt-3 d-flex justify-content-between">
             <a href="http://localhost:8080/DeliverEat_1/listFood" class="btn btn-dark ">View Menu List</a>
             </div>
                 </div>
            </div>
            </div> 
            </div>
            </div> 
        
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
              <img src="../images/pic.jpg" class="img-fluid" style="border-radius:50%;max-width:150px;" />
              
              <br>
        <h5 class="modal-title mt-3" id="exampleModalLabel"><%=admin.getAdname()%></h5>
        <!--//details-->
        
        
        <div id="profile-details">
        <table class="table">
  
  <tbody>
    <tr>
      <th scope="row">ID :</th>
      <td><%=admin.getAdminId()%></td>
      
    </tr>
    <tr>
      <th scope="row">Name :</th>
      <td><%=admin.getAdname()%></td>
      
    </tr>
  
    
    <tr>
          <th scope="row">Password</th>
      <td><%=admin.getAdpassword()%></td>
      
    </tr>
  </tbody>
</table>
        </div>       
        
   <!--profile edit--> 

   <div id="profile-edit" style="display:none;">
       <h3 class="mt-2">Please Edit Carefully</h3>
       <form action="AdminEditServlet" method="POST" enctype="multipart/form-data">
           <table class="table">
               <tr>
                   <td>ID :</td><!-- comment -->  
                   <td><%=admin.getAdminId()%></td><!-- comment -->  
               </tr>
               
               <tr>
                   <td>Name:</td><!-- comment -->  
                   <td><input type="text" class="form-control" name="adname" value="<%=admin.getAdname()%>"></td><!-- comment -->  
               </tr>
               
               <tr>
                   <td>Password:</td><!-- comment -->  
                   <td><input type="text" class="form-control" name="adpassword" value="<%=admin.getAdpassword()%>"></td><!-- comment -->  
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
        <form action="AdminDeleteServlet" method="POST" enctype="multipart/form-data">
            <button class="btn btn-primary "><a href="AdminDeleteServlet?=id" style="color:white;">DELETE</a></button>
               <!--<input class="primary-background text-white btn btn-primary" type="submit" value="DELETE"/>
               <button  id="edit-profile-button" type="button" class="btn btn-primary">DELETE</button></a>-->
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
