package org.example.jxut.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BaseServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求的编码格式
        request.setCharacterEncoding("UTF-8");
        //设置响应类型
        response.setContentType("text/html;charset=utf-8");
    }
}
