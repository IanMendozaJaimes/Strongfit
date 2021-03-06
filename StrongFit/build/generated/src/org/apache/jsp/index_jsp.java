package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <!-- Metadatos para buscadores -->\n");
      out.write("\t<!-- Descripción de la página -->\n");
      out.write("\t<meta name=\"description\" content=\"Mejora tu salud y vive plenamente\" />\n");
      out.write("\t<!-- Autor de la página -->\n");
      out.write("\t<meta name=\"author\" content=\"StrongFit, Strom\" />\n");
      out.write("\t<!-- Indexación para los motores de búsqueda -->\n");
      out.write("\t<meta name=\"robots\" content=\"index, follow, noarchive\" />\n");
      out.write("\t<!-- Palabras clave de la página -->\n");
      out.write("\t<meta name=\"keywords\" content=\"Strong, fit, dieta, salud, HTML5, CSS3, JavaScript\" />\n");
      out.write("\t<!-- Para el responsive design de la página -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=2\">\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"Estilos/estilo.css\">-->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel = \"stylesheet\" type =\"text/css\" href=\"Estilos/normalize.css\">\n");
      out.write("        <link rel = \"stylesheet\" type =\"text/css\" href=\"Estilos/estilos_login.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Imagenes/logo_s.jpg\">\n");
      out.write("        <title>StrongFit</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <header class = \"Header\">\n");
      out.write("            <p class=\"Header-title\"><a href = \"index.jsp\">Strongfit</a></p>\n");
      out.write("            <form action = \"sLogIn\" method=\"post\" class=\"Header-form\">\n");
      out.write("                    <input type = \"email\" name = \"txt-mail\" class=\"Header-mail Header-txt\" placeholder = \"Correo\" required>\n");
      out.write("                    <input type = \"password\" name = \"txt-pass\" class = \"Header-pass Header-txt\" placeholder=\"Contraseña\" required>\n");
      out.write("                    <input type = \"submit\" name = \"btn-signin\" class=\"Header-submit\" value=\"Entrar\">\n");
      out.write("            </form>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <section class=\"Section\">\n");
      out.write("            <article class=\"Section-article\">\n");
      out.write("                <h3 class = \"Section-login\">¿No tienes cuenta? &nbsp;<strong style=\"font-size: 1.4em;\">Registrate</strong></h3>\n");
      out.write("                <hr class=\"Section-line\">\n");
      out.write("                <form action = \"sAltaDeUsuario\" method=\"post\" class=\"Section-form\">\n");
      out.write("                    <input type = \"text\" name = \"txt-name\" class=\"Section-nombre Section-txt\" placeholder = \"Nombre\" required>\n");
      out.write("                    <input type = \"email\" name = \"txt-mail\" class=\"Section-mail Section-txt\" placeholder = \"Correo\" required>\n");
      out.write("                    <input type = \"password\" name = \"txt-pass\" class = \"Section-pass Section-txt\" placeholder=\"Contraseña\" required>\n");
      out.write("                    <input type = \"submit\" name = \"btn-signin\" class=\"Section-submit\" value=\"Unirse\">\n");
      out.write("                    <p>¿Eres un nutriólogo?<a href = \"jsp/nutriologo/altanutriologo.jsp\">Registrate como médico.</a></p>\n");
      out.write("                </form>\n");
      out.write("            </article>\n");
      out.write("            <article class=\"Section-signup\">\n");
      out.write("                <p>Administra tus comidas diarias, tus dietas, tu gasto calórico, encuentra nutriólogos y mucho más con <strong>Strongfit</strong>.</p>\n");
      out.write("            </article>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <footer class = \"Footer\">\n");
      out.write("            <p class=\"Footer-parrafo Footer-parrafo1\">Strongfit es un proyecto creado por <a href=\"#\" class=\"Footer-link\">Strom</a>.</p>\n");
      out.write("            <p class=\"Footer-parrafo\"><a href=\"#\" class = \"Footer-link\">Politicas de privacidad</a></p>\n");
      out.write("        </footer>\n");
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
