package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_005floginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/main_loginPage_navbar.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>DeliverEat</title>\n");
      out.write("        <link rel=\"icon\" href=\"/images/icon.png\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head><html>\n");
      out.write("      <style>\n");
      out.write("body {\n");
      out.write("        background-color:blanchedalmond;\n");
      out.write("        background-size: 100%;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("#boxShadows1{ \n");
      out.write("width:1515px;\n");
      out.write("height:80px;\n");
      out.write("background-color:white;\n");
      out.write("box-shadow:10px 10px 5px #666666;\n");
      out.write("text-align:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginpage {\n");
      out.write("  position: absolute;\n");
      out.write("  right:550px;\n");
      out.write("  top:200px;\n");
      out.write("  width: 400px;\n");
      out.write("  height:400px;\n");
      out.write("  border: 3px solid blanchedalmond;\n");
      out.write("  box-shadow:1px 1px 10px 1px #666666;\n");
      out.write("  padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".alphabet{\n");
      out.write("    font-family:'verdana';\n");
      out.write("    font-size:20px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write(".center {\n");
      out.write("  margin: 0;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 31%;\n");
      out.write("  left: 50%;\n");
      out.write("  -ms-transform: translate(-50%, -50%);\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("}\n");
      out.write(".admin {\n");
      out.write("  margin: 0;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 60%;\n");
      out.write("  left: 50%;\n");
      out.write("  -ms-transform: translate(-50%, -50%);\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("}\n");
      out.write(".delivery {\n");
      out.write("  margin: 0;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 90%;\n");
      out.write("  left: 50%;\n");
      out.write("  -ms-transform: translate(-50%, -50%);\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark text-black\" style=\"background-color:white;\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"Homepage.jsp\"></i><img src=\"/images/driveEat.PNG\" alt=\"\" style=\"height:60px; box-shadow:grey 2px;\"/></a>\n");
      out.write(" \n");
      out.write("\n");
      out.write(" \n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>DeliverEat</title>\n");
      out.write("        <link rel=\"icon\" href=\"/images/icon.png\"/>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write(" \n");
      out.write(" \n");
      out.write("        \n");
      out.write("        <div class=\"loginpage\">\n");
      out.write("            <div class=\"alphabet\"><b>HEY THERE!</b></div>\n");
      out.write("            <p> We welcome you as?</p><br>\n");
      out.write("            \n");
      out.write("            <div class=\"center\">\n");
      out.write("            <a href=\"customerLogin_page.jsp\">\n");
      out.write("            <input type=\"button\" value=\"CUSTOMER\" name=\"customer\" style=\"float:right; width:400px; height:50px; background-color:#EF9B0F; border-width:3px; border-color:darkblue;\">\n");
      out.write("            </a>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            <br><br><br><p style=\"text-align:center;\">or</p><br>\n");
      out.write("            \n");
      out.write("            <div class=\"admin\">\n");
      out.write("            <a href=\"adminLogin_page.jsp\">\n");
      out.write("            <input type=\"button\" value=\"ADMINISTRATOR\" name=\"administrator\"  style=\"float:right; width:400px; height:50px; background-color:#EF9B0F;  border-width:3px; border-color:darkblue;\">\n");
      out.write("            </a>\n");
      out.write("            </div>\n");
      out.write("            <br><br><p style=\"text-align:center;\">or</p><br>\n");
      out.write("            \n");
      out.write("            <div class=\"delivery\">\n");
      out.write("            <a href=\"deliveryMenLogin_page.jsp\">\n");
      out.write("            <input type=\"button\" value=\"DELIVERYMEN\" name=\"delivermen\"  style=\"float:right; width:400px; height:50px; background-color:#EF9B0F;  border-width:3px; border-color:darkblue;\">\n");
      out.write("            </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
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
