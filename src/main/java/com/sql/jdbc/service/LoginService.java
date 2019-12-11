package com.sql.jdbc.service;

import com.sql.jdbc.model.Person;
import com.sql.jdbc.util.DBConnection;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {
    public void login(String emilId, String passowrd) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT USER_NAME,EMAIL_ID,PASSWORD FROM PERSON WHERE EMAIL_ID=? AND PASSWORD=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, emilId);
        preparedStatement.setString(2, passowrd);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Person person = new Person(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
            System.out.println("Login Success :" + person.toString());
        } else {
            System.out.println("Login Failed !!!");
        }
    }
}
