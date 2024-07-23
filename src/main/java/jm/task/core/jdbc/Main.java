package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser(" Саша", " Иванов", (byte) 22);
        userService.saveUser(" Иван", " Александров", (byte) 44);
        userService.saveUser(" Никита", " Иванов", (byte) 32);
        userService.saveUser(" Петр", " Петров", (byte) 24);

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
