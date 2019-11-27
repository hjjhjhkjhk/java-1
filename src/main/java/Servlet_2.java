import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_2",urlPatterns = "/index")
public class Servlet_2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // setCharacterEncoding必须要获取请求参数之前调用才有效
        request.setCharacterEncoding("UTF-8");
        //告诉浏览器输出的内容是html,并且以utf-8的编码来查看这个内容。
        response.setContentType("text/html; charset=utf-8");
        String user = request.getParameter("user");//账号
        String pass = request.getParameter("pass");//密码
        if (user.equals("123")) {
            request.getRequestDispatcher("/Servlet_21.jsp").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // setCharacterEncoding必须要获取请求参数之前调用才有效
        request.setCharacterEncoding("UTF-8");
        //告诉浏览器输出的内容是html,并且以utf-8的编码来查看这个内容。
        response.setContentType("text/html; charset=utf-8");

//        System.out.println("客户端发出请求时的完整URL：" + request.getRequestURL());
//        System.out.println("请求方式：" + request.getMethod());
//        System.out.println("获取浏览器传递过来的头信息,可以获取浏览器的基本资料：" + request.getHeader("user-agent"));
//        System.out.println("请求行中的参数部分：" + request.getQueryString());
//        System.out.println("浏览器所处于的客户机的IP地址：" + request.getRemoteAddr());
//        System.out.println("浏览器所处于的客户机的主机名：" + request.getRemoteHost());
//        System.out.println("浏览器所处于的客户机使用的网络端口：" + request.getRemotePort());
//        System.out.println("服务器的IP地址：" + request.getLocalAddr());
//        System.out.println("服务器的主机名：" + request.getLocalName());
//        System.out.println("服务器使用的网络端口：" + request.getLocalPort());

//        Enumeration<String> em = request.getHeaderNames();  //得到请求头的name集合
//        while (em.hasMoreElements()) {
//            String name = (String) em.nextElement();
//            String value = request.getHeader(name); //通过请求头的name等到请求头的值
//            System.out.println(name + "=" + value);
//        }
//        PrintWriter out = response.getWriter();//设置输出流到http
//        out.println("<!DOCTYPE html><html><head>");
//        out.println("<title>我是新页面</title>");
//        out.println("</head><body>");
//        out.println("<%" + " request.getContextPath()" + "%>");
//
//        out.println("<h1>" + "账号:" + user + "密码:" + pass + "</h1>");
//        out.println("<input type=\"button\" value=\"点击请进\" onclick='window.open(\"Servlet_21.jsp\")' />");
//        out.println("<form action=\"Servlet_21.jsp\" method=\"get\">");
//        out.println("<input type=\"text\" name=\"user\"></input>");
//        out.println(" <input style=\"color: #fff;\" type=\"submit\" value=\"提交\"></input> ");
//        out.println("</form>");
//        out.println("</body></html>");
//        out.close();
    }
}
