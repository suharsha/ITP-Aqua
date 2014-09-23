/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import CLASSES.ClientDetailsDAO;
import CLASSES.EmployeeManagementDAO;
import CLASSES.EventDetailsDAO;
import CLASSES.SupplierDetailsDAO;
import CLASSES.Themes;
import CLASSES.UserManagementDAO;
import java.awt.CardLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suharsha Wick
 */
public class Home extends javax.swing.JFrame {
private Vector<Vector<String>> data_eventDetails; //Used for data from database
private Vector<String> header_eventDetails; //Used to store data header

private Vector<Vector<String>> data_userManagement; //Used for data from database
private Vector<String> header_userManagement; //Used to store data header

private Vector<Vector<String>> data_clientDetails; //Used for data from database
private Vector<String> header_clientDetails; //Used to store data header

private Vector<Vector<String>> data_employeeDetails; //Used for data from database
private Vector<String> header_employeeDetails; //Used to store data header

private Vector<Vector<String>> data_supplierDetails; //Used for data from database
private Vector<String> header_supplierDetails; //Used to store data header


private String currentUser="";
private int selectedEventDetailsId;
private int selectedUserDetailsId;
private int selectedClientDetailsId;
private int selectedSupplierDetailsId;
    /**
     * Creates new form Home
     */
    public Home() {

        initComponents(); 
        
        Themes theme = new Themes();
        theme.setIcon(this);
        Rectangle rec = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.setSize(rec.width, rec.height);

        header_eventDetails = new Vector<String>();
        header_eventDetails.add("EventID");
        header_eventDetails.add("Name");
        header_eventDetails.add("Client");
        header_eventDetails.add("Location");
        header_eventDetails.add("Start Date");
        header_eventDetails.add("StartTime");
        header_eventDetails.add("End Date");
        header_eventDetails.add("EndTime");
        header_eventDetails.add("Status");
        
        header_userManagement = new Vector<String>();
        header_userManagement.add("UserID");
        header_userManagement.add("Employee Name");
        header_userManagement.add("Level");
        header_userManagement.add("UserName");
        header_userManagement.add("Password");
        header_userManagement.add("Added Date");
        header_userManagement.add("Modified Date");
        
        header_clientDetails = new Vector<String>();
        header_clientDetails.add("Client ID");
        header_clientDetails.add("Name");
        header_clientDetails.add("Address");
        header_clientDetails.add("Telephone");
        header_clientDetails.add("Email");

        header_employeeDetails = new Vector<String>();
        header_employeeDetails.add("Employee ID");
        header_employeeDetails.add("Title");
        header_employeeDetails.add("First Name");
        header_employeeDetails.add("Middle Name");
        header_employeeDetails.add("Last Name");
        header_employeeDetails.add("Job Title");
        header_employeeDetails.add("Gender");
        
        header_supplierDetails = new Vector<String>();
        header_supplierDetails.add("Supplier ID");
        header_supplierDetails.add("Name");
        header_supplierDetails.add("Item");
        header_supplierDetails.add("Rate");
        header_supplierDetails.add("Address");
        
        loadEventDetailsTable();
        loadClientDetailsTable();
        loadUserManagementTable();
        loadEmployeeDetailsTable();
        loadSupplierDetailsTable();
        CurrentDate();
    }
    
    public void showLoggedInUser(String userName){
        currentUser = userName;
        lblLoggedInUser.setText(currentUser);
    }
    
