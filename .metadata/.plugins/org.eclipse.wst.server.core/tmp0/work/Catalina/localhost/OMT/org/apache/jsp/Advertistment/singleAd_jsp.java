/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-05-27 06:38:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Advertistment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import OMTpkg.Advertistment.AdModel;

public final class singleAd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("OMTpkg.Advertistment.AdModel");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../styles/Default.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("	\r\n");
      out.write("	<style type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("	body{\r\n");
      out.write("	background-image: url(\"styles/images/bg.jpg\");\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("  	background-attachment: fixed;\r\n");
      out.write("  	background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("	\r\n");
      out.write("	</style>\r\n");
      out.write("	\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"container\">\r\n");

	AdModel ad = (AdModel)request.getAttribute("ad");
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"card mb-3\">\r\n");
      out.write("  <video class=\"card-img-top\"  controls>\r\n");
      out.write("  	 <source src='Uploads/");
      out.print(ad.getPath());
      out.write("' type=\"video/mp4\">\r\n");
      out.write("  </video>\r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <h5 class=\"card-title\">");
      out.print(ad.getAdName() );
      out.write("</h5>\r\n");
      out.write("    <p class=\"card-text\">\r\n");
      out.write("    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/AdController?action=UPDATE\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("    	 <input type=\"text\" name=\"adname\" id=\"adname\" placeholder=\"");
      out.print(ad.getAdName() );
      out.write("\" class=\"form-control\"><br>\r\n");
      out.write("        <select name=\"category\" class=\"form-control\">\r\n");
      out.write("        	<option value=\"");
      out.print(ad.getCategory() );
      out.write('"');
      out.write('>');
      out.print(ad.getCategory() );
      out.write("</option>\r\n");
      out.write("            <option value=\"education\">education</option>\r\n");
      out.write("            <option value=\"entertainment\">entertainment</option>\r\n");
      out.write("            <option value=\"health\">health care</option>\r\n");
      out.write("            <option value=\"foods\">foods</option>\r\n");
      out.write("            <option value=\"others\">others</option>\r\n");
      out.write("        </select><br>\r\n");
      out.write("        <select name=\"period\" class=\"form-control\">\r\n");
      out.write("        	<option value=\"");
      out.print(ad.getPeriod() );
      out.write('"');
      out.write('>');
      out.print(ad.getPeriod() );
      out.write("</option>\r\n");
      out.write("            <option value=\"day\">1 day</option>\r\n");
      out.write("            <option value=\"week\">7 days</option>\r\n");
      out.write("            <option value=\"two-weeks\">14 days</option>\r\n");
      out.write("            <option value=\"month\">28 days</option>\r\n");
      out.write("        </select><br>\r\n");
      out.write("        <input type=\"file\" name=\"thumbFile\" id=\"name\" accept=\"image/*\"><br>\r\n");
      out.write("        <input type=\"file\" name=\"file\" id=\"name\"><br>\r\n");
      out.write("       <center> <button type=\"submit\" class=\"btn btn-dark\">Update</button></center>\r\n");
      out.write("        <input type=\"text\" name=\"id\" value=\"");
      out.print(ad.getId());
      out.write("\" hidden>\r\n");
      out.write("    </form>\r\n");
      out.write("    </p>\r\n");
      out.write("    <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("		integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("		integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("		integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
