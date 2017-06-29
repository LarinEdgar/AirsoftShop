package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Shleck on 6/23/2017.
 */
public class Dbconnect {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/airsoft_db";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "satana";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
    }

}
