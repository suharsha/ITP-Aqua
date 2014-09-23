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
public class SupplierDetailsDAO {
    private DBConnManager dbConnManager = null;
    private PreparedStatement pst;
    
    public SupplierDetailsDAO() {
        dbConnManager = new DBConnManager();
    }
    public boolean addSupplier(SupplierDetails d) {

        
        boolean result = false;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "INSERT INTO supplier(name,rate,address,item,email,telephone,addedDate,addedBy)  " +
                    "VALUES( '" + d.getName() + "','" + d.getRate() + "','" + d.getAddress() + "','" + d.getItem() + "',"
                    + "'" + d.getEmail() + "','" + d.getTelephone() + "','" +d.getAddedDate() + "','" +d.getAddedBy()+ "')";

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
    
        public void deleteSupplier(int SelectedID) {

        boolean result = false;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                String query= "DELETE FROM supplier where supplier_ID = '" + SelectedID + "'";
                pst= dbConn.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Successfully deleted","Record Deleted",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Delete query failed at SupplierDetailsDAO.deleteSupplier");

        }finally{
            dbConnManager.con_close(dbConn);
        }
    }
        
        public void updateSupplier(SupplierDetails d,int SelectedID) {

	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "UPDATE supplier SET " +
                    "name='" + d.getName() + "',rate='" + d.getRate() + "',address='" + d.getAddress() + "',item='"+ d.getItem() +"',"
                    + "email='"+ d.getEmail() +"',telephone='"+ d.getTelephone() +"',modifiedDate='" + d.getModifiedDate() + "',modifiedBy='" + d.getModifiedBy() + "'"
                    + "WHERE supplier_ID = "+SelectedID+"";

            pst=dbConn.prepareStatement(query);
            pst.execute();


        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Update query failed at ClientDetailsDAO.updateClient");

        }finally{
            dbConnManager.con_close(dbConn);
        }
    }
    
    public Vector getSupplierDetails() {

        Vector<Vector<String>> SupplierDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT *"+
                    "FROM supplier ";

            ResultSet rs = stmt.executeQuery(query);
            SupplierDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> supplierDetails = new Vector<String>();
                supplierDetails.add(rs.getString(1)); //EmpID
                supplierDetails.add(rs.getString(2)); //title
                supplierDetails.add(rs.getString(5)); //job_Title
                supplierDetails.add(rs.getString(4)); //gender
                supplierDetails.add(rs.getString(3)); //f_Name
                supplierDetails.add(rs.getString(6)); //m_Name
                supplierDetails.add(rs.getString(7)); //l_Name
                SupplierDetailsVector.add(supplierDetails);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return SupplierDetailsVector;
    }
    public String[] getSelectedSupplierDetailsStrings(int selectedSupplierID){

            //arraylist is having behaviours of arrys
        ArrayList<String> eventAttributesList = null;
	Connection dbConn = null;
        String[] AttList = null;
        int supplierID = selectedSupplierID;
        try{
            //connect with db, create the statement and using that execute the query
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            //Select the JobCatNames
            String query = "SELECT * FROM supplier WHERE supplier_ID = "+supplierID+"";

            System.out.println(query);
            //by this query we are getting more than one value
            ResultSet rs = stmt.executeQuery(query);

            //one by one from resultset,we have to add values to your arraylist.this is done by while loop
            eventAttributesList = new ArrayList<>();

            System.out.println("Arraylist has been created");
            while (rs.next()) {

                    for (int i=0; i<=10;i++)
                    {
                        eventAttributesList.add(rs.getString(i+1));
                    }
            }
            System.out.println("Data have been added");
            AttList = eventAttributesList.toArray(new String[11]);
            System.out.println("ArrayList converted to an array");

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at SupplierDetailsDAO.getSelectedSupplierDetailsStrings");
        }finally{
            //how ever you are going to execute that part.that's why conclose happening inside filnally block.
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }
        return AttList;
    }
}
