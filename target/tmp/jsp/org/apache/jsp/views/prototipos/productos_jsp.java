/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.7.v20170914
 * Generated at: 2022-05-16 10:56:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.prototipos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/home/nekashii/.m2/repository/org/apache/struts/struts2-core/2.5.14.1/struts2-core-2.5.14.1.jar", Long.valueOf(1652665261649L));
    _jspx_dependants.put("jar:file:/home/nekashii/.m2/repository/org/apache/struts/struts2-core/2.5.14.1/struts2-core-2.5.14.1.jar!/META-INF/struts-tags.tld", Long.valueOf(1511966294000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fparam_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fname.release();
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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

      out.write('\n');
      out.write('\n');
String context = request.getContextPath();
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\" ng-app=\"pasteleria\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Struts 2 y Angular JS</title>\n");
      out.write("    <link href=\"");
      out.print(context);
      out.write("/assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/assets/js/angular.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/assets/js/feather.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body ng-controller=\"pasteleriaController\">\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    ");
      if (_jspx_meth_s_005finclude_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header bg-dark text-white\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-auto\"><h5 class=\"m-0\" style=\"padding-block: 0.5rem\">Pasteles</h5></div>\n");
      out.write("                            <div class=\"col-auto ms-auto\"><button class=\"btn btn-success\"><i data-feather=\"plus\"></i></button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table table-striped\">\n");
      out.write("                                <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>#</th>\n");
      out.write("                                    <th>Código</th>\n");
      out.write("                                    <th>Nombre</th>\n");
      out.write("                                    <th>Sabor</th>\n");
      out.write("                                    <th>Precio</th>\n");
      out.write("                                    <th>Cantidad</th>\n");
      out.write("                                    <th>Acciones</th>\n");
      out.write("                                </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody class=\"align-middle\">\n");
      out.write("                                <tr ng-repeat=\"pastel in pasteles\">\n");
      out.write("                                    <th scope=\"row\">{{$index+1}}</th>\n");
      out.write("                                    <td>{{pastel.codigo}}</td>\n");
      out.write("                                    <td>{{pastel.nombre}}</td>\n");
      out.write("                                    <td>{{pastel.sabor}}</td>\n");
      out.write("                                    <td>{{pastel.precio | currency}}</td>\n");
      out.write("                                    <td>{{pastel.cantidad}}</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <button class=\"btn btn-primary\"><i data-feather=\"edit\"></i></button>\n");
      out.write("                                        <button class=\"btn btn-danger\" ng-click=\"mostrarEliminacion($index)\"><i data-feather=\"trash-2\"></i></button>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_s_005finclude_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_s_005finclude_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_s_005finclude_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(context);
      out.write("/assets/js/bootstrap.js\"></script>\n");
      out.write("<script>feather.replace()</script>\n");
      out.write("<script>\n");
      out.write("    const app = angular.module('pasteleria', [])\n");
      out.write("\n");
      out.write("    const pasteles = [\n");
      out.write("        {\n");
      out.write("            codigo: 'P-374',\n");
      out.write("            nombre: 'Pastel Chocoamaretto',\n");
      out.write("            sabor: 'Vainilla',\n");
      out.write("            precio: 236,\n");
      out.write("            cantidad: 7\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("            codigo: 'P-294',\n");
      out.write("            nombre: 'Pastel Rous',\n");
      out.write("            sabor: 'Zarzamora',\n");
      out.write("            precio: 253,\n");
      out.write("            cantidad: 2\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("            codigo: 'P-984',\n");
      out.write("            nombre: 'Pastel Xoccolat',\n");
      out.write("            sabor: 'Chocolate',\n");
      out.write("            precio: 354,\n");
      out.write("            cantidad: 2\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("            codigo: 'P-123',\n");
      out.write("            nombre: 'Pastel de Chocolate con Chocolate',\n");
      out.write("            sabor: 'Chocolate',\n");
      out.write("            precio: 458,\n");
      out.write("            cantidad: 4\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("            codigo: 'P-234',\n");
      out.write("            nombre: 'Pastel de Fresa',\n");
      out.write("            sabor: 'Fresa',\n");
      out.write("            precio: 2,\n");
      out.write("            cantidad: 450\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("            codigo: 'P-568',\n");
      out.write("            nombre: 'Pastel de Queso con Chocolate',\n");
      out.write("            sabor: 'Chocolate',\n");
      out.write("            precio: 500,\n");
      out.write("            cantidad: 7\n");
      out.write("        },\n");
      out.write("    ]\n");
      out.write("\n");
      out.write("    app.controller('pasteleriaController', ($scope) => {\n");
      out.write("        const modalRegistro = new bootstrap.Modal(document.getElementById('modalRegistro'), {})\n");
      out.write("        const modalModificacion = new bootstrap.Modal(document.getElementById('modalModificacion'), {})\n");
      out.write("        const modalEliminacion = new bootstrap.Modal(document.getElementById('modalEliminacion'), {})\n");
      out.write("        $scope.pasteles = pasteles\n");
      out.write("\n");
      out.write("        $scope.mostrarRegistro = (index) => {\n");
      out.write("            $scope.infoRegistro = $scope.pasteles[index]\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $scope.mostrarModificacion = (index) => {\n");
      out.write("            $scope.infoModificacion = $scope.pasteles[index]\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $scope.mostrarEliminacion = (index) => {\n");
      out.write("            $scope.infoEliminacion = {...$scope.pasteles[index], index: index}\n");
      out.write("            modalEliminacion.show()\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $scope.eliminar = (index) => {\n");
      out.write("            const pastelesNuevo = $scope.pasteles.filter((pastel, i) => i != index)\n");
      out.write("            $scope.pasteles = pastelesNuevo\n");
      out.write("            modalEliminacion.hide()\n");
      out.write("        }\n");
      out.write("    })\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_s_005finclude_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_005finclude_005f0 = (org.apache.struts2.views.jsp.IncludeTag) _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue.get(org.apache.struts2.views.jsp.IncludeTag.class);
    try {
      _jspx_th_s_005finclude_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005finclude_005f0.setParent(null);
      // /views/prototipos/productos.jsp(18,4) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005finclude_005f0.setValue("/components/navbar.jsp");
      int _jspx_eval_s_005finclude_005f0 = _jspx_th_s_005finclude_005f0.doStartTag();
      if (_jspx_eval_s_005finclude_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005finclude_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005finclude_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005finclude_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_s_005fparam_005f0(_jspx_th_s_005finclude_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_s_005finclude_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005finclude_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue.reuse(_jspx_th_s_005finclude_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005finclude_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f0 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fname.get(org.apache.struts2.views.jsp.ParamTag.class);
    try {
      _jspx_th_s_005fparam_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005finclude_005f0);
      // /views/prototipos/productos.jsp(19,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fparam_005f0.setName("actualPage");
      int _jspx_eval_s_005fparam_005f0 = _jspx_th_s_005fparam_005f0.doStartTag();
      if (_jspx_eval_s_005fparam_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fparam_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fparam_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fparam_005f0.doInitBody();
        }
        do {
          out.write("prototipos");
          int evalDoAfterBody = _jspx_th_s_005fparam_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fparam_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fname.reuse(_jspx_th_s_005fparam_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_s_005finclude_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_005finclude_005f1 = (org.apache.struts2.views.jsp.IncludeTag) _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    try {
      _jspx_th_s_005finclude_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005finclude_005f1.setParent(null);
      // /views/prototipos/productos.jsp(71,4) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005finclude_005f1.setValue("/components/prototipos/productos/modalRegistro.jsp");
      int _jspx_eval_s_005finclude_005f1 = _jspx_th_s_005finclude_005f1.doStartTag();
      if (_jspx_th_s_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_s_005finclude_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_005finclude_005f2 = (org.apache.struts2.views.jsp.IncludeTag) _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    try {
      _jspx_th_s_005finclude_005f2.setPageContext(_jspx_page_context);
      _jspx_th_s_005finclude_005f2.setParent(null);
      // /views/prototipos/productos.jsp(72,4) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005finclude_005f2.setValue("/components/prototipos/productos/modalModificacion.jsp");
      int _jspx_eval_s_005finclude_005f2 = _jspx_th_s_005finclude_005f2.doStartTag();
      if (_jspx_th_s_005finclude_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_s_005finclude_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_005finclude_005f3 = (org.apache.struts2.views.jsp.IncludeTag) _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    try {
      _jspx_th_s_005finclude_005f3.setPageContext(_jspx_page_context);
      _jspx_th_s_005finclude_005f3.setParent(null);
      // /views/prototipos/productos.jsp(73,4) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005finclude_005f3.setValue("/components/prototipos/productos/modalEliminacion.jsp");
      int _jspx_eval_s_005finclude_005f3 = _jspx_th_s_005finclude_005f3.doStartTag();
      if (_jspx_th_s_005finclude_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f3);
    }
    return false;
  }
}