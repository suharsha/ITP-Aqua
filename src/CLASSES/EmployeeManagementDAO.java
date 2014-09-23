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
 * @author Keith Weerasinghe
 */
public class EmployeeManagementDAO {
     private DBConnManager dbConnManager = null;
    private PreparedStatement pst;

    public EmployeeManagementDAO() {
    dbConnManager = new DBConnManager();
    }
    
    public boolean addEmployee(EmployeeManagement d) {

        
        boolean result = false;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            String query = "INSERT INTO Emp_Management(title,job_Title,gender,f_Name,m_Name,l_Name,prf_Name,DOB,s_Date,age,LOS,nationality,NIC,address,e_mail,c_Home,c_Mobile,pic_Path,acc_Num,acc_Branch,acc_Bank,cv_Path,edu_Qual,prof_Qual,emp_rel,IC_fname,IC_lname,IC_contactNumber,addedDate,addedBy)  " +
                    "VALUES( '" + d.getTitle() + "','" + d.getJob_Title() + "','" + d.getGender() + "','" + d.getF_Name() + "','" + d.getM_Name() + "','" + d.getL_Name() + "','" +d.getPrf_Name() + "','" +d.getDOB() + "','" +d.getS_Date() + "','" +d.getAge() + "','" + d.getLOS() + 
                    "','" +d.getNationality() + "','" + d.getNIC() + "','" + d.getAddress() +"','" +d.getE_mail() +"','" +d.getC_Home() +"','" +d.getC_Mobile() +"','" +
                    d.getPic_Path() +"','" +d.getAcc_Num() +"','" +d.getAcc_Branch() +"','" +d.getAcc_Bank() + "','" +d.getCv_Path() +"','" +d.getEdu_Qual() +"','" +d.getProf_Qual() +"','" +d.getEmp_rel()+"','"+ d.getIC_fname()+"','"+d.getIC_lname()+"','" +d.getIC_contactNumber() +"'"
                    + ",'"+d.getAddedDate()+"','"+d.getAddedBy()+"')";

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

public String[] getEmployeeDetailsStrings(int selectedID){

            //arraylist is having behaviours of arrys
            ArrayList<String> employeeAttributesList = null;
            Connection dbConn = null;
            String[] AttList = null;
            int emp_ID = selectedID;
            try{
            //connect with db, create the statement and using that execute the query
            //Connect to th DB
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();

            //Select the JobCatNames
            String query = "SELECT * FROM Emp_Management WHERE emp_ID = "+emp_ID+"";

            System.out.println(query);
            //by this query we are getting more than one value
            ResultSet rs = stmt.executeQuery(query);

            //one by one from resultset,we have to add values to your arraylist.this is done by while loop
            employeeAttributesList = new ArrayList<>();

            System.out.println("Arraylist has been created");
            while (rs.next()) {

                    for (int i=0; i<=26;i++)
                    {
                        employeeAttributesList.add(rs.getString(i+1));
                    }
            }
            System.out.println("Data have been added");
            AttList = employeeAttributesList.toArray(new String[27]);
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

public Vector getEmployeeDetails() {

        Vector<Vector<String>> EmployeeDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT *"+
                    "FROM Emp_Management ";

            ResultSet rs = stmt.executeQuery(query);
            EmployeeDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> EmployeeDetails = new Vector<String>();
                EmployeeDetails.add(rs.getString(1)); //EmpID
                EmployeeDetails.add(rs.getString(2)); //title
                EmployeeDetails.add(rs.getString(5)); //job_Title
                EmployeeDetails.add(rs.getString(6)); //gender
                EmployeeDetails.add(rs.getString(7)); //f_Name
                EmployeeDetails.add(rs.getString(3)); //m_Name
                EmployeeDetails.add(rs.getString(4)); //l_Name
                /*
                EmployeeDetails.add(rs.getString(8)); //prf_Name
                EmployeeDetails.add(rs.getString(9)); //DOB
                EmployeeDetails.add(rs.getString(10)); //s_Date
                EmployeeDetails.add(rs.getString(11)); //age
                EmployeeDetails.add(rs.getString(12)); //LOS
                EmployeeDetails.add(rs.getString(13)); //nationality
                EmployeeDetails.add(rs.getString(14)); //NIC
                EmployeeDetails.add(rs.getString(15)); //address
                EmployeeDetails.add(rs.getString(16)); //e_mail
                EmployeeDetails.add(rs.getString(17)); //c_Home
                EmployeeDetails.add(rs.getString(18)); //c_Mobile
                EmployeeDetails.add(rs.getString(19)); //pic_Path
                EmployeeDetails.add(rs.getString(20)); //acc_Num
                EmployeeDetails.add(rs.getString(21)); //acc_Branch
                EmployeeDetails.add(rs.getString(22)); //acc_Bank
                EmployeeDetails.add(rs.getString(23)); //cv_Path
                EmployeeDetails.add(rs.getString(24)); //edu_Qual
                EmployeeDetails.add(rs.getString(25)); //prof_Qual
                EmployeeDetails.add(rs.getString(26)); //emp_rel
                EmployeeDetails.add(rs.getString(27)); //IC_fname
                EmployeeDetails.add(rs.getString(28)); //IC_lname
                EmployeeDetails.add(rs.getString(29)); //IC_contactNumber
                */
                EmployeeDetailsVector.add(EmployeeDetails);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return EmployeeDetailsVector;
    }
   

public void updateEmployee(EmployeeManagement d, int SelectedID) {
        Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();

            Statement stmt = dbConn.createStatement();
            

            String query = "UPDATE Emp_Management SET title = '"
                           + d.getTitle() + "' ,job_Title = '" + d.getJob_Title()
                           + "' , gender = '" + d.getGender()+"' ,f_Name = '" + d.getF_Name() + "',m_Name = '" 
                           + d.getM_Name() + "' ,l_Name = '" + d.getL_Name()+ "' ,prf_Name = '" + d.getPrf_Name()+"' ,DOB = '" + d.getDOB()+"' ,s_Date = '" + d.getS_Date()+"' ,age = '" + d.getAge()+"' ,"
                           + "LOS = '" + d.getLOS()+"' ,nationality = '" + d.getNationality()+"' ,NIC = '" + d.getNIC()+"' ,address = '" + d.getAddress()+"' ,e_mail = '" + d.getE_mail()+"' ,c_Home = '" + d.getC_Home()
                           +"' ,c_Mobile = '" + d.getC_Mobile()+"' ,pic_Path = '" + "' ,acc_Num = '" + d.getAcc_Num()+"' ,acc_Branch = '" + d.getAcc_Branch()+"' ,acc_Bank = '" + d.getAcc_Bank()+"' ,cv_Path = '" +"' ,edu_Qual = '" + d.getEdu_Qual()+"' ,prof_Qual = '" + d.getProf_Qual()+"' ,emp_rel = '" + d.getEmp_rel()+"' ,IC_fname = '" + d.getIC_fname()+"' ,IC_lname = '" + d.getIC_lname()+"' ,IC_contactNumber = '" + d.getIC_contactNumber()
                            +d.getIC_relationship()+"' WHERE emp_ID = "+SelectedID+"";

             pst=dbConn.prepareStatement(query);
             pst.execute();


        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Insert query failed");

        }finally{
            dbConnManager.con_close(dbConn);
        }
} 
       public void deleteEmployee(int SelectedID) {

        boolean result = false;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                String query= "DELETE FROM Emp_Management where emp_ID= '" + SelectedID + "'";
                pst= dbConn.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Successfully deleted","Record Deleted",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Insert query failed");

        }finally{
            dbConnManager.con_close(dbConn);
        }
    }
    
