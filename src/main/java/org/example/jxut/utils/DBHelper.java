package org.example.jxut.utils;

import java.sql.*;

public class DBHelper {
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://127.0.0.1:3306/myschool";
    private final static String USERNAME = "root";
    private final static String PWD = "123456";

    static {
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    //获取连接对象
    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PWD);
    }

    //释放资源
    public static void closeAll(Connection conn, Statement st, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
