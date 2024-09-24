package org.example.jxut.servlet;

import org.example.jxut.dao.StudentDao;
import org.example.jxut.dao.SubjectDao;
import org.example.jxut.model.Student;
import org.example.jxut.model.Subject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SubjectServlet")
public class SubjectServlet extends BaseServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        //实例化
        SubjectDao subjectDao = new SubjectDao();
        //获取所有学生信息
        List<Subject> subjectList = subjectDao.getAllSubject();
        // 将值添加到作用域中 pageContext request session applicationContext
        request.setAttribute("subjectList", subjectList);
        //转发
        request.getRequestDispatcher("subjectList.jsp").forward(request, response);
    }
}