    //Sorting Algorithms
       
    public Vector sortEmployeeDetailsNameAZ() {

        Vector<Vector<String>> EmployeeDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  *"+
                    "FROM Emp_Management  ORDER BY f_Name,m_Name,l_Name,prf_Name";

            ResultSet rs = stmt.executeQuery(query);
            EmployeeDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> EmployeeDetails = new Vector<String>();
                EmployeeDetails.add(rs.getString(1)); //EmpID
                EmployeeDetails.add(rs.getString(2)); //title
                EmployeeDetails.add(rs.getString(3)); //job_Title
                EmployeeDetails.add(rs.getString(4)); //gender
                EmployeeDetails.add(rs.getString(5)); //f_Name
                EmployeeDetails.add(rs.getString(6)); //m_Name
                EmployeeDetails.add(rs.getString(7)); //l_Name
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return EmployeeDetailsVector;
    }
    
    public Vector sortEventDetailsNameZA() {

        Vector<Vector<String>> EmployeeDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  *"+
                    "FROM Emp_Management  ORDER BY f_Name,m_Name,l_Name,prf_Name";

            ResultSet rs = stmt.executeQuery(query);
            EmployeeDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> EmployeeDetails = new Vector<String>();
                EmployeeDetails.add(rs.getString(1)); //EmpID
                EmployeeDetails.add(rs.getString(2)); //title
                EmployeeDetails.add(rs.getString(3)); //job_Title
                EmployeeDetails.add(rs.getString(4)); //gender
                EmployeeDetails.add(rs.getString(5)); //f_Name
                EmployeeDetails.add(rs.getString(6)); //m_Name
                EmployeeDetails.add(rs.getString(7)); //l_Name
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return EmployeeDetailsVector;
    }
    
