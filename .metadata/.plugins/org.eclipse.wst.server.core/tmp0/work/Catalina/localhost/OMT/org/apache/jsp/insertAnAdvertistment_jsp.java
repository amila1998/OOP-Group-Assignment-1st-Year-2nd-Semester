/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-05-28 03:47:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;

public final class insertAnAdvertistment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/AmilaSLIIT/2020eclipsprojects/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/OMT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/../styles/Default.css", Long.valueOf(1622163719564L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1622110055988L));
    _jspx_dependants.put("/../styles/userRegister.css", Long.valueOf(1621156846694L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/Default.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/userRegister.css\">\r\n");
      out.write("<style>\r\n");
      out.write("@charset \"ISO-8859-1\";\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  font-family: roboto, sans-serif;\r\n");
      out.write("  background-image: linear-gradient(#ff6963,black,black);\r\n");
      out.write("  \r\n");
      out.write("  background-repeat: repeat;\r\n");
      out.write("  background-attachment: fixed;\r\n");
      out.write("  background-size: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*start of header*/\r\n");
      out.write("#mainHeader {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  display:flex;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("  padding: 0px 10px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  position:fixed;\r\n");
      out.write("  top: 0px;\r\n");
      out.write("  background: #eee;\r\n");
      out.write("  transition: background 0.4s;\r\n");
      out.write("  z-index: +1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mainHeader.is-sticky {\r\n");
      out.write("  background: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mainHeader.is-sticky a {\r\n");
      out.write("  color:#eee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mainHeader.is-sticky .logo img {\r\n");
      out.write("  height:64px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mainHeader.is-sticky .Plogo img {\r\n");
      out.write("  margin-top:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mainHeader.is-sticky .SearchPadding {\r\n");
      out.write("  padding:5px 20px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".logo img {\r\n");
      out.write("  height: 84px;\r\n");
      out.write("  transition: height 0.4s;\r\n");
      out.write("}\r\n");
      out.write(".Plogo img {\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  margin-top:18px;\r\n");
      out.write("  transition:0.4s;\r\n");
      out.write("}\r\n");
      out.write("#mainHeader .SearchPadding{\r\n");
      out.write("	padding:10px 10px;\r\n");
      out.write("	transition:0.4s;\r\n");
      out.write("}\r\n");
      out.write("#mainHeader .searchForm {\r\n");
      out.write("  float: middle;\r\n");
      out.write("  padding: 6px 20px;\r\n");
      out.write("  margin-top: 15px;\r\n");
      out.write("  background: none;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer; \r\n");
      out.write("  display:flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".searchTxt\r\n");
      out.write("{\r\n");
      out.write("  background-color: white;\r\n");
      out.write("  border: none;\r\n");
      out.write("  padding: 5.5px 10px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  width:400px;\r\n");
      out.write("}\r\n");
      out.write(".searchBT:hover {\r\n");
      out.write("  background-color:#66ff66;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".searchBT {\r\n");
      out.write("  background-color: #00cc00;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 5px 10px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/*End of header*/\r\n");
      out.write("\r\n");
      out.write("/* start editing horizontal menu*/\r\n");
      out.write("#menu {\r\n");
      out.write("	 margin-top: 84px;\r\n");
      out.write("	 width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("ul.menu {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li.menu1 {\r\n");
      out.write("  float: left;\r\n");
      out.write("}\r\n");
      out.write("li.menu2 {\r\n");
      out.write("  float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu li a   {\r\n");
      out.write("	/* When you have li and a together this will work*/\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change the link color to pink on hover \r\n");
      out.write("When you move the curser to a menu item it will highlighted with pink*/\r\n");
      out.write("#menu  li a:hover {\r\n");
      out.write("  background-color: gray;\r\n");
      out.write("}\r\n");
      out.write("/*============================================================================*/\r\n");
      out.write("/*Start of footer*/\r\n");
      out.write("\r\n");
      out.write("div.Bfooter{\r\n");
      out.write("	display:table;\r\n");
      out.write("	width:100%;\r\n");
      out.write("	height:auto;\r\n");
      out.write("}\r\n");
      out.write("#mainFooter {\r\n");
      out.write("  display:flex;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("  bottom:0px;\r\n");
      out.write("  padding:10px 30px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  background-color: rgb(100, 100, 100);\r\n");
      out.write("  color:white;\r\n");
      out.write("  position:fixed;\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("#mainFooter .FtopPadding{\r\n");
      out.write("	padding-top:10px;\r\n");
      out.write("}\r\n");
      out.write(".SocialLogos img {\r\n");
      out.write("\r\n");
      out.write("	width:30px;\r\n");
      out.write("	height:30px;\r\n");
      out.write("}\r\n");
      out.write("#mainFooter ul.SocialLogos {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding:0;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("#mainFooter li.SocialLogos {\r\n");
      out.write("  float: left;\r\n");
      out.write("}\r\n");
      out.write("#mainFooter li a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".DateandTime{\r\n");
      out.write("	font-family:\"Arial Black\", Gadget, sans-serif;\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write(".copyRSing{\r\n");
      out.write("	font-family:\"Comic Sans MS\", cursive, sans-serif;\r\n");
      out.write("	padding-left:90px;\r\n");
      out.write("}\r\n");
      out.write("#Footer2 {\r\n");
      out.write("  display:flex;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("  padding: 10px 16px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  background: #14141f;\r\n");
      out.write("  color:white;\r\n");
      out.write("  margin-bottom:50px;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("#Footer2 ul.style {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  padding-bottom:40px;\r\n");
      out.write("}\r\n");
      out.write("#Footer2 li a{\r\n");
      out.write("	color: white;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-style: italic;\r\n");
      out.write("}\r\n");
      out.write("#Footer2 li a:hover {\r\n");
      out.write("  color: gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#Footer2 .Txtstyle{\r\n");
      out.write("	font-family:\"Comic Sans MS\", cursive, sans-serif;\r\n");
      out.write("	font-size:24px;\r\n");
      out.write("	line-height: 1.8;\r\n");
      out.write("}\r\n");
      out.write("#Footer2 .Txtstyle2{\r\n");
      out.write("	padding-top:90px;\r\n");
      out.write("	font-family:\"Comic Sans MS\", cursive, sans-serif;\r\n");
      out.write("	font-size:24px;\r\n");
      out.write("	line-height: 1.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#Footer2 ul.proFBBt {\r\n");
      out.write("  background-color: #00cc00;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 20px 50px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#Footer2 .btpadding{\r\n");
      out.write("	padding-top:50px;\r\n");
      out.write("	padding-left:20px;\r\n");
      out.write("}\r\n");
      out.write("/*============================================================================*/\r\n");
      out.write("\r\n");
      out.write("h1.Ttxtstyle{\r\n");
      out.write("	color:white;\r\n");
      out.write("	font-family:\"Arial Black\", Gadget, sans-serif;\r\n");
      out.write("	text-shadow:1px 1px 2px black, 0 0 25px black, 0 0 5px black;\r\n");
      out.write("	font-size:60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("section {\r\n");
      out.write("	padding:20px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*DIV sections*/\r\n");
      out.write(".row {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  flex-wrap: wrap;\r\n");
      out.write("  margin: 0 -16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".col-25 {\r\n");
      out.write("  flex: 25%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-50,\r\n");
      out.write(".coll-50 {\r\n");
      out.write("   flex: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-75 {\r\n");
      out.write("  flex: 75%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-25,\r\n");
      out.write(".col-50,\r\n");
      out.write(".col-75 {\r\n");
      out.write("  padding: 20px 16px;\r\n");
      out.write("}\r\n");
      out.write("/*--------------------------------------------------------------------------------------*/\r\n");
      out.write("/*Form*/\r\n");
      out.write("fieldset{\r\n");
      out.write("	padding:20px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("legend{\r\n");
      out.write("	font-size:22px;\r\n");
      out.write("	font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle1.style2{\r\n");
      out.write("	font-family:\"Arial Black\", Gadget, sans-serif;\r\n");
      out.write("	font-size:30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle1 label,\r\n");
      out.write("#formStyle3 label {\r\n");
      out.write("  display: block;\r\n");
      out.write("  font-size:16px;\r\n");
      out.write("  float:left;\r\n");
      out.write("  margin-left:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle4 label{\r\n");
      out.write("  float:center;\r\n");
      out.write("  display: block;\r\n");
      out.write("  font-size:16px;\r\n");
      out.write("  margin-left:10px;\r\n");
      out.write("  margin-bottom:30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle2 label{ \r\n");
      out.write("	 font-family: \"Comic Sans MS\", cursive, sans-serif;\r\n");
      out.write("	 font-weight:bold;\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("    line-height: 1.15;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("	 width:100%;\r\n");
      out.write("}\r\n");
      out.write("#formStyle6 input[type=text],\r\n");
      out.write("#formStyle6 input[type=email],\r\n");
      out.write("#formStyle3 input[type=email],\r\n");
      out.write("#formStyle3  input[type= password],\r\n");
      out.write("#formStyle1  input[type= password],\r\n");
      out.write("#formStyle1  input[type= number],\r\n");
      out.write("#formStyle1 input[type=file],\r\n");
      out.write("#formStyle1 input[type=number]\r\n");
      out.write("#formStyle4 input[type=email],\r\n");
      out.write("#formStyle1 input[type=email],\r\n");
      out.write("#formStyle1 input[type=month],\r\n");
      out.write("#formStyle1 input[type=date],\r\n");
      out.write("#formStyle1 input[type=text],\r\n");
      out.write("#formStyle1 input[type=tel],\r\n");
      out.write("#formStyle3 input[type=text],\r\n");
      out.write("#formStyle4 input[type=tel],\r\n");
      out.write("#formStyle4 input[type=text],\r\n");
      out.write("#formStyle1 select{\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  margin-bottom: 20px;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  border: 2px solid #ccc;\r\n");
      out.write("  border-radius: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle6 input:active[type=text],\r\n");
      out.write("#formStyle6 input:active[type=email],\r\n");
      out.write("#formStyle3  input:active[type= password],\r\n");
      out.write("#formStyle3  input:active[type= email],\r\n");
      out.write("#formStyle1 input:active[type=file],\r\n");
      out.write("#formStyle1 input:active[type=number],\r\n");
      out.write("#formStyle1 input:active[type=month],\r\n");
      out.write("#formStyle1 input:active[type=text],\r\n");
      out.write("#formStyle3 input:active[type=text],\r\n");
      out.write("#formStyle4 input:active[type=text],\r\n");
      out.write("#formStyle4 input:active[type=text],\r\n");
      out.write("#formStyle1 select:active{\r\n");
      out.write("    border: 2px solid #808080;\r\n");
      out.write("	outline:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle3  input[type= radio]{\r\n");
      out.write("  margin-bottom: 20px;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("  margin-left:20px;\r\n");
      out.write("  outline:none;\r\n");
      out.write("}\r\n");
      out.write("#formStyle6 textarea,\r\n");
      out.write("#formStyle1 textarea{\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  margin-bottom: 20px;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("  height:80px;\r\n");
      out.write("  font-family:Verdana;\r\n");
      out.write("  border-radius:50px;\r\n");
      out.write("  outline:none;\r\n");
      out.write("  resize: vertical;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle1 form,\r\n");
      out.write("#formStyle2 form,\r\n");
      out.write("#formStyle3 form,\r\n");
      out.write("#formStyle4 form{\r\n");
      out.write("	padding:20px;\r\n");
      out.write("	background-color: rgba(255, 255, 255,0.5);\r\n");
      out.write("	font-size:14px;\r\n");
      out.write("	font-family:Verdana;\r\n");
      out.write("	color:black;\r\n");
      out.write("	margin:20px;\r\n");
      out.write("	box-shadow:1px 1px 2px black, 0 0 25px black, 0 0 5px black;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	border:none;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("#formStyle6 form{\r\n");
      out.write("	font-size:14px;\r\n");
      out.write("	font-family:Verdana;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	border:none;\r\n");
      out.write("	padding:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle1 form,\r\n");
      out.write("#formStyle4 form{\r\n");
      out.write("	width:99%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle2 form{\r\n");
      out.write("	width:95%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formStyle3 form{\r\n");
      out.write("	width:50%;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	position:center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".Btn,\r\n");
      out.write(".Btn1,\r\n");
      out.write(".Btn2,\r\n");
      out.write(".Btn3,\r\n");
      out.write(".Btn4,\r\n");
      out.write(".Btn5{\r\n");
      out.write("\r\n");
      out.write("	padding:20px 30px;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  background-color: #680000;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 30px;\r\n");
      out.write("  box-shadow: 0 5px #999;\r\n");
      out.write("  margin-bottom:30px;\r\n");
      out.write("  margin-top:10px;\r\n");
      out.write("  margin-left:20px;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".Btn:active,\r\n");
      out.write(".Btn1:active,\r\n");
      out.write(".Btn3:active,\r\n");
      out.write(".Btn2:active,\r\n");
      out.write(".Btn4:active,\r\n");
      out.write(".Btn5:active,\r\n");
      out.write(".Btn6:active{\r\n");
      out.write("	background-color: #ff6a6f;\r\n");
      out.write("  box-shadow: 0 3px #666;\r\n");
      out.write("  transform: translateY(4px);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".Btn:hover,\r\n");
      out.write(".Btn1:hover,\r\n");
      out.write(".Btn3:hover,\r\n");
      out.write(".Btn2:hover,\r\n");
      out.write(".Btn4:hover,\r\n");
      out.write(".Btn5:hover{\r\n");
      out.write("	background-color: #ff6a6f\r\n");
      out.write("}\r\n");
      out.write(".Btn,\r\n");
      out.write(".Btn1{\r\n");
      out.write("	float:right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".Btn2{\r\n");
      out.write("	float:left;\r\n");
      out.write("}\r\n");
      out.write(".Btn3{\r\n");
      out.write("	margin-bottom:20px;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write(".Btn4{\r\n");
      out.write("	margin-left:10px;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".Btn5{\r\n");
      out.write("	width:95%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write(".RegisterBody{\r\n");
      out.write("	padding:20px 300px;\r\n");
      out.write("}");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<title>user register</title>\r\n");
      out.write("<header>\r\n");
      out.write("\r\n");

   // Get session creation time.
   Date createTime = new Date(session.getCreationTime());
      // Get last access time of this Webpage.
   Date lastAccessTime = new Date(session.getLastAccessedTime());
  
   Integer visitCount = new Integer(0);
   String visitCountKey = new String("visitCount");
   String userIDKey = new String("userID");
   String userID = new String("ABCD");

   // Check if this is new comer on your Webpage.
   if (session.isNew() ){
	   response.sendRedirect("login.jsp?msg=loginFirst");
   }
   if (session == null){
	   response.sendRedirect("login.jsp?msg=loginFirst");
   }
   String Email =(String)session.getAttribute("email");
     

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".navbar {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  background-color: #555;\r\n");
      out.write("  overflow: auto;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar a {\r\n");
      out.write("  float: left;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar a:hover {\r\n");
      out.write("  background-color: #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("  background-color: #d14959;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 500px) {\r\n");
      out.write("  .navbar a {\r\n");
      out.write("    float: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("  <a href=\"#\"><i class=\"fa fa-fw fa-home\"></i> Home</a> \r\n");
      out.write("  <a href=\"#\"><i class=\"fa fa-fw fa-search\"></i> Search</a> \r\n");
      out.write("  <a href=\"userProfile\"><i class=\"fa fa-fw fa-user\"></i> ");
      out.print(Email );
      out.write("</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

		String id = request.getParameter("uid");


      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write(" \r\n");
      out.write("	\r\n");
      out.write("	 \r\n");
      out.write("	 \r\n");
      out.write("\r\n");
      out.write("<center><h1 class=\"Ttxtstyle\">Insert An Adevertistment</h1></center>\r\n");
      out.write("<div class=\"RegisterBody\">\r\n");
      out.write("<section style=\"width:100%\">\r\n");
      out.write("	<div id=\"formStyle1\">\r\n");
      out.write("		<form action=\"insertAdv\" target=\"_self\" method=\"POST\">\r\n");
      out.write("		<fieldset>\r\n");
      out.write("			<label for=\"name\">User ID:</label>\r\n");
      out.write("  			<input type=\"text\" id=\"id\" name=\"uid\" value=\"");
      out.print( id );
      out.write("\" readonly>\r\n");
      out.write("  			\r\n");
      out.write("			<label for=\"name\">Advertistment Name:</label>\r\n");
      out.write("  			<input type=\"text\" id=\"ad_name\" name=\"ad_name\" required>\r\n");
      out.write("			  				\r\n");
      out.write("			<label for=\"MobileNumber\">Category :</label>\r\n");
      out.write("			<input type=\"text\" id=\"adCategory\" name=\"adCategory\" required>\r\n");
      out.write("			\r\n");
      out.write("			<label for=\"ageRestrictio\">Period :</label>\r\n");
      out.write("			<input type=\"text\" id=\"period\" name=\"period\" required>\r\n");
      out.write("			\r\n");
      out.write("					\r\n");
      out.write("			<label for=\"file\">Insert File :</label>\r\n");
      out.write("			<input type=\"file\" id=\"file\" name=\"file\" required>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			<label for=\"file\">Thumbnail :</label>\r\n");
      out.write("			<input type=\"file\" id=\"thumbnail\" name=\"thumbnail\">\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("										 \r\n");
      out.write("			<br><br>\r\n");
      out.write("			\r\n");
      out.write("			<input name=\"AdInsert\" class=\"Btn1\" type=\"submit\" id=\"btn2\" name=\"btn2\"  value=\"Insert Advertistment\">\r\n");
      out.write("			\r\n");
      out.write("	</fieldset>\r\n");
      out.write("		</form>\r\n");
      out.write("        </div>\r\n");
      out.write("		</section>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<footer style=\"display: block;\r\n");
      out.write("  width:100%;\r\n");
      out.write("  height:auto;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  position:fixed;\">\r\n");
      out.write("<div class=\"FtopPadding\">\r\n");
      out.write("				<p class=\"copyRSing\" >Copyright &#169; 2021 - Online Movie & Tv Series System - All Right Reserved</p>\r\n");
      out.write("			</div>	\r\n");
      out.write("</footer>\r\n");
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
