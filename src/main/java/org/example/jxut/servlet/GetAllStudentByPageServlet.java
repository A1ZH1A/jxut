package org.example.jxut.servlet;

import org.example.jxut.dao.StudentDao;
import org.example.jxut.model.Student;
import org.example.jxut.utils.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/GetAllStudentByPageServlet")
public class GetAllStudentByPageServlet extends BaseServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        //获取请求参数
        String pageNo = request.getParameter("pageNo");
        int currentPage = 1;
        if(pageNo != null && pageNo.length() > 0){
            currentPage = Integer.parseInt(pageNo);
        }
        int pageCount = 10;
        StudentDao studentDao = new StudentDao();
        List<Student> studentList = studentDao.getAllStudentByPage(currentPage, pageCount);
        Page page = new Page(currentPage, pageCount);
        page.setResult(studentList,studentDao.totalStudent());
        request.setAttribute("page", page);
        request.getRequestDispatcher("userList.jsp").forward(request, response);
    }
}