    public Vector sortEventDetailsClientNameAZ() {

        Vector<Vector<String>> EmployeeDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  *"+
                    "FROM Emp_Management  ORDER BY f_Name,m_Name,l_Name,prf_Name";

            ResultSet rs = stmt.executeQuery(query);
            EmployeeDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> EmployeeDetails = new Vector<String>();
                EmployeeDetails.add(rs.getString(1)); //EmpID
                EmployeeDetails.add(rs.getString(2)); //title
                EmployeeDetails.add(rs.getString(3)); //job_Title
                EmployeeDetails.add(rs.getString(4)); //gender
                EmployeeDetails.add(rs.getString(5)); //f_Name
                EmployeeDetails.add(rs.getString(6)); //m_Name
                EmployeeDetails.add(rs.getString(7)); //l_Name
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return EmployeeDetailsVector;
    }
    
    public Vector sortEventDetailsClientNameZA() {

        Vector<Vector<String>> EmployeeDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  *"+
                    "FROM Emp_Management  ORDER BY f_Name,m_Name,l_Name,prf_Name";

            ResultSet rs = stmt.executeQuery(query);
            EmployeeDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> EmployeeDetails = new Vector<String>();
                EmployeeDetails.add(rs.getString(1)); //EmpID
                EmployeeDetails.add(rs.getString(2)); //title
                EmployeeDetails.add(rs.getString(3)); //job_Title
                EmployeeDetails.add(rs.getString(4)); //gender
                EmployeeDetails.add(rs.getString(5)); //f_Name
                EmployeeDetails.add(rs.getString(6)); //m_Name
                EmployeeDetails.add(rs.getString(7)); //l_Name
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return EmployeeDetailsVector;
    }
    
    //Search Function
    public Vector searchEmployeeDetailsEmpID(String keyword) {

        Vector<Vector<String>> EmployeeDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  *"+
                    "FROM Emp_Management  WHERE emp_ID = ? AND LIKE '"+keyword+"%'";

            ResultSet rs = stmt.executeQuery(query);
            EmployeeDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> EmployeeDetails = new Vector<String>();
                EmployeeDetails.add(rs.getString(1)); //EmpID
                EmployeeDetails.add(rs.getString(2)); //title
                EmployeeDetails.add(rs.getString(3)); //job_Title
                EmployeeDetails.add(rs.getString(4)); //gender
                EmployeeDetails.add(rs.getString(5)); //f_Name
                EmployeeDetails.add(rs.getString(6)); //m_Name
                EmployeeDetails.add(rs.getString(7)); //l_Name
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return EmployeeDetailsVector;
    }
    
    public Vector searchEmployeeDetailsEmpName(String keyword) {

        Vector<Vector<String>> EmployeeDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  * "+
                    "FROM Emp_Management  WHERE f_Name = ? AND LIKE '"+keyword+"%'";

            ResultSet rs = stmt.executeQuery(query);
            EmployeeDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> EmployeeDetails = new Vector<String>();
                EmployeeDetails.add(rs.getString(1)); //EmpID
                EmployeeDetails.add(rs.getString(2)); //title
                EmployeeDetails.add(rs.getString(3)); //job_Title
                EmployeeDetails.add(rs.getString(4)); //gender
                EmployeeDetails.add(rs.getString(5)); //f_Name
                EmployeeDetails.add(rs.getString(6)); //m_Name
                EmployeeDetails.add(rs.getString(7)); //l_Name
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return EmployeeDetailsVector;
    }
    
    public Vector searchEmployeeDetailsJobTitle(String keyword) {

        Vector<Vector<String>> EmployeeDetailsVector = null;
	Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT  *"+
                    "FROM Emp_Management  WHERE job_Title = ? AND LIKE '"+keyword+"%'";

            ResultSet rs = stmt.executeQuery(query);
            EmployeeDetailsVector = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> EmployeeDetails = new Vector<String>();
                EmployeeDetails.add(rs.getString(1)); //EmpID
                EmployeeDetails.add(rs.getString(2)); //title
                EmployeeDetails.add(rs.getString(3)); //job_Title
                EmployeeDetails.add(rs.getString(4)); //gender
                EmployeeDetails.add(rs.getString(5)); //f_Name
                EmployeeDetails.add(rs.getString(6)); //m_Name
                EmployeeDetails.add(rs.getString(7)); //l_Name
            }

        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.con_close(dbConn);
        }
        return EmployeeDetailsVector;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
