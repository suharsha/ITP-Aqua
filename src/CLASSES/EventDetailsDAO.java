/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

import GUI.Home;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Suharsha Wick
 */
public class EventDetailsDAO {
    
        //connect with db,execute the query,disconnect - DAO class
        private DBConnManager dbConnManager = null;
        PreparedStatement pst = null;
        Connection dbConn = null;
        
    public EventDetailsDAO() {
        dbConnManager = new DBConnManager();
        }
    
    public boolean addEventDetails(EventDetails d) {

        boolean result = false;
	Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "INSERT INTO Event_Details(name,client,location,description,StartDate,StartTimeHours,StartTimeMinutes,StartTimeAm,EndDate,EndTimeHours,EndTimeMinutes,EndTimeAm,status)  " +
                    "VALUES( '" + d.getName() + "','" + d.getClientID() + "','" + d.getLocation() + "','"+ d.getDescription() +"','"+ d.getStartDate() +"','"+ d.getStartTimeHours() +"','"+ d.getStartTimeMinutes() +"'"
                    + ",'"+ d.getStartTimeAM() +"','"+ d.getEndDate() +"','"+ d.getEndTimeHours() +"','"+ d.getEndTimeMinutes() +"','"+ d.getEndTimeAM() +"','"+ d.getStatus() +"')";

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
    
    
    
    public int returnEventID(String eventName) {
        int id = 0;
       try{
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "SELECT DISTINCT eventID FROM Event_Details WHERE name ='"+eventName+"'";

            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            //
            while (rs.next()) {
                id = rs.getInt(1);
            }

            } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at EventDetailsDAO.returnEventID.");
        }finally{
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }   
           return id;
    }
    
    public int confirmInsertion(EventDetails d) {
       try{
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "SELECT DISTINCT eventID FROM Event_Details WHERE " +
                    "name='" + d.getName() + "' AND client=" + d.getClientID() + " AND location='" + d.getLocation() + "'AND description='"+ d.getDescription() +"' AND StartDate='"+ d.getStartDate() +"' AND StartTimeHours="+ d.getStartTimeHours() +" AND StartTimeMinutes="+ d.getStartTimeMinutes() +""
                    + " AND StartTimeAm='"+ d.getStartTimeAM() +"' AND EndDate='"+ d.getEndDate() +"' AND EndTimeHours="+ d.getEndTimeHours() +" AND EndTimeMinutes="+ d.getEndTimeMinutes() +" AND EndTimeAm='"+ d.getEndTimeAM() +"' AND status='"+ d.getStatus() +"'";

            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                return 1;
            }

            } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at EventDetailsDAO.confirmInsertion.");
        }finally{
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }   
       return 0;
    }
    
  
    public Vector getEventDetails() {

        Vector<Vector<String>> eventDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  e.eventID, e.name, c.cus_name, e.location,e.Description, e.StartDate, CONCAT_WS(' ',CONCAT_WS(':',e.StartTimeHours,e.StartTimeMinutes),e.StartTimeAm),"
                    + " e.EndDate,CONCAT_WS(' ',CONCAT_WS(':',e.EndTimeHours,e.EndTimeMinutes),e.EndTimeAm),status "+
                    "FROM Event_Details e, client c WHERE e.client = c.customer_ID";

            ResultSet rs = stmt.executeQuery(query);
            eventDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> eventDetails = new Vector<String>();
                eventDetails.add(rs.getString(1));
                eventDetails.add(rs.getString(2));
                eventDetails.add(rs.getString(3));
                eventDetails.add(rs.getString(4));
                eventDetails.add(rs.getString(6));
                eventDetails.add(rs.getString(7));
                eventDetails.add(rs.getString(8));
                eventDetails.add(rs.getString(9));
                eventDetails.add(rs.getString(10));
                eventDetailsVector.add(eventDetails);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return eventDetailsVector;
    }
   
