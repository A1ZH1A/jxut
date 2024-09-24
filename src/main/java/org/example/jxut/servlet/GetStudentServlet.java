package org.example.jxut.servlet;

import org.example.jxut.dao.StudentDao;
import org.example.jxut.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GetStudentServlet")
public class GetStudentServlet extends BaseServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        //获取请求参数
        String studentno = request.getParameter("studentno");
        //实例化对象
        StudentDao studentDao = new StudentDao();
        Student student = studentDao.getStudent(studentno);
        //将值添加到作用中
        request.setAttribute("student", student);
        request.getRequestDispatcher("userView.jsp").forward(request, response);
    }
}
