import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter_2")
public class Filter_2 implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String user = req.getParameter("user");//账号
        String pass = req.getParameter("pass");//密码

        //如果账号为空就转跳，
//        if(user==null||user.equals("")){
//            req.getRequestDispatcher("/Servlet_21.jsp").forward(req,resp); }

        //执行后续操作,如果后面还有过滤器,则进入下一个过滤器;如果后面没有过滤器,则进入请求url相应的Servlet
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        // 获取初始化web.xml参数
        String site = config.getInitParameter("Site");
        System.out.println( site);
    }

}
