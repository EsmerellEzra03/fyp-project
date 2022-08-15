package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.deliver.eat.entities.Message;

public final class customerLogin_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/normal_navbar.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <!-- css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background {\n");
      out.write("         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark text-black\" style=\"background-color:white\">\n");
      out.write("    <a class=\"navbar-brand text-muted\" href=\"main_loginPage.jsp\"></i>DELIVEREAT</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          \n");
      out.write("      </li>\n");
      out.write("          \n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    <body style=\"background-color:blanchedalmond\">\n");
      out.write("        \n");
      out.write("        <!<!-- navbar -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("          \n");
      out.write("        <main class=\"d-flex align-items-center primary-background banner-background \" style=\"height:90vh; \"\">\n");
      out.write("            \n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 offset-md-4\">\n");
      out.write("                      \n");
      out.write("                        <div class=\"card\" style=\"background-color:#EF9B0F;\">\n");
      out.write("                            <div class=\"card-header  text-white text-center\" style=\"background-color:#EF9B0F;\">\n");
      out.write("                                <span class=\"fa fa-user-plus fa-3x text-white\" ></span>\n");
      out.write("                                    \n");
      out.write("                                <br>   \n");
      out.write("                                <p>Login here</p>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                           ");

                             Message m=(Message)session.getAttribute("msg");  
                           if (m!=null){
                               
      out.write("\n");
      out.write("                               <div class=\"alert ");
      out.print(m.getCssClass());
      out.write("\" role=\"alert\">\n");
      out.write("                                ");
      out.print(m.getContent());
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                          ");

                              session.removeAttribute("msg");
                           }

                           
                           
                           
      out.write("\n");
      out.write("                            \n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                         \n");
      out.write("                        \n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form action=\"CustomerLoginServlet\" method=\"POST\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Customer Email</label>\n");
      out.write("    <input name=\"custemail\" required type=\"email\" class=\"form-control\" id=\"admin_name\" aria-describedby=\"emailHelp\" placeholder=\"Enter Email\">\n");
      out.write("    <small id=\"emailHelp\" class=\"form-text text-white\">We'll never share your details with anyone else.</small>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("    <input  name=\"custpassword\" required type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("                                    <div class=\"container text-center\">\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary  text-muted\" style=\"background-color:blanchedalmond\">LOG IN</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"mt-4\">\n");
      out.write("\t\t\t\t\t<div class=\"d-flex justify-content-center links\">\n");
      out.write("                                            New at work? <a class=\"ml-2\" href=\"customerRegister_Page.jsp\">Sign Up</a>\n");
      out.write("</form>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        </main>");
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
