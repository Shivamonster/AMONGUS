package com.tracker;
import java.sql.*;
public class DBConnection {
  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/tracker", "root", "");
  }
}