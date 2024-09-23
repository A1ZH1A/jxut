package org.example.jxut.model;

public class Teacher {
    private String StudentNo;
    private String LoginPwd;
    private String StudentName;
    private String Sex;
    private int GradeId;
    private String Phone;
    private String Address;
    private String BornDate;
    private String Email;

    public Teacher(String studentNo, String loginPwd, String studentName, String sex, int gradeId, String phone, String address, String bornDate, String email) {
        StudentNo = studentNo;
        LoginPwd = loginPwd;
        StudentName = studentName;
        Sex = sex;
        GradeId = gradeId;
        Phone = phone;
        Address = address;
        BornDate = bornDate;
        Email = email;
    }

    public String getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(String studentNo) {
        StudentNo = studentNo;
    }

    public String getLoginPwd() {
        return LoginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        LoginPwd = loginPwd;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getGradeId() {
        return GradeId;
    }

    public void setGradeId(int gradeId) {
        GradeId = gradeId;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBornDate() {
        return BornDate;
    }

    public void setBornDate(String bornDate) {
        BornDate = bornDate;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
