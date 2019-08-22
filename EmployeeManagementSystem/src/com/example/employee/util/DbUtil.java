package com.example.employee.util;

import java.sql.DriverManager;

import java.sql.*;

public class DbUtil {
static Connection con= null;
public static final String INSERT_DEPT = "insert into department values(?,?,?,?,?)";

public static final String SELECT_EMPLOYEE="select * from employeed";
public static final String INSERT_EMPLOYEE ="insert into employeed values(?,?,?,?,?,?)";
public static Connection getConnection()
{
       try
       {
              Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase?useSSL=false","root","root");
       }
       catch(Exception e)
       {
              e.printStackTrace();
       }
       return con;
}
}
