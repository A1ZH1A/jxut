package org.example.jxut.servlet;

import org.example.jxut.dao.StudentDao;
import org.example.jxut.dao.SubjectDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteSubjectServlet")
public class DeleteSubjectServlet extends BaseServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        // 获取请求参数
        String subjectId = request.getParameter("subjectId");
        //实例化
        SubjectDao subjectDao = new SubjectDao();
        //调用删除方法
        int result = subjectDao.deleteSubject(Integer.parseInt(subjectId));
        if(result == 1) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
        //重定向获取学生信息
        response.sendRedirect("SubjectServlet");
    }
}
