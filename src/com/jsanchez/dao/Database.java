package com.jsanchez.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Connection getConnection() throws Exception {
        try {
            String connectionURL = "jdbc:mysql://128.233.173.24:3306/tuplespace";
            Connection connection = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(connectionURL, "jsanchez", "madmuc");
            return connection;
        } catch (Exception e) {
            throw e;
        }
    }
}
