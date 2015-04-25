package com.sigma.project.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Tahir on 4/20/2015.
 */
public class DBConnection {

  public static DBConnection dbConnection;
  private Connection con;

  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost:3307/ems";

  //  Database credentials
  static final String USER = "root";
  static final String PASS = "root";

  private DBConnection(){


    try {
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");
      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL, USER, PASS);
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }

  public static DBConnection getInstance(){

    if (dbConnection == null){
      dbConnection = new DBConnection();
    }
    return dbConnection;
  }


  public Connection getConnection(){
    return con;
  }
}
