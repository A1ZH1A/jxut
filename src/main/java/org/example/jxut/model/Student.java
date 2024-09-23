package org.example.jxut.model;



public class Student {
    private String student_no;
    private String login_pwd;
    private String student_name;
    private String sex;
    private int grade_id;
    private String phone;
    private String address;
    private String born_date;
    private String email;

    public Student(String student_no, String login_pwd, String student_name, String sex, int grade_id, String phone, String address, String born_date, String email) {
        this.student_no = student_no;
        this.login_pwd = login_pwd;
        this.student_name = student_name;
        this.sex = sex;
        this.grade_id = grade_id;
        this.phone = phone;
        this.address = address;
        this.born_date = born_date;
        this.email = email;
    }

    public Student() {

    }

    public String getStudent_no() {
        return student_no;
    }

    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }

    public String getLogin_pwd() {
        return login_pwd;
    }

    public void setLogin_pwd(String login_pwd) {
        this.login_pwd = login_pwd;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBorn_date() {
        return born_date;
    }

    public void setBorn_date(String born_date) {
        this.born_date = born_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
