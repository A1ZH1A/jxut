﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>江西科技学院课件管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>江西科技学院课件管理系统</h1>

    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> Admin</span> , 欢迎你！</p>
        <a href="login.html">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li ><a href="/SubjectServlet">科目管理</a></li>
                <li><a href="studyList.html">课件管理</a></li>
                <li><a href="/StudentServlet">用户管理</a></li>
                <li><a href="password.html">密码修改</a></li>
                <li><a href="login.html">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面 >> 用户修改页面</span>
        </div>
        <div class="providerAdd">
            <form action="/UpdateServlet">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div>
                    <label for="studentno">学号：</label>
                    <input type="text" name="studentno" id="studentno" value="${student.student_no}" readonly/>
                    <span >*</span>
                </div>
                <div>
                    <label for="studentname">真实姓名：</label>
                    <input type="text" name="studentname" id="studentname" value="${student.student_name}"/>
                    <span >*</span>
                </div>

                <div>
                    <label >用户性别：</label>

                    <select name="sex" value="${student.sex}">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                </div>
                <div>
                    <label for="borndate">出生日期：</label>
                    <input type="text" name="borndate" id="borndate" value="${student.born_date}"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="phone">用户电话：</label>
                    <input type="text" name="phone" id="phone" value="${student.phone}"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="address">用户地址：</label>
                    <input type="text" name="address" id="address" value="${student.address}"/>
                </div>
                <div>
                    <label for="loginpwd">用户密码：</label>
                    <input type="text" name="loginpwd" id="loginpwd" value="${student.login_pwd}"/>
                    <span>*密码长度必须大于6位小于20位</span>
                </div>
                <div>
                    <label for="email">邮件：</label>
                    <input type="text" name="email" id="email" value="${student.email}"/>
                </div>
                <div>
                    <label >用户类别：</label>
                    <input type="radio" name="gradeid" ${student.grade_id == 1?"checked":""} value="1"/>一年级
                    <input type="radio" name="gradeid" ${student.grade_id == 2?"checked":""} value="2"/>二年级
                    <input type="radio" name="gradeid" ${student.grade_id == 3?"checked":""} value="3"/>三年级

                </div>
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <!--<a href="userList.html">返回</a>-->
                    <input type="submit" value="修改"/>
                    <input type="button" value="返回" onclick="history.back(-1)"/>
                </div>
            </form>
        </div>

    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>