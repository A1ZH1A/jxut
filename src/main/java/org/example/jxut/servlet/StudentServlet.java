package org.example.jxut.servlet;


import org.example.jxut.dao.StudentDao;
import org.example.jxut.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/StudentServlet")
public class StudentServlet extends BaseServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        //实例化
        StudentDao studentDao = new StudentDao();
        //获取所有学生信息
        List<Student> studentList = studentDao.getAllStudent();
        // 将值添加到作用域中 pageContext request session applicationContext
        request.setAttribute("studentList", studentList);
        request.setAttribute("username",studentList.size());
        //转发
        request.getRequestDispatcher("userList.jsp").forward(request, response);


    }
    /**
     * pageContext 作用于当前页面
     * request 作用一次请求（转发）
     * session 作用于当前会话（当前浏览器）
     * applicationContext 作用于当前服务器
     */
}
