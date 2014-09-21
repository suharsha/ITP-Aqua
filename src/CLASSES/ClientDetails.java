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
