package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- Main CSS-->\n");
      out.write("        <link href=\"css/main_2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        <!-- or -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        <!-- Font-icon css-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body onload=\"time()\" class=\"app sidebar-mini rtl\">\n");
      out.write("        <!-- Navbar-->\n");
      out.write("        <header class=\"app-header\">\n");
      out.write("            <!-- Sidebar toggle button--><a class=\"app-sidebar__toggle\" href=\"#\" data-toggle=\"sidebar\"\n");
      out.write("                                            aria-label=\"Hide Sidebar\"></a>\n");
      out.write("            <!-- Navbar Right Menu-->\n");
      out.write("            <ul class=\"app-nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- User Menu-->\n");
      out.write("                <li><a class=\"app-nav__item\" href=\"dashboard\"><i class='bx bx-log-out bx-rotate-180'></i> </a>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </header>\n");
      out.write("        <!-- Sidebar menu-->\n");
      out.write("        <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\n");
      out.write("        <aside class=\"app-sidebar\">\n");
      out.write("            <div class=\"app-sidebar__user\"><img class=\"app-sidebar__user-avatar\" src=\"image/user.png\" width=\"50px\"\n");
      out.write("                                                alt=\"User Image\">\n");
      out.write("                <div>\n");
      out.write("                    <p class=\"app-sidebar__user-name\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></p>\n");
      out.write("                    <p class=\"app-sidebar__user-designation\">Chào mừng bạn trở lại</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <ul class=\"app-menu\">\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"dashboard\"><i class='app-menu__icon bx bx-tachometer'></i><span\n");
      out.write("                            class=\"app-menu__label\">Bảng điều khiển</span></a></li>\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"admin\"><i class='app-menu__icon bx bx-user-voice'></i><span\n");
      out.write("                            class=\"app-menu__label\">Quản lý khách hàng</span></a></li>\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"manager-product\"><i\n");
      out.write("                            class='app-menu__icon bx bx-purchase-tag-alt'></i><span class=\"app-menu__label\">Quản lý sản phẩm</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"ordermanager\"><i class='app-menu__icon bx bx-task'></i><span\n");
      out.write("                            class=\"app-menu__label\">Quản lý đơn hàng</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </aside>\n");
      out.write("        <main class=\"app-content\">\n");
      out.write("            <div class=\"app-title\">\n");
      out.write("                <ul class=\"app-breadcrumb breadcrumb side\">\n");
      out.write("                    <li class=\"breadcrumb-item active\"><a href=\"#\"><b>Danh sách đơn hàng</b></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div id=\"clock\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"tile\">\n");
      out.write("                        <div class=\"tile-body\">\n");
      out.write("                            <div class=\"row element-button\"\n");
      out.write("                                 <div class=\"col-sm-2\">\n");
      out.write("                                    <a class=\"btn btn-delete btn-sm print-file\" type=\"button\" title=\"In\" onclick=\"myApp.printTable()\"><i\n");
      out.write("                                            class=\"fas fa-print\"></i> In dữ liệu</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <table class=\"table table-hover table-bordered\" id=\"sampleTable\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>ID đơn hàng</th>\n");
      out.write("                                        <th>Khách hàng</th>\n");
      out.write("                                        <th>Số điện thoại</th>\n");
      out.write("                                        <th>Địa chỉ</th>\n");
      out.write("                                        <th>Ngày mua</th>\n");
      out.write("                                        <th>Tổng tiền</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </main>\n");
      out.write("        <!-- Essential javascripts for application to work-->\n");
      out.write("        <script src=\"admin/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"admin/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"admin/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"admin/js/main.js\"></script>\n");
      out.write("        <!-- The javascript plugin to display page loading on top-->\n");
      out.write("        <script src=\"admin/js/plugins/pace.min.js\"></script>\n");
      out.write("        <!-- Page specific javascripts-->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js\"></script>\n");
      out.write("        <!-- Data table plugin-->\n");
      out.write("        <script type=\"text/javascript\" src=\"admin/js/plugins/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"admin/js/plugins/dataTables.bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">$('#sampleTable').DataTable();</script>\n");
      out.write("        <script>\n");
      out.write("            //Thời Gian\n");
      out.write("            function time() {\n");
      out.write("                var today = new Date();\n");
      out.write("                var weekday = new Array(7);\n");
      out.write("                weekday[0] = \"Chủ Nhật\";\n");
      out.write("                weekday[1] = \"Thứ Hai\";\n");
      out.write("                weekday[2] = \"Thứ Ba\";\n");
      out.write("                weekday[3] = \"Thứ Tư\";\n");
      out.write("                weekday[4] = \"Thứ Năm\";\n");
      out.write("                weekday[5] = \"Thứ Sáu\";\n");
      out.write("                weekday[6] = \"Thứ Bảy\";\n");
      out.write("                var day = weekday[today.getDay()];\n");
      out.write("                var dd = today.getDate();\n");
      out.write("                var mm = today.getMonth() + 1;\n");
      out.write("                var yyyy = today.getFullYear();\n");
      out.write("                var h = today.getHours();\n");
      out.write("                var m = today.getMinutes();\n");
      out.write("                var s = today.getSeconds();\n");
      out.write("                m = checkTime(m);\n");
      out.write("                s = checkTime(s);\n");
      out.write("                nowTime = h + \" giờ \" + m + \" phút \" + s + \" giây\";\n");
      out.write("                if (dd < 10) {\n");
      out.write("                    dd = '0' + dd\n");
      out.write("                }\n");
      out.write("                if (mm < 10) {\n");
      out.write("                    mm = '0' + mm\n");
      out.write("                }\n");
      out.write("                today = day + ', ' + dd + '/' + mm + '/' + yyyy;\n");
      out.write("                tmp = '<span class=\"date\"> ' + today + ' - ' + nowTime +\n");
      out.write("                        '</span>';\n");
      out.write("                document.getElementById(\"clock\").innerHTML = tmp;\n");
      out.write("                clocktime = setTimeout(\"time()\", \"1000\", \"Javascript\");\n");
      out.write("\n");
      out.write("                function checkTime(i) {\n");
      out.write("                    if (i < 10) {\n");
      out.write("                        i = \"0\" + i;\n");
      out.write("                    }\n");
      out.write("                    return i;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            //In dữ liệu\n");
      out.write("            var myApp = new function () {\n");
      out.write("                this.printTable = function () {\n");
      out.write("                    var tab = document.getElementById('sampleTable');\n");
      out.write("                    var win = window.open('', '', 'height=700,width=700');\n");
      out.write("                    win.document.write(tab.outerHTML);\n");
      out.write("                    win.document.close();\n");
      out.write("                    win.print();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bill}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("b");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.u.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>(+84)");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.u.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.u.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.totalMoney}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                                           \n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
