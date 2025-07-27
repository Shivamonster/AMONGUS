package com.tracker;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class UpdateLocationServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    String lat = req.getParameter("lat");
    String lng = req.getParameter("lng");
    // JDBC insert logic
  }
}