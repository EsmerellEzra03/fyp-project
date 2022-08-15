package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.deliver.eat.dao.OrderDao;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class ProcessOrderAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");




//String cart_id= "c" + cartNo;
int order_id =Integer.parseInt(request.getParameter("order_id"));
int cart_id =Integer.parseInt(request.getParameter("cart_id"));
int custId =Integer.parseInt(request.getParameter("custId"));
String total_amount=request.getParameter("total_amount");
String order_date=request.getParameter("order_date");
String order_time=request.getParameter("order_time");
String status=request.getParameter("status");
String deliveryMen=request.getParameter("deliveryMen");

OrderDao orderdao= new OrderDao();



try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/delivereat", "root", "admin");
Statement st=conn.createStatement();

if (status == "Delivered")
{
    boolean i = orderdao.updateOrderStatusDelivered(order_id);
}



response.sendRedirect("OrderCheckOut.jsp");


}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}

      out.write('\n');
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
