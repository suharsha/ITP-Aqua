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
public class UserManagement {
    
    private int useID;
    private int empID;
    private String empName;
    private String empLevel;
    private String emp_userName;
    private String emp_password;
    private String addedDate;
    private String addedBy;
    private String lastModified;
    private String modifiedBy;

    public UserManagement(String empLevel, String emp_password, String lastModified, String modifiedBy) {
        this.empLevel = empLevel;
        this.emp_password = emp_password;
        this.lastModified = lastModified;
        this.modifiedBy = modifiedBy;
    }

    public UserManagement(int empID, String empName, String empLevel, String emp_userName, String emp_password, String addedDate) {
        this.empID = empID;
        this.empName = empName;
        this.empLevel = empLevel;
        this.emp_userName = emp_userName;
        this.emp_password = emp_password;
        this.addedDate = addedDate;
    }

    
    
    public UserManagement(int empID, String empName, String empLevel, String emp_userName, String emp_password, String addedDate, String addedBy, String lastModified, String modifiedBy) {
        this.empID = empID;
        this.empName = empName;
        this.empLevel = empLevel;
        this.emp_userName = emp_userName;
        this.emp_password = emp_password;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
        this.lastModified = lastModified;
        this.modifiedBy = modifiedBy;
    }

    public int getUseID() {
        return useID;
    }

    public void setUseID(int useID) {
        this.useID = useID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(String empLevel) {
        this.empLevel = empLevel;
    }

    public String getEmp_userName() {
        return emp_userName;
    }

    public void setEmp_userName(String emp_userName) {
        this.emp_userName = emp_userName;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    
    
}
