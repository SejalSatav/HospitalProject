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
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    
    Hospital hospital;
    
    public PatientJPanel(Hospital hospital) {
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

        lblPatient = new javax.swing.JLabel();
        lblPatID = new javax.swing.JLabel();
        LBLPrimDoc = new javax.swing.JLabel();
        lblLastVis = new javax.swing.JLabel();
        lblAllergy = new javax.swing.JLabel();
        lblMed = new javax.swing.JLabel();
        lblNextVis = new javax.swing.JLabel();
        txtPatID = new javax.swing.JTextField();
        txtPrimDoc = new javax.swing.JTextField();
        txtLastVis = new javax.swing.JTextField();
        txtNextVis = new javax.swing.JTextField();
        btnSave5 = new javax.swing.JButton();
        txtAllergy = new javax.swing.JTextField();
        txtMed = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 255));

        lblPatient.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatient.setText("Patient Information");

        lblPatID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPatID.setForeground(new java.awt.Color(255, 255, 255));
        lblPatID.setText("Patient ID:");

        LBLPrimDoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LBLPrimDoc.setForeground(new java.awt.Color(255, 255, 255));
        LBLPrimDoc.setText("Primary doctor:");

        lblLastVis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLastVis.setForeground(new java.awt.Color(255, 255, 255));
        lblLastVis.setText("Last visit date:");

        lblAllergy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAllergy.setForeground(new java.awt.Color(255, 255, 255));
        lblAllergy.setText("Any allergies:");

        lblMed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMed.setForeground(new java.awt.Color(255, 255, 255));
        lblMed.setText("On Medication:");

        lblNextVis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNextVis.setForeground(new java.awt.Color(255, 255, 255));
        lblNextVis.setText("Date of next visit:");

        btnSave5.setBackground(new java.awt.Color(0, 51, 102));
        btnSave5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave5.setForeground(new java.awt.Color(255, 255, 255));
        btnSave5.setText("Save");
        btnSave5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBLPrimDoc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLastVis, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAllergy, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMed, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNextVis, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrimDoc)
                    .addComponent(txtLastVis)
                    .addComponent(txtNextVis)
                    .addComponent(txtPatID, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtAllergy)
                    .addComponent(txtMed))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtLastVis, txtNextVis, txtPatID, txtPrimDoc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblPatient)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatID)
                    .addComponent(txtPatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLPrimDoc)
                    .addComponent(txtPrimDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastVis)
                    .addComponent(txtLastVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAllergy)
                    .addComponent(txtAllergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMed)
                    .addComponent(txtMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNextVis)
                    .addComponent(txtNextVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnSave5)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSave5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave5ActionPerformed
        // TODO add your handling code here:
        
        hospital.setPatid(txtPatID.getText());
        hospital.setPrimdoc(txtPrimDoc.getText());
        hospital.setLastvisit(txtLastVis.getText());
        hospital.setNextvisit(txtNextVis.getText());
        hospital.setAllergy(txtAllergy.getText());
        hospital.setMed(txtMed.getText());
        
        
        JOptionPane.showMessageDialog(this, "Patient Information Saved");
    }//GEN-LAST:event_btnSave5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLPrimDoc;
    private javax.swing.JButton btnSave5;
    private javax.swing.JLabel lblAllergy;
    private javax.swing.JLabel lblLastVis;
    private javax.swing.JLabel lblMed;
    private javax.swing.JLabel lblNextVis;
    private javax.swing.JLabel lblPatID;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JTextField txtAllergy;
    private javax.swing.JTextField txtLastVis;
    private javax.swing.JTextField txtMed;
    private javax.swing.JTextField txtNextVis;
    private javax.swing.JTextField txtPatID;
    private javax.swing.JTextField txtPrimDoc;
    // End of variables declaration//GEN-END:variables
}