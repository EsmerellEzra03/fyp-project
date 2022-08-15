<%-- 
    Document   : customerRegister_Page
    Created on : Jul 1, 2021, 3:21:22 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background {
         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);
       
            }
            </style>
        
        
        
        
        
        
        
    </head>
    <%@include file="normal_navbar.jsp"%>
    <body style="background-color:blanchedalmond">
        
      
       
        <main class="primary-background banner-background" style="padding-botton:50px; height:700px; " >
            <div class="container"  >
                  <br>  <br>
               <div class="col-md-6 offset-md-3 "  > 
                   <div class="card" style="background-color:#EF9B0F; margin-top:35px;">
                       <div class="card-header text-center  text-white" style="background-color:#EF9B0F;" >
                           <span class="fa fa-3x fa-user-circle text-white"></span>
                           <br>
                           Register Here
                           
                           
                           
                       </div> 
                       
                       <div class="card-body">
                        <form id="reg-form" action="StudentRegisterServlet" method="POST">
    <div class="form-group">
												<input type="text" name="stud_name" class="form-style" id="stud_name" placeholder="Your Full Name" autocomplete="off">
												<i class="input-icon uil uil-user"></i>
											</div>	
											<div class="form-group mt-2">
												<input type="address" name="stud_add" class="form-style" placeholder="Your Address" id="stud_add" autocomplete="off">
												<i class="input-icon uil uil-at"></i>
											</div>
                                                                                        <div class="form-group mt-2">
												<input type="email" name="stud_email" class="form-style" placeholder="Your Email" id="stud_email" autocomplete="off">
												<i class="input-icon uil uil-lock-alt"></i>
											</div>
                                                                                        <div class="form-group mt-2">
												<input type="hpno" name="stud_no" class="form-style" placeholder="Your Hp No" id="stud_no" autocomplete="off">
												<i class="input-icon uil uil-lock-alt"></i>
											</div>
											<div class="form-group mt-2">
												<input type="password" name="password" class="form-style" placeholder="Your Password" id="password" autocomplete="off">
												<i class="input-icon uil uil-lock-alt"></i>
											</div>
                            
                                           
  <div class="form-check">
    <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Agree Terms and Conditions</label>
  </div>
                            
                            <br>    
                            <div class="container text-center" id="loader" style="display: none;">
                            <span class="fa fa-repeat fa-spin fa-3x"></span>
                            <h4>please wait</h4><!-- comment -->
                            </div>
                             <div class="container text-center text-center">
                            <button id="submit-btn" type="submit" class="btn btn-primary  text-muted" style="align-items:center; background-color:blanchedalmond">SIGN UP</button>
                             </div>
                            
                             
</form>   
                           
                       </div>
                       
                       
                   </div>
                
            </div>
            
            
            
        </main>
        
        
        
        
        
        
        
        
        
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
       
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
<script>
    $(document).ready(function () {
        console.log("loaded.......")
        
        $('#reg-form').on('submit', function(event){
           event.preventDefault();
           
           let form=new FormData(this);
           
           $("#submit-btn").show();
           $("#loader").hide();
           //send register servlet
            $.ajax({
               url:"CustomerRegisterServlet",
               type:'POST',
               data:form,
               success:function (data,textStatus,jqXHR) {
                 console.log(data)
                 
           $("#submit-btn").show();
           $("#loader").hide();
           
           if(data.trim()==='done')
           {
               
     swal("You have Sign Up SUCESSFULLY").then((value) => {
 window.location="customerLogin_page.jsp";
});

           }else{
               
                 swal(data);
           }
               },
               error: function(jqXHR, textStatus, errorThrown) {
                   $("#submit-btn").show();
                   $("#loader").hide();
                  swal("Something wrong. Try again");

               },
               processData:false,
               contentType: false
            });
        });
    });
    
    
    
    
</script>








    </body>
</html>

