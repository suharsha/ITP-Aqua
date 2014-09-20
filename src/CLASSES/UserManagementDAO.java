/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Suharsha Wick
 */
public class UserManagementDAO {
            //connect with db,execute the query,disconnect - DAO class
        private DBConnManager dbConnManager = null;
        PreparedStatement pst = null;
        Connection dbConn = null;
        private static MessageDigest md;
    public UserManagementDAO() {
        dbConnManager = new DBConnManager();
        }
    
    public boolean addUser(UserManagement d) {

        boolean result = false;
	Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();
            
            String query = "INSERT INTO User_Management(emp_ID,emp_Name,emp_Level,emp_UserName,user_password,addedDate)  " +
                    "VALUES( '" + d.getEmpID() + "','" + d.getEmpName() + "','" + d.getEmpLevel() + "','"+ d.getEmp_userName() +"','"+ d.getEmp_password() +"',"
                    + "'"+ d.getAddedDate() +"')";

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
    
    public String returnPassword(String username){
        
        String password = "";
        
        try{
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "SELECT DISTINCT user_password FROM User_Management WHERE " +
                    "emp_UserName='"+username+"'";

            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                password = rs.getString(1);
            }

            } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at UserManagementDAO.returnPassword.");
        }finally{
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }   
        System.out.println("Returned :" + password);
        return password;

    }
   
    public String encryptPassword(String password){
            try {
                md = MessageDigest.getInstance("MD5");
                byte[] passBytes = password.getBytes();
                 md.reset();
                 byte[] digested = md.digest(passBytes);
                 StringBuffer sb = new StringBuffer();
                for(int i=0;i<digested.length;i++){
             sb.append(Integer.toHexString(0xff & digested[i]));
             }
                return sb.toString();
    } catch (NoSuchAlgorithmException ex) {
        Logger.getLogger(UserManagementDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
        return null;
   }
    public Vector getUserDetails() {

        Vector<Vector<String>> userDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  user_ID,emp_Name, emp_Level, emp_UserName,user_password, addedDate,modifiedDate "+
                    "FROM User_Management";

            ResultSet rs = stmt.executeQuery(query);
            userDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> UserDetails = new Vector<String>();
                UserDetails.add(rs.getString(1));
                UserDetails.add(rs.getString(2));
                UserDetails.add(rs.getString(3));
                UserDetails.add(rs.getString(4));
                UserDetails.add(rs.getString(5));
                UserDetails.add(rs.getString(6));
                UserDetails.add(rs.getString(7));
                userDetailsVector.add(UserDetails);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at UserManagementDAO.getUserDetails.");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return userDetailsVector;
    }
    
    public String[] getSelectedUserDetailsStrings(int selectedUserID){

            //arraylist is having behaviours of arrys
        ArrayList<String> userAttributesList = null;
	Connection dbConn = null;
        String[] AttList = null;
        int userID = selectedUserID;
        try{
            //connect with db, create the statement and using that execute the query
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            //Select the JobCatNames
            String query = "SELECT * FROM User_Management WHERE user_ID = "+userID+"";

            System.out.println(query);
            //by this query we are getting more than one value
            ResultSet rs = stmt.executeQuery(query);

            //one by one from resultset,we have to add values to your arraylist.this is done by while loop
            userAttributesList = new ArrayList<>();

            System.out.println("Arraylist has been created");
            while (rs.next()) {

                    for (int i=1; i<=10;i++)
                    {
                        userAttributesList.add(rs.getString(i));
                    }
            }
            System.out.println("Data have been added");
            AttList = userAttributesList.toArray(new String[11]);
            System.out.println("ArrayList converted to an array");

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at UserManagementDAO.getSelectedUserDetailsStrings");
        }finally{
            //how ever you are going to execute that part.that's why conclose happening inside filnally block.
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }
        return AttList;
    }
    
    public void updateUser(UserManagement d,int SelectedID) {

	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "UPDATE User_Management SET " +
                    "emp_Level='" + d.getEmpLevel() + "',user_password='" + d.getEmp_password() + "',modifiedDate='" + d.getLastModified() + "',modifiedBy='"+ d.getModifiedBy() +"'"
                    + "WHERE user_ID = "+SelectedID+"";

            pst=dbConn.prepareStatement(query);
            pst.execute();


        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Update query failed at UserManagementDAO.updateUser");

        }finally{
            dbConnManager.con_close(dbConn);
        }
    }
    
    public void deleteUser(int SelectedID) {

        boolean result = false;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                String query= "DELETE FROM User_Management where user_ID = '" + SelectedID + "'";
                pst= dbConn.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Successfully deleted","Record Deleted",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Delete query failed at UserManagementDAO.deleteUser");

        }finally{
            dbConnManager.con_close(dbConn);
        }
    }
}
