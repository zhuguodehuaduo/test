package com.example.xiangmu.util;

import java.sql.*;

public class BaseDao {
    //我们希望BaseDao承担起执行SQL语句的责任
    //而且希望它能够执行一切SQL语句
    private static Connection connection;
    private static PreparedStatement preparedStatement;

    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "liurenyi", "Lry_123456");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        if(connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "liurenyi", "Lry_123456");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }

    public ResultSet executeQuery(String sql, Object... params) {
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for(int i = 0; i < params.length; i++)
                preparedStatement.setObject(i + 1,  params[i]);
            return preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public int executeUpdate(String sql, Object... params) {
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for(int i = 0; i < params.length; i++)
                preparedStatement.setObject(i + 1,  params[i]);
            return preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }
}
