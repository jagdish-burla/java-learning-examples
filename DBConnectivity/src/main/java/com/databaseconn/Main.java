package com.databaseconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try{
            String myDriver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
            String myUrl = "jdbc:sqlserver://localhost:1433";
            Connection conn;
            Statement stmt;
            conn = DriverManager.getConnection(myUrl, "sa","Test@1234");
            stmt = conn.createStatement();
            String sqlstmt = "select optname from [master].[dbo].[MSreplication_options]";
            stmt.executeQuery(sqlstmt);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}