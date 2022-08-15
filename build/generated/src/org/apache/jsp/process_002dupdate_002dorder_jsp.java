package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.deliver.eat.entities.Order;
import com.deliver.eat.dao.OrderDao;
import com.deliver.eat.DB.ConnectionProvider;

public final class process_002dupdate_002dorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Order</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");
 
        
      
    int orderId = Integer.parseInt(request.getParameter("order_id"));
    ConnectionProvider database = new ConnectionProvider();
    OrderDao orderDao = new OrderDao();
    Order order = orderDao.retrieveOneOrder(orderId);
    
      out.write("\n");
      out.write("    \n");
      out.write("  <body style=\"font-family: century gothic; max-width:600px; background-color:blanchedalmond\">\n");
      out.write("        <div style=\"background-color:yellowgreen; padding:10px; text-align:center;\">\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <fieldset><legend><b>Update Order</b></legend>\n");
      out.write("                <form action=\"process-update-order2.jsp\" method=\"get\">\n");
      out.write("                    <input type=\"hidden\" name=\"order_id\" value=\"");
      out.print(order.getOrderId());
      out.write("\"/>\n");
      out.write("                    <table>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><label>Order Date:</label></td>\n");
      out.write("                                <td><input type=\"date\" name=\"order_date\" value=\"");
      out.print(order.getOrderDate());
      out.write("\"/></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td><label>Order Time:</label></td>\n");
      out.write("                                <td><input type=\"time\" name=\"order_time\" value=\"");
      out.print(order.getOrderTime());
      out.write("\"/></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                             \n");
      out.write("                            <tr>\n");
      out.write("                                <td><label>Cart Id:</label></td>\n");
      out.write("                                <td><input type=\"text\" name=\"cart_id\" value=\"");
      out.print(order.getCartId());
      out.write("\"/></td>\n");
      out.write("                                \n");
      out.write("                            </tr><!-- comment -->\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td><label>Customer Id</label></td>\n");
      out.write("                                <td><input type=\"text\" name=\"custId\" value=\"");
      out.print(order.getCustId());
      out.write("\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                             \n");
      out.write("                            <tr>\n");
      out.write("                                <td><label>Total Amount</label></td>\n");
      out.write("                                <td><input type=\"text\" name=\"total_amount\" value=\"");
      out.print(order.getTotalAmount());
      out.write("\"/></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                             <tr>\n");
      out.write("                                <td><label>Status</label></td>\n");
      out.write("                                <td><input type=\"text\" name=\"status\" value=\"");
      out.print(order.getStatus());
      out.write("\"/></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                              <tr>\n");
      out.write("                                <td><label>DeliveryMen</label></td>\n");
      out.write("                                <td><input type=\"text\" name=\"deliveryMen\" value=\"");
      out.print(order.getDeliveryMen());
      out.write("\"/></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td><label></label></td>\n");
      out.write("                                <td><input type=\"submit\" value=\"Update\" style=\"font-family:century gothic;\"/>\n");
      out.write("                                <input type=\"button\" value=\"Cancel\" style=\"font-family:century gothic;\" \n");
      out.write("                                           onclick=\"window.location.href=''; return false;\"/>\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                                  \n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("    </body>  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
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
