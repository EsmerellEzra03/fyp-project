package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class OrderProcessing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/delivereat";
String user = "root";
String psw = "admin";
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background {\n");
      out.write("         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);\n");
      out.write("       \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("      \n");
      out.write("<body style=\"background-color:blanchedalmond\">\n");
      out.write("        \n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<form action=\"#\">\n");

String cartId=(String)session.getAttribute("cart_id");
String totalAmount="";    
Connection con = null;

PreparedStatement ps = null;
PreparedStatement ps1 = null;
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
            
String sql_1 = "SELECT * FROM orders WHERE status='Pending' or status='Confirmed'";

ps = con.prepareStatement(sql_1);
ResultSet rs = ps.executeQuery(); 




      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("    <div class=\"container\">   \n");
      out.write("    <form method=\"post\" action=\"ProcessOrderAdmin.jsp\" >\n");
      out.write("        \n");
      out.write("    <div class=\"form-group\"> \n");
      out.write("       <label for=\"orderId\">Order Id</label>\n");
      out.write("       <!--<input type=\"text\" class=\"form-control\" id=\"\" name=\"order_id\" placeholder=\"Enter order_id\">-->\n");
      out.write("       <select style=\"width:150px;\" id=\"order_id\" name=\"order_id\">\n");

while(rs.next())
{

String order_id= rs.getString("order_id");

      out.write("\n");
      out.write("<option  value=\"");
      out.print(order_id);
      out.write('"');
      out.write('>');
      out.print(order_id);
      out.write("</option>\n");

}

      out.write("\n");
      out.write("        </select>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("       <label for=\"orderDate\">Order Date</label>\n");
      out.write("       <input type=\"date\" class=\"form-control\" id=\"\" name=\"order_date\" placeholder=\"OrderDate\" required=\"required\">\n");
      out.write("    </div>   \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("       <label for=\"orderTime\">Order Time</label>\n");
      out.write("       <input type=\"time\" class=\"form-control\" id=\"\" value =\"\" name=\"order_time\" placeholder=\"OrderTime\" required=\"required\">\n");
      out.write("    </div>       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"cartId\">Cart Id</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"\" name=\"cart_id\" placeholder=\"CartId\" value=\"");
      out.print(cartId);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    <div class=\"form-group\">        \n");
      out.write("        <label>Customer Name:</label>\n");
      out.write("        <select id=\"custId\" name=\"custId\">\n");

    String sql = "SELECT * FROM customer";

ps1 = con.prepareStatement(sql);
ResultSet rs1 = ps1.executeQuery(); 
while(rs1.next())
{
String cname = rs1.getString("custname"); 
String cId= rs1.getString("custId");

      out.write("\n");
      out.write("<option value=\"");
      out.print(cId);
      out.write('"');
      out.write('>');
      out.print(cname);
      out.write("</option>\n");

}

      out.write("\n");
      out.write("        </select>\n");
      out.write("</p>\n");

    
    String sql2 = "SELECT * From deliverymen";
    ps=con.prepareStatement(sql2);
    ResultSet rs2=ps.executeQuery();
    
    
      out.write("\n");
      out.write("</div>                                                \n");
      out.write("                                            \n");
      out.write("        \n");
      out.write("\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"totalAmount\">Total Amount</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"\" name=\"total_amount\" placeholder=\"amount\" value=\"");
      out.print(totalAmount);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label>Status:</label>\n");
      out.write("        <select class=\"form-control\" name=\"status\" id=\"payment_type\" placeholder=\"Choose one\">\n");
      out.write("                    <option value=\"Confirmed\"> Confirmed/Assigned </option>\n");
      out.write("                    <option value=\"Delivered\"> Delivered </option>\n");
      out.write("        </select>             \n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("  \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label>Select DeliveryMen:</label>\n");
      out.write("            <select id=\"deliveryMen\" name=\"deliveryMen\">\n");

while(rs2.next())
{
String deliveryMenName = rs2.getString("deliv_name"); 
String deliveryMenId= rs2.getString("deliv_menId");

      out.write("\n");
      out.write("<option value=\"");
      out.print(deliveryMenId);
      out.write('"');
      out.write('>');
      out.print(deliveryMenName);
      out.write("</option>\n");

}

      out.write("\n");
      out.write("        </select>\n");
      out.write("</p>\n");

}
catch(SQLException sqe)
{ 
out.println(sqe);
}

      out.write("\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Submit Order</button>\n");
      out.write("</form>\n");
      out.write("  \n");
      out.write("  ");

      if ((session.getAttribute("order_id") != "")) 
      { 
          
      out.write("\n");
      out.write("          \n");
      out.write("          ");

      }
  
      out.write("\n");
      out.write("    </div>      \n");
      out.write("        \n");
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
