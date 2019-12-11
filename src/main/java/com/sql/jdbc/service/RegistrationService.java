package com.sql.jdbc.service;

import com.sql.jdbc.model.Person;
import com.sql.jdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationService {

    public void register(final Person person) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PERSON (USER_NAME,EMAIL_ID,PASSWORD) VALUES (?,?,?)");
        preparedStatement.setString(1, person.getUserName());
        preparedStatement.setString(2, person.getEmilId());
        preparedStatement.setString(3, person.getPassowrd());
        int updateCount = preparedStatement.executeUpdate();
        if (updateCount > 0) {
            System.out.println("Registration Success :" + person.toString());
        } else {
            System.out.println("Registration Failed :" + person.toString());
        }
    }
}
