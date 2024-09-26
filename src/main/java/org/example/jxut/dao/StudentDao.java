package org.example.jxut.dao;

import org.example.jxut.model.Student;
import org.example.jxut.utils.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    //获取所有的学生信息
    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<Student>();
        //获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //获取连接对象
            conn = DBHelper.getConn();
            //编写sql
            String sql = "select * from student";
            //获取sql的预处理对象
            ps = conn.prepareStatement(sql);
            //执行sql
            rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    Student student = new Student();
                    student.setStudent_no(rs.getString("student_no"));
                    student.setStudent_name(rs.getString("student_name"));
                    student.setAddress(rs.getString("address"));
                    student.setEmail(rs.getString("email"));
                    student.setPhone(rs.getString("phone"));
                    student.setBorn_date(rs.getString("born_date"));
                    student.setGrade_id(rs.getInt("Grade_id"));
                    student.setLogin_pwd(rs.getString("login_pwd"));
                    student.setSex(rs.getString("Sex"));
                    studentList.add(student);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(conn, ps, rs);
        }
        return studentList;
    }

    //删除学生信息
    public int deleteStudent(String student_no) {
        //获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //获取连接对象
            conn = DBHelper.getConn();
            //编写sql
            String sql = "delete from student where student_no = ?";
            //获取sql的预处理对象
            ps = conn.prepareStatement(sql);
            //添加参数
            ps.setString(1, student_no);
            //执行sql语句
            return ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(conn,ps,null);
        }
        return 0;
    }

    //添加学生信息
    public int addStudent(Student student) {
        //获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //获取连接对象
            conn = DBHelper.getConn();
            //编写sql
            String sql = "insert into student values(?,?,?,?,?,?,?,?,?)";
            //获取sql的预处理对象
            ps = conn.prepareStatement(sql);
            //添加参数
            ps.setString(1,student.getStudent_no());
            ps.setString(2,student.getLogin_pwd());
            ps.setString(3,student.getStudent_name());
            ps.setString(4,student.getSex());
            ps.setInt(5,student.getGrade_id());
            ps.setString(6,student.getPhone());
            ps.setString(7,student.getAddress());
            ps.setString(8,student.getBorn_date());
            ps.setString(9,student.getEmail());
            //执行sql语句
            return ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(conn,ps,null);
        }
        return 0;
    }

    //修改学生信息
    public int updateStudent(Student student) {
        //获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //获取连接对象
            conn = DBHelper.getConn();
            //编写sql
            String sql = "update student set login_pwd=?,student_name=?,sex=?,grade_id=?,phone=?,address=?,born_date=?,email=?  where student_no=?";
            //获取sql的预处理对象
            ps = conn.prepareStatement(sql);
            //添加参数
            ps.setString(1,student.getLogin_pwd());
            ps.setString(2,student.getStudent_name());
            ps.setString(3,student.getSex());
            ps.setInt(4,student.getGrade_id());
            ps.setString(5,student.getPhone());
            ps.setString(6,student.getAddress());
            ps.setString(7,student.getBorn_date());
            ps.setString(8,student.getEmail());
            ps.setString(9,student.getStudent_no());
            //执行sql语句
            return ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(conn,ps,null);
        }
        return 0;
    }

    //查询学生信息
    public Student getStudent(String student_no) {
        //获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //获取连接对象
            conn = DBHelper.getConn();
            //编写sql
            String sql = "select * from student where student_no = ?";
            //获取sql的预处理对象
            ps = conn.prepareStatement(sql);
            //添加参数
            ps.setString(1, student_no);
            //执行sql
            rs = ps.executeQuery();
            if(rs != null){
                if(rs.next()){
                    Student student = new Student();
                    student.setStudent_no(rs.getString("student_no"));
                    student.setStudent_name(rs.getString("student_name"));
                    student.setAddress(rs.getString("address"));
                    student.setEmail(rs.getString("email"));
                    student.setPhone(rs.getString("phone"));
                    student.setBorn_date(rs.getString("born_date"));
                    student.setGrade_id(rs.getInt("Grade_id"));
                    student.setLogin_pwd(rs.getString("login_pwd"));
                    student.setSex(rs.getString("Sex"));
                    return student;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(conn, ps, rs);
        }
        return null;
    }

    //统计记录数
    public int totalStudent(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            //获取连接对象
            conn = DBHelper.getConn();
            //编写sql
            String sql = "select count(*) from student";
            //获取sql的预处理对象
            ps = conn.prepareStatement(sql);
            //执行sql
            rs = ps.executeQuery();
            if(rs != null){
                if(rs.next()){
                    return rs.getInt(1);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(conn,ps,rs);
        }
        return 0;
    }

    public List<Student> getAllStudentByPage(int currentPage, int pageCount) {
        List<Student> studentList = new ArrayList<Student>();
        //获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //获取连接对象
            conn = DBHelper.getConn();
            //编写sql
            String sql = "select * from student limit ?,?";
            //获取sql的预处理对象
            ps = conn.prepareStatement(sql);
            ps.setInt(1,(currentPage-1)*pageCount);
            ps.setInt(2,pageCount);
            //执行sql
            rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    Student student = new Student();
                    student.setStudent_no(rs.getString("student_no"));
                    student.setStudent_name(rs.getString("student_name"));
                    student.setAddress(rs.getString("address"));
                    student.setEmail(rs.getString("email"));
                    student.setPhone(rs.getString("phone"));
                    student.setBorn_date(rs.getString("born_date"));
                    student.setGrade_id(rs.getInt("Grade_id"));
                    student.setLogin_pwd(rs.getString("login_pwd"));
                    student.setSex(rs.getString("Sex"));
                    studentList.add(student);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(conn, ps, rs);
        }
        return studentList;
    }
}
