package com.sql.jdbc;

import com.sql.jdbc.model.Person;
import com.sql.jdbc.service.LoginService;
import com.sql.jdbc.service.RegistrationService;

import java.sql.SQLException;

public class RunMain {
    public static void main(String[] args) throws SQLException {
        Person person = new Person("DHARANI", "dharani@gmail.com", "dharu");

        addNewUser(person);

        login(person.getEmilId(), person.getPassowrd());
    }

    private static void login(final String emilId, final String passowrd) throws SQLException {
        LoginService loginService = new LoginService();
        loginService.login(emilId, passowrd);
    }

    private static void addNewUser(final Person person) throws SQLException {
        RegistrationService registrationService = new RegistrationService();
        registrationService.register(person);
    }
}
