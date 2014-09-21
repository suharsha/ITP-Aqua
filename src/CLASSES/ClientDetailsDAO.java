/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Suharsha Wick
 */
public class ClientDetailsDAO {
        
        //connect with db,execute the query,disconnect - DAO class
        private DBConnManager dbConnManager = null;
        PreparedStatement pst = null;
        Connection dbConn = null;
        
    public ClientDetailsDAO() {
        dbConnManager = new DBConnManager();
        }
    
    public boolean addClientDetails(ClientDetails d) {

        boolean result = false;
	Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "INSERT INTO client(cus_name,address,cus_telephone,cus_email)  " +
                    "VALUES( '" + d.getCus_name() + "','" + d.getAddress() + "','" + d.getCus_telephone() + "'"
                    + ",'"+ d.getCus_email() +"')";

            System.out.println(query);

            int val = stmt.executeUpdate(query);
            if (val == 1) {
                result = true;
            } else {
                result = false;
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Insert query failed");

            result = false;
        }finally{
            dbConnManager.con_close(dbConn);
        }
        return result;
    }
    
    public int returnClientID(String cName) {
        int id = 0;
       try{
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "SELECT DISTINCT customer_ID FROM client WHERE cus_name ='"+cName+"'";

            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            //
            while (rs.next()) {
                id = rs.getInt(1);
            }

            } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at ClientDetailsDAO.returnClientID.");
        }finally{
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }   
           return id;
    }
    
    public String returnClientName(int clientID) {
      String clientName = "";
       try{
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "SELECT DISTINCT cus_name FROM client WHERE customer_ID ='"+clientID+"'";

            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                clientName = rs.getString(1);
            }

            } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at EventDetailsDAO.returnClientName.");
        }finally{
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }   
           return clientName;
    }
}
