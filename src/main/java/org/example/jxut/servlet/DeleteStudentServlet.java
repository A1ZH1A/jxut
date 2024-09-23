package org.example.jxut.servlet;

import org.example.jxut.dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends BaseServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        System.out.println(1);
        // 获取请求参数
        String studentno = request.getParameter("studentno");
        //实例化
        StudentDao studentDao = new StudentDao();
        //调用删除方法
        int result = studentDao.deleteStudent(studentno);
        if(result == 1) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
        //重定向获取学生信息
        response.sendRedirect("StudentServlet");

    }
}
