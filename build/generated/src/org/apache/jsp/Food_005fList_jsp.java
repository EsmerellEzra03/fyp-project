package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.deliver.eat.entities.Admin;

public final class Food_005fList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Adminprofile.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>DeliverEat</title>\n");
      out.write("        <link rel=\"icon\" href=\"/images/icon.png\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background {\n");
      out.write("         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);\n");
      out.write("       \n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    


Admin admin=(Admin)session.getAttribute("currentUser");

if (admin==null){
    response.sendRedirect("adminLogin_page.jsp");
}





      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>DeliverEat</title>\n");
      out.write("        <link rel=\"icon\" href=\"/images/icon.png\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background {\n");
      out.write("         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"background-color:blanchedalmond;\">\n");
      out.write("        <!-- navbar -->\n");
      out.write("     <nav class=\"navbar navbar-expand-lg navbar-dark text-white\" style=\"background-color:tomato;\">\n");
      out.write("         <a class=\"navbar-brand text-white\"  href=\"Adminprofile.jsp\"><span class=\"\"></span>DELIVEREAT</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"RestaurantForm.jsp\"> <span class=\"\"></span>Restaurants <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("       <li class=\"nav-item active\">\n");
      out.write("           <a class=\"nav-link text-white\" href=\"http://localhost:8080/DeliverEat_1/listRest\"> <span class=\"\"></span>Restaurant List <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       <li class=\"nav-item active\">\n");
      out.write("           <a class=\"nav-link text-white\" href=\"FoodForm.jsp\"> <span class=\"\"></span>Menus <span class=\"sr-only\">(current)</span></a>\n");
      out.write("       </li><!-- comment -->\n");
      out.write("     \n");
      out.write("       <li class=\"nav-item active\">\n");
      out.write("           <a class=\"nav-link text-white\" href=\"http://localhost:8080/DeliverEat_1/listFood\"> <span class=\"\"></span>Menu List <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       <li class=\"nav-item active\">\n");
      out.write("           <a class=\"nav-link text-white\" href=\"OrderProfile.jsp\"> <span class=\"\"></span>Assign Delivery <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("           <a class=\"nav-link text-white\" href=\"http://localhost:8080/DeliverEat_1/listOrder\"> <span class=\"\"></span>Delivery Orders <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("      <ul class=\"navbar-nav mr-right\">\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("         <a class=\"nav-link text-white\" href=\"#!\" data-toggle=\"modal\" data-target=\"#profile-modal\"><span class=\"fa fa-user-circle\"></span>");
      out.print(admin.getAdname());
      out.write("</a>\n");
      out.write("      </li>\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("         <a class=\"nav-link text-white\" href=\"AdminLogoutServlet\"><span class=\"\"></span>LOGOUT</a>\n");
      out.write("      </li>\n");
      out.write("          \n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <!-- end of nav bar -->\n");
      out.write("        \n");
      out.write("            <div class=\"container \" style=\"margin-top:200px; margin-left:210px;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("        \n");
      out.write("                                    \n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("                <div class=\"col-md-3 my-3 \">\n");
      out.write("            <div class=\"card w-100\" style=\"width: 18rem;\">\n");
      out.write("                 <img class=\"card-img-top\" style=\"height:160px;\" src=\"/images/addRestaurant.jpg\" alt=\"Why no picture\">\n");
      out.write("                 <div class=\"card-body\">\n");
      out.write("                     \n");
      out.write("           <div class=\"mt-3 d-flex justify-content-between\">\n");
      out.write("           <a href=\"RestaurantForm.jsp\" class=\"btn btn-dark\">Add Restaurant</a>\n");
      out.write("           </div>\n");
      out.write("                 </div>\n");
      out.write("           </div>\n");
      out.write("           </div> \n");
      out.write("          \n");
      out.write("                                    \n");
      out.write("            <div class=\"col-md-3 my-3 \">\n");
      out.write("            <div class=\"card w-100\" style=\"width: 18rem;\">\n");
      out.write("                 <img class=\"card-img-top\" style=\"height:160px;\" src=\"/images/viewRestaurant.jpg\" alt=\"Why no picture\">\n");
      out.write("                 <div class=\"card-body\">\n");
      out.write("              \n");
      out.write("            <div class=\"mt-3 d-flex justify-content-between\">\n");
      out.write("            <a href=\"http://localhost:8080/DeliverEat_1/listRest\" class=\"btn btn-dark\">View Restaurant List</a>\n");
      out.write("            </div>\n");
      out.write("                 </div>\n");
      out.write("           </div>\n");
      out.write("           </div> \n");
      out.write("                \n");
      out.write("                                          \n");
      out.write("            <div class=\"col-md-3 my-3 \">\n");
      out.write("            <div class=\"card w-100\" style=\"width: 18rem;\">\n");
      out.write("                 <img class=\"card-img-top\" style=\"height:160px;\"  src=\"/images/addMenu.jpg\" alt=\"Why no picture\">\n");
      out.write("                 <div class=\"card-body\">\n");
      out.write("               \n");
      out.write("            <div class=\"mt-3 d-flex justify-content-between\">\n");
      out.write("            <a href=\"FoodForm.jsp\" class=\"btn btn-dark\">Add Menu</a>\n");
      out.write("            </div>\n");
      out.write("                 </div>\n");
      out.write("           </div>\n");
      out.write("           </div> \n");
      out.write("            \n");
      out.write("            <div class=\"col-md-3 my-3 \">\n");
      out.write("            <div class=\"card w-100\" style=\"width: 18rem;\">\n");
      out.write("                 <img class=\"card-img-top\" style=\"height:160px;\" src=\"/images/viewMenu.jpg\" alt=\"Why no picture\">\n");
      out.write("                 <div class=\"card-body\">\n");
      out.write("               \n");
      out.write("             <div class=\"mt-3 d-flex justify-content-between\">\n");
      out.write("             <a href=\"http://localhost:8080/DeliverEat_1/listFood\" class=\"btn btn-dark \">View Menu List</a>\n");
      out.write("             </div>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("            </div> \n");
      out.write("            </div>\n");
      out.write("            </div> \n");
      out.write("        \n");
      out.write("        <!--profile modal -->\n");
      out.write("       \n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header primary-background text-white text-center\">\n");
      out.write("        <h5 class=\"modal-title text-muted\" id=\"exampleModalLabel\">DELIVEREAT</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <div class=\"container text-center\">\n");
      out.write("              <img src=\"../images/pic.jpg\" class=\"img-fluid\" style=\"border-radius:50%;max-width:150px;\" />\n");
      out.write("              \n");
      out.write("              <br>\n");
      out.write("        <h5 class=\"modal-title mt-3\" id=\"exampleModalLabel\">");
      out.print(admin.getAdname());
      out.write("</h5>\n");
      out.write("        <!--//details-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"profile-details\">\n");
      out.write("        <table class=\"table\">\n");
      out.write("  \n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">ID :</th>\n");
      out.write("      <td>");
      out.print(admin.getAdminId());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Name :</th>\n");
      out.write("      <td>");
      out.print(admin.getAdname());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("          <th scope=\"row\">Password</th>\n");
      out.write("      <td>");
      out.print(admin.getAdpassword());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("        </div>       \n");
      out.write("        \n");
      out.write("   <!--profile edit--> \n");
      out.write("\n");
      out.write("   <div id=\"profile-edit\" style=\"display:none;\">\n");
      out.write("       <h3 class=\"mt-2\">Please Edit Carefully</h3>\n");
      out.write("       <form action=\"AdminEditServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("           <table class=\"table\">\n");
      out.write("               <tr>\n");
      out.write("                   <td>ID :</td><!-- comment -->  \n");
      out.write("                   <td>");
      out.print(admin.getAdminId());
      out.write("</td><!-- comment -->  \n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("                   <td>Name:</td><!-- comment -->  \n");
      out.write("                   <td><input type=\"text\" class=\"form-control\" name=\"adname\" value=\"");
      out.print(admin.getAdname());
      out.write("\"></td><!-- comment -->  \n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("                   <td>Password:</td><!-- comment -->  \n");
      out.write("                   <td><input type=\"text\" class=\"form-control\" name=\"adpassword\" value=\"");
      out.print(admin.getAdpassword());
      out.write("\"></td><!-- comment -->  \n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("           \n");
      out.write("               \n");
      out.write("               \n");
      out.write("           </table>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("                       <div class=\"container\">\n");
      out.write("                           <button type=\"submit\" class=\"btn btn-outline-primary\">Save</button>\n");
      out.write("                       </div>\n");
      out.write("           \n");
      out.write("       </form>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <form action=\"AdminDeleteServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <button class=\"btn btn-primary \"><a href=\"AdminDeleteServlet?=id\" style=\"color:white;\">DELETE</a></button>\n");
      out.write("               <!--<input class=\"primary-background text-white btn btn-primary\" type=\"submit\" value=\"DELETE\"/>\n");
      out.write("               <button  id=\"edit-profile-button\" type=\"button\" class=\"btn btn-primary\">DELETE</button></a>-->\n");
      out.write("       </form>\n");
      out.write("        <button  id=\"edit-profile-button\" type=\"button\" class=\"btn btn-primary\">EDIT</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <!--end of profile modal -->\n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("  integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        let editStatus = false;\n");
      out.write("        \n");
      out.write("\n");
      out.write("         $('#edit-profile-button').click(function() \n");
      out.write("         {\n");
      out.write("             //alert(\"button clicked\")\n");
      out.write("             \n");
      out.write("          if(editStatus == false) \n");
      out.write("          {\n");
      out.write("          $(\"#profile-details\").hide()\n");
      out.write("             \n");
      out.write("          $(\"#profile-edit\").show()\n");
      out.write("          editStatus=true;\n");
      out.write("          $(this).text(\"Back\")\n");
      out.write("          \n");
      out.write("             }else\n");
      out.write("             {\n");
      out.write("          \n");
      out.write("            $(\"#profile-details\").show()\n");
      out.write("             \n");
      out.write("          $(\"#profile-edit\").hide()\n");
      out.write("         editStatus=false;\n");
      out.write("          $(this).text(\"Edit\")\n");
      out.write("             }\n");
      out.write("         });\n");
      out.write("        \n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <body style=\"background-color:blanchedalmond\">\n");
      out.write("        <header>\n");
      out.write("         \n");
      out.write("        </header>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h3 class=\"text-center\">List of Food Items</h3>\n");
      out.write("                        <hr>\n");
      out.write("             \n");
      out.write("                    <div class=\"container text-left\">\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/new\" class=\"btn btn-success\">Add New Food Item</a><!-- comment -->\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <table class=\"table table-bordered \" style=\"border-color:black; border-width:2px;\">\n");
      out.write("                        <thead style=\"border-color:black; border-width:2px;\">\n");
      out.write("                            <tr style=\"border-color:black; border-width:2px;\">\n");
      out.write("                                <th style=\"border-color:black; border-width:2px;\">FOOD ID</th><!-- comment -->\n");
      out.write("                                <th style=\"border-color:black; border-width:2px;\">Food Name</th><!-- comment -->\n");
      out.write("                                <th style=\"border-color:black; border-width:2px;\">Restaurant Name</th><!-- comment -->\n");
      out.write("                                <th style=\"border-color:black; border-width:2px;\">Food Category</th><!-- comment -->\n");
      out.write("                                <th style=\"border-color:black; border-width:2px;\">Food Price</th>\n");
      out.write("                                  <th style=\"border-color:black; border-width:2px;\">Actions</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        \n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("      <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("  integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("     \n");
      out.write("                </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("food");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listFood}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td style=\"border-color:black; border-width:2px;\">\n");
          out.write("                                        ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    \n");
          out.write("                                    <td style=\"border-color:black; border-width:2px;\">\n");
          out.write("                                        ");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    \n");
          out.write("                                    <td style=\"border-color:black; border-width:2px;\">\n");
          out.write("                                        ");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    \n");
          out.write("                                    <td style=\"border-color:black; border-width:2px;\">\n");
          out.write("                                        ");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    \n");
          out.write("                                    <td style=\"border-color:black; border-width:2px;\">\n");
          out.write("                                        ");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    \n");
          out.write("                                    \n");
          out.write("                                    <td style=\"border-color:black; border-width:2px;\">\n");
          out.write("                                        <a href=\"edit?food_id=");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp;<!-- comment -->\n");
          out.write("                                        <a href=\"delete?food_id=");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">Delete</a></td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.foodId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.foodName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.restId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.foodCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.foodPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.foodId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.foodId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }
}
