package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.deliver.eat.entities.Order;
import java.util.List;
import com.deliver.eat.dao.OrderDao;
import com.deliver.eat.dao.CustomerDao;
import com.deliver.eat.entities.Customer;

public final class OrderByCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

String custId= session.getAttribute("custId2").toString();

OrderDao pd = new OrderDao();
List<Order> orders = pd.selectAllOrdersByCustomer(Integer.parseInt(custId));//(Integer.parseInt(custId));


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  \n");
      out.write("    \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .table tbody td{\n");
      out.write("                vartical-align:middle;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn-incre, .btn-decre{\n");
      out.write("                box-shadow:none;\n");
      out.write("                font-size:25px;\n");
      out.write("            }\n");
      out.write("        </style> \n");
      out.write("       </head>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    


Customer customer=(Customer)session.getAttribute("currentUser");

if (customer==null){
    response.sendRedirect("customerLogin_page.jsp");
}





      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
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
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">DELIVEREAT</h5>\n");
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
      out.write("               ");

                  Customer customer2 = new Customer();
                                 session.setAttribute("custId2",String.valueOf(customer2.getCustId()));
                                
                                   
                                

                               
                            
                            
      out.write("\n");
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
      out.write("     \n");
      out.write("    <body style=\"background-color:blanchedalmond\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card-header my-3\">DELIVEREAT Order</div> \n");
      out.write("            <div class=\"d-flex py-3\"><h3>Order</h3></div>   \n");
      out.write("                <table class=\"table table-Loght\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">Order ID</th> \n");
      out.write("                            <th scope=\"col\">Cart ID</th> \n");
      out.write("                            <th scope=\"col\">Customer ID </th> \n");
      out.write("                            <th scope=\"col\">Total Amount</th> \n");
      out.write("                            <th scope=\"col\">Order Date</th> \n");
      out.write("                            <th scope=\"col\">Order Time</th> \n");
      out.write("                            <th scope=\"col\">Status</th> \n");
      out.write("                             \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    \n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                   if(!orders.isEmpty()) { 
                                          for (Order p:orders) {
                                        
      out.write("\n");
      out.write("                                       <tr>\n");
      out.write("                                <td>");
      out.print(p.getOrderId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(p.getCartId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(p.getCustId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(p.getTotalAmount());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(p.getOrderDate());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(p.getOrderTime());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(p.getStatus());
      out.write("</td>\n");
      out.write("                                       \n");
      out.write("                                \n");
      out.write("                                <td><a class=\"btn btn-sm btn-danger\" href=\"editOrder?order_id=");
      out.print(p.getOrderId());
      out.write("\">Assign Delivery</a></td>\n");
      out.write("                                        <td><a class=\"btn btn-sm btn-danger\" href=\"deleteOrder?order_id=");
      out.print(p.getOrderId());
      out.write("\">Remove</a></td>\n");
      out.write("                            </tr>   \n");
      out.write("                            ");

                                    }
                                }
                                
      out.write("\n");
      out.write("                             \n");
      out.write("                            </tbody>\n");
      out.write("                </table>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("  integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
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
