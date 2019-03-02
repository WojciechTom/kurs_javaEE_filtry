package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IpRequestFilter implements Filter {

    private String ipPattern;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ipPattern = filterConfig.getInitParameter("ipPattern");
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String requestIp = servletRequest.getRemoteAddr();
        System.out.println("Ip filter " + requestIp);

        if(requestIp.matches(ipPattern)){
            System.out.println("IP ok");
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            System.out.println("IP is not ok ");
            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
            httpServletResponse.sendError(403);
        }
    }



    @Override
    public void destroy() {

    }
}
