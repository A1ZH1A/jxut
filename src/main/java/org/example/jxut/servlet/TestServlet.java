package org.example.jxut.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/TestServlet")
public class TestServlet implements Servlet {
    //初始化 只会被执行一次
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("....init....");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("....getServletConfig...");
        return null;
    }
    //每次访问都会执行
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "";
    }
    //销毁时调用
    @Override
    public void destroy() {

    }
}
