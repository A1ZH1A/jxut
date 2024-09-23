package org.example.jxut.test;

import org.example.jxut.dao.StudentDao;
import org.example.jxut.model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
//        Student student = new Student("s1","abb","a","a",1,"a","s","20220906","s");
//        System.out.println(studentDao.updateStudent(student)>0?true:false);
        List<Student> studentList = studentDao.getAllStudent();
        for (Student student : studentList) {
            System.out.println(student.getStudent_name());
        }
    }
    private void getAllStudent(){
        //1.加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        //2.建立连接
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschool","root","123456");
        //3.编写sql
            String sql = "select * from student";
        //4.获取sql的预处理对象
            PreparedStatement ps = conn.prepareStatement(sql);
        //5.执行sql语句
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    System.out.println(rs.getString(3));
                }
            }
        //6.释放资源
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
