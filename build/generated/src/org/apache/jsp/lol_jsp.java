package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.w3c.dom.Document;
import java.util.ArrayList;
import ch01.employtime;

public final class lol_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <font color=\"blue\" size=\"20\">Online Cinema Booking System\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("                <td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("        <font color=\"black\" style=\"font-size:20px\">\n");
      out.write("\t<TABLE id=\"dataTable\" width=\"1150px\" height=\"50px\" border=\"1\">\n");
      out.write("            <caption> All Employee list(including you) </caption>\n");
      out.write("            <tr>\n");
      out.write("                <th> Username </th>\n");
      out.write("                <th> Password </th>\n");
      out.write("                <th> First_name </th>\n");
      out.write("                <th> Last_name </th>\n");
      out.write("                <th> JOB_TYPE </th>\n");
      out.write("                \n");
      out.write("            <tr/>\n");
      out.write("            <form action=\"Booking\">\n");
      out.write("            ");
 
            
            ArrayList<employtime> transactions = (ArrayList<employtime>) session.getAttribute("transactions");
            if(transactions==null)
            {
                out.println("");
            }
            else if(transactions.size()==0)
            {
                out.println("No Available Movie For Your Selected Date");
            }
            else 
            {session.setAttribute("ope",transactions);
                //out.println("<table>");
                //out.println("<hr><td>Sl.</td><td>Amount</td><td>Datetime</td></tr>");
                int count=0;
                for(employtime trans: transactions)
                {
                    count++;
                    out.println("<tr>");
  
                    out.println( String.format("<td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td>", trans.user_name, trans.pass, trans.first_name,trans.last_name,trans.job_type) );
                    //out.println("<input type=\"hidden\" id=\"dd\" name=\"prod\" value=\"\"/>");
                    //session.setAttribute("flag", trans.movie_name);
                    //session.setAttribute("operation", trans.hall_type);
                    
                   
                    
                    //out.println("");
                    out.println("</tr>");
                }
                out.println("</table>");
            }
        
      out.write("\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("\t</TABLE>\n");
      out.write("                \n");
      out.write("                \n");
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
