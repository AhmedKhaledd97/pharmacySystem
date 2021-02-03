package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Free Pharmaceutical Company Template- Download HTML Website Templates</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function ctck()\r\n");
      out.write("{\r\n");
      out.write("var sds = document.getElementById(\"dum\");\r\n");
      out.write("if(sds == null){alert(\"You are using a free package.\\n You are not allowed to remove the tag.\\n\");}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("function dil(form)\r\n");
      out.write("{\r\n");
      out.write("   for(var i=0; i<form.elements.length; i++)\r\n");
      out.write("   {\r\n");
      out.write("\t\tif(form.elements[i].value == \"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t   alert(\"Fill out all Fields\")\r\n");
      out.write("\t\t   document.F1.username.focus()\r\n");
      out.write("\t\t   return false\r\n");
      out.write("\t\t}\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   if(!isNaN(document.F1.username.value))\r\n");
      out.write("   {\r\n");
      out.write("       alert(\"User Name  must  be  char's & can't be null\")\r\n");
      out.write("\t   document.F1.username.value=\"\"\r\n");
      out.write("\t   document.F1.username.focus()\r\n");
      out.write("\t   return false\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   if(!isNaN(document.F1.password.value))\r\n");
      out.write("   {\r\n");
      out.write("       alert(\"Password  must  be  char's & can't be null\")\r\n");
      out.write("\t   document.F1.password.value=\"\"\r\n");
      out.write("\t   document.F1.password.focus()\r\n");
      out.write("\t   return false\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   return true   \r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Global Banking ..</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function ctck()\r\n");
      out.write("{\r\n");
      out.write("var sds = document.getElementById(\"dum\");\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div id=\"navigation\">\r\n");
      out.write("    \t<ul>\r\n");
      out.write("        \t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("            <li><a href=\"about.jsp\">About Us</a></li>\r\n");
      out.write("            <li><a href=\"admin.jsp\">ADMINISTRATOR </a></li>\r\n");
      out.write("            <li><a href=\"distributerlogin.jsp\">DISTRIBUTER </a></li>\r\n");
      out.write("            <li><a href=\"customer.jsp\">CUST0MER</a></li>\r\n");
      out.write("            <li><a href=\"contactus.jsp\">Contact Us</a></li>\r\n");
      out.write("        </ul>\t\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<table width=\"960\" border=\"0\" cellspacing=\"10\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("  <tr align=\"justify\">\r\n");
      out.write("    <td valign=\"top\" width=\"220px\">\r\n");
      out.write("    \t<img src=\"images/hioxindia-pharmacy_08.jpg\" alt=\"\" border=\"0\" /> <br /> \r\n");
      out.write("      <h1>Pharmaceutist</h1>\r\n");
      out.write("      \t<p>Freedesignertemplates.com has a wide collection of HTML web design templates.</p>\r\n");
      out.write("    \t<p align=\"right\"><a href=\"#\" class=\"more\">View More</a></p>\r\n");
      out.write("    </td> <td valign=\"top\">\r\n");
      out.write("   \t\t   \r\n");
      out.write("\t\t\t\t  ");
  out.print("<font color=red>WELCOME TO ADMINISTRATION LOGIN");
	
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \t<form name=F1 onSubmit=\"return dil(this)\" action=\"adminprocess.jsp\" >\r\n");
      out.write("\t\t\t\t   <table cellspacing=\"10\" cellpadding=\"8\">\t\r\n");
      out.write("\t\t\t\t  ");
if(request.getAttribute("aa")!=null)
			{
			out.print("<div>");
			out.print("<font color='blue'><font size='4'>"+request.getAttribute("aa")+"");
			
			out.print("</div>"); 
			}
			
			 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t    \t\t\t<tr><td>LOGIN NAME:</td><td> <input type=\"text\" name=\"username\"/></td></tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr><td>PASSWORD:</td><td> <input type=\"password\" name=\"password\"/></td></tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr><td></td><td><input type=\"submit\" value=\"Submit\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                   \r\n");
      out.write("                   <INPUT TYPE=RESET VALUE=\"CLEAR\"></td></tr>\r\n");
      out.write("                   \r\n");
      out.write("             \t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("  \t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("    <td valign=\"top\">\r\n");
      out.write("    \t<img src=\"images/hioxindia-pharmacy_10.jpg\" alt=\"\" border=\"0\" />\r\n");
      out.write("        <h1>Drug Store</h1>\r\n");
      out.write("      <p>Anyone can use these HTML templates just by replacing the content to the pre-existing site designs.</p>\r\n");
      out.write("        <p align=\"right\"><a href=\"#\" class=\"more\">View More</a></p>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td valign=\"top\">\r\n");
      out.write("    \t<img src=\"images/hioxindia-pharmacy_12.jpg\" alt=\"\" border=\"0\" />\r\n");
      out.write("        <h1>Tablets</h1>\r\n");
      out.write("      <p>This high quality free pharmaceutical company template is built using XHTML and CSS..</p>\r\n");
      out.write("        <p align=\"right\"><a href=\"#\" class=\"more\">View More</a></p>\r\n");
      out.write("    </td>\r\n");
      out.write("    \r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td colspan=\"4\" style=\"border-bottom:1px solid #CCCCCC;\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("<table width=\"960\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr align=\"justify\">\r\n");
      out.write("    <td width=\"200\" valign=\"top\">\r\n");
      out.write("    \t<img src=\"images/hioxindia-pharmacy_19.jpg\" alt=\"\" border=\"0\" />    </td>\r\n");
      out.write("    <td width=\"760\" valign=\"top\">\r\n");
      out.write("    \t<h1>Welcome to Pharmaceutical Company </h1>\r\n");
      out.write("        <p>This is free Pharmaceutical Company Template for your online website, blog or web page which is under Health and Medicine category. Anyone wants good, professional, template for their pharmacy, drug store, medical store then this template would be the best one. This free pharmaceutical company template is designed by professional designers to make your task much easier to customize it.</p><br />\r\n");
      out.write("\r\n");
      out.write("<p>There are many other template categories like Arts, Agriculture, Computers, Satellite, Cars, Finance, Nature, Music, Personal Website, Religious, Fashion, Furniture, Holiday, Travel, Night club are available in this site. Have a look at the collection of HTML templates, pick the right one, preview and download it easily.</p>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("  <div id=\"footer_1\">\r\n");
      out.write("   \t\t<ul>\r\n");
      out.write("        \t<li><a href=\"#\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("            <li><a href=\"#\">Specials</a></li>\r\n");
      out.write("            <li><a href=\"#\">All Products</a></li>\r\n");
      out.write("            <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("        </ul>\t<br />\r\n");
      out.write("    <span id=\"design\">Designed by <a id=\"dum\" href=\"http://freedesignertemplates.com\" target=\"_blank\">www.freedesignertemplates.com</a></span>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    document.onload = ctck();\r\n");
      out.write("    </script>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    \r\n");
      out.write("<div id=\"footer_top\">\r\n");
      out.write("  <div id=\"footer_navigation\">\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"footer_copyright\" >\r\n");
      out.write(" \r\n");
      out.write("    \t    <center><img  alt=\"business\"  width=\"196\" height=\"106\"></center><br>\r\n");
      out.write("\t\t    <p>Each people plan their site layouts depending upon their business type. Here comes a free designer template which provides you with a selection of different kinds of webdesign   starting from business template, fashion template, media template, Science template, Arts template and much more.</p>\r\n");
      out.write("\t  \r\n");
      out.write("  Copyright © Your Company Name</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("document.onload = ctck();\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
