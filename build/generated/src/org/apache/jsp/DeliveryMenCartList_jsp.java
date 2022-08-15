package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.deliver.eat.entities.Cart;
import com.deliver.eat.dao.CartDao;
import java.util.ArrayList;
import com.deliver.eat.entities.Order;
import java.util.List;
import com.deliver.eat.dao.OrderDao;

public final class DeliveryMenCartList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      			null, true, 8192, true);
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


CartDao pd = new CartDao();
List<Cart> carts = pd.selectAllCarts2();


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
      out.write("    \n");
      out.write("    <body style=\"background-color:blanchedalmond\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card-header my-3\">DELIVEREAT Order</div> \n");
      out.write("            <div class=\"d-flex py-3\"><h3>Order</h3></div>   \n");
      out.write("                <table class=\"table table-Loght\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">Cart ID</th> \n");
      out.write("                            <th scope=\"col\">Food Name</th> \n");
      out.write("                            <th scope=\"col\">Food Price </th> \n");
      out.write("                           \n");
      out.write("                             \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    \n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                   if(!carts.isEmpty()) { 
                                          for (Cart p:carts) {
                                        
      out.write("\n");
      out.write("                                       <tr>\n");
      out.write("                                <td>");
      out.print(p.getCartId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(p.getFoodName());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(p.getFoodPrice());
      out.write("</td>\n");
      out.write("                                \n");
      out.write("                                       \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                       <td><a class=\"btn btn-sm btn-danger\" href=\"deleteCart2?cart_id=");
      out.print(p.getCartId());
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
