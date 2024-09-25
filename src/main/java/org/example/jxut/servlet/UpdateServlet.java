package org.example.jxut.servlet;

import org.example.jxut.dao.StudentDao;
import org.example.jxut.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends BaseServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        //获取请求参数
        String studentno = request.getParameter("studentno");
        String loginpwd = request.getParameter("loginpwd");
        String studentname = request.getParameter("studentname");
        String sex = request.getParameter("sex");
        String gradeid = request.getParameter("gradeid");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String borndate = request.getParameter("borndate");
        String email = request.getParameter("email");
        Student student = new Student();
        student.setStudent_no(studentno);
        student.setLogin_pwd(loginpwd);
        student.setStudent_name(studentname);
        student.setSex(sex);
        student.setGrade_id(Integer.parseInt(gradeid));
        student.setPhone(phone);
        student.setAddress(address);
        student.setBorn_date(borndate);
        student.setEmail(email);
        StudentDao studentDao = new StudentDao();
        int result = studentDao.updateStudent(student);
        if(result == 1){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
        response.sendRedirect("StudentServlet");
    }
}
