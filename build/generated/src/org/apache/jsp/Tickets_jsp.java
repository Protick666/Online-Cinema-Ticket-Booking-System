package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Tickets_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <font color=\"blue\" size=\"20\">Online Cinema Booking System\n");
      out.write("        </div>\n");
      out.write("        <div align=\"left\"><font color=\"black\" style=\"font-size:20px\">\n");
      out.write("            <table>\n");
      out.write("                <form action=\"myservlet\"> \n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Movies\" style=\"height:70px; width:270px\">\n");
      out.write("                </form>\n");
      out.write("                <form action=\"Tickets\"> \n");
      out.write("                    <td><input type=\"submit\" value=\"Tickets\" style=\"height:70px; width:270px\">\n");
      out.write("                </form>\t\n");
      out.write("                <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("                <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("                <form action=\"Logout\"> \n");
      out.write("                    <td><input type=\"submit\" value=\"Logout\" style=\"height:70px; width:270px\">\n");
      out.write("                </tr>\n");
      out.write("                </form>\n");
      out.write("        <font color=\"black\" style=\"font-size: 20px\">\n");
      out.write("        <div align=\"center\">\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <caption>Waiting for Authorization<br></caption>\n");
      out.write("            <tr>\n");
      out.write("                <th> Hall No. </th>\n");
      out.write("                <th> Seat No. </th>\n");
      out.write("                <th> Movie Name </th>\n");
      out.write("                <th> Date </th>\n");
      out.write("                <th> Start_time </th>\n");
      out.write("                <th> Hall_type </th>\n");
      out.write("                <th> Price </th>\n");
      out.write("            <tr/>\n");
      out.write("            <tr>\n");
      out.write("                <td> 3 </th>\n");
      out.write("                <td> G5 </th>\n");
      out.write("                <td> The Jungle Book </th>\n");
      out.write("                <td> 19-12-2016 </th>\n");
      out.write("                <td> 4-50 PM </th>\n");
      out.write("                <td> Regular </th>\n");
      out.write("                <td> 750 tk. </th>\n");
      out.write("            <tr/>\n");
      out.write("        </table>\n");
      out.write("            <br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <caption>Bought Tickets<br></caption>\n");
      out.write("            <tr>\n");
      out.write("                <th> Hall No. </th>\n");
      out.write("                <th> Seat No. </th>\n");
      out.write("                <th> Movie Name </th>\n");
      out.write("                <th> Date </th>\n");
      out.write("                <th> Start_time </th>\n");
      out.write("                <th> Hall_type </th>\n");
      out.write("                <th> Price </th>\n");
      out.write("            <tr/>\n");
      out.write("            <tr>\n");
      out.write("                <td> 2 </th>\n");
      out.write("                <td> A2 </th>\n");
      out.write("                <td> The Jungle Book </th>\n");
      out.write("                <td> 17-12-2016 </th>\n");
      out.write("                <td> 3-50 PM </th>\n");
      out.write("                <td> Regular </th>\n");
      out.write("                <td> 350 tk. </th>\n");
      out.write("            <tr/>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
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
