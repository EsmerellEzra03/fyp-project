package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.deliver.eat.entities.Food;
import com.deliver.eat.dao.FoodDao;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.deliver.eat.entities.Restaurant;
import java.util.List;
import com.deliver.eat.dao.RestaurantDao;
import com.deliver.eat.dao.CustomerDao;
import com.deliver.eat.entities.Customer;

public final class AuniPart2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/delivereat";
String user = "root";
String psw = "admin";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Customerprofile.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

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

      out.write('\n');
      out.write('\n');
 
FoodDao pd = new FoodDao();
List<Food> foods = pd.selectAllFoods();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" \n");
      out.write("      integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" \n");
      out.write("        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    


Customer customer=(Customer)session.getAttribute("currentUser");




session.setAttribute("custId2",String.valueOf(customer.getCustId()));

if (customer==null){
    response.sendRedirect("customerLogin_page.jsp");
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
      out.write("         <a class=\"navbar-brand text-white\"  href=\"Customerprofile.jsp\"><span class=\"\"></span>DELIVEREAT</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"RestaurantProfile.jsp\"> <span class=\"\"></span>Restaurants <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("       <li class=\"nav-item active\">\n");
      out.write("           <a class=\"nav-link text-white\" href=\"FoodProfile.jsp\"> <span class=\"\"></span>Menus <span class=\"sr-only\">(current)</span></a>\n");
      out.write("       </li><!-- comment -->\n");
      out.write("     \n");
      out.write("       <li class=\"nav-item active\">\n");
      out.write("           <a class=\"nav-link text-white\" href=\"FoodCart2.jsp\"> <span class=\"\"></span>My Cart <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("       <li class=\"nav-item active\">\n");
      out.write("           <a class=\"nav-link text-white\" href=\"OrderByCustomer.jsp\"> <span class=\"\"></span>My Orders <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("      <ul class=\"navbar-nav mr-right\">\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("         <a class=\"nav-link text-white\" href=\"#!\" data-toggle=\"modal\" data-target=\"#profile-modal\"><span class=\"fa fa-user-circle\"></span>");
      out.print(customer.getCustname());
      out.write("</a>\n");
      out.write("      </li>\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("         <a class=\"nav-link text-white\" href=\"CustomerLogoutServlet\"><span class=\"\"></span>LOGOUT</a>\n");
      out.write("      </li>\n");
      out.write("          \n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <!-- end of nav bar -->\n");
      out.write("        \n");
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
      out.write("              <img src=\"/images/pic.jpg\" class=\"img-fluid\" style=\"border-radius:50%;max-width:150px;\" />\n");
      out.write("              \n");
      out.write("              <br>\n");
      out.write("        <h5 class=\"modal-title mt-3\" id=\"exampleModalLabel\">");
      out.print(customer.getCustname());
      out.write("</h5>\n");
      out.write("        <!--//details-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"profile-details\">\n");
      out.write("        <table class=\"table\">\n");
      out.write("  \n");
      out.write("  <tbody>\n");
      out.write("      <tr>\n");
      out.write("      <th scope=\"row\">ID :</th>\n");
      out.write("      <td>");
      out.print(customer.getCustId());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Name :</th>\n");
      out.write("      <td>");
      out.print(customer.getCustname());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Email :</th>\n");
      out.write("      <td>");
      out.print(customer.getCustemail());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("          <th scope=\"row\">Address :</th>\n");
      out.write("      <td>");
      out.print(customer.getCustaddr());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("     <tr>\n");
      out.write("          <th scope=\"row\">Password :</th>\n");
      out.write("      <td>");
      out.print(customer.getCustpassword());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("        </div>       \n");
      out.write("        \n");
      out.write("   <!--profile edit--> \n");
      out.write("\n");
      out.write("   <div id=\"profile-edit\" style=\"display:none;\">\n");
      out.write("       <h3 class=\"mt-2\">Please Edit Carefully</h3>\n");
      out.write("       <form action=\"CustomerEditServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("           <table class=\"table\">\n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("                   <td>ID :</td><!-- comment -->  \n");
      out.write("                   <td>");
      out.print(customer.getCustId());
      out.write("</td><!-- comment -->  \n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("                   <td>Name :</td><!-- comment -->  \n");
      out.write("                   <td><input type=\"text\" class=\"form-control\" name=\"custname\" value=\"");
      out.print(customer.getCustname());
      out.write("\"><!-- comment -->  \n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("                   <td>Email:</td><!-- comment -->  \n");
      out.write("                   <td><input type=\"email\" class=\"form-control\" name=\"custemail\" value=\"");
      out.print(customer.getCustemail());
      out.write("\"></td><!-- comment -->  \n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                   <td>Address:</td><!-- comment -->  \n");
      out.write("                   <td><input type=\"text\" class=\"form-control\" name=\"custaddr\" value=\"");
      out.print(customer.getCustaddr());
      out.write("\"></td><!-- comment -->  \n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("                   <td>Password:</td><!-- comment -->  \n");
      out.write("                   <td><input type=\"text\" class=\"form-control\" name=\"custpassword\" value=\"");
      out.print(customer.getCustpassword());
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
      out.write("        \n");
      out.write("        <form action=\"CustomerDeleteServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <button class=\"btn btn-primary \"><a href=\"CustomerDeleteServlet?=id\" style=\"color:white;\">DELETE</a></button>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("       </form>\n");
      out.write("        \n");
      out.write("        <button  id=\"edit-profile-button\" type=\"button\" class=\"btn btn-primary\">EDIT</button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("             \n");
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
      out.write("                        <div class=\"card-header my-3\">DELIVEREAT </div> \n");
      out.write("                        <h3 class=\"text-center\">List of Menus</h3>\n");
      out.write("                        <hr>\n");
      out.write("             \n");
      out.write("                    <div class=\"container text-right\">\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                     <fieldset class=\"form-group\">\n");
      out.write("          <label hidden>CART ID:</label>\n");
      out.write("          <input type=\"text\" value=\"");
      out.print(newcid);
      out.write("\" id=\"cid\" name=\"cart_id\" required=\"required\" hidden=\"hidden\"><!-- comment -->                             \n");
      out.write("        </fieldset>\n");
      out.write("                    <table class=\"table table-bordered \" style=\"border-color:black; border-width:2px; margin-left:15%\">\n");
      out.write("                        <thead style=\"border-color:blanchedalmond; border-width:2px;\">\n");
      out.write("                            <tr style=\"border-color:blanchedalmond; border-width:2px;\">\n");
      out.write("                                 <th style=\"border-color:blanchedalmond; border-width:2px;\"> </th><!-- comment -->\n");
      out.write("                                \n");
      out.write("                                    <th style=\"border-color:blanchedalmond; border-width:2px;\"></th>\n");
      out.write("                                   \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        \n");
      out.write("                        <tbody>\n");
      out.write("                           \n");
      out.write("                          \n");
      out.write("                                      ");

                                          if(!foods.isEmpty()) { 
                                          for (Food p:foods) {
                                     
      out.write("\n");
      out.write("                                     <tr>\n");
      out.write("                                        <form method=\"post\" action=\"processFoodProfile.jsp\">\n");
      out.write("                                           <input type=\"hidden\" name=\"cart_id\"  value=\"");
      out.print(newcid);
      out.write("\">\n");
      out.write("                                \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <td style=\"border-color:blanchedalmond; border-width:2px; background-color:#ffb03b\">\n");
      out.write("                                        <h6 class=\"price\" style=\"color:black\">Name: <input style=\"border:0px; width:200px; background-color:#ffb03b;\" type=\"text\" value=\"");
      out.print(p.getFoodName());
      out.write("\"  name=\"food_name\" required=\"required\" readonly=\"readonly\"></h6>\n");
      out.write("                                        <h5 class=\"card-title\" style=\"font-size:15px;\"> Category: ");
      out.print(p.getFoodCategory());
      out.write("</h5>\n");
      out.write("                                        <h6 class=\"price\">Price: <input style=\"border:0px; background-color:#ffb03b;\" type=\"text\" value=\"");
      out.print(p.getFoodPrice());
      out.write("\"  name=\"food_price\" required=\"required\" readonly=\"readonly\">\n");
      out.write("                                        <h5 class=\"card-title\" style=\"font-size:15px;\"> Restaurant: ");
      out.print(p.getRestId());
      out.write("</h5>\n");
      out.write("                                            </td>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <td style=\"border-color:blanchedalmond; border-width:2px; \">\n");
      out.write("                                           <input class=\"btn btn-dark\"  type=\"submit\" value=\"Add to Cart\"></a>  \n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                      </form>\n");
      out.write("                         ");
     
              }       
                }
      
      out.write("      \n");
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
      out.write("<script>        \n");
      out.write("                </body>\n");
      out.write("</html>\n");
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
}
