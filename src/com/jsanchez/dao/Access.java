package com.jsanchez.dao;

import com.jsanchez.entities.Tuple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Access {
    public Tuple getAndDeleteTuple(String key) throws Exception {
        Connection con = Database.getConnection();
        Tuple tuple  = new Tuple();
        tuple.setKey(key);
        tuple.setData("0");
        String sqlSelectStatement = "SELECT * FROM tuple WHERE `key`=? LIMIT 1 ";
        PreparedStatement stmt = con.prepareStatement(sqlSelectStatement);
        stmt.setString(1,key);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            tuple.setKey(rs.getString("key"));
            tuple.setData(rs.getString("value"));
            String sqlDeleteStatement = "DELETE FROM tuple WHERE `idtuple`=?";
            stmt = con.prepareStatement(sqlDeleteStatement);
            stmt.setInt(1,rs.getInt("idtuple"));
            stmt.executeUpdate();
        }
        con.close();
        return tuple;
    }

    public int addTuple(Tuple tuple) throws Exception {
        Connection con = Database.getConnection();
        String sqlInsertStatement = "INSERT INTO tuple (`key`, `value`)  VALUES (?,?)";
        PreparedStatement stmt = con.prepareStatement(sqlInsertStatement);
        stmt.setString(1,tuple.getKey());
        stmt.setString(2,tuple.getData());
        int result = stmt.executeUpdate();
        con.close();
        return result;

    }

}

