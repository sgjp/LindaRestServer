package com.jsanchez.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Connection getConnection() throws Exception {
        try {
            String connectionURL = "jdbc:mysql://localhost:3306/tuplespace?verifyServerCertificate=false&useSSL=false";
            Connection connection = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(connectionURL, "jsanchez", "madmuc");
            return connection;
        } catch (Exception e) {
            throw e;
        }
    }
}
