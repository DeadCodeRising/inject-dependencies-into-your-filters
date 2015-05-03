import javax.servlet.*;
import java.io.IOException;

public class AuditFilter implements Filter {

    private final AuditHandler auditHandler;
    private String appName;

    public AuditFilter(AuditHandler auditHandler) {
        this.auditHandler = auditHandler;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        auditHandler.auditRequest(appName, request);
        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        appName = filterConfig.getInitParameter("appName");
    }

    public void destroy() {}
}
