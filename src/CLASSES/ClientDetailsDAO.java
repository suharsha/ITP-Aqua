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
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

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

            String query = "INSERT INTO client(cus_name,address,cus_telephone,cus_email,addedDate,addedBy)  " +
                    "VALUES( '" + d.getCus_name() + "','" + d.getAddress() + "','" + d.getCus_telephone() + "'"
                    + ",'"+ d.getCus_email() +"', '" + d.getAddedDate() + "','" + d.getAddedBy() + "')";

            System.out.println(query);

            int val = stmt.executeUpdate(query);
            if (val == 1) {
                result = true;
            } else {
                result = false;
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Insert query failed at ClientDetailsDAO.addClientDetails");

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
    
    public Vector getClientDetails() {

        Vector<Vector<String>> clientDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT customer_ID,cus_name,address, cus_telephone, cus_email FROM client";

            ResultSet rs = stmt.executeQuery(query);
            clientDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> clientDetails = new Vector<String>();
                clientDetails.add(rs.getString(1));
                clientDetails.add(rs.getString(2));
                clientDetails.add(rs.getString(3));
                clientDetails.add(rs.getString(4));
                clientDetails.add(rs.getString(5));
                clientDetailsVector.add(clientDetails);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed ClientDetailsDAO.getClientDetails");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return clientDetailsVector;
    }
    
    public String[] getSelectedClientDetails(int selectedClientID){

            //arraylist is having behaviours of arrys
        ArrayList<String> clientAttributesList = null;
	Connection dbConn = null;
        String[] AttList = null;
        int clientID = selectedClientID;
        try{
            //connect with db, create the statement and using that execute the query
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            //Select the JobCatNames
            String query = "SELECT * FROM client WHERE customer_ID= "+clientID+"";

            System.out.println(query);
            //by this query we are getting more than one value
            ResultSet rs = stmt.executeQuery(query);

            //one by one from resultset,we have to add values to your arraylist.this is done by while loop
            clientAttributesList = new ArrayList<>();

            System.out.println("Arraylist has been created");
            while (rs.next()) {

                    for (int i=1; i<10;i++)
                    {
                        clientAttributesList.add(rs.getString(i));
                    }
            }
            System.out.println("Data have been added");
            AttList = clientAttributesList.toArray(new String[10]);
            System.out.println("ArrayList converted to an array");

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at ClientDetailsDAO.getSelectedClientDetails");
        }finally{
            dbConnManager.con_close(dbConn);
        }
        return AttList;
    }
    
    public void updateClient(ClientDetails d,int SelectedID) {

	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "UPDATE client SET " +
                    "cus_name='" + d.getCus_name() + "',address='" + d.getAddress() + "',cus_telephone='" + d.getCus_telephone() + "',cus_email='"+ d.getCus_email() +"',"
                    + "modifiedDate='" + d.getModifiedDate() + "',modifiedBy='" + d.getModifiedBy() + "'"
                    + "WHERE customer_ID = "+SelectedID+"";

            pst=dbConn.prepareStatement(query);
            pst.execute();


        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Update query failed at ClientDetailsDAO.updateClient");

        }finally{
            dbConnManager.con_close(dbConn);
        }
    }
    
    public void deleteClient(int SelectedID) {

        boolean result = false;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                String query= "DELETE FROM client where customer_ID = '" + SelectedID + "'";
                pst= dbConn.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Successfully deleted","Record Deleted",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Delete query failed at ClientDetailsDAO.deleteClient");

        }finally{
            dbConnManager.con_close(dbConn);
        }
    }
}
