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
public class ClientDetails {
    private int customer_id;
    private String cus_name;
    private String address;
    private String cus_telephone;
    private String cus_email;
    private String addedDate;
    private String addedBy;
    private String isModified;
    private String modifiedDate;
    private String modifiedBy;

    public ClientDetails(String cus_name, String address, String cus_telephone, String cus_email, String addedDate, String addedBy) {
        this.cus_name = cus_name;
        this.address = address;
        this.cus_telephone = cus_telephone;
        this.cus_email = cus_email;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
    }

    public ClientDetails(String cus_name, String address, String cus_telephone, String cus_email,String isModified, String modifiedDate, String modifiedBy) {
        this.cus_name = cus_name;
        this.address = address;
        this.cus_telephone = cus_telephone;
        this.cus_email = cus_email;
        this.isModified = isModified;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
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

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCus_telephone() {
        return cus_telephone;
    }

    public void setCus_telephone(String cus_telephone) {
        this.cus_telephone = cus_telephone;
    }

    public String getCus_email() {
        return cus_email;
    }

    public void setCus_email(String cus_email) {
        this.cus_email = cus_email;
    }
    
    
    
}
