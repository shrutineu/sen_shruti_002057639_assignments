/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;
//import model.PersonDirectory;

/**
 *
 * @author shrutisen
 */
public class ListPersonJPanel extends javax.swing.JPanel {

    PersonDirectory personList;

    /**
     * Creates new form ListPersonsJPanel
     */
    public ListPersonJPanel(PersonDirectory personList) {
        initComponents();
        
        this.personList = personList;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblLastName = new javax.swing.JLabel();
        lblAnnualSalary = new javax.swing.JLabel();
        lblWorkStreetAddress = new javax.swing.JLabel();
        lblworkAddress = new javax.swing.JLabel();
        lblHomeCity = new javax.swing.JLabel();
        lblHomeState = new javax.swing.JLabel();
        lblHomezipCode = new javax.swing.JLabel();
        lblWorkCity = new javax.swing.JLabel();
        lblHomeUnitNumber = new javax.swing.JLabel();
        lblWorkState = new javax.swing.JLabel();
        lblHomeAddress = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonRecords = new javax.swing.JTable();
        lblWorkzipCode = new javax.swing.JLabel();
        lblWorkBuildingName = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblHomeStreetAddress = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        lblSocialSecurityNumber = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAnnualSalary = new javax.swing.JTextField();
        txtWorkStreetAddress = new javax.swing.JTextField();
        txtWorkBuildingName = new javax.swing.JTextField();
        txtWorkCity = new javax.swing.JTextField();
        txtWorkState = new javax.swing.JTextField();
        txtWorkPostalCode = new javax.swing.JTextField();
        txtHomeStreetAddress = new javax.swing.JTextField();
        txtHomeUnitNumber = new javax.swing.JTextField();
        txtHomeCity = new javax.swing.JTextField();
        txtHomeState = new javax.swing.JTextField();
        txtHomeZip = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnBack.setText("Main Menu");

        btnSearch.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnBack)
                .addGap(42, 42, 42)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        lblLastName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblLastName.setText("Last Name");

        lblAnnualSalary.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblAnnualSalary.setText("Annual Salary");

        lblWorkStreetAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblWorkStreetAddress.setText("Street Address");

        lblworkAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblworkAddress.setText("Work Address");

        lblHomeCity.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHomeCity.setText("City");

        lblHomeState.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHomeState.setText("State");

        lblHomezipCode.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHomezipCode.setText("ZipCode");

        lblWorkCity.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblWorkCity.setText("City");

        lblHomeUnitNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHomeUnitNumber.setText("Unit Number");

        lblWorkState.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblWorkState.setText("State");

        lblHomeAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHomeAddress.setText("Home Address");

        lblFirstName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblFirstName.setText("First Name");

        tblPersonRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Home City", "Home ZipCode", "Work City", "Work ZipCode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersonRecords);

        lblWorkzipCode.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblWorkzipCode.setText("ZipCode");

        lblWorkBuildingName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblWorkBuildingName.setText("Building Name");

        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblHomeStreetAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHomeStreetAddress.setText("Street Address");

        btnView.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblSocialSecurityNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSocialSecurityNumber.setText("Social Security Number");

        lblDOB.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDOB.setText("Date Of Birth");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblWorkState, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtWorkState, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblWorkBuildingName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtWorkBuildingName))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblWorkStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtWorkStreetAddress))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblWorkCity, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtWorkCity))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblWorkzipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtWorkPostalCode))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lblworkAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHomeUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHomeCity, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHomeState, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHomezipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHomeUnitNumber)
                            .addComponent(txtHomeCity)
                            .addComponent(txtHomeState)
                            .addComponent(txtHomeZip, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblHomeStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHomeStreetAddress))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGap(129, 129, 129))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSocialSecurityNumber)
                    .addComponent(lblDOB)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(txtDOB)
                    .addComponent(txtSSN))
                .addGap(209, 209, 209)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnnualSalary)
                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(txtAnnualSalary))
                .addGap(174, 174, 174))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnView))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblLastName)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDOB)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnnualSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnnualSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeAddress)
                            .addComponent(lblworkAddress))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeStreetAddress)
                            .addComponent(lblWorkStreetAddress)
                            .addComponent(txtWorkStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomeStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeUnitNumber)
                            .addComponent(lblWorkBuildingName)
                            .addComponent(txtWorkBuildingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomeUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeCity)
                            .addComponent(lblWorkCity)
                            .addComponent(txtWorkCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomeCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblWorkState)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeState)
                            .addComponent(txtWorkState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomeState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHomezipCode)
                    .addComponent(lblWorkzipCode)
                    .addComponent(txtWorkPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHomeZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPersonRecords.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete Account Details?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Person person = (Person) tblPersonRecords.getValueAt(selectedRow, 0);
                personList.deletePerson(person);
                populateTable();

            }

        }

        else{
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPersonRecords.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblPersonRecords.getModel();
        Person person = (Person) model.getValueAt(selectedRowIndex, 0);

        txtFirstName.setText(String.valueOf(person.getFirstName()));
        txtLastName.setText(String.valueOf(person.getLastName()));
        txtSSN.setText(String.valueOf(person.getSocialSecurityNumber()));
        txtDOB.setText(String.valueOf(person.getDOB()));
        txtAnnualSalary.setText(String.valueOf(person.getAnnualSalary()));
         
       
        txtHomeCity.setText(String.valueOf(person.getHomeAddress().getCity()));
        txtHomeState.setText(String.valueOf(person.getHomeAddress().getState()));
        txtHomeStreetAddress.setText(String.valueOf(person.getHomeAddress().getStreetAddress()));
        txtHomeZip.setText(String.valueOf(person.getHomeAddress().getPostalCode()));
        txtHomeUnitNumber.setText(String.valueOf(person.getHomeAddress().getUnitNumber()));

        txtWorkCity.setText(String.valueOf(person.getWorkAddress().getCity()));
        txtWorkState.setText(String.valueOf(person.getWorkAddress().getState()));
        txtWorkStreetAddress.setText(String.valueOf(person.getWorkAddress().getStreetAddress()));
        txtWorkPostalCode.setText(String.valueOf(person.getWorkAddress().getPostalCode()));
        txtWorkBuildingName.setText(String.valueOf(person.getWorkAddress().getUnitNumber()));
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnnualSalary;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHomeAddress;
    private javax.swing.JLabel lblHomeCity;
    private javax.swing.JLabel lblHomeState;
    private javax.swing.JLabel lblHomeStreetAddress;
    private javax.swing.JLabel lblHomeUnitNumber;
    private javax.swing.JLabel lblHomezipCode;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSocialSecurityNumber;
    private javax.swing.JLabel lblWorkBuildingName;
    private javax.swing.JLabel lblWorkCity;
    private javax.swing.JLabel lblWorkState;
    private javax.swing.JLabel lblWorkStreetAddress;
    private javax.swing.JLabel lblWorkzipCode;
    private javax.swing.JLabel lblworkAddress;
    private javax.swing.JTable tblPersonRecords;
    private javax.swing.JTextField txtAnnualSalary;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHomeCity;
    private javax.swing.JTextField txtHomeState;
    private javax.swing.JTextField txtHomeStreetAddress;
    private javax.swing.JTextField txtHomeUnitNumber;
    private javax.swing.JTextField txtHomeZip;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWorkBuildingName;
    private javax.swing.JTextField txtWorkCity;
    private javax.swing.JTextField txtWorkPostalCode;
    private javax.swing.JTextField txtWorkState;
    private javax.swing.JTextField txtWorkStreetAddress;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
    
            DefaultTableModel model = (DefaultTableModel) tblPersonRecords.getModel();
            
        model.setRowCount(0);
        
        for(Person cp : personList.getPersonList())
        {
            
            
            Object[] row = new Object[6];
            row[0] = cp;
            row[1] = cp.getLastName();
            row[2] = cp.getHomeAddress().getCity();
            row[3] = cp.getHomeAddress().getPostalCode();
            row[4] = cp.getWorkAddress().getCity();
            row[5] = cp.getWorkAddress().getPostalCode();
            
            model.addRow(row);
            
        }

}

}
