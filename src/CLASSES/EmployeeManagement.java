/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

/**
 *
 * @author Keith Weerasinghe
 */
public class EmployeeManagement {
    private int emp_ID;
    private String title;
    private String job_Title;
    private String gender;
    private String f_Name;
    private String m_Name;
    private String l_Name;
    private String prf_Name;
    private String DOB;
    private String s_Date;
    private String age;
    private String LOS;
    private String nationality;
    private String NIC;
    private String address;
    private String e_mail;
    private String c_Home;
    private String c_Mobile;
    private String pic_Path;
    private String acc_Num;
    private String acc_Branch;
    private String acc_Bank;
    private String cv_Path;
    private String edu_Qual;
    private String prof_Qual;
    private String emp_rel;
    private String IC_fname;
    private String IC_lname;
    private String IC_contactNumber;
    private String IC_relationship;
    private String addedDate;
    private String addedBy;
    private String modifiedDate;
    private String modifiedBy;

    public EmployeeManagement(String title, String job_Title, String gender, String f_Name, String m_Name, String l_Name, String prf_Name, String DOB, String s_Date, String age, String LOS, String nationality, String NIC, String address, String e_mail, String c_Home, String c_Mobile, String pic_Path, String acc_Num, String acc_Branch, String acc_Bank, String cv_Path, String edu_Qual, String prof_Qual, String emp_rel, String IC_fname, String IC_lname, String IC_contactNumber, String IC_relationship, String addedDate, String addedBy) {
        this.title = title;
        this.job_Title = job_Title;
        this.gender = gender;
        this.f_Name = f_Name;
        this.m_Name = m_Name;
        this.l_Name = l_Name;
        this.prf_Name = prf_Name;
        this.DOB = DOB;
        this.s_Date = s_Date;
        this.age = age;
        this.LOS = LOS;
        this.nationality = nationality;
        this.NIC = NIC;
        this.address = address;
        this.e_mail = e_mail;
        this.c_Home = c_Home;
        this.c_Mobile = c_Mobile;
        this.pic_Path = pic_Path;
        this.acc_Num = acc_Num;
        this.acc_Branch = acc_Branch;
        this.acc_Bank = acc_Bank;
        this.cv_Path = cv_Path;
        this.edu_Qual = edu_Qual;
        this.prof_Qual = prof_Qual;
        this.emp_rel = emp_rel;
        this.IC_fname = IC_fname;
        this.IC_lname = IC_lname;
        this.IC_contactNumber = IC_contactNumber;
        this.IC_relationship = IC_relationship;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
    }

    
    
    public int getEmp_ID() {
        return emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJob_Title() {
        return job_Title;
    }

    public void setJob_Title(String job_Title) {
        this.job_Title = job_Title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getF_Name() {
        return f_Name;
    }

    public void setF_Name(String f_Name) {
        this.f_Name = f_Name;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public String getL_Name() {
        return l_Name;
    }

    public void setL_Name(String l_Name) {
        this.l_Name = l_Name;
    }

    public String getPrf_Name() {
        return prf_Name;
    }

    public void setPrf_Name(String prf_Name) {
        this.prf_Name = prf_Name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getS_Date() {
        return s_Date;
    }

    public void setS_Date(String s_Date) {
        this.s_Date = s_Date;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLOS() {
        return LOS;
    }

    public void setLOS(String LOS) {
        this.LOS = LOS;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getC_Home() {
        return c_Home;
    }

    public void setC_Home(String c_Home) {
        this.c_Home = c_Home;
    }

    public String getC_Mobile() {
        return c_Mobile;
    }

    public void setC_Mobile(String c_Mobile) {
        this.c_Mobile = c_Mobile;
    }

    public String getPic_Path() {
        return pic_Path;
    }

    public void setPic_Path(String pic_Path) {
        this.pic_Path = pic_Path;
    }

    public String getAcc_Num() {
        return acc_Num;
    }

    public void setAcc_Num(String acc_Num) {
        this.acc_Num = acc_Num;
    }

    public String getAcc_Branch() {
        return acc_Branch;
    }

    public void setAcc_Branch(String acc_Branch) {
        this.acc_Branch = acc_Branch;
    }

    public String getAcc_Bank() {
        return acc_Bank;
    }

    public void setAcc_Bank(String acc_Bank) {
        this.acc_Bank = acc_Bank;
    }

    public String getCv_Path() {
        return cv_Path;
    }

    public void setCv_Path(String cv_Path) {
        this.cv_Path = cv_Path;
    }

    public String getEdu_Qual() {
        return edu_Qual;
    }

    public void setEdu_Qual(String edu_Qual) {
        this.edu_Qual = edu_Qual;
    }

    public String getProf_Qual() {
        return prof_Qual;
    }

    public void setProf_Qual(String prof_Qual) {
        this.prof_Qual = prof_Qual;
    }

    public String getEmp_rel() {
        return emp_rel;
    }

    public void setEmp_rel(String emp_rel) {
        this.emp_rel = emp_rel;
    }

    public String getIC_fname() {
        return IC_fname;
    }

    public void setIC_fname(String IC_fname) {
        this.IC_fname = IC_fname;
    }

    public String getIC_lname() {
        return IC_lname;
    }

    public void setIC_lname(String IC_lname) {
        this.IC_lname = IC_lname;
    }

    public String getIC_contactNumber() {
        return IC_contactNumber;
    }

    public void setIC_contactNumber(String IC_contactNumber) {
        this.IC_contactNumber = IC_contactNumber;
    }

    public String getIC_relationship() {
        return IC_relationship;
    }

    public void setIC_relationship(String IC_relationship) {
        this.IC_relationship = IC_relationship;
    }

    

    
    
         
}