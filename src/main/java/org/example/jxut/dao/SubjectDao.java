package org.example.jxut.dao;

import org.example.jxut.model.Subject;
import org.example.jxut.utils.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SubjectDao {
    //获取所有的学生信息
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
}
