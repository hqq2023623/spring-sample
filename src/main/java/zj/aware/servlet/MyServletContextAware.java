package zj.aware.servlet;

import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

@Component
public class MyServletContextAware implements ServletContextAware {
    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println("|ServletContextAware|param : ServletContext|component|");
    }
}
