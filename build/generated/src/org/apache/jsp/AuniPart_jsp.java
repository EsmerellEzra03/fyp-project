package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.deliver.eat.dao.FoodDao;
import java.util.List;
import com.deliver.eat.entities.Food;

public final class AuniPart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>DeliverEat</title>\n");
      out.write("        <link rel=\"icon\" href=\"icon.png\"/>\n");
      out.write("        <style>\n");
      out.write("<!--General-->\n");
      out.write("    body {\n");
      out.write("  font-family: \"Poppins\", sans-serif;\n");
      out.write("  color: #444444;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: #ffb03b;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover {\n");
      out.write("  color: #ffc56e;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1, h2, h3, h4, h5, h6 {\n");
      out.write("  font-family: \"Satisfy\", sans-serif;\n");
      out.write("}     \n");
      out.write("<!--General section-->\n");
      out.write("section {\n");
      out.write("  padding: 60px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".section-bg {\n");
      out.write("  background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".section-title {\n");
      out.write("  text-align: center;\n");
      out.write("  padding-bottom: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".section-title h2 {\n");
      out.write("  margin: 15px 0 0 0;\n");
      out.write("  font-size: 32px;\n");
      out.write("  font-weight: 700;\n");
      out.write("  color: #5f5950;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".section-title h2 span {\n");
      out.write("  color: #ffb03b;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".section-title p {\n");
      out.write("  margin: 15px auto 0 auto;\n");
      out.write("  font-weight: 300;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (min-width: 1024px) {\n");
      out.write("  .section-title p {\n");
      out.write("    width: 50%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("<!--Menu-->\n");
      out.write(".menu #menu-flters {\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 50% 50%;\n");
      out.write("  right:50%;\n");
      out.write("  left:50%;\n");
      out.write("  list-style: none;\n");
      out.write("  text-align: center;\n");
      out.write("  border-radius: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu #menu-flters li {\n");
      out.write("  cursor: pointer;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 8px 16px 10px 16px;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-weight: 500;\n");
      out.write("  line-height: 1;\n");
      out.write("  color: #444444;\n");
      out.write("  margin: 0 3px 10px 3px;\n");
      out.write("  transition: all ease-in-out 0.3s;\n");
      out.write("  background: #fff;\n");
      out.write("  border: 2px solid #ffb03b;\n");
      out.write("  border-radius: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu #menu-flters li:hover, .menu #menu-flters li.filter-active {\n");
      out.write("  color: #fff;\n");
      out.write("  background: #ffb03b;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu #menu-flters li:last-child {\n");
      out.write("  margin-right: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu .menu-content {\n");
      out.write("  margin-top: 30px;\n");
      out.write("  overflow: hidden;\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: space-between;\n");
      out.write("  position: relative;\n");
      out.write("  font-size: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu .menu-content::after {\n");
      out.write("  content: \"......................................................................\"\n");
      out.write(" \"....................................................................\"\n");
      out.write(" \"....................................................................\";\n");
      out.write("  position: absolute;\n");
      out.write("  left: 20px;\n");
      out.write("  right: 0;\n");
      out.write("  top: -4px;\n");
      out.write("  z-index: 1;\n");
      out.write("  color: #dad8d4;\n");
      out.write("  font-family: Arial, \"Helvetica Neue\", Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu .menu-content a {\n");
      out.write("  padding-right: 10px;\n");
      out.write("  background:  #fff;\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 7;\n");
      out.write("  font-weight:1000;\n");
      out.write("  color: #ff9b08;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu .menu-content span {\n");
      out.write("  background: #fff;\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 3;\n");
      out.write("  padding: 0 10px;\n");
      out.write("  font-weight: 600;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu .menu-ingredients {\n");
      out.write("  font-style: italic;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-family: \"Comic Neue\", sans-serif;\n");
      out.write("  color: #948c81;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:blanchedalmond\">\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <section id=\"menu\" class=\"menu\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>Check our tasty <span>Menu</span></h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-12 d-flex justify-content-center\">\n");
      out.write("            <ul id=\"menu-flters\">\n");
      out.write("              <li data-filter=\"*\" class=\"filter-active\">Show All</li>\n");
      out.write("             \n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("          <fieldset class=\"\">\n");
      out.write("          <label>CART ID:</label>\n");
      out.write("          <input type=\"text\" value=\"");
      out.print(newcid);
      out.write("\" id=\"cid\" name=\"cart_id\" required=\"required\"><!-- comment -->                             \n");
      out.write("        </fieldset>\n");
      out.write("\n");
      out.write("          \n");
      out.write("                                      ");

                                          if(!foods.isEmpty()) { 
                                          for (Food p:foods) {
                                     
      out.write("\n");
      out.write("                  <form method=\"post\" action=\"processFoodProfile.jsp\">  \n");
      out.write("                  <input type=\"hidden\" name=\"cart_id\"  value=\"");
      out.print(newcid);
      out.write("\">                   \n");
      out.write("                                     \n");
      out.write("        <div class=\"row menu-container\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-6 menu-item filter-starters\">\n");
      out.write("            <div class=\"menu-content\">\n");
      out.write("              <a href=\"\"><h6 class=\"price\">Name: <input style=\"border:0px; background-color:blanchedalmond\" type=\"text\" value=\"");
      out.print(p.getFoodName());
      out.write("\"  name=\"food_name\" required=\"required\" readonly=\"readonly\"><!-- comment --> </h6></a>\n");
      out.write("              <span> <h6 class=\"price\">Price: <input style=\"border:0px; background-color:blanchedalmond; font-size:15px\" type=\"text\" value=\"");
      out.print(p.getFoodPrice());
      out.write("\"  name=\"food_price\" required=\"required\" readonly=\"readonly\"><!-- comment -->    </h6> </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu-ingredients\">\n");
      out.write("                ");
      out.print(p.getFoodCategory());
      out.write("</br>\n");
      out.write("              ");
      out.print(p.getFoodId());
      out.write("\n");
      out.write("            </div>\n");
      out.write("             <div class=\"mt-3 d-flex justify-content-between\">\n");
      out.write("          <input class=\"btn btn-dark\"  type=\"submit\" value=\"Add to Cart\"></a>  \n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("          \n");
      out.write("        \n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("                  \n");
      out.write("   ");
     
              }       
                }
      
      out.write("      \n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("\n");
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
