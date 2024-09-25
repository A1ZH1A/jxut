package org.example.jxut.dao;

import org.example.jxut.model.Student;
import org.example.jxut.model.Subject;
import org.example.jxut.utils.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SubjectDao {
    //获取所有的科目信息
    public List<Subject> getAllSubject() {
        List<Subject> subjectList = new ArrayList<Subject>();
        //获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //获取连接对象
            conn = DBHelper.getConn();
            //编写sql
            String sql = "select * from subject";
            //获取sql的预处理对象
            ps = conn.prepareStatement(sql);
            //执行sql
            rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    Subject subject = new Subject();
                    subject.setSubjectId(rs.getInt("subjectid"));
                    subject.setSubjectName(rs.getString("subjectname"));
                    subject.setClassHour(rs.getInt("classhour"));
                    subject.setGradeId(rs.getInt("gradeid"));
                    subjectList.add(subject);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(conn, ps, rs);
        }
        return subjectList;
    }
    //删除科目信息
    public int deleteSubject(int subjectId) {
        //获取连接对象
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //获取连接对象
            conn = DBHelper.getConn();
            //编写sql
            String sql = "delete from subject where SubjectId = ?";
            //获取sql的预处理对象
            ps = conn.prepareStatement(sql);
            //添加参数
            ps.setInt(1, subjectId);
            //执行sql语句
            return ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(conn,ps,null);
        }
        return 0;
    }
    //添加科目信息
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
}
