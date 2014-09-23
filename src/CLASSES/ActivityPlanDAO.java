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

/**
 *
 * @author Suharsha Wick
 */
public class ActivityPlanDAO {
            //connect with db,execute the query,disconnect - DAO class
        private DBConnManager dbConnManager = null;
        PreparedStatement pst = null;
        Connection dbConn = null;
        
    public ActivityPlanDAO() {
        dbConnManager = new DBConnManager();
        }
    
    public ArrayList getEventsWithNoAP(){

            //arraylist is having behaviours of arrys
        ArrayList EventNamesList = null;
	Connection dbConn = null;

        try{
            //connect with db, create the statement and using that execute the query
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            //Select the JobCatNames
            String query = "SELECT DISTINCT name FROM Event_Details WHERE activityPlanId = '-1'";

            System.out.println(query);
            //by this query we are getting more than one value
            ResultSet rs = stmt.executeQuery(query);

            //one by one from resultset,we have to add values to your arraylist.this is done by while loop
            EventNamesList = new ArrayList();

            //
            while (rs.next()) {
                String eveName = rs.getString(1);
                System.out.println(eveName);
                EventNamesList.add(eveName);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed at getClientNamesList");
        }finally{
            //how ever you are going to execute that part.that's why conclose happening inside filnally block.
            //Close the db connection
            dbConnManager.con_close(dbConn);
        }
        return EventNamesList;
    }
    
    public boolean addActivityPlan(ActivityPlan d) {

        boolean result = false;
	Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "INSERT INTO Activity_Plan(planID,eventID)  " +
                    "VALUES( '" + d.getPlanID() + "','" + d.getEventID() + "')";

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
}
