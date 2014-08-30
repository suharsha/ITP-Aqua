/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

/**
 *
 * @author Suharsha Wick
 */
public class EventDetails {
    private int eventID;
    private String name;
    private int clientID;
    private String location;
    private String description;
    private String startDate;
    private int startTimeHours;
    private int startTimeMinutes;
    private String startTimeAM;
    private String endDate;
    private int endTimeHours;
    private int endTimeMinutes;
    private String endTimeAM;
    private int activityPlanID;
    private int equipmentPlanID;
    private int budgetID;
    private String status;

    public EventDetails(String name, int clientID, String location, String description, String startDate, int startTimeHours, int startTimeMinutes, String startTimeAM, String endDate, int endTimeHours, int endTimeMinutes, String endTimeAM, String status) {
        this.name = name;
        this.clientID = clientID;
        this.location = location;
        this.description = description;
        this.startDate = startDate;
        this.startTimeHours = startTimeHours;
        this.startTimeMinutes = startTimeMinutes;
        this.startTimeAM = startTimeAM;
        this.endDate = endDate;
        this.endTimeHours = endTimeHours;
        this.endTimeMinutes = endTimeMinutes;
        this.endTimeAM = endTimeAM;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getStartTimeHours() {
        return startTimeHours;
    }

    public void setStartTimeHours(int startTimeHours) {
        this.startTimeHours = startTimeHours;
    }

    public int getStartTimeMinutes() {
        return startTimeMinutes;
    }

    public void setStartTimeMinutes(int startTimeMinutes) {
        this.startTimeMinutes = startTimeMinutes;
    }

    public String getStartTimeAM() {
        return startTimeAM;
    }

    public void setStartTimeAM(String startTimeAM) {
        this.startTimeAM = startTimeAM;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getEndTimeHours() {
        return endTimeHours;
    }

    public void setEndTimeHours(int endTimeHours) {
        this.endTimeHours = endTimeHours;
    }

    public int getEndTimeMinutes() {
        return endTimeMinutes;
    }

    public void setEndTimeMinutes(int endTimeMinutes) {
        this.endTimeMinutes = endTimeMinutes;
    }

    public String getEndTimeAM() {
        return endTimeAM;
    }

    public void setEndTimeAM(String endtTimeAM) {
        this.endTimeAM = endtTimeAM;
    }

    public int getActivityPlanID() {
        return activityPlanID;
    }

    public void setActivityPlanID(int activityPlanID) {
        this.activityPlanID = activityPlanID;
    }

    public int getEquipmentPlanID() {
        return equipmentPlanID;
    }

    public void setEquipmentPlanID(int equipmentPlanID) {
        this.equipmentPlanID = equipmentPlanID;
    }

    public int getBudgetID() {
        return budgetID;
    }

    public void setBudgetID(int budgetID) {
        this.budgetID = budgetID;
    }
    
    
}
