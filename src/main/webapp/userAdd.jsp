<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <span>用户管理页面 >> 用户添加页面</span>
        </div>
        <div class="providerAdd">
            <form action="/AddStudentServlet">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="userId">用户账号：</label>
                    <input type="text" name="studentno" id="userId"/>
                    <span>*请输入用户账号，且不能重复</span>
                </div>
                <div>
                    <label for="userName">真实姓名：</label>
                    <input type="text" name="studentname" id="userName"/>
                    <span >*请输入用真实姓名</span>
                </div>
                <div>
                    <label for="userpassword">用户密码：</label>
                    <input type="text" name="loginpwd" id="userpassword"/>
                    <span>*密码长度必须大于6位小于20位</span>
                </div>
                <div>
                    <label >用户性别：</label>

                    <select name="sex">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                    <span></span>
                </div>
                <div>
                    <label for="date">出生日期：</label>
                    <input type="date" name="borndate" id="date"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="userphone">用户电话：</label>
                    <input type="text" name="phone" id="userphone"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="userAddress">用户地址：</label>
                    <input type="text" name="address" id="userAddress"/>
                </div>
                <div>
                    <label for="email">邮件：</label>
                    <input type="text" name="email" id="email"/>
                </div>
                <div>
                    <label >用户类别：</label>
                    <input type="radio" name="gradeid" value="1"/>一年级
                    <input type="radio" name="gradeid" value="2"/>二年级
                    <input type="radio" name="gradeid" value="3"/>三年级

                </div>
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <!--<a href="userList.html">返回</a>-->
                    <input type="submit" value="保存"/>
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