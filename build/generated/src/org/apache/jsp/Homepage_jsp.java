package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>DeliverEat</title>\n");
      out.write("        <link rel=\"icon\" href=\"/images/icon.png\"/>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"Northstreet Restaurant\">\n");
      out.write("    <meta name=\"author\" content=\"A.K.\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Latest compiled and minified CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <!-- jQuery library -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Popper JS -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Latest compiled JavaScript -->\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script> \n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Leckerli+One\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lora\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Ubuntu\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->  \n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("html, body {\n");
      out.write("\toverflow-x: hidden;\n");
      out.write("\tfont-family: 'Lato', sans-serif;\n");
      out.write("\twidth: 100%;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("\tlist-style-type: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover,\n");
      out.write("a:focus {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("h1,\n");
      out.write("h2,\n");
      out.write("h3,\n");
      out.write("h4,\n");
      out.write("h5,\n");
      out.write("h6 {\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tfont-family: 'Lato', sans-serif;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("hr {\n");
      out.write("\tborder-color: #ffc266;\n");
      out.write("\tborder-width: 5px;\n");
      out.write("\tmax-width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".container-h1 {\n");
      out.write("    font-family: 'Lora', serif;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 50px;\n");
      out.write("    font-weight: 700;\n");
      out.write("    margin: 50px auto;\n");
      out.write("    color: #333;\n");
      out.write("    font-family: 'Ubuntu', sans-serif;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground-color: #182c39;\n");
      out.write("\tmargin: 20px auto;\n");
      out.write("\tborder-radius: 0;\n");
      out.write("\tfont-weight: 500;\n");
      out.write("\tdisplay: table;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover{\n");
      out.write("\tcolor: #182c39;\n");
      out.write("\tbackground-color: transparent;\n");
      out.write("\tborder: 1px solid #182c39;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".hr-h3s {\n");
      out.write("\tborder: 3px solid #E94B3C;\n");
      out.write("\twidth: 70px;\n");
      out.write("\tmargin: 0 auto 35px auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("textarea {\n");
      out.write("\tresize: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("section {\n");
      out.write("\talign-items: center;\n");
      out.write("\tpadding: 50px 60px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".bg-section h2 {\n");
      out.write("\tfont-family: 'Montserrat', sans-serif;\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tcolor: #ffc266;\n");
      out.write("\tbackground-color: #182c39;\n");
      out.write("\tmargin: 50px 0;\n");
      out.write("\tpadding: 25px 20px;\n");
      out.write("\tborder-radius: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slideanim {\n");
      out.write("\tvisibility: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slide {\n");
      out.write("\tanimation-name: slide;\n");
      out.write("\t-webkit-animation-name: slide;\n");
      out.write("\t-moz-animation-name: slide;\n");
      out.write("\tanimation-duration: 1.5s;\n");
      out.write("\t-webkit-animation-duration: 1.5s;\n");
      out.write("\t-moz-animation-duration: 1.5s;\n");
      out.write("\tvisibility: visible;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes slide {\n");
      out.write("\t0% {\n");
      out.write("\t\topacity: 0;\n");
      out.write("\t\ttransform: translateX(50%);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t100% {\n");
      out.write("\t\topacity: 1;\n");
      out.write("\t\ttransform: translateX(0%);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes slide {\n");
      out.write("\t0% {\n");
      out.write("\t\topacity: 0;\n");
      out.write("\t\t-webkit-transform: translateX(50%);\n");
      out.write("\t\ttransform: translateX(50%);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t100% {\n");
      out.write("\t\topacity: 1;\n");
      out.write("\t\t-webkit-transform: translateX(0%);\n");
      out.write("\t\ttransform: translateX(0%);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/*  *** Header + Navigation *** */\n");
      out.write("\n");
      out.write(".navbar {\n");
      out.write("\tbackground-color: #F1CFB7;\n");
      out.write("        border-color: rgb(51, 17, 0);\n");
      out.write("\tborder-color: rgba(51, 17, 0, 0.2);\n");
      out.write("\tfont-weight: 700;\n");
      out.write("\tpadding: 15px 0;\n");
      out.write("\ttransition: padding .5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar .navbar-brand {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: 'Leckerli One', cursive;\n");
      out.write("\tfont-weight: 500;\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tfont-size: 25px;\n");
      out.write("\tpadding-left: 15px;\n");
      out.write("\ttext-shadow: black 0.3em 0.3em 0.3em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar .navbar-brand:hover,\n");
      out.write(".navbar .navbar-brand:focus {\n");
      out.write("\tcolor: #ffc266;\n");
      out.write("\ttransition: color 1s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar .navbar-nav {\n");
      out.write("\tpadding-right: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar .navbar-nav > li > a {\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tmargin: auto 5px;\n");
      out.write("    font-family: 'Lato', sans-serif; \n");
      out.write("    text-shadow: #222 0.3em 0.3em 0.3em;   \n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar .navbar-nav > li > a:hover,\n");
      out.write(".navbar .navbar-nav > li > a:focus:hover {\n");
      out.write("\tcolor: #ffc266;\n");
      out.write("\ttransition: color 1s; \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".navbar .navbar-nav > li.active > a:hover,\n");
      out.write(".navbar .navbar-nav > li.active > a:focus:hover {\n");
      out.write("\tbackground-color: transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar.scrolled {\n");
      out.write("\tbox-shadow: 0 3px 3px rgba(0,0,0,0.1);\n");
      out.write("\tpadding: 5px 0;\n");
      out.write("\topacity: 0.9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".jumbotron {\n");
      out.write("\tmargin-bottom: 0px;\n");
      out.write("    background-image: url('/images/homepage.jpeg'); \n");
      out.write("    background-position: 0% 50%;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    color: beige;\n");
      out.write("    text-shadow: black 0.3em 0.3em 0.3em;\n");
      out.write("    height: 700px;\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".jumbotron .header-content-inner {\n");
      out.write("\tfont-weight: 700;\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tmargin-bottom: 0;\n");
      out.write("\tmargin: 200px;\n");
      out.write("\tfont-family: 'Roboto', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".jumbotron h1 {\n");
      out.write("\tfont-size: 45px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".jumbotron h3 {\n");
      out.write("\tfont-size: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* *** About *** */\n");
      out.write("\n");
      out.write(".bg-about {\n");
      out.write("\tmargin: auto 50px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about h3 {\n");
      out.write("\tfont-family: 'Roboto', sans-serif;\n");
      out.write("\tcolor: #E94B3C;\n");
      out.write("    \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .restaurant-history p {\n");
      out.write("\tpadding: 20px 80px;\n");
      out.write("\tfont-family: 'Roboto', sans-serif;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tcolor: #444;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p.first::first-letter {\n");
      out.write("    font-size: 150%;\n");
      out.write("    color: #000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about h1 {\n");
      out.write("\tpadding-top: 35px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#about .image {\n");
      out.write("  display: block;\n");
      out.write("  width: 100%;\n");
      out.write("  height: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("#about .hov-img * {\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .hov-img {\n");
      out.write("\tposition: relative;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tmax-width: 100%;\n");
      out.write("\theight: auto;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .hov-img img {\n");
      out.write("\tmax-width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .hov-img-bottom {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .hov-img-top {\n");
      out.write("\topacity: 0;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("    right: 0;\n");
      out.write("\tbottom: 0;\n");
      out.write("    left: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100%;\n");
      out.write("\tbackground: rgba(0, 0, 0, 0.6);\n");
      out.write("\tcolor: #fff;\n");
      out.write("\t-moz-transition: all 0.4s ease-in-out 0s;\n");
      out.write("\t-webkit-transition: all 0.4s ease-in-out 0s;\n");
      out.write("\t-ms-transition: all 0.4s ease-in-out 0s;\n");
      out.write("\ttransition: all 0.4s ease-in-out 0s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .hov-img:hover .hov-img-top {\n");
      out.write("\topacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .hov-img-text {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttext-shadow: black .2em .2em .2em; \n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\t-moz-transform: translate(-50%, -50%);\n");
      out.write("\t-webkit-transform: translate(-50%, -50%);\n");
      out.write("\t-ms-transform: translate(-50%, -50%);\n");
      out.write("\ttransform: translate(-50%, -50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .hov-img-text p {\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tline-height: 1.2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .hov-img-slideup {\n");
      out.write("\t-moz-transform: translateY(100%);\n");
      out.write("\t-webkit-transform: translateY(100%);\n");
      out.write("\t-ms-transform: translateY(100%);\n");
      out.write("\ttransform: translateY(100%);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#about .hov-img:hover .hov-img-slideup {\n");
      out.write("\t-moz-transform: translateY(0);\n");
      out.write("\t-webkit-transform: translateY(0);\n");
      out.write("\t-ms-transform: translateY(0);\n");
      out.write("\ttransform: translateY(0);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* *** Menu *** */\n");
      out.write("\n");
      out.write(".bg-menu {\n");
      out.write("\tmargin: auto 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .nav-pills {\n");
      out.write("\tbackground-color: blanchedalmond;\n");
      out.write("\tborder-color: transparent;\n");
      out.write("\tfont-weight: 500;\n");
      out.write("\tcolor: #000;\n");
      out.write("\tmargin: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .nav-pills > li > a,\n");
      out.write("#menu .nav-pills > li > a:focus {\n");
      out.write("\tfont-weight: 500;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tborder-radius: 0;\n");
      out.write("\tborder: 1px solid #fff;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-family: 'Roboto', sans-serif;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .nav-pills > li > a:hover,\n");
      out.write("#menu .nav-pills > li > a:focus:hover {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground-color: #944743;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .nav-pills > li > a.active,\n");
      out.write("#menu .nav-pills > li  > a.active:focus {\n");
      out.write("\tbackground-color: #944743;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("#menu .hr-menu {\n");
      out.write("\tborder: 2px solid #182c39;\n");
      out.write("\twidth: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .list-group-item {\n");
      out.write("\tbackground-color: transparent;\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-bottom: 1px solid #555;\n");
      out.write("\tpadding: 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .tab-content  .tab-pane  h3 {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-family: 'Leckerli One', cursive;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .list-group-item:first-child {\n");
      out.write("\tborder-top-right-radius: 0;\n");
      out.write("\tborder-top-left-radius: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .list-group-item:last-child {\n");
      out.write("\tborder-bottom-right-radius: 0;\n");
      out.write("\tborder-bottom-left-radius: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .list-group-item  h4 {\n");
      out.write("\ttext-align: left;\n");
      out.write("\tcolor: #182c39;\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .list-group-item  p {\n");
      out.write("\ttext-align: left;\n");
      out.write("\tcolor: #555555;\n");
      out.write("\tfont-weight: 500;\n");
      out.write("\tfont-style: italic;\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .badge {\n");
      out.write("\tborder-radius: 0;\n");
      out.write("\tbackground-color: #444;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu .right-cover {\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\tcolor: #DC4C46;\n");
      out.write("\ttext-shadow: #DC4C46 .4em .4em .4em;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\ttext-transform: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* *** Service *** */\n");
      out.write("\n");
      out.write("\n");
      out.write("#service .service-round {\n");
      out.write("\theight: 100px;\n");
      out.write("\twidth: 100px;\n");
      out.write("\t-webkit-border-radius: 50%;\n");
      out.write("\t-moz-border-radius: 50%;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tborder: 8px solid #182c39;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tcolor: #182c39;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#service .service-round  i {\n");
      out.write("\tcolor: #182c39;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#service h4 {\n");
      out.write("\tmargin: 10px auto;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\tcolor: #555;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#service .round:hover .fa {\n");
      out.write("\tcolor: #ffc266;\n");
      out.write("\ttransition: color 2s;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#service .round:hover .service-round {\n");
      out.write("\tborder-color: #ffc266;\n");
      out.write("\ttransition: border-color 2s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* *** Gallery *** */\n");
      out.write("\n");
      out.write("\n");
      out.write("#gallery h3 {\n");
      out.write("\tfont-family: 'Lato', sans-serif;\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tcolor: #182c39;\n");
      out.write("\tmargin: 50px auto 10px auto;\n");
      out.write("\tfont-weight: 700;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .gallery {\n");
      out.write("\tmargin: 0px 80px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .no-gutter > [class*=\"col-\"] {\n");
      out.write("\tpadding-right: 0;\n");
      out.write("\tpadding-left: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .caption-content {\t\n");
      out.write("\tposition: absolute;\n");
      out.write("\tbottom: 100%;\n");
      out.write("\tleft: 0;\n");
      out.write("\tright: 0;\n");
      out.write("\tbackground: rgba(0, 0, 0, 0.8); \n");
      out.write("    color: #f1f1f1;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 0;\n");
      out.write("\ttransition: .5s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .portfolio-item:hover .caption-content {\n");
      out.write("\tbottom: 0;\n");
      out.write("\theight: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .caption-content .fa {\n");
      out.write("\twhite-space: nowrap;\n");
      out.write("\tcolor: white;\n");
      out.write("\tfont-size: 40px;\n");
      out.write("\tposition: absolute;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("    -webkit-transform: translate(-50%, -50%);\n");
      out.write("    -ms-transform: translate(-50%, -50%);\n");
      out.write("\t-moz-transform: translate(-50%, -50%);\n");
      out.write("\t-o-transform: translate(-50%, -50%);\n");
      out.write("\ttransform: translate(-50%, -50%);\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .more-img {\n");
      out.write("\tmargin: 0 80px;\n");
      out.write("\tbackground-color: #182c39;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .more-img .to-gallery {\n");
      out.write("\ttext-align: center;\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tmargin: 0px auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .more-img .to-gallery h4 {\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tpadding: 5px;\n");
      out.write("\tmargin: auto;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .more-img .social-networks .fa {\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\tmargin: 5px 5px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#gallery .more-img .social-networks .fa:hover {\n");
      out.write("\tcolor: #ffc266;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* *** Our staff *** */\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("#staff .thumbnail-row {\n");
      out.write("\tmargin: auto 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#staff h3 {\n");
      out.write("\tfont-family: 'Lato', sans-serif;\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tcolor: #182c39;\n");
      out.write("\tmargin: 50px auto 10px auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#staff img {\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#staff  h5 {\n");
      out.write("\tcolor: #222;\n");
      out.write("\tfont-family: 'Roboto', sans-serif;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#staff  h6 {\n");
      out.write("\tcolor: #555;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#staff img:hover {\n");
      out.write("\tbox-shadow: 2px 2px 2px 0 rgba(0,0,0,0.9);\n");
      out.write("\ttransition: .3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* *** Testimonials *** */\n");
      out.write("#testimonials .hr-testimonials {\n");
      out.write("\tborder: 1px solid #182c39;\n");
      out.write("\twidth: 50%;\n");
      out.write("\tmargin: 0 auto 35px auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#testimonials h3 {\n");
      out.write("\tcolor: #182c39;\n");
      out.write("\tmargin: 40px auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#testimonials .carousel {\n");
      out.write("\tfloat: none;\n");
      out.write("  \tmargin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#testimonials .carousel-indicators li {\n");
      out.write("\tborder: 2px solid #182c39;\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\theight: 10px;\n");
      out.write("\twidth: 10px;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#testimonials .carousel-indicators li.active {\n");
      out.write("\tborder-color: #fff;\n");
      out.write("\tbackground-color: #182c39;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("#testimonials .carousel-item h4 {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tline-height: 1.2em;\n");
      out.write("\tfont-weight: 500;\n");
      out.write("\tpadding-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#testimonials .carousel-item h5 {\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tfont-weight: 500;\n");
      out.write("\tmargin-bottom: 80px;\n");
      out.write("\tfont-style: italic;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* *** Contact *** */\n");
      out.write("\n");
      out.write("#contact .form-group input, \n");
      out.write("#contact .form-group textarea {\n");
      out.write("\tborder: 1px solid #000;\n");
      out.write("\tborder-radius: 0;\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#contact .form-group input:hover,\n");
      out.write("#contact .form-group textarea:hover {\n");
      out.write("\tborder-color: #ababee;\n");
      out.write("\tbox-shadow: 2px 2px 2px rgba(0,0,0, .2);\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#contact .contact-buttons input, \n");
      out.write("#contact .contact-buttons input:focus {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground-color: #182c39;\n");
      out.write("\tmargin: 20px auto 40px auto;\n");
      out.write("\tborder-radius: 0;\n");
      out.write("\tfont-weight: 500;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tborder: 1px solid #182c39;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#contact .contact-buttons input:hover {\n");
      out.write("\tcolor: #182c39;\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#contact .left-box {\n");
      out.write("\tbackground-color: #182c39;\n");
      out.write("\tmargin: 0 20px;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\ttext-transform: none;\n");
      out.write("\tline-height: 1.8em;\n");
      out.write("\tfont-weight: 500;\n");
      out.write("\tpadding: 30px 50px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#contact .left-box .span-contact {\n");
      out.write("\tcolor: #ffc266;\n");
      out.write("\tfont-weight: 700;\n");
      out.write("\tpadding-right: 20px;\n");
      out.write("\tfont-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#contact #googleMap {\n");
      out.write("\t-webkit-filter: grayscale(100%);\n");
      out.write("\tfilter: grayscale(100%);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* ** Footer ** */\n");
      out.write("\n");
      out.write("#footer {\n");
      out.write("\tbackground-color: black;\n");
      out.write("\tcolor: white;\n");
      out.write("\tfont-family: 'Roboto', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer ul {\n");
      out.write("\tlist-style-type: none;\n");
      out.write("\tpadding-left: 0;\n");
      out.write("\tline-height: 2.2;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer h5 {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tcolor: white;\n");
      out.write("\tmargin-top: 40px;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer a {\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer a:hover,\n");
      out.write("#footer a:focus {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer .social-networks {\n");
      out.write("\tpadding-top: 20px;\n");
      out.write("\tpadding-bottom: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer .footer-items .fa {\n");
      out.write("\tfont-size: 17px;\n");
      out.write("\tmargin-bottom: 5px;\n");
      out.write("\tbackground-color: black;\n");
      out.write("\tcolor: #182c39;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tpadding-bottom: 25px;\n");
      out.write("\theight: 30px;\n");
      out.write("\twidth: 30px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tline-height: 31px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\ttransition: color 1s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer .footer-items {\n");
      out.write("\tmargin: auto;\n");
      out.write("\tpadding-left: 50px;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer .fa-facebook:hover,\n");
      out.write("#footer .fa-instagram:hover {\n");
      out.write("\tborder: 1px solid #fff;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground-color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".footer-copyright {\n");
      out.write("\tbackground-color: #10222e;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-copyright p {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tcolor: #ccc;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tpadding: 10px 0;\n");
      out.write("\tmargin-bottom: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer .hr-foot {\n");
      out.write("\twidth: 80%;\n");
      out.write("  \tmargin: 10px auto;\n");
      out.write("  \tborder: 1px solid #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer .to-top {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 30px;\n");
      out.write("\tposition: fixed;\n");
      out.write("\tright: 12px;\n");
      out.write("\tbottom: 12px;\n");
      out.write("\theight: 40px;\n");
      out.write("\twidth: 40px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\t-moz-border-radius: 50%;\n");
      out.write("\t-webkit-border-radius: 50%;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tbackground: rgba(0, 0, 0, 0.5); \n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tbackground-position: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer .to-top:hover {\n");
      out.write("\tbackground-color: black;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\t-webkit-transition: all 1s ease;\n");
      out.write("\t-moz-transition: all 1s ease;\n");
      out.write("\t-ms-transition: all 1s ease;\n");
      out.write("\t-o-transition: all 1s ease;\n");
      out.write("\ttransition: all 1s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body id=\"myPage\"  data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"60\">\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-md bg-dark navbar-dark fixed-top\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">DeliverEat.com</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"main_loginPage.jsp\">Login</a>\n");
      out.write("                </li>  \n");
      out.write("            </ul>\n");
      out.write("        </div>  \n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"header-content-inner\">\n");
      out.write("                <h1 style=\"font-size:70px\">Welcome to DeliverEat.com</h1> \n");
      out.write("                <h2 style=\"font-size:40px\">Trust us, your foods will come to you.</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"script.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("     \n");
      out.write("    </script>  \n");
      out.write("    \n");
      out.write("</body>\n");
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
