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
public class ActivityPlan {
    private int planID;
    private int eventID;
    private int itemID;
    private String description;
    private int	employeeID;
    private String startDate;
    private String endDate;
    private String submissionDate;
    private String clientRespondingDate;
    private String productionStartDate;
    private String productionEndDate;
    private String fixingDate;
    private String removingDate;

    public ActivityPlan(int eventID) {
        this.eventID = eventID;
    }

    
    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getClientRespondingDate() {
        return clientRespondingDate;
    }

    public void setClientRespondingDate(String clientRespondingDate) {
        this.clientRespondingDate = clientRespondingDate;
    }

    public String getProductionStartDate() {
        return productionStartDate;
    }

    public void setProductionStartDate(String productionStartDate) {
        this.productionStartDate = productionStartDate;
    }

    public String getProductionEndDate() {
        return productionEndDate;
    }

    public void setProductionEndDate(String productionEndDate) {
        this.productionEndDate = productionEndDate;
    }

    public String getFixingDate() {
        return fixingDate;
    }

    public void setFixingDate(String fixingDate) {
        this.fixingDate = fixingDate;
    }

    public String getRemovingDate() {
        return removingDate;
    }

    public void setRemovingDate(String removingDate) {
        this.removingDate = removingDate;
    }
    
    
}
