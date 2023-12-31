/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Hospital;

/**
 *
 * @author hp
 */
public class DriverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DriverJPanel
     */
    Hospital hospital;
    
    public DriverJPanel(Hospital hospital) {
        initComponents();
        this.hospital = hospital;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDriver = new javax.swing.JLabel();
        lblLicNum = new javax.swing.JLabel();
        lblIssue = new javax.swing.JLabel();
        lblValid = new javax.swing.JLabel();
        txtLicNum = new javax.swing.JTextField();
        txtIssue = new javax.swing.JTextField();
        txtValid = new javax.swing.JTextField();
        btnSave3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(new java.awt.Color(255, 153, 255));

        lblDriver.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblDriver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDriver.setText("Driver's Information");

        lblLicNum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLicNum.setForeground(new java.awt.Color(255, 255, 255));
        lblLicNum.setText("Licence Number:");

        lblIssue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIssue.setForeground(new java.awt.Color(255, 255, 255));
        lblIssue.setText("Issue date:");

        lblValid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValid.setForeground(new java.awt.Color(255, 255, 255));
        lblValid.setText("Valid through:");

        btnSave3.setBackground(new java.awt.Color(0, 0, 153));
        btnSave3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave3.setForeground(new java.awt.Color(255, 255, 255));
        btnSave3.setText("Save");
        btnSave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDriver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLicNum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIssue, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValid, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLicNum, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(txtIssue)
                    .addComponent(txtValid))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(lblDriver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicNum)
                    .addComponent(txtLicNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIssue)
                    .addComponent(txtIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValid)
                    .addComponent(txtValid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnSave3)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave3ActionPerformed
        // TODO add your handling code here:
        
        hospital.setCarlicnum(txtLicNum.getText());
        hospital.setIssuedate(txtIssue.getText());
        hospital.setValiddate(txtValid.getText());
        
        
        JOptionPane.showMessageDialog(this, "Driver's Information Saved");
        
        
    }//GEN-LAST:event_btnSave3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave3;
    private javax.swing.JLabel lblDriver;
    private javax.swing.JLabel lblIssue;
    private javax.swing.JLabel lblLicNum;
    private javax.swing.JLabel lblValid;
    private javax.swing.JTextField txtIssue;
    private javax.swing.JTextField txtLicNum;
    private javax.swing.JTextField txtValid;
    // End of variables declaration//GEN-END:variables
}
