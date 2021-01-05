package com.example.xiangmu;

import com.example.xiangmu.util.BaseDao;

import java.sql.*;
import java.util.Scanner;

/**
 * @Author: liurenyi
 * @Date: 1/4/21 3:22 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        BaseDao dao=new BaseDao();
        try {
            Connection connection = BaseDao.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call countChild(?,?)}");
            callableStatement.setInt(1,11);
            callableStatement.setInt(2,11);
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
