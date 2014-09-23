/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Suharsha Wick
 */
@Entity
@Table(name = "user_management", catalog = "AquaCompany", schema = "")
@NamedQueries({
    @NamedQuery(name = "UserManagement.findAll", query = "SELECT u FROM UserManagement u"),
    @NamedQuery(name = "UserManagement.findByUserID", query = "SELECT u FROM UserManagement u WHERE u.userID = :userID"),
    @NamedQuery(name = "UserManagement.findByEmpID", query = "SELECT u FROM UserManagement u WHERE u.empID = :empID"),
    @NamedQuery(name = "UserManagement.findByEmpName", query = "SELECT u FROM UserManagement u WHERE u.empName = :empName"),
    @NamedQuery(name = "UserManagement.findByEmpLevel", query = "SELECT u FROM UserManagement u WHERE u.empLevel = :empLevel"),
    @NamedQuery(name = "UserManagement.findByEmpUserName", query = "SELECT u FROM UserManagement u WHERE u.empUserName = :empUserName"),
    @NamedQuery(name = "UserManagement.findByUserPassword", query = "SELECT u FROM UserManagement u WHERE u.userPassword = :userPassword"),
    @NamedQuery(name = "UserManagement.findByAddedDate", query = "SELECT u FROM UserManagement u WHERE u.addedDate = :addedDate"),
    @NamedQuery(name = "UserManagement.findByAddedBy", query = "SELECT u FROM UserManagement u WHERE u.addedBy = :addedBy"),
    @NamedQuery(name = "UserManagement.findByModifiedDate", query = "SELECT u FROM UserManagement u WHERE u.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "UserManagement.findByModifiedBy", query = "SELECT u FROM UserManagement u WHERE u.modifiedBy = :modifiedBy")})
public class UserManagement implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_ID")
    private Integer userID;
    @Column(name = "emp_ID")
    private String empID;
    @Column(name = "emp_Name")
    private String empName;
    @Column(name = "emp_Level")
    private String empLevel;
    @Column(name = "emp_UserName")
    private String empUserName;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "addedDate")
    private String addedDate;
    @Column(name = "addedBy")
    private String addedBy;
    @Column(name = "modifiedDate")
    private String modifiedDate;
    @Column(name = "modifiedBy")
    private String modifiedBy;

    public UserManagement() {
    }

    public UserManagement(Integer userID) {
        this.userID = userID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        Integer oldUserID = this.userID;
        this.userID = userID;
        changeSupport.firePropertyChange("userID", oldUserID, userID);
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        String oldEmpID = this.empID;
        this.empID = empID;
        changeSupport.firePropertyChange("empID", oldEmpID, empID);
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        String oldEmpName = this.empName;
        this.empName = empName;
        changeSupport.firePropertyChange("empName", oldEmpName, empName);
    }

    public String getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(String empLevel) {
        String oldEmpLevel = this.empLevel;
        this.empLevel = empLevel;
        changeSupport.firePropertyChange("empLevel", oldEmpLevel, empLevel);
    }

    public String getEmpUserName() {
        return empUserName;
    }

    public void setEmpUserName(String empUserName) {
        String oldEmpUserName = this.empUserName;
        this.empUserName = empUserName;
        changeSupport.firePropertyChange("empUserName", oldEmpUserName, empUserName);
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        String oldUserPassword = this.userPassword;
        this.userPassword = userPassword;
        changeSupport.firePropertyChange("userPassword", oldUserPassword, userPassword);
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        String oldAddedDate = this.addedDate;
        this.addedDate = addedDate;
        changeSupport.firePropertyChange("addedDate", oldAddedDate, addedDate);
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        String oldAddedBy = this.addedBy;
        this.addedBy = addedBy;
        changeSupport.firePropertyChange("addedBy", oldAddedBy, addedBy);
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        String oldModifiedDate = this.modifiedDate;
        this.modifiedDate = modifiedDate;
        changeSupport.firePropertyChange("modifiedDate", oldModifiedDate, modifiedDate);
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        String oldModifiedBy = this.modifiedBy;
        this.modifiedBy = modifiedBy;
        changeSupport.firePropertyChange("modifiedBy", oldModifiedBy, modifiedBy);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserManagement)) {
            return false;
        }
        UserManagement other = (UserManagement) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.UserManagement[ userID=" + userID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