public EventDetails getEventDetails(int eventId) {

    EventDetails eventDetails = null;
    Connection dbConn = null;

        try {

            //Connect to th DB
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  eventID,name,client,location, description, StartDate, StartTimeHours, StartTimeMinutes, StartTimeAm, EndDate, EndTimeHours, EndTimeMinutes, EndTimeAm, " +
                    "status FROM Event_Details " +
                    "WHERE eventID = "+eventId+"";

            System.out.println(query);

           ResultSet rs = stmt.executeQuery(query);
           eventDetails = new EventDetails();

            if (rs.next()) {
                eventDetails.setEventID(Integer.parseInt(rs.getString(1))); //eventID
               // jobDetails.setJobName(rs.getString(2)); //jobName
               // jobDetails.setPostedDate(rs.getString(3)); //postedDate
               // jobDetails.setExpirationDate(rs.getString(4)); //expirationDate
               // jobDetails.setJobCategoryName(rs.getString(5)); //jobCatName
                //jobDetails.setSubCategoryName(rs.getString(6)); //subCategoryName
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed for JobID");
        } finally {
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }
        return eventDetails;

       }
public String[] getSelectedEventDetailsStrings(int selectedEventID){

            //arraylist is having behaviours of arrys
        ArrayList<String> eventAttributesList = null;
	Connection dbConn = null;
        String[] AttList = null;
        int eventID = selectedEventID;
        try{
            //connect with db, create the statement and using that execute the query
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            //Select the JobCatNames
            String query = "SELECT * FROM Event_Details WHERE eventID = "+eventID+"";

            System.out.println(query);
            //by this query we are getting more than one value
            ResultSet rs = stmt.executeQuery(query);

            //one by one from resultset,we have to add values to your arraylist.this is done by while loop
            eventAttributesList = new ArrayList<>();

            System.out.println("Arraylist has been created");
            while (rs.next()) {

                    for (int i=0; i<=13;i++)
                    {
                        eventAttributesList.add(rs.getString(i+1));
                    }
            }
            System.out.println("Data have been added");
            AttList = eventAttributesList.toArray(new String[14]);
            System.out.println("ArrayList converted to an array");

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at JobCatNames");
        }finally{
            //how ever you are going to execute that part.that's why conclose happening inside filnally block.
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }
        return AttList;
    }

    public void updateEvent(EventDetails d,int SelectedID) {

	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "UPDATE Event_Details SET " +
                    "name='" + d.getName() + "',client='" + d.getClientID() + "',location='" + d.getLocation() + "',description='"+ d.getDescription() +"',StartDate='"+ d.getStartDate() +"',StartTimeHours='"+ d.getStartTimeHours() +"',StartTimeMinutes='"+ d.getStartTimeMinutes() +"'"
                    + ",StartTimeAm='"+ d.getStartTimeAM() +"',EndDate='"+ d.getEndDate() +"',EndTimeHours='"+ d.getEndTimeHours() +"',EndTimeMinutes='"+ d.getEndTimeMinutes() +"',EndTimeAm='"+ d.getEndTimeAM() +"',status='"+ d.getStatus() +"'"
                    + "WHERE eventID = "+SelectedID+"";

            pst=dbConn.prepareStatement(query);
            pst.execute();


        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Update query failed at EventDetailsDAO.updateEvent");

        }finally{
            dbConnManager.con_close(dbConn);
        }
    }
    
    public void deleteEvent(int SelectedID) {

        boolean result = false;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                String query= "DELETE FROM Event_Details where eventID = '" + SelectedID + "'";
                pst= dbConn.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Successfully deleted","Record Deleted",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Delete query failed");

        }finally{
            dbConnManager.con_close(dbConn);
        }
    }
    
    public ArrayList getClientNamesList(){

            //arraylist is having behaviours of arrys
        ArrayList ClientNamesList = null;
	Connection dbConn = null;

        try{
            //connect with db, create the statement and using that execute the query
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            //Select the JobCatNames
            String query = "SELECT DISTINCT cus_name FROM client";

            System.out.println(query);
            //by this query we are getting more than one value
            ResultSet rs = stmt.executeQuery(query);

            //one by one from resultset,we have to add values to your arraylist.this is done by while loop
            ClientNamesList = new ArrayList();

            //
            while (rs.next()) {
                String eveName = rs.getString(1);
                System.out.println(eveName);
                ClientNamesList.add(eveName);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at getClientNamesList");
        }finally{
            //how ever you are going to execute that part.that's why conclose happening inside filnally block.
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }
        return ClientNamesList;
    }
    
    public ArrayList getEventNames(){

            //arraylist is having behaviours of arrys
        ArrayList eventsList = null;
	Connection dbConn = null;

        try{
            //connect with db, create the statement and using that execute the query
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            //Select the JobCatNames
            String query = "SELECT DISTINCT name FROM Event_Details";

            System.out.println(query);
            //by this query we are getting more than one value
            ResultSet rs = stmt.executeQuery(query);

            //one by one from resultset,we have to add values to your arraylist.this is done by while loop
            eventsList = new ArrayList();

            //
            while (rs.next()) {
                String eventName = rs.getString(1);
                System.out.println(eventName);
                eventsList.add(eventName);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at EventDetailsDAO.getEventNames");
        }finally{
            //how ever you are going to execute that part.that's why conclose happening inside filnally block.
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }
        return eventsList;
    }
    
   
    
    public Vector searchEventDetailsEventName(String keyword) {

        Vector<Vector<String>> eventDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  e.eventID, e.name, c.cus_name, e.location,e.Description, e.StartDate, CONCAT_WS(' ',CONCAT_WS(':',e.StartTimeHours,e.StartTimeMinutes),e.StartTimeAm),"
                    + " e.EndDate,CONCAT_WS(' ',CONCAT_WS(':',e.EndTimeHours,e.EndTimeMinutes),e.EndTimeAm),status "+
                    "FROM Event_Details e, client c WHERE e.client = c.customer_ID AND e.name LIKE '"+keyword+"%'";

            ResultSet rs = stmt.executeQuery(query);
            eventDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> eventDetails = new Vector<String>();
                eventDetails.add(rs.getString(1));
                eventDetails.add(rs.getString(2));
                eventDetails.add(rs.getString(3));
                eventDetails.add(rs.getString(4));
                eventDetails.add(rs.getString(6));
                eventDetails.add(rs.getString(7));
                eventDetails.add(rs.getString(8));
                eventDetails.add(rs.getString(9));
                eventDetails.add(rs.getString(10));
                eventDetailsVector.add(eventDetails);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return eventDetailsVector;
    }
    
    public Vector searchEventDetailsClientName(String keyword) {

        Vector<Vector<String>> eventDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  e.eventID, e.name, c.cus_name, e.location,e.Description, e.StartDate, CONCAT_WS(' ',CONCAT_WS(':',e.StartTimeHours,e.StartTimeMinutes),e.StartTimeAm),"
                    + " e.EndDate,CONCAT_WS(' ',CONCAT_WS(':',e.EndTimeHours,e.EndTimeMinutes),e.EndTimeAm),status "+
                    "FROM Event_Details e, client c WHERE e.client = c.customer_ID AND c.cus_name LIKE '"+keyword+"%'";

            ResultSet rs = stmt.executeQuery(query);
            eventDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> eventDetails = new Vector<String>();
                eventDetails.add(rs.getString(1));
                eventDetails.add(rs.getString(2));
                eventDetails.add(rs.getString(3));
                eventDetails.add(rs.getString(4));
                eventDetails.add(rs.getString(6));
                eventDetails.add(rs.getString(7));
                eventDetails.add(rs.getString(8));
                eventDetails.add(rs.getString(9));
                eventDetails.add(rs.getString(10));
                eventDetailsVector.add(eventDetails);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return eventDetailsVector;
    }
    
    public Vector searchEventDetailsLocation(String keyword) {

        Vector<Vector<String>> eventDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  e.eventID, e.name, c.cus_name, e.location,e.Description, e.StartDate, CONCAT_WS(' ',CONCAT_WS(':',e.StartTimeHours,e.StartTimeMinutes),e.StartTimeAm),"
                    + " e.EndDate,CONCAT_WS(' ',CONCAT_WS(':',e.EndTimeHours,e.EndTimeMinutes),e.EndTimeAm),status "+
                    "FROM Event_Details e, client c WHERE e.client = c.customer_ID AND e.location LIKE '"+keyword+"%'";

            ResultSet rs = stmt.executeQuery(query);
            eventDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> eventDetails = new Vector<String>();
                eventDetails.add(rs.getString(1));
                eventDetails.add(rs.getString(2));
                eventDetails.add(rs.getString(3));
                eventDetails.add(rs.getString(4));
                eventDetails.add(rs.getString(6));
                eventDetails.add(rs.getString(7));
                eventDetails.add(rs.getString(8));
                eventDetails.add(rs.getString(9));
                eventDetails.add(rs.getString(10));
                eventDetailsVector.add(eventDetails);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return eventDetailsVector;
    }
}
