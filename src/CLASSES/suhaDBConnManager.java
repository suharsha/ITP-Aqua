/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Suharsha Wick
 */
public class suhaDBConnManager {
    String sourceURL="";

    public suhaDBConnManager() {
    try {
    // Load JDBC driver
    Class.forName("com.mysql.jdbc.Driver");
    // Connection URL.
    sourceURL = new String("jdbc:mysql://localhost/AquaCompany");
    } catch (ClassNotFoundException classNotFoundException) {
    System.out.println(classNotFoundException + "-----------Unable to load database driver classes");
    }
    }

    public Connection connect(){
    Connection dbConn = null;
    //driver manager use to connect with db
    try {
    dbConn = DriverManager.getConnection(sourceURL, "root", "0771876520");
    } catch (SQLException sQLException) {
    System.out.println(sQLException + "-----------DB connection failure");
    }
    return dbConn;
    }

    public void con_close(Connection dbConn) {
    try {
    dbConn.close();
    } catch (SQLException sQLException) {
    System.out.println(sQLException + "-----------DB connection closing failure");
    }
}
}
