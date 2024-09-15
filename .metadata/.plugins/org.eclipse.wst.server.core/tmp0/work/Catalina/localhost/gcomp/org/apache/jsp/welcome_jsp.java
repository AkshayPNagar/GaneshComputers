/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2024-04-25 12:39:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <title>Personal-Finance</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	HttpSession session1 =request.getSession(false);
	
	if(session1 !=null && session1.getAttribute("username")!=null)
	{
			String username=(String) session1.getAttribute("username");
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section class=\"container d-none d-md-block\">\r\n");
      out.write("      <div class=\"top_header d-flex justify-content-between \">\r\n");
      out.write("        <div class=\"d-flex\">\r\n");
      out.write("            <div class=\"px-2\"><span>For private customers </span></div>\r\n");
      out.write("            <div class=\"px-2\"><span>For business </span></div>\r\n");
      out.write("            <div class=\"px-2\"><span>Corporate clients </span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"d-flex pe-4\">\r\n");
      out.write("            <div class=\"pe-2\"><i class=\"fa-regular fa-credit-card text-danger\"></i></div>\r\n");
      out.write("            <div class=\"text-danger\">Transfers and payments</div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"height container mt-2 d-none d-xl-block\"></div>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"container\">\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg pb-lg-4\">\r\n");
      out.write("            <div class=\"container-fluid p-0 m-0 \">\r\n");
      out.write("              <a class=\"navbar-brand anchor_logo  \" href=\"#\"><img  src=\"images/logo.svg\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"d-flex\">\r\n");
      out.write("                <div class=\"\"><a href=\"\"><i class=\"pe-2 pt-1 text-dark d-lg-none fa-solid search fa-magnifying-glass\"></i></a></div>\r\n");
      out.write("                <div class=\"button text-center px-2 d-none d-md-block d-md-none\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-outline-dark bg-dark text-light  rounded-0\"> logout </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <button class=\"navbar-toggler  rounded-0\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\r\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>  \r\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                <ul class=\"navbar-nav ps-lg-5 fw-bold\">\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link active text-danger\" href=\"index.html\">Home</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                 \r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"locate.html\">Locate us</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"contact.jsp\">Contact us</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\" d-none d-lg-flex row pe-4\">\r\n");
      out.write("                <div class=\" col-3 d-flex justify-content-center align-items-center\"><a href=\"login.jsp\"><i class=\" text-dark  fa-solid search fa-magnifying-glass\"></i></a></div>\r\n");
      out.write("                <div class=\"button  col-9 text-center\">\r\n");
      out.write("                   <a href=\"login.jsp\"> <button type=\"button\" class=\"btn btn-outline-dark btn-bank  rounded-0\"> Logout </button></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>    \r\n");
      out.write("          </nav>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"button text-center pt-3 d-md-none p-3 \">\r\n");
      out.write("        <a href=\"login.jsp\"> <button type=\"button\" class=\"btn btn-outline-dark w-100 fw-bold rounded-0\"> Login </button> </a>\r\n");
      out.write("		<a href=\"logout.java\"> <button type=\"button\" class=\"btn btn-outline-dark w-100 fw-bold rounded-0\"> Log out </button> </a>        \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"container-fluid cta p-0 m-0 d-xl-none\">\r\n");
      out.write("            <div class=\"main_cta row row-cols-md-2 \">            \r\n");
      out.write("                <div class=\"cta_img d-md-none p-0 \">\r\n");
      out.write("                    <img src=\"images/asset23.jpeg\" class=\"object-fit-cover  img-fluid h-100 w-100\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"bg-danger p-4 ps-4 p-md-5 text-light\">\r\n");
      out.write("                    <h4 class=\"py-md-4\">WELCOME TO MULTIBANK</h4>\r\n");
      out.write("                    <h1 class=\"py-3 fs-1\">The future of banking is already here</h1>\r\n");
      out.write("                    <h6 class=\"py-md-4 \">$0 Monthly Service Charge. Low minimum deposit to open.</h6>\r\n");
      out.write("                    <div class=\" d-none d-md-block py-4\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-lg btn-outline-light bg-light text-dark\">Learn more</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-none d-md-block p-0  md_img\">\r\n");
      out.write("                    <img src=\"images/asset23.jpeg\" class=\" object-fit-cover img-fluid w-100 h-100 \" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"container-fluid d-none d-xl-block\">\r\n");
      out.write("        <div class=\"main_cta position-relative \">\r\n");
      out.write("            <div class=\"\"><img src=\"images/asset23.jpeg\" class=\"object-fit-cover img-fluid h-100 w-100 \" alt=\"\"></div>\r\n");
      out.write("            <div class=\"w-25 position-absolute cta_info\">\r\n");
      out.write("                <div class=\"bg-danger p-5  ps-4 p-md-5 xl_info text-light\">\r\n");
      out.write("                    <h4 class=\"py-md-5 fs-2 text-dark-emphasis\">WELCOME TO MULTIBANK</h4>\r\n");
      out.write("                    <h1 class=\"py-4 \">The future of banking is already here</h1>\r\n");
      out.write("                    <h6 class=\"py-md-4 fs-4 text-dark-emphasis\">$0 Monthly Service Charge. Low minimum deposit to open.</h6>\r\n");
      out.write("                    <div class=\" d-none d-md-block py-3 my-2 \">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-lg btn-outline-light bg-light text-dark  rounded-0\">Learn more</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>            \r\n");
      out.write("        </div> \r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"container mt-xl-5\">\r\n");
      out.write("        <section class=\"choose text-center py-5\">\r\n");
      out.write("            <span>BANKING AT ITS FINEST</span>\r\n");
      out.write("            <h2 class=\"py-3 fs-1\">Choose what's right for you</h2>\r\n");
      out.write("            <span class=\"pb-xl-3 d-block\">We help businesses and customers achieve more</span>\r\n");
      out.write("            <div class=\"choose_items row row-cols-2 py-5 row-cols-md-5\">\r\n");
      out.write("                <div class=\"   border-end border-xl-dark   \">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"text-danger fa-solid fa-mobile-screen\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div><a href=\"\" class=\"text-decoration-none text-dark\"><span class=\"fs-5 pe-1\">Banking</span><i class=\"fa-regular fs-5 fa-circle-right\"></i></a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pb-5 pb-md-0 border-end border-xl-dark \">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"text-danger fa-solid fa-money-check-dollar\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div><a href=\"\" class=\"text-decoration-none text-dark\"><span class=\"fs-5 pe-1\">Checking</span><i class=\"fs-5 fa-regular fa-circle-right\"></i></a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"border-end border-xl-dark\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"text-danger fa-solid fa-piggy-bank\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div><a href=\"\" class=\"text-decoration-none text-dark\"><span class=\"fs-5 pe-1\">Payment</span><i class=\"fa-regular fs-5 fa-circle-right\"></i></a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"border-end border-xl-dark\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"text-danger fa-solid fa-house\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div><a href=\"\" class=\"text-decoration-none text-dark\"><span class=\"fs-5 pe-1\">Saving</span><i class=\"fa-regular fs-5 fa-circle-right\"></i></a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-none d-md-block\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i class=\"text-danger fa-brands fa-cc-amazon-pay\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div><a href=\"\" class=\"text-decoration-none text-dark\"><span class=\"fs-5 pe-1\">Mortgage</span><i class=\"fs-5 fa-regular fa-circle-right\"></i></a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"container p-4 p-md-0\">\r\n");
      out.write("        <div class=\"secure row row-cols-xl-2 pb-xl-5 mb-xl-5\">\r\n");
      out.write("            <div class=\"secure_img p-0 order-xl-1\">\r\n");
      out.write("                <img src=\"images/home-3-big-1-600x610.jpg\" class=\"img-fluid w-100 h-100 object-fit-cover\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"secure_info px-2 d-xl-flex flex-column justify-content-center align-items-center text-center p-xl-5 \">\r\n");
      out.write("                <h6 class=\"pt-4 py-lg-4 text-start text-dark-emphasis \">MULTIBANK MOBILE APP</h6>\r\n");
      out.write("                <h2 class=\"pb-3 py-xl-4  text-start\">Secure, convenient banking with our mobile app</h2>\r\n");
      out.write("                <h6 class=\"pb-4 py-xl-3 text-start text-dark-emphasis\">Operate your accounts in smartphone</h6>\r\n");
      out.write("                <div class=\"pb-5 row row-cols-md-2 py-xl-4 btn_div\">\r\n");
      out.write("                    <div class=\"pb-3\">\r\n");
      out.write("                        <button type=\"button\" class=\"w-100 btn btn-outline-dark  rounded-0\"><i class=\"fa-brands fa-apple pe-1\"></i>App Store</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div >\r\n");
      out.write("                        <button type=\"button\" class=\"w-100 btn btn-outline-dark  rounded-0\"><i class=\"fa-brands fa-google-play pe-1\"></i>Google play</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>    \r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"container\">\r\n");
      out.write("        <div class=\"accordi text-center pb-5\">\r\n");
      out.write("            <p class=\"m-0 pt-5\">HELP CENTER</p>\r\n");
      out.write("            <h2 class=\"py-3 fs-1\">Frequently asked questions</h2>\r\n");
      out.write("            <p class=\"pb-5\">Got a question about how weâre organised, applying to work for us, or looking for financial or shareholder information?<span class=\"text-danger\">View more Q&A here</span></p>\r\n");
      out.write("            <div class=\"accordion accordion-flush text-start\" id=\"accordionFlushExample\">\r\n");
      out.write("                <div class=\"accordion-item\">\r\n");
      out.write("                  <h2 class=\"accordion-header\">\r\n");
      out.write("                    <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapseOne\">\r\n");
      out.write("                        I'm having trouble accessing my account online. What should I do?\r\n");
      out.write("                    </button>\r\n");
      out.write("                  </h2>\r\n");
      out.write("                  <div id=\"flush-collapseOne\" class=\"accordion-collapse collapse\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                    <div class=\"accordion-body\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Harum, beatae vitae at aspernatur repudiandae voluptatum optio reprehenderit obcaecati. Tempore soluta itaque placeat quaerat cum aut eos veniam odio, molestias repellat.</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"accordion-item\">\r\n");
      out.write("                  <h2 class=\"accordion-header\">\r\n");
      out.write("                    <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapseTwo\">\r\n");
      out.write("                        What is the address I mail my credit card payment to?\r\n");
      out.write("                    </button>\r\n");
      out.write("                  </h2>\r\n");
      out.write("                  <div id=\"flush-collapseTwo\" class=\"accordion-collapse collapse\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                    <div class=\"accordion-body\">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Voluptatem aliquid nesciunt assumenda inventore veniam culpa consequuntur dolores soluta fugit ducimus autem distinctio accusantium obcaecati, unde laborum tempore rem. Modi, iusto?</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"accordion-item\">\r\n");
      out.write("                  <h2 class=\"accordion-header\">\r\n");
      out.write("                    <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapseThree\">\r\n");
      out.write("                        How do I dispute a charge on my account?\r\n");
      out.write("                    </button>\r\n");
      out.write("                  </h2>\r\n");
      out.write("                  <div id=\"flush-collapseThree\" class=\"accordion-collapse collapse\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                    <div class=\"accordion-body\">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quaerat exercitationem, recusandae consequuntur fugiat neque cum dolor distinctio explicabo velit hic. Id esse ducimus earum nulla consequuntur sapiente assumenda commodi necessitatibus.</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"accordion-item\">\r\n");
      out.write("                    <h2 class=\"accordion-header\">\r\n");
      out.write("                      <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapsefour\">\r\n");
      out.write("                        How do I contact the payment assistance team?\r\n");
      out.write("                      </button>\r\n");
      out.write("                    </h2>\r\n");
      out.write("                    <div id=\"flush-collapsefour\" class=\"accordion-collapse collapse\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                      <div class=\"accordion-body\">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Labore quia odio quo aliquam perferendis atque incidunt vel blanditiis mollitia soluta consequatur tempora non aspernatur, repudiandae quaerat veniam eum hic repellendus.</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"accordion-item\">\r\n");
      out.write("                    <h2 class=\"accordion-header\">\r\n");
      out.write("                      <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapsefive\">\r\n");
      out.write("                        How do I activate a card?\r\n");
      out.write("                      </button>\r\n");
      out.write("                    </h2>\r\n");
      out.write("                    <div id=\"flush-collapsefive\" class=\"accordion-collapse collapse\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                      <div class=\"accordion-body\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Enim veritatis labore commodi, optio praesentium laborum totam dolore molestias facilis voluptas ipsam? Architecto ut debitis, repudiandae autem molestiae temporibus dignissimos eveniet.</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section class=\"container-fluid main_footer py-5\">\r\n");
      out.write("        <section class=\"container\">\r\n");
      out.write("            <div class=\"row row-cols-md-2\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h4 class=\"fw-bold text-light\">Open an account now and enjoy all the benefits of modern banking</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"py-3 d-md-flex justify-content-end\">\r\n");
      out.write("                    <button type=\"button\" class=\"me-md-3 btn btn-outline-dark btn-lg bg-danger text-light  rounded-0\">Open Account</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"heightt my-3\"></div>\r\n");
      out.write("            <div class=\"lower_div row row-cols-xl-2\">\r\n");
      out.write("               <div class=\"row row-cols-md-2 row-cols-xl-2\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <img src=\"images/logo.svg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p class=\"mt-2 text-dark-emphasis\">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Sequi ab a laudantium amet, nam ut odit minima, non veniam ducimus dicta quidem eligendi ratione maxime quasi eos facere minus voluptatibus.</p>\r\n");
      out.write("                    <div class=\"d-flex pb-3\">\r\n");
      out.write("                        <div><a href=\"\" class=\"text-dark\"><i class=\"fa-brands fa-facebook text-light fs-5\"></i></a></div>\r\n");
      out.write("                        <div class=\"px-3\"><a href=\"\" class=\"text-dark\"><i class=\"fa-brands fa-x-twitter text-light fs-5\"></i></a></div>\r\n");
      out.write("                        <div><a href=\"\" class=\"text-dark\"><i class=\"fa-brands fa-linkedin text-light fs-5\"></i></a></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"pb-5 row row-cols-md-1 pt-md-5 btn_div\">\r\n");
      out.write("                        <div class=\"pb-3 \">\r\n");
      out.write("                            <button type=\"button\" class=\"w-100 btn btn-outline-light rounded-0\"><i class=\"fa-brands fa-apple pe-1\"></i>App Store</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div >\r\n");
      out.write("                            <button type=\"button\" class=\"w-100 btn btn-outline-light  rounded-0\"><i class=\"fa-brands fa-google-play pe-1\"></i>Google play</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"account row row-cols-2 row-cols-md-1\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h6 class=\"fw-bold text-dark-emphasis\">ACCOUNT SERVICES</h6>\r\n");
      out.write("                        <div class=\"\">\r\n");
      out.write("                            <p><a class=\"text-light\" href=\"\">ATM Services</a></p>\r\n");
      out.write("                            <p><a class=\"text-light\" href=\"\">Beneficial Ownership</a></p>\r\n");
      out.write("                            <p><a class=\"text-light\" href=\"\">Calculators</a></p>\r\n");
      out.write("                            <p><a class=\"text-light\" href=\"\">Direct Deposit</a></p>\r\n");
      out.write("                            <p><a class=\"text-light\" href=\"\">Fraud Prevention</a></p>\r\n");
      out.write("                            <p><a class=\"text-light\" href=\"\">Overdraft Services</a></p>\r\n");
      out.write("                            <p><a class=\"text-light\" href=\"\">Switch Kit</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h6 class=\"fw-bold text-dark-emphasis\">CARD SERVICES</h6>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <p><a href=\"\" class=\"text-light\">Credit Cards</a></p>\r\n");
      out.write("                            <p><a href=\"\" class=\"text-light\">Debit Cards</a></p>\r\n");
      out.write("                            <p><a href=\"\" class=\"text-light\">Gift Cards</a></p>\r\n");
      out.write("                            <p><a href=\"\" class=\"text-light\">Prepaid Cards</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("                <div class=\"main_last row row-cols-2\">\r\n");
      out.write("                    <div class=\"online_services\">\r\n");
      out.write("                        <h6 class=\"fw-bold text-dark-emphasis\">ONLINE SERVICES</h6>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Apply for a Loan</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Apply for a Mortgage</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">eStatements</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Make a Loan Payment</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Make an Appointment</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Mobile App</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Mobile Deposit</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Online Banking Guides</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Open an Account</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Rates</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Switch Kit</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Reorder Checks</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">Text Banking</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("    \r\n");
      out.write("                    <div class=\"bank_info\">\r\n");
      out.write("                       <div class=\"upper_info\">\r\n");
      out.write("                        <h6 class=\"fw-bold text-dark-emphasis\">BANK INFORMATION</h6>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <p><a href=\"\" class=\"text-light\">About The Bank</a></p>\r\n");
      out.write("                            <p><a href=\"\" class=\"text-light\">Bank Services</a></p>\r\n");
      out.write("                            <p><a href=\"\" class=\"text-light\">Locations</a></p>\r\n");
      out.write("                            <p><a href=\"\" class=\"text-light\">Shop</a></p>\r\n");
      out.write("                            <p><a href=\"\" class=\"text-light\">Image Credits</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       </div>\r\n");
      out.write("                       \r\n");
      out.write("                       <div class=\"contact text-dark-emphasis\">\r\n");
      out.write("                        <h6>contact</h6>\r\n");
      out.write("                        <p>Corporate Headquarters: 85 Broad Street, New York, NY 10004</p>\r\n");
      out.write("                        <p>Routing Number: 111923607</p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\">1-123-456-7890</a></p>\r\n");
      out.write("                        <p><a href=\"\" class=\"text-light\" >customercare@ex.com</a></p>\r\n");
      out.write("                       </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"heightt \"></div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </section>\r\n");
      out.write("    ");

	} 
	
	else{
		response.sendRedirect("login.jsp");		
	}
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
