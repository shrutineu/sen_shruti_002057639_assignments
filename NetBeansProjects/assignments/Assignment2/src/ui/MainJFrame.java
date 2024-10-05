/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author shrutisen
 */
public class MainJFrame extends javax.swing.JFrame {

    PersonDirectory personList;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
       this.personList = new PersonDirectory();
       
       //Intialising 5 person's data at the App startup
       populateData();
                
    }

    private void populateData() {
        
        Person person1 = personList.addPerson(); // Created Person1
        
        person1.setFirstName("Shruti");
        person1.setLastName("Sen");
        person1.setSocialSecurityNumber(Long.parseLong("123456789"));
        person1.setAnnualSalary(Float.parseFloat("1234.567"));
        person1.getHomeAddress().setStreetAddress("Street1");
        person1.getHomeAddress().setCity("City1"); 
        person1.getHomeAddress().setState("State1");
        person1.getHomeAddress().setPostalCode("12345");
        person1.getHomeAddress().setUnitNumber("Unit2");
        person1.getWorkAddress().setCity("City2");
        person1.getWorkAddress().setState("State2");
        person1.getWorkAddress().setStreetAddress("Street2");
        person1.getWorkAddress().setPostalCode("123456");
                        
        Person person2 = personList.addPerson();// Created Person2
 
        person2.setFirstName("John");
        person2.setLastName("Singh");
        person2.setSocialSecurityNumber(Long.parseLong("7817777"));        
        person2.setAnnualSalary(Float.parseFloat("9876.3748"));
        person2.getHomeAddress().setStreetAddress("Beacon St");
        person2.getHomeAddress().setCity("Boston"); 
        person2.getHomeAddress().setState("MA");
        person2.getHomeAddress().setPostalCode("02215");
        person2.getHomeAddress().setUnitNumber("Apt 8");
        person2.getWorkAddress().setCity("Chicago");
        person2.getWorkAddress().setState("xyz");
        person2.getWorkAddress().setBuildingName("Boylston St");
        person2.getWorkAddress().setPostalCode("94837");
        
        Person person3 = personList.addPerson();// Created Person3
 
        person3.setFirstName("Shreya");
        person3.setLastName("Malhotra");
        person3.setSocialSecurityNumber(Long.parseLong("88776655"));
        person3.setAnnualSalary(Float.parseFloat("96517.935"));
        person3.getHomeAddress().setStreetAddress("Street3");
        person3.getHomeAddress().setCity("New York"); 
        person3.getHomeAddress().setState("State");
        person3.getHomeAddress().setPostalCode("67890");
        person3.getHomeAddress().setUnitNumber("Unit 2");
        person3.getWorkAddress().setCity("Boston");
        person3.getWorkAddress().setState("MA");
        person3.getWorkAddress().setStreetAddress("abc Street");
        person3.getWorkAddress().setBuildingName("Building A");
        person3.getWorkAddress().setPostalCode("458123");
        
        Person person4 = personList.addPerson();// Created Person4
 
        person4.setFirstName("Daksh");
        person4.setLastName("Sethi");
        person4.setSocialSecurityNumber(Long.parseLong("93344552"));
        person4.setAnnualSalary(Float.parseFloat("50000.7383"));
        person4.getHomeAddress().setStreetAddress("Street 4");
        person4.getHomeAddress().setCity("City "); 
        person4.getHomeAddress().setState("Texas");
        person4.getHomeAddress().setPostalCode("15345");
        person4.getHomeAddress().setUnitNumber("Unit 4");
        person4.getWorkAddress().setCity("Dallas");
        person4.getWorkAddress().setState("Texas");
        person4.getWorkAddress().setStreetAddress("Street 3");
        person4.getWorkAddress().setBuildingName("Building 7");
        person4.getWorkAddress().setPostalCode("123459");
        
        
        Person person5 = personList.addPerson();// Created Person5
 
        person5.setFirstName("Riya");
        person5.setLastName("Sharma");
        person5.setSocialSecurityNumber(Long.parseLong("123456789"));
        person5.setAnnualSalary(Float.parseFloat("90000.7829"));
        person5.getHomeAddress().setStreetAddress("Hamptons");
        person5.getHomeAddress().setCity("abcdefgh"); 
        person5.getHomeAddress().setState("New Jersey");
        person5.getHomeAddress().setPostalCode("16345");
        person5.getHomeAddress().setUnitNumber("Unit 5");
        person5.getWorkAddress().setCity("New York");
        person5.getWorkAddress().setState("MA");
        person5.getWorkAddress().setStreetAddress("Street onb");
        person5.getWorkAddress().setBuildingName("Unit 5");
        person5.getWorkAddress().setPostalCode("123469");
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        btnjPanel = new javax.swing.JPanel();
        btnWorkArea = new javax.swing.JButton();
        workAreajPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setPreferredSize(new java.awt.Dimension(400, 571));

        btnjPanel.setBackground(new java.awt.Color(0, 102, 102));

        btnWorkArea.setText("Open Work Area");
        btnWorkArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnjPanelLayout = new javax.swing.GroupLayout(btnjPanel);
        btnjPanel.setLayout(btnjPanelLayout);
        btnjPanelLayout.setHorizontalGroup(
            btnjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnjPanelLayout.createSequentialGroup()
                .addContainerGap(557, Short.MAX_VALUE)
                .addComponent(btnWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        btnjPanelLayout.setVerticalGroup(
            btnjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnjPanelLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btnWorkArea)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(btnjPanel);

        workAreajPanel.setBackground(new java.awt.Color(204, 255, 255));
        workAreajPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setLeftComponent(workAreajPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWorkAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkAreaActionPerformed

        // TODO add your handling code here:
        WorkAreaJPanel panel = new WorkAreaJPanel(workAreajPanel, personList);
        workAreajPanel.add("WorkAreaJPanel", panel) ;
        
        CardLayout layout = (CardLayout) workAreajPanel.getLayout();
        layout.next(workAreajPanel);
        
        
    }//GEN-LAST:event_btnWorkAreaActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnWorkArea;
    private javax.swing.JPanel btnjPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workAreajPanel;
    // End of variables declaration//GEN-END:variables
}
