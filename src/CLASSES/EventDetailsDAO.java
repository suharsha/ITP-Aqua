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
import java.util.Vector;

/**
 *
 * @author Suharsha Wick
 */
public class EventDetailsDAO {
            //connect with db,execute the query,disconnect - DAO class
        private suhaDBConnManager dbConnManager = null;
        PreparedStatement pst = null;
        Connection dbConn = null;
        
    public EventDetailsDAO() {
        dbConnManager = new suhaDBConnManager();
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
    
    public int returnClientID(String cName) {
       try{
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "SELECT DISTINCT customer_ID FROM client WHERE eventID ="+cName+"";

            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            //
            while (rs.next()) {
                int id = rs.getInt(1);
                return id;
            }

            } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at EventDetailsDAO.returnClientID.");
        }finally{
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }   
           return -1;
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

            String query = "SELECT  eventID, name, client, location,Description, StartDate, CONCAT_WS(' ',CONCAT_WS(':',StartTimeHours,StartTimeMinutes),StartTimeAm),"
                    + " EndDate,CONCAT_WS(' ',CONCAT_WS(':',EndTimeHours,EndTimeMinutes),EndTimeAm),status "+
                    "FROM Event_Details";

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