    public void CurrentDate() {
            Thread clock = new Thread(){
        public void run(){
         for(;;){
            Calendar cal = new GregorianCalendar();
            int month = cal.get(Calendar.MONTH);
            int year = cal.get(Calendar.YEAR);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            lblDate.setText(year+"-"+(month+1)+"-"+day);
        
            int second = cal.get(Calendar.SECOND);
            int minute = cal.get(Calendar.MINUTE);
            int hour = cal.get(Calendar.HOUR); 
            lblTime.setText(hour+":"+minute+":"+second);
 
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }};
    clock.start();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasePanel = new javax.swing.JPanel();
        NavigationPanel = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnEventDetails = new javax.swing.JButton();
        btnInvoice = new javax.swing.JButton();
        btnEquipmentPlan = new javax.swing.JButton();
        btnActivityPlan = new javax.swing.JButton();
        btnEventBudget = new javax.swing.JButton();
        btnFileManagement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClientPayments = new javax.swing.JButton();
        btnSupplierOutstanding = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        CardsPanel = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        homeSearch = new javax.swing.JTextField();
        homeSearchTypes = new javax.swing.JComboBox();
        btnhomeSearch = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jButton24 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        homeClientList = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        homeCompletionSlider = new javax.swing.JSlider();
        jButton17 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        EventDetails = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        eventDetailsMainTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        EDsearchKeyword = new javax.swing.JTextField();
        EDSearchType = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        eventDetailsDelete = new javax.swing.JButton();
        eventDetailsEdit = new javax.swing.JButton();
        eventDetailsView = new javax.swing.JButton();
        eventDetailsAdd = new javax.swing.JButton();
        EDRefresh = new javax.swing.JButton();
        Invoice = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jPanel37 = new javax.swing.JPanel();
        homeSearch15 = new javax.swing.JTextField();
        homeSearchTypes15 = new javax.swing.JComboBox();
        btnhomeSearch15 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        eventDetailsDelete1 = new javax.swing.JButton();
        invoiceEdit = new javax.swing.JButton();
        invoiceView = new javax.swing.JButton();
        invoiceAdd = new javax.swing.JButton();
        EquipmentPlan = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        homeSearch3 = new javax.swing.JTextField();
        homeSearchTypes3 = new javax.swing.JComboBox();
        btnhomeSearch3 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jButton29 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        equipmentPlanDelete = new javax.swing.JButton();
        equipmentPlanEdit = new javax.swing.JButton();
        equipmentPlanView = new javax.swing.JButton();
        equipmentPlanAdd = new javax.swing.JButton();
        ActivityPlan = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        homeSearch4 = new javax.swing.JTextField();
        homeSearchTypes4 = new javax.swing.JComboBox();
        btnhomeSearch4 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox13 = new javax.swing.JComboBox();
        jButton34 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        activityPlanDelete = new javax.swing.JButton();
        activityPlanEdit = new javax.swing.JButton();
        activityPlanView = new javax.swing.JButton();
        activityPlanAdd = new javax.swing.JButton();
        FilesManagement = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel31 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        homeSearch5 = new javax.swing.JTextField();
        homeSearchTypes5 = new javax.swing.JComboBox();
        btnhomeSearch5 = new javax.swing.JButton();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        jButton39 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        eventFilesDelete = new javax.swing.JButton();
        eventFilesEdit = new javax.swing.JButton();
        eventFilesView = new javax.swing.JButton();
        eventFilesAdd = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        homeSearch14 = new javax.swing.JTextField();
        homeSearchTypes14 = new javax.swing.JComboBox();
        btnhomeSearch14 = new javax.swing.JButton();
        jComboBox31 = new javax.swing.JComboBox();
        jComboBox32 = new javax.swing.JComboBox();
        jButton40 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        forwardedFilesDelete = new javax.swing.JButton();
        forwardedFilesEdit = new javax.swing.JButton();
        forwardedFilesAdd = new javax.swing.JButton();
        forwardedFilesApprove = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        EventBudget = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        homeSearch6 = new javax.swing.JTextField();
        homeSearchTypes6 = new javax.swing.JComboBox();
        btnhomeSearch6 = new javax.swing.JButton();
        jComboBox15 = new javax.swing.JComboBox();
        jComboBox16 = new javax.swing.JComboBox();
        jButton44 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        budgetDelete = new javax.swing.JButton();
        budgetEdit = new javax.swing.JButton();
        budgetView = new javax.swing.JButton();
        budgetAdd = new javax.swing.JButton();
        ClientPayments = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        homeSearch7 = new javax.swing.JTextField();
        homeSearchTypes7 = new javax.swing.JComboBox();
        btnhomeSearch7 = new javax.swing.JButton();
        jComboBox17 = new javax.swing.JComboBox();
        jComboBox18 = new javax.swing.JComboBox();
        jButton49 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        clientpaymentsDelete = new javax.swing.JButton();
        clientpaymentsEdit = new javax.swing.JButton();
        clientpaymentsView = new javax.swing.JButton();
        clientpaymentsAdd = new javax.swing.JButton();
        SupplierPayments = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        homeSearch8 = new javax.swing.JTextField();
        homeSearchTypes8 = new javax.swing.JComboBox();
        btnhomeSearch8 = new javax.swing.JButton();
        jComboBox19 = new javax.swing.JComboBox();
        jComboBox20 = new javax.swing.JComboBox();
        jButton54 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton55 = new javax.swing.JButton();
        suppOutsItemEdit = new javax.swing.JButton();
        suppOutsItemView = new javax.swing.JButton();
        suppOutsItemAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jButton59 = new javax.swing.JButton();
        suppPaymentsEdit = new javax.swing.JButton();
        suppPaymentsView = new javax.swing.JButton();
        suppPaymentsAdd = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        homeSearch9 = new javax.swing.JTextField();
        homeSearchTypes9 = new javax.swing.JComboBox();
        btnhomeSearch9 = new javax.swing.JButton();
        jComboBox21 = new javax.swing.JComboBox();
        jComboBox22 = new javax.swing.JComboBox();
        jButton63 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        ClientsManagement = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        clientDetailsDelete = new javax.swing.JButton();
        clientDetailsEdit = new javax.swing.JButton();
        clientDetailsView = new javax.swing.JButton();
        clientDetailsAdd = new javax.swing.JButton();
        CMRefresh = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        homeSearch16 = new javax.swing.JTextField();
        homeSearchTypes16 = new javax.swing.JComboBox();
        btnhomeSearch16 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        clientDetails = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        homeSearch10 = new javax.swing.JTextField();
        homeSearchTypes10 = new javax.swing.JComboBox();
        btnhomeSearch10 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        comMemberDelete = new javax.swing.JButton();
        comMemberEdit = new javax.swing.JButton();
        comMemberView = new javax.swing.JButton();
        comMemberAdd = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        SuppliersManagement = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        homeSearch11 = new javax.swing.JTextField();
        homeSearchTypes11 = new javax.swing.JComboBox();
        btnhomeSearch11 = new javax.swing.JButton();
        jComboBox25 = new javax.swing.JComboBox();
        jComboBox26 = new javax.swing.JComboBox();
        jButton69 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        supplierDelete = new javax.swing.JButton();
        supplierEdit = new javax.swing.JButton();
        supplierView = new javax.swing.JButton();
        supplierAdd = new javax.swing.JButton();
        supplierRefresh = new javax.swing.JButton();
        EmployeeManagement = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        employeeDetails = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        homeSearch12 = new javax.swing.JTextField();
        homeSearchTypes12 = new javax.swing.JComboBox();
        btnhomeSearch12 = new javax.swing.JButton();
        jComboBox27 = new javax.swing.JComboBox();
        jComboBox28 = new javax.swing.JComboBox();
        jButton74 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jButton75 = new javax.swing.JButton();
        employeeEdit = new javax.swing.JButton();
        employeeView = new javax.swing.JButton();
        employeeAdd = new javax.swing.JButton();
        UserManagement = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        homeSearch13 = new javax.swing.JTextField();
        homeSearchTypes13 = new javax.swing.JComboBox();
        btnhomeSearch13 = new javax.swing.JButton();
        jComboBox29 = new javax.swing.JComboBox();
        jComboBox30 = new javax.swing.JComboBox();
        jButton79 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        btnUserDelete = new javax.swing.JButton();
        userEdit = new javax.swing.JButton();
        btnViewUser = new javax.swing.JButton();
        userManAdd = new javax.swing.JButton();
        UMRefresh = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        userDetailsTable = new javax.swing.JTable();
        StatusBar = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblLoggedInUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aqua Event Management");

        BasePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        NavigationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Home-icon.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnEventDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/event.png"))); // NOI18N
        btnEventDetails.setText("Event Details");
        btnEventDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEventDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventDetailsActionPerformed(evt);
            }
        });

        btnInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/invoice.png"))); // NOI18N
        btnInvoice.setText("Invoice");
        btnInvoice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceActionPerformed(evt);
            }
        });

        btnEquipmentPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/equipment.png"))); // NOI18N
        btnEquipmentPlan.setText("Equipment Plan");
        btnEquipmentPlan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEquipmentPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipmentPlanActionPerformed(evt);
            }
        });

        btnActivityPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/activity.png"))); // NOI18N
        btnActivityPlan.setText("Activity Plan");
        btnActivityPlan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActivityPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivityPlanActionPerformed(evt);
            }
        });

        btnEventBudget.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/budget.png"))); // NOI18N
        btnEventBudget.setText("Event Budget");
        btnEventBudget.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEventBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventBudgetActionPerformed(evt);
            }
        });

        btnFileManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/file management.png"))); // NOI18N
        btnFileManagement.setText("Files Management");
        btnFileManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFileManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileManagementActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EVENT DETAILS");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FINANCE");
        jLabel2.setOpaque(true);

        btnClientPayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/cash flow.png"))); // NOI18N
        btnClientPayments.setText("Client Payments");
        btnClientPayments.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientPaymentsActionPerformed(evt);
            }
        });

        btnSupplierOutstanding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/supplier out.png"))); // NOI18N
        btnSupplierOutstanding.setText("Supplier Outstanding");
        btnSupplierOutstanding.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSupplierOutstanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierOutstandingActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HUMAN RESOURCE");
        jLabel3.setOpaque(true);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/client.png"))); // NOI18N
        jButton10.setText("Clients Management");
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/User-Administrator-Red-icon.png"))); // NOI18N
        jButton11.setText("Suppliers Management");
        jButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/employee.png"))); // NOI18N
        jButton12.setText("Employees Management");
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/user.png"))); // NOI18N
        jButton13.setText("Users Management");
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavigationPanelLayout = new javax.swing.GroupLayout(NavigationPanel);
        NavigationPanel.setLayout(NavigationPanelLayout);
        NavigationPanelLayout.setHorizontalGroup(
            NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEventDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEquipmentPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnActivityPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFileManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEventBudget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientPayments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSupplierOutstanding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(NavigationPanelLayout.createSequentialGroup()
                .addGroup(NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        NavigationPanelLayout.setVerticalGroup(
            NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEventDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInvoice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEquipmentPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActivityPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFileManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEventBudget)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientPayments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSupplierOutstanding)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CardsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        CardsPanel.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch.setText("Search");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton24.setText("Sort");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch)
                .addGap(298, 298, 298)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton24)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Client :");

        homeClientList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Start Date :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("End Date :");

        jButton1.setText("Filter by Client");

        jButton14.setText("Filter by Start Date");

        jButton15.setText("Filter by End Date");

        jButton16.setText("Filter by Range");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Start Date :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("End Date :");

        homeCompletionSlider.setMajorTickSpacing(25);
        homeCompletionSlider.setMinimum(25);
        homeCompletionSlider.setPaintLabels(true);
        homeCompletionSlider.setPaintTicks(true);
        homeCompletionSlider.setSnapToTicks(true);
        homeCompletionSlider.setValue(100);
        homeCompletionSlider.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                homeCompletionSliderPropertyChange(evt);
            }
        });

        jButton17.setText("Filter by Completion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(homeClientList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(homeCompletionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17)
                        .addGap(142, 142, 142)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(homeClientList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(homeCompletionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton17)
                                    .addComponent(jButton16))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15)
                                    .addComponent(jLabel6))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("HOME");
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        CardsPanel.add(Home, "cHomePanel");

        eventDetailsMainTable.setAutoCreateRowSorter(true);
        eventDetailsMainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        eventDetailsMainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventDetailsMainTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(eventDetailsMainTable);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        EDsearchKeyword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EDsearchKeywordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EDsearchKeywordKeyTyped(evt);
            }
        });

        EDSearchType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Event Name", "Location", "Client Name" }));

        jButton2.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EDSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EDsearchKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDsearchKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("EVENT DETAILS");
        jLabel15.setOpaque(true);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        eventDetailsDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        eventDetailsDelete.setText("Delete");
        eventDetailsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventDetailsDeleteActionPerformed(evt);
            }
        });

        eventDetailsEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        eventDetailsEdit.setText("Edit");
        eventDetailsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventDetailsEditActionPerformed(evt);
            }
        });

        eventDetailsView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        eventDetailsView.setText("View");
        eventDetailsView.setEnabled(false);
        eventDetailsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventDetailsViewActionPerformed(evt);
            }
        });

        eventDetailsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        eventDetailsAdd.setText("Add");
        eventDetailsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventDetailsAddActionPerformed(evt);
            }
        });

        EDRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Button-Refresh-icon.png"))); // NOI18N
        EDRefresh.setText("Refresh");
        EDRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(EDRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eventDetailsAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventDetailsView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventDetailsEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventDetailsDelete))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventDetailsDelete)
                    .addComponent(eventDetailsEdit)
                    .addComponent(eventDetailsView)
                    .addComponent(eventDetailsAdd)
                    .addComponent(EDRefresh))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EventDetailsLayout = new javax.swing.GroupLayout(EventDetails);
        EventDetails.setLayout(EventDetailsLayout);
        EventDetailsLayout.setHorizontalGroup(
            EventDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        EventDetailsLayout.setVerticalGroup(
            EventDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventDetailsLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        CardsPanel.add(EventDetails, "cEventDetails");

        jTable16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane16.setViewportView(jTable16);

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch15.setText("Search");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch15, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel27.setBackground(new java.awt.Color(102, 102, 102));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("INVOICE MANAGEMENT");
        jLabel27.setOpaque(true);

        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        eventDetailsDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        eventDetailsDelete1.setText("Delete");

        invoiceEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        invoiceEdit.setText("Edit");
        invoiceEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceEditActionPerformed(evt);
            }
        });

        invoiceView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        invoiceView.setText("View");
        invoiceView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceViewActionPerformed(evt);
            }
        });

        invoiceAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        invoiceAdd.setText("Add");
        invoiceAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(invoiceAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoiceView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoiceEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventDetailsDelete1))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventDetailsDelete1)
                    .addComponent(invoiceEdit)
                    .addComponent(invoiceView)
                    .addComponent(invoiceAdd))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout InvoiceLayout = new javax.swing.GroupLayout(Invoice);
        Invoice.setLayout(InvoiceLayout);
        InvoiceLayout.setHorizontalGroup(
            InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InvoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        InvoiceLayout.setVerticalGroup(
            InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InvoiceLayout.createSequentialGroup()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        CardsPanel.add(Invoice, "cInvoice");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch3.setText("Search");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton29.setText("Sort");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch3)
                .addGap(298, 298, 298)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton29)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch3)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("EQUIPMENT PLANT");
        jLabel17.setOpaque(true);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        equipmentPlanDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        equipmentPlanDelete.setText("Delete");

        equipmentPlanEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        equipmentPlanEdit.setText("Edit");
        equipmentPlanEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentPlanEditActionPerformed(evt);
            }
        });

        equipmentPlanView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        equipmentPlanView.setText("View");
        equipmentPlanView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentPlanViewActionPerformed(evt);
            }
        });

        equipmentPlanAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        equipmentPlanAdd.setText("Add");
        equipmentPlanAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentPlanAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(equipmentPlanAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipmentPlanView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipmentPlanEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipmentPlanDelete))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipmentPlanDelete)
                    .addComponent(equipmentPlanEdit)
                    .addComponent(equipmentPlanView)
                    .addComponent(equipmentPlanAdd))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EquipmentPlanLayout = new javax.swing.GroupLayout(EquipmentPlan);
        EquipmentPlan.setLayout(EquipmentPlanLayout);
        EquipmentPlanLayout.setHorizontalGroup(
            EquipmentPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EquipmentPlanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EquipmentPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        EquipmentPlanLayout.setVerticalGroup(
            EquipmentPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EquipmentPlanLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CardsPanel.add(EquipmentPlan, "cEquipmentPlan");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch4.setText("Search");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton34.setText("Sort");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch4)
                .addGap(298, 298, 298)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton34)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch4)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ACTIVITY PLAN");
        jLabel18.setOpaque(true);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        activityPlanDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        activityPlanDelete.setText("Delete");

        activityPlanEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        activityPlanEdit.setText("Edit");
        activityPlanEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityPlanEditActionPerformed(evt);
            }
        });

        activityPlanView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        activityPlanView.setText("View");
        activityPlanView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityPlanViewActionPerformed(evt);
            }
        });

        activityPlanAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        activityPlanAdd.setText("Add");
        activityPlanAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityPlanAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(activityPlanAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activityPlanView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activityPlanEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activityPlanDelete))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityPlanDelete)
                    .addComponent(activityPlanEdit)
                    .addComponent(activityPlanView)
                    .addComponent(activityPlanAdd))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ActivityPlanLayout = new javax.swing.GroupLayout(ActivityPlan);
        ActivityPlan.setLayout(ActivityPlanLayout);
        ActivityPlanLayout.setHorizontalGroup(
            ActivityPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ActivityPlanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ActivityPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ActivityPlanLayout.setVerticalGroup(
            ActivityPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActivityPlanLayout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CardsPanel.add(ActivityPlan, "cActivityPlan");

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("FILES MANAGEMENT");
        jLabel19.setOpaque(true);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Event :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch5.setText("Search");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton39.setText("Sort");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch5)
                .addGap(298, 298, 298)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton39)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch5)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        eventFilesDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        eventFilesDelete.setText("Delete");

        eventFilesEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        eventFilesEdit.setText("Edit");
        eventFilesEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventFilesEditActionPerformed(evt);
            }
        });

        eventFilesView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        eventFilesView.setText("View");
        eventFilesView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventFilesViewActionPerformed(evt);
            }
        });

        eventFilesAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        eventFilesAdd.setText("Add");
        eventFilesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventFilesAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eventFilesAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventFilesView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventFilesEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventFilesDelete))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventFilesDelete)
                    .addComponent(eventFilesEdit)
                    .addComponent(eventFilesView)
                    .addComponent(eventFilesAdd))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Event Files", jPanel31);

        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch14.setText("Search");

        jComboBox31.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox32.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton40.setText("Sort");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch14)
                .addGap(298, 298, 298)
                .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton40)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch14)
                    .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        forwardedFilesDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        forwardedFilesDelete.setText("Delete");

        forwardedFilesEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        forwardedFilesEdit.setText("Edit");

        forwardedFilesAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        forwardedFilesAdd.setText("Add");
        forwardedFilesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardedFilesAddActionPerformed(evt);
            }
        });

        forwardedFilesApprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Hand-thumbs-up-like-icon.png"))); // NOI18N
        forwardedFilesApprove.setText("Approve");
        forwardedFilesApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardedFilesApproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(forwardedFilesAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forwardedFilesApprove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forwardedFilesEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forwardedFilesDelete))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forwardedFilesDelete)
                    .addComponent(forwardedFilesEdit)
                    .addComponent(forwardedFilesAdd)
                    .addComponent(forwardedFilesApprove))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jTable15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane15.setViewportView(jTable15);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Forwarded Files", jPanel32);

        javax.swing.GroupLayout FilesManagementLayout = new javax.swing.GroupLayout(FilesManagement);
        FilesManagement.setLayout(FilesManagementLayout);
        FilesManagementLayout.setHorizontalGroup(
            FilesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilesManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FilesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane2)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        FilesManagementLayout.setVerticalGroup(
            FilesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilesManagementLayout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        CardsPanel.add(FilesManagement, "cFilesManagement");

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch6.setText("Search");

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton44.setText("Sort");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch6)
                .addGap(298, 298, 298)
                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton44)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch6)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("EVENT BUDGET");
        jLabel20.setOpaque(true);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        budgetDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        budgetDelete.setText("Delete");

        budgetEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        budgetEdit.setText("Edit");
        budgetEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgetEditActionPerformed(evt);
            }
        });

        budgetView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        budgetView.setText("View");
        budgetView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgetViewActionPerformed(evt);
            }
        });

        budgetAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        budgetAdd.setText("Add");
        budgetAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgetAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(budgetAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(budgetView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(budgetEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(budgetDelete))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(budgetDelete)
                    .addComponent(budgetEdit)
                    .addComponent(budgetView)
                    .addComponent(budgetAdd))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EventBudgetLayout = new javax.swing.GroupLayout(EventBudget);
        EventBudget.setLayout(EventBudgetLayout);
        EventBudgetLayout.setHorizontalGroup(
            EventBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EventBudgetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        EventBudgetLayout.setVerticalGroup(
            EventBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventBudgetLayout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CardsPanel.add(EventBudget, "cEventBudget");

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable9);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch7.setText("Search");

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton49.setText("Sort");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch7)
                .addGap(298, 298, 298)
                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton49)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch7)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("CLIENTS PAYMENTS");
        jLabel21.setOpaque(true);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        clientpaymentsDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        clientpaymentsDelete.setText("Delete");

        clientpaymentsEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        clientpaymentsEdit.setText("Edit");
        clientpaymentsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientpaymentsEditActionPerformed(evt);
            }
        });

        clientpaymentsView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        clientpaymentsView.setText("View");
        clientpaymentsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientpaymentsViewActionPerformed(evt);
            }
        });

        clientpaymentsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        clientpaymentsAdd.setText("Add");
        clientpaymentsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientpaymentsAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clientpaymentsAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientpaymentsView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientpaymentsEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientpaymentsDelete))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientpaymentsDelete)
                    .addComponent(clientpaymentsEdit)
                    .addComponent(clientpaymentsView)
                    .addComponent(clientpaymentsAdd))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ClientPaymentsLayout = new javax.swing.GroupLayout(ClientPayments);
        ClientPayments.setLayout(ClientPaymentsLayout);
        ClientPaymentsLayout.setHorizontalGroup(
            ClientPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ClientPaymentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClientPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ClientPaymentsLayout.setVerticalGroup(
            ClientPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientPaymentsLayout.createSequentialGroup()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CardsPanel.add(ClientPayments, "cClientPayments");

        jLabel22.setBackground(new java.awt.Color(102, 102, 102));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("SUPPLIER OUTSTANDING");
        jLabel22.setOpaque(true);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch8.setText("Search");

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton54.setText("Sort");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch8)
                .addGap(298, 298, 298)
                .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch8)
                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        jButton55.setText("Delete");

        suppOutsItemEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        suppOutsItemEdit.setText("Edit");
        suppOutsItemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppOutsItemEditActionPerformed(evt);
            }
        });

        suppOutsItemView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        suppOutsItemView.setText("View");
        suppOutsItemView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppOutsItemViewActionPerformed(evt);
            }
        });

        suppOutsItemAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        suppOutsItemAdd.setText("Add");
        suppOutsItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppOutsItemAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(suppOutsItemAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suppOutsItemView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suppOutsItemEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton55))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton55)
                    .addComponent(suppOutsItemEdit)
                    .addComponent(suppOutsItemView)
                    .addComponent(suppOutsItemAdd))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Event Items", jPanel19);

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        jButton59.setText("Delete");

        suppPaymentsEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        suppPaymentsEdit.setText("Edit");
        suppPaymentsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppPaymentsEditActionPerformed(evt);
            }
        });

        suppPaymentsView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        suppPaymentsView.setText("View");
        suppPaymentsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppPaymentsViewActionPerformed(evt);
            }
        });

        suppPaymentsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        suppPaymentsAdd.setText("Add");
        suppPaymentsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppPaymentsAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(suppPaymentsAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suppPaymentsView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suppPaymentsEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton59))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton59)
                    .addComponent(suppPaymentsEdit)
                    .addComponent(suppPaymentsView)
                    .addComponent(suppPaymentsAdd))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch9.setText("Search");

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton63.setText("Sort");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch9)
                .addGap(298, 298, 298)
                .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch9)
                    .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton63))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTable10);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Supplier Payments", jPanel20);

        javax.swing.GroupLayout SupplierPaymentsLayout = new javax.swing.GroupLayout(SupplierPayments);
        SupplierPayments.setLayout(SupplierPaymentsLayout);
        SupplierPaymentsLayout.setHorizontalGroup(
            SupplierPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SupplierPaymentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        SupplierPaymentsLayout.setVerticalGroup(
            SupplierPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SupplierPaymentsLayout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        CardsPanel.add(SupplierPayments, "cSupplierPayments");

        jLabel23.setBackground(new java.awt.Color(102, 102, 102));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CLIENTS MANAGEMENT");
        jLabel23.setOpaque(true);

        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        clientDetailsDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        clientDetailsDelete.setText("Delete");
        clientDetailsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientDetailsDeleteActionPerformed(evt);
            }
        });

        clientDetailsEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        clientDetailsEdit.setText("Edit");
        clientDetailsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientDetailsEditActionPerformed(evt);
            }
        });

        clientDetailsView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        clientDetailsView.setText("View");
        clientDetailsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientDetailsViewActionPerformed(evt);
            }
        });

        clientDetailsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        clientDetailsAdd.setText("Add");
        clientDetailsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientDetailsAddActionPerformed(evt);
            }
        });

        CMRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Button-Refresh-icon.png"))); // NOI18N
        CMRefresh.setText("Refresh");
        CMRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CMRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clientDetailsAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientDetailsView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientDetailsEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientDetailsDelete))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientDetailsDelete)
                    .addComponent(clientDetailsEdit)
                    .addComponent(clientDetailsView)
                    .addComponent(clientDetailsAdd)
                    .addComponent(CMRefresh))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch16.setText("Search");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch16, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        clientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientDetailsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(clientDetails);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Client Details", jPanel4);

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch10.setText("Search");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        comMemberDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        comMemberDelete.setText("Delete");

        comMemberEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        comMemberEdit.setText("Edit");
        comMemberEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comMemberEditActionPerformed(evt);
            }
        });

        comMemberView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        comMemberView.setText("View");
        comMemberView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comMemberViewActionPerformed(evt);
            }
        });

        comMemberAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        comMemberAdd.setText("Add");
        comMemberAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comMemberAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 781, Short.MAX_VALUE)
                .addComponent(comMemberAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comMemberView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comMemberEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comMemberDelete))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comMemberDelete)
                    .addComponent(comMemberEdit)
                    .addComponent(comMemberView)
                    .addComponent(comMemberAdd))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable11);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Committee Members", jPanel6);

        javax.swing.GroupLayout ClientsManagementLayout = new javax.swing.GroupLayout(ClientsManagement);
        ClientsManagement.setLayout(ClientsManagementLayout);
        ClientsManagementLayout.setHorizontalGroup(
            ClientsManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ClientsManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        ClientsManagementLayout.setVerticalGroup(
            ClientsManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientsManagementLayout.createSequentialGroup()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        CardsPanel.add(ClientsManagement, "cClientsManagement");

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        supplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierTableMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(supplierTable);

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch11.setText("Search");

        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton69.setText("Sort");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch11)
                .addGap(298, 298, 298)
                .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton69)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch11)
                    .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setBackground(new java.awt.Color(102, 102, 102));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("SUPPLIERS MANAGEMENT");
        jLabel24.setOpaque(true);

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        supplierDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        supplierDelete.setText("Delete");
        supplierDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDeleteActionPerformed(evt);
            }
        });

        supplierEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        supplierEdit.setText("Edit");
        supplierEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierEditActionPerformed(evt);
            }
        });

        supplierView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        supplierView.setText("View");
        supplierView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierViewActionPerformed(evt);
            }
        });

        supplierAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        supplierAdd.setText("Add");
        supplierAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAddActionPerformed(evt);
            }
        });

        supplierRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Button-Refresh-icon.png"))); // NOI18N
        supplierRefresh.setText("Refresh");
        supplierRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supplierRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supplierAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierDelete))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierDelete)
                    .addComponent(supplierEdit)
                    .addComponent(supplierView)
                    .addComponent(supplierAdd)
                    .addComponent(supplierRefresh))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SuppliersManagementLayout = new javax.swing.GroupLayout(SuppliersManagement);
        SuppliersManagement.setLayout(SuppliersManagementLayout);
        SuppliersManagementLayout.setHorizontalGroup(
            SuppliersManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SuppliersManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SuppliersManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        SuppliersManagementLayout.setVerticalGroup(
            SuppliersManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SuppliersManagementLayout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CardsPanel.add(SuppliersManagement, "cSuppliersManagement");

        employeeDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(employeeDetails);

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch12.setText("Search");

        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton74.setText("Sort");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch12)
                .addGap(298, 298, 298)
                .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton74)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch12)
                    .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setBackground(new java.awt.Color(102, 102, 102));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("EMPLOYEES MANAGEMENT");
        jLabel25.setOpaque(true);

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        jButton75.setText("Delete");

        employeeEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        employeeEdit.setText("Edit");
        employeeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeEditActionPerformed(evt);
            }
        });

        employeeView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        employeeView.setText("View");
        employeeView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeViewActionPerformed(evt);
            }
        });

        employeeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        employeeAdd.setText("Add");
        employeeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(employeeAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton75))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton75)
                    .addComponent(employeeEdit)
                    .addComponent(employeeView)
                    .addComponent(employeeAdd))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EmployeeManagementLayout = new javax.swing.GroupLayout(EmployeeManagement);
        EmployeeManagement.setLayout(EmployeeManagementLayout);
        EmployeeManagementLayout.setHorizontalGroup(
            EmployeeManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EmployeeManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmployeeManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        EmployeeManagementLayout.setVerticalGroup(
            EmployeeManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeManagementLayout.createSequentialGroup()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CardsPanel.add(EmployeeManagement, "cEmployeeManagement");

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder("Search | Sort"));

        homeSearchTypes13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Location", "Client" }));

        btnhomeSearch13.setText("Search");

        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton79.setText("Sort");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSearch13, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeSearchTypes13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnhomeSearch13)
                .addGap(298, 298, 298)
                .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton79)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeSearch13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeSearchTypes13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhomeSearch13)
                    .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setBackground(new java.awt.Color(102, 102, 102));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("USERS MANAGEMENT");
        jLabel26.setOpaque(true);

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnUserDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        btnUserDelete.setText("Delete");
        btnUserDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDeleteActionPerformed(evt);
            }
        });

        userEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/setting-icon.png"))); // NOI18N
        userEdit.setText("Edit");
        userEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userEditActionPerformed(evt);
            }
        });

        btnViewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Dj-View-icon.png"))); // NOI18N
        btnViewUser.setText("View");
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });

        userManAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add.png"))); // NOI18N
        userManAdd.setText("Add");
        userManAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userManAddActionPerformed(evt);
            }
        });

        UMRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Button-Refresh-icon.png"))); // NOI18N
        UMRefresh.setText("Refresh");
        UMRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UMRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UMRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userManAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUserDelete))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserDelete)
                    .addComponent(userEdit)
                    .addComponent(btnViewUser)
                    .addComponent(userManAdd)
                    .addComponent(UMRefresh))
                .addGap(7, 7, 7))
        );

        userDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        userDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(userDetailsTable);

        javax.swing.GroupLayout UserManagementLayout = new javax.swing.GroupLayout(UserManagement);
        UserManagement.setLayout(UserManagementLayout);
        UserManagementLayout.setHorizontalGroup(
            UserManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(UserManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UserManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane17))
                .addContainerGap())
        );
        UserManagementLayout.setVerticalGroup(
            UserManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserManagementLayout.createSequentialGroup()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        CardsPanel.add(UserManagement, "cUsersManagement");

        StatusBar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Logged in as :");

        lblLoggedInUser.setText("jLabel12");

        lblDate.setText("jLabel12");

        lblTime.setText("jLabel13");

        javax.swing.GroupLayout StatusBarLayout = new javax.swing.GroupLayout(StatusBar);
        StatusBar.setLayout(StatusBarLayout);
        StatusBarLayout.setHorizontalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusBarLayout.createSequentialGroup()
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoggedInUser, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        StatusBarLayout.setVerticalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLoggedInUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(NavigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, Short.MAX_VALUE))
            .addComponent(StatusBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NavigationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cHomePanel");
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnEventDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventDetailsActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cEventDetails");
    }//GEN-LAST:event_btnEventDetailsActionPerformed

    private void btnInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cInvoice");
    }//GEN-LAST:event_btnInvoiceActionPerformed

    private void btnClientPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientPaymentsActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cClientPayments");
    }//GEN-LAST:event_btnClientPaymentsActionPerformed

    private void btnEventBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventBudgetActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cEventBudget");
    }//GEN-LAST:event_btnEventBudgetActionPerformed

    private void btnActivityPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivityPlanActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cActivityPlan");
    }//GEN-LAST:event_btnActivityPlanActionPerformed

    private void btnEquipmentPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipmentPlanActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cEquipmentPlan");
    }//GEN-LAST:event_btnEquipmentPlanActionPerformed

    private void btnFileManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileManagementActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cFilesManagement");
    }//GEN-LAST:event_btnFileManagementActionPerformed

    private void btnSupplierOutstandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierOutstandingActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cSupplierPayments");
    }//GEN-LAST:event_btnSupplierOutstandingActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cClientsManagement");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cUsersManagement");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cSuppliersManagement");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        CardLayout cl = (CardLayout) (CardsPanel.getLayout());
        cl.show(CardsPanel, "cEmployeeManagement");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void eventDetailsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventDetailsAddActionPerformed
        AddEventDetails frm = new AddEventDetails();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_eventDetailsAddActionPerformed

    private void eventDetailsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventDetailsViewActionPerformed
        ViewEventDetails frm = new ViewEventDetails();
        frm.showEventDetails(selectedEventDetailsId);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_eventDetailsViewActionPerformed

    private void eventDetailsEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventDetailsEditActionPerformed
        EditEventDetails frm = new EditEventDetails();
        frm.showEventDetails(selectedEventDetailsId);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_eventDetailsEditActionPerformed

    private void equipmentPlanAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentPlanAddActionPerformed
        EPChooseEvent frm = new EPChooseEvent();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_equipmentPlanAddActionPerformed

    private void equipmentPlanEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentPlanEditActionPerformed
        EditEquipmentPlan frm = new EditEquipmentPlan();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_equipmentPlanEditActionPerformed

    private void equipmentPlanViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentPlanViewActionPerformed
        ViewEquipmentPlan frm = new ViewEquipmentPlan();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_equipmentPlanViewActionPerformed

    private void activityPlanAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityPlanAddActionPerformed
        APChooseEvent frm = new APChooseEvent();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_activityPlanAddActionPerformed

    private void activityPlanEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityPlanEditActionPerformed
        EditActivityPlan frm = new EditActivityPlan();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_activityPlanEditActionPerformed

    private void activityPlanViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityPlanViewActionPerformed
        ViewActivityPlan frm = new ViewActivityPlan();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_activityPlanViewActionPerformed

    private void eventFilesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventFilesAddActionPerformed
        AddEventFiles frm = new AddEventFiles();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_eventFilesAddActionPerformed

    private void eventFilesViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventFilesViewActionPerformed
        ViewEventFiles frm = new ViewEventFiles();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);       
    }//GEN-LAST:event_eventFilesViewActionPerformed

    private void eventFilesEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventFilesEditActionPerformed
        EditEventFiles frm = new EditEventFiles();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);   
    }//GEN-LAST:event_eventFilesEditActionPerformed

    private void forwardedFilesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardedFilesAddActionPerformed
        AddForwardedFiles frm = new AddForwardedFiles();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);  
    }//GEN-LAST:event_forwardedFilesAddActionPerformed

    private void forwardedFilesApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardedFilesApproveActionPerformed
        ViewForwardedFiles frm = new ViewForwardedFiles();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE); 
    }//GEN-LAST:event_forwardedFilesApproveActionPerformed

    private void homeCompletionSliderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_homeCompletionSliderPropertyChange

    }//GEN-LAST:event_homeCompletionSliderPropertyChange

    private void invoiceEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceEditActionPerformed
        EditInvoice frm = new EditInvoice();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_invoiceEditActionPerformed

    private void invoiceViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceViewActionPerformed

    }//GEN-LAST:event_invoiceViewActionPerformed

    private void invoiceAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceAddActionPerformed
        InvoiceChooseDetails frm = new InvoiceChooseDetails();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_invoiceAddActionPerformed

    private void budgetAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgetAddActionPerformed
        AddBudget frm = new AddBudget();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_budgetAddActionPerformed

    private void budgetViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgetViewActionPerformed
        ViewBudget frm = new ViewBudget();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_budgetViewActionPerformed

    private void budgetEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgetEditActionPerformed
        EditBudget frm = new EditBudget();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_budgetEditActionPerformed

    private void clientpaymentsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientpaymentsAddActionPerformed
        AddClientPayment frm = new AddClientPayment();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_clientpaymentsAddActionPerformed

    private void clientpaymentsEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientpaymentsEditActionPerformed
        EditClientPayment frm = new EditClientPayment();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_clientpaymentsEditActionPerformed

    private void clientpaymentsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientpaymentsViewActionPerformed
        ViewClientPayment frm = new ViewClientPayment();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_clientpaymentsViewActionPerformed

    private void suppOutsItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppOutsItemAddActionPerformed
        AddSupplierItem frm = new AddSupplierItem();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_suppOutsItemAddActionPerformed

    private void suppOutsItemViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppOutsItemViewActionPerformed
        ViewSupplierItem frm = new ViewSupplierItem();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_suppOutsItemViewActionPerformed

    private void suppOutsItemEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppOutsItemEditActionPerformed
        EditSupplierItem frm = new EditSupplierItem();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_suppOutsItemEditActionPerformed

    private void clientDetailsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientDetailsAddActionPerformed
        AddClient frm = new AddClient();
        frm.setCurrentUser(currentUser);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_clientDetailsAddActionPerformed

    private void clientDetailsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientDetailsViewActionPerformed
        ViewClient frm = new ViewClient();
        frm.showClientDetails(selectedClientDetailsId);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_clientDetailsViewActionPerformed

    private void clientDetailsEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientDetailsEditActionPerformed
        EditClient frm = new EditClient();
        frm.showClientDetails(selectedClientDetailsId);
        frm.setCurrentUser(currentUser);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_clientDetailsEditActionPerformed

    private void comMemberAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comMemberAddActionPerformed
        AddCommitteeMember frm = new AddCommitteeMember();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_comMemberAddActionPerformed

    private void comMemberViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comMemberViewActionPerformed
        ViewCommitteeMember frm = new ViewCommitteeMember();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_comMemberViewActionPerformed

    private void comMemberEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comMemberEditActionPerformed
        EditCommitteeMember frm = new EditCommitteeMember();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_comMemberEditActionPerformed

    private void supplierAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAddActionPerformed
        AddSupplier frm = new AddSupplier();
        frm.setCurrentUser(currentUser);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_supplierAddActionPerformed

    private void supplierViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierViewActionPerformed
        ViewSupplier frm = new ViewSupplier();
        frm.showSupplierDetails(selectedSupplierDetailsId);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_supplierViewActionPerformed

    private void supplierEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierEditActionPerformed
        EditSupplier frm = new EditSupplier();
        frm.setCurrentUser(currentUser);
        frm.showSupplierDetails(selectedSupplierDetailsId);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_supplierEditActionPerformed

    private void employeeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeAddActionPerformed
        AddEmployee frm = new AddEmployee();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_employeeAddActionPerformed

    private void employeeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeEditActionPerformed
        EditEmployee frm = new EditEmployee();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_employeeEditActionPerformed

    private void employeeViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeViewActionPerformed
        ViewEmployee frm = new ViewEmployee();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_employeeViewActionPerformed

    private void userManAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userManAddActionPerformed
        AddUser frm = new AddUser();
        frm.setLocationRelativeTo ( null );
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_userManAddActionPerformed

    private void userEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userEditActionPerformed
        EditUser frm = new EditUser();
        frm.showUserDetails(selectedUserDetailsId);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_userEditActionPerformed

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        ViewUser frm = new ViewUser();
        frm.showUserDetails(selectedUserDetailsId);
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void suppPaymentsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppPaymentsAddActionPerformed
        AddSupplierPayment frm = new AddSupplierPayment();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_suppPaymentsAddActionPerformed

    private void suppPaymentsEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppPaymentsEditActionPerformed
        EditSupplierPayment frm = new EditSupplierPayment();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_suppPaymentsEditActionPerformed

    private void suppPaymentsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppPaymentsViewActionPerformed
        ViewSupplierPayment frm = new ViewSupplierPayment();
        frm.setLocationRelativeTo ( null );
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_suppPaymentsViewActionPerformed

    private void EDRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDRefreshActionPerformed
        loadEventDetailsTable();
        lblStatus.setText("Event details table has been refreshed");
    }//GEN-LAST:event_EDRefreshActionPerformed

    private void eventDetailsMainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventDetailsMainTableMouseClicked
        selectRowEventDetails();
        eventDetailsView.setEnabled(true);
    }//GEN-LAST:event_eventDetailsMainTableMouseClicked

    private void eventDetailsDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventDetailsDeleteActionPerformed
        selectRowEventDetails();
        EventDetailsDAO dao = new EventDetailsDAO();
        dao.deleteEvent(selectedEventDetailsId);
        loadEventDetailsTable();
    }//GEN-LAST:event_eventDetailsDeleteActionPerformed

    private void EDsearchKeywordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EDsearchKeywordKeyTyped

    }//GEN-LAST:event_EDsearchKeywordKeyTyped

    private void EDsearchKeywordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EDsearchKeywordKeyReleased
        EventDetailsDAO dao = new EventDetailsDAO();
        int searchType = EDSearchType.getSelectedIndex();
        if (searchType == 0) {  //Search by event name
        data_eventDetails = dao.searchEventDetailsEventName(EDsearchKeyword.getText());

        eventDetailsMainTable.setModel(new javax.swing.table.DefaultTableModel(
                data_eventDetails, header_eventDetails));
        jScrollPane3.setViewportView(eventDetailsMainTable);
        }
        else if (searchType == 1) { //Search by event location
        data_eventDetails = dao.searchEventDetailsLocation(EDsearchKeyword.getText());

        eventDetailsMainTable.setModel(new javax.swing.table.DefaultTableModel(
                data_eventDetails, header_eventDetails));
        jScrollPane3.setViewportView(eventDetailsMainTable);
        }
        else if (searchType == 2) {    //Search by client name
        data_eventDetails = dao.searchEventDetailsClientName(EDsearchKeyword.getText());

        eventDetailsMainTable.setModel(new javax.swing.table.DefaultTableModel(
                data_eventDetails, header_eventDetails));
        jScrollPane3.setViewportView(eventDetailsMainTable);
        }
    }//GEN-LAST:event_EDsearchKeywordKeyReleased

    private void btnUserDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDeleteActionPerformed
        UserManagementDAO dao = new UserManagementDAO();
        dao.deleteUser(selectedUserDetailsId);
    }//GEN-LAST:event_btnUserDeleteActionPerformed

    private void UMRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UMRefreshActionPerformed
        loadUserManagementTable();
        lblStatus.setText("User details table has been refreshed");
    }//GEN-LAST:event_UMRefreshActionPerformed

    private void CMRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMRefreshActionPerformed
        loadClientDetailsTable();
    }//GEN-LAST:event_CMRefreshActionPerformed

    private void clientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientDetailsMouseClicked
        selectRowClientDetails();
    }//GEN-LAST:event_clientDetailsMouseClicked

    private void clientDetailsDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientDetailsDeleteActionPerformed
        ClientDetailsDAO dao = new ClientDetailsDAO();
        dao.deleteClient(selectedClientDetailsId);
        loadClientDetailsTable();
    }//GEN-LAST:event_clientDetailsDeleteActionPerformed

    private void userDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userDetailsTableMouseClicked
        selectRowUserDetails();
    }//GEN-LAST:event_userDetailsTableMouseClicked

    private void supplierRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierRefreshActionPerformed
        loadSupplierDetailsTable();
    }//GEN-LAST:event_supplierRefreshActionPerformed

    private void supplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTableMouseClicked
        selectRowSupplierDetails();
        System.out.println(selectedSupplierDetailsId);
    }//GEN-LAST:event_supplierTableMouseClicked

    private void supplierDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDeleteActionPerformed
        SupplierDetailsDAO dao = new SupplierDetailsDAO();
        dao.deleteSupplier(selectedSupplierDetailsId);
        loadSupplierDetailsTable();
    }//GEN-LAST:event_supplierDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);

            }
        });
    }

    public void loadEventDetailsTable() {

        EventDetailsDAO dao = new EventDetailsDAO();
        data_eventDetails = dao.getEventDetails();

        eventDetailsMainTable.setModel(new javax.swing.table.DefaultTableModel(
                data_eventDetails, header_eventDetails));
        jScrollPane3.setViewportView(eventDetailsMainTable);
    }
    
    private void selectRowEventDetails() {

        //retrieving the selected row index
        int row = eventDetailsMainTable.getSelectedRow();

        //if a single row is selected from the table, take each cell values into the controls
        if (eventDetailsMainTable.getRowSelectionAllowed()) {

            selectedEventDetailsId = Integer.parseInt(eventDetailsMainTable.getValueAt(row, 0).toString());

        }
    }

    public void loadUserManagementTable() {

        UserManagementDAO dao = new UserManagementDAO();
        data_userManagement = dao.getUserDetails();

        userDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
                data_userManagement, header_userManagement));
        jScrollPane17.setViewportView(userDetailsTable);
    }
    
    private void selectRowUserDetails() {

        //retrieving the selected row index
        int row = userDetailsTable.getSelectedRow();

        //if a single row is selected from the table, take each cell values into the controls
        if (userDetailsTable.getRowSelectionAllowed()) {

            selectedUserDetailsId = Integer.parseInt(userDetailsTable.getValueAt(row, 0).toString());

        }
        System.out.println("Selected row ID :"+selectedUserDetailsId);
    }
    
    public void loadClientDetailsTable() {

        ClientDetailsDAO dao = new ClientDetailsDAO();
        data_clientDetails = dao.getClientDetails();

        clientDetails.setModel(new javax.swing.table.DefaultTableModel(
                data_clientDetails, header_clientDetails));
        jScrollPane4.setViewportView(clientDetails);
    }
        
    private void selectRowClientDetails() {

        //retrieving the selected row index
        int row = clientDetails.getSelectedRow();

        //if a single row is selected from the table, take each cell values into the controls
        if (clientDetails.getRowSelectionAllowed()) {

            selectedClientDetailsId = Integer.parseInt(clientDetails.getValueAt(row, 0).toString());

        }
    }
    
        public void loadEmployeeDetailsTable() {

        EmployeeManagementDAO dao = new EmployeeManagementDAO();
        data_employeeDetails = dao.getEmployeeDetails();

        employeeDetails.setModel(new javax.swing.table.DefaultTableModel(
                data_employeeDetails, header_employeeDetails));
        jScrollPane13.setViewportView(employeeDetails);
    }
        
    public void loadSupplierDetailsTable() {

        SupplierDetailsDAO dao = new SupplierDetailsDAO();
        data_supplierDetails = dao.getSupplierDetails();

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
                data_supplierDetails, header_supplierDetails));
        jScrollPane12.setViewportView(supplierTable);
    }
    
    private void selectRowSupplierDetails() {

        //retrieving the selected row index
        int row = supplierTable.getSelectedRow();

        //if a single row is selected from the table, take each cell values into the controls
        if (supplierTable.getRowSelectionAllowed()) {

            selectedSupplierDetailsId = Integer.parseInt(supplierTable.getValueAt(row, 0).toString());

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityPlan;
    private javax.swing.JPanel BasePanel;
    private javax.swing.JButton CMRefresh;
    private javax.swing.JPanel CardsPanel;
    private javax.swing.JPanel ClientPayments;
    private javax.swing.JPanel ClientsManagement;
    private javax.swing.JButton EDRefresh;
    private javax.swing.JComboBox EDSearchType;
    private javax.swing.JTextField EDsearchKeyword;
    private javax.swing.JPanel EmployeeManagement;
    private javax.swing.JPanel EquipmentPlan;
    private javax.swing.JPanel EventBudget;
    private javax.swing.JPanel EventDetails;
    private javax.swing.JPanel FilesManagement;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Invoice;
    private javax.swing.JPanel NavigationPanel;
    private javax.swing.JPanel StatusBar;
    private javax.swing.JPanel SupplierPayments;
    private javax.swing.JPanel SuppliersManagement;
    private javax.swing.JButton UMRefresh;
    private javax.swing.JPanel UserManagement;
    private javax.swing.JButton activityPlanAdd;
    private javax.swing.JButton activityPlanDelete;
    private javax.swing.JButton activityPlanEdit;
    private javax.swing.JButton activityPlanView;
    private javax.swing.JButton btnActivityPlan;
    private javax.swing.JButton btnClientPayments;
    private javax.swing.JButton btnEquipmentPlan;
    private javax.swing.JButton btnEventBudget;
    private javax.swing.JButton btnEventDetails;
    private javax.swing.JButton btnFileManagement;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInvoice;
    private javax.swing.JButton btnSupplierOutstanding;
    private javax.swing.JButton btnUserDelete;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JButton btnhomeSearch;
    private javax.swing.JButton btnhomeSearch10;
    private javax.swing.JButton btnhomeSearch11;
    private javax.swing.JButton btnhomeSearch12;
    private javax.swing.JButton btnhomeSearch13;
    private javax.swing.JButton btnhomeSearch14;
    private javax.swing.JButton btnhomeSearch15;
    private javax.swing.JButton btnhomeSearch16;
    private javax.swing.JButton btnhomeSearch3;
    private javax.swing.JButton btnhomeSearch4;
    private javax.swing.JButton btnhomeSearch5;
    private javax.swing.JButton btnhomeSearch6;
    private javax.swing.JButton btnhomeSearch7;
    private javax.swing.JButton btnhomeSearch8;
    private javax.swing.JButton btnhomeSearch9;
    private javax.swing.JButton budgetAdd;
    private javax.swing.JButton budgetDelete;
    private javax.swing.JButton budgetEdit;
    private javax.swing.JButton budgetView;
    private javax.swing.JTable clientDetails;
    private javax.swing.JButton clientDetailsAdd;
    private javax.swing.JButton clientDetailsDelete;
    private javax.swing.JButton clientDetailsEdit;
    private javax.swing.JButton clientDetailsView;
    private javax.swing.JButton clientpaymentsAdd;
    private javax.swing.JButton clientpaymentsDelete;
    private javax.swing.JButton clientpaymentsEdit;
    private javax.swing.JButton clientpaymentsView;
    private javax.swing.JButton comMemberAdd;
    private javax.swing.JButton comMemberDelete;
    private javax.swing.JButton comMemberEdit;
    private javax.swing.JButton comMemberView;
    private javax.swing.JButton employeeAdd;
    private javax.swing.JTable employeeDetails;
    private javax.swing.JButton employeeEdit;
    private javax.swing.JButton employeeView;
    private javax.swing.JButton equipmentPlanAdd;
    private javax.swing.JButton equipmentPlanDelete;
    private javax.swing.JButton equipmentPlanEdit;
    private javax.swing.JButton equipmentPlanView;
    private javax.swing.JButton eventDetailsAdd;
    private javax.swing.JButton eventDetailsDelete;
    private javax.swing.JButton eventDetailsDelete1;
    private javax.swing.JButton eventDetailsEdit;
    private javax.swing.JTable eventDetailsMainTable;
    private javax.swing.JButton eventDetailsView;
    private javax.swing.JButton eventFilesAdd;
    private javax.swing.JButton eventFilesDelete;
    private javax.swing.JButton eventFilesEdit;
    private javax.swing.JButton eventFilesView;
    private javax.swing.JButton forwardedFilesAdd;
    private javax.swing.JButton forwardedFilesApprove;
    private javax.swing.JButton forwardedFilesDelete;
    private javax.swing.JButton forwardedFilesEdit;
    private javax.swing.JComboBox homeClientList;
    private javax.swing.JSlider homeCompletionSlider;
    private javax.swing.JTextField homeSearch;
    private javax.swing.JTextField homeSearch10;
    private javax.swing.JTextField homeSearch11;
    private javax.swing.JTextField homeSearch12;
    private javax.swing.JTextField homeSearch13;
    private javax.swing.JTextField homeSearch14;
    private javax.swing.JTextField homeSearch15;
    private javax.swing.JTextField homeSearch16;
    private javax.swing.JTextField homeSearch3;
    private javax.swing.JTextField homeSearch4;
    private javax.swing.JTextField homeSearch5;
    private javax.swing.JTextField homeSearch6;
    private javax.swing.JTextField homeSearch7;
    private javax.swing.JTextField homeSearch8;
    private javax.swing.JTextField homeSearch9;
    private javax.swing.JComboBox homeSearchTypes;
    private javax.swing.JComboBox homeSearchTypes10;
    private javax.swing.JComboBox homeSearchTypes11;
    private javax.swing.JComboBox homeSearchTypes12;
    private javax.swing.JComboBox homeSearchTypes13;
    private javax.swing.JComboBox homeSearchTypes14;
    private javax.swing.JComboBox homeSearchTypes15;
    private javax.swing.JComboBox homeSearchTypes16;
    private javax.swing.JComboBox homeSearchTypes3;
    private javax.swing.JComboBox homeSearchTypes4;
    private javax.swing.JComboBox homeSearchTypes5;
    private javax.swing.JComboBox homeSearchTypes6;
    private javax.swing.JComboBox homeSearchTypes7;
    private javax.swing.JComboBox homeSearchTypes8;
    private javax.swing.JComboBox homeSearchTypes9;
    private javax.swing.JButton invoiceAdd;
    private javax.swing.JButton invoiceEdit;
    private javax.swing.JButton invoiceView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton79;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox jComboBox18;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JComboBox jComboBox21;
    private javax.swing.JComboBox jComboBox22;
    private javax.swing.JComboBox jComboBox25;
    private javax.swing.JComboBox jComboBox26;
    private javax.swing.JComboBox jComboBox27;
    private javax.swing.JComboBox jComboBox28;
    private javax.swing.JComboBox jComboBox29;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox30;
    private javax.swing.JComboBox jComboBox31;
    private javax.swing.JComboBox jComboBox32;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLoggedInUser;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTime;
    private javax.swing.JButton suppOutsItemAdd;
    private javax.swing.JButton suppOutsItemEdit;
    private javax.swing.JButton suppOutsItemView;
    private javax.swing.JButton suppPaymentsAdd;
    private javax.swing.JButton suppPaymentsEdit;
    private javax.swing.JButton suppPaymentsView;
    private javax.swing.JButton supplierAdd;
    private javax.swing.JButton supplierDelete;
    private javax.swing.JButton supplierEdit;
    private javax.swing.JButton supplierRefresh;
    private javax.swing.JTable supplierTable;
    private javax.swing.JButton supplierView;
    private javax.swing.JTable userDetailsTable;
    private javax.swing.JButton userEdit;
    private javax.swing.JButton userManAdd;
    // End of variables declaration//GEN-END:variables
}
