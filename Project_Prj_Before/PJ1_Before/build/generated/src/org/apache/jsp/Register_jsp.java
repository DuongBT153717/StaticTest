package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/register.css\">\r\n");
      out.write("       \r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        ");

            String err = "";
            if (request.getAttribute("err") != null) {
                err = (String) request.getAttribute("err");
            }
        
      out.write("\r\n");
      out.write("        <div class=\"d-flex align-items-center light-blue-gradient\" style=\"height: 100vh;\">\r\n");
      out.write("            <div class=\"container\" >\r\n");
      out.write("                <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <div class=\"card rounded-0 shadow\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h3>Sign Up</h3>\r\n");
      out.write("                                <form action=\"register\" method=\"post\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                         <li style=\"color: red\">");
      out.print(err);
      out.write("</li>\r\n");
      out.write("                                        <label for=\"exampleInputEmail1\">Username: </label>\r\n");
      out.write("                                        <input type=\"text\" name=\"username\"   class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter username\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"exampleInputPassword1\">Password: </label>\r\n");
      out.write("                                        <input name=\"password\" type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"exampleInputEmail1\">Email address:</label>\r\n");
      out.write("                                        <input name=\"email\" type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\r\n");
      out.write("                                        <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"exampleInputDate1\">Date of Birth:</label><br>\r\n");
      out.write("                                        <input type=\"date\" value=\"\" name=\"dob\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"exampleInputGender1\">Gender:</label><br>\r\n");
      out.write("                                        <input type=\"text\"  list=\"exampleList\"\r\n");
      out.write("                                        name=\"gender\" > \r\n");
      out.write("                                        <datalist id=\"exampleList\">\r\n");
      out.write("                                            <option value=\"Male\">\r\n");
      out.write("                                            <option value=\"Female\">\r\n");
      out.write("                                        </datalist>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"exampleInputPhone1\">Phone:</label><br>\r\n");
      out.write("                                        <input type=\"text\" value=\"\"\t\t\t\t\r\n");
      out.write("                               name=\"phone\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                         <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"exampleInputAddress1\">Address:</label><br>\r\n");
      out.write("                                        <input type=\"text\" value=\"\"\t\t\t\t\r\n");
      out.write("                               name=\"address\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group form-check\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\" checked>\r\n");
      out.write("                                        <label class=\"form-check-label\" for=\"exampleCheck1\">Check me out</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                                    <a  href=\"home\"><button type=\"button\" class=\"btn btn-primary\">Back</button></a>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Optional JavaScript -->\r\n");
      out.write("                <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("                <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("                <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("            </div>\r\n");
      out.write("    </body>\r\n");
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
