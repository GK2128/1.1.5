package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("German", "Kozlov", (byte) 26);
        userService.saveUser("Alina", "Yavtukhovkaya", (byte) 27);
        userService.saveUser("Stas", "Uskov", (byte) 27);
        userService.saveUser("Yuri", "Cheban", (byte) 27);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
