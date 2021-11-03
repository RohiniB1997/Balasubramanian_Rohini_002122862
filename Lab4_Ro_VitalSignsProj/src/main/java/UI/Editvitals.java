/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Class.VitalSign;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rohinibalasubramanian
 */
public class Editvitals extends javax.swing.JPanel {

    /**
     * Creates new form Editvitals
     */
     private VitalSign vitalSign;
    private JPanel userProcessContainer;
    private Boolean isEdit = Boolean.FALSE;

    public Editvitals(JPanel upc, VitalSign vitalSign, Boolean isEdit) {
        initComponents();
        this.userProcessContainer = upc;
        this.vitalSign = vitalSign;
        this.isEdit = isEdit;
       
        populateVitalSignDetails();
        modifyTextFields(this.isEdit);
    }
    private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            
            bloodPressureJTextField.setEnabled(true);
           
        } else {
            
            bloodPressureJTextField.setEnabled(false);
           
        }
    }

    private void populateVitalSignDetails() {
        
        bloodPressureJTextField.setText(String.valueOf(vitalSign.getBloodPressure()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bloodPressureJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText(" Blood pressure");

        backJButton.setText("GOBACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(515, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(saveJButton)
                .addGap(88, 88, 88))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(backJButton)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:

        try {
          
            int bloodPressure = Integer.parseInt(bloodPressureJTextField.getText());
            
            vitalSign.setBloodPressure(bloodPressure);
            
            /*Set current date and time as TimeStamp*/
            vitalSign.setTimestamp(new Date());
            JOptionPane.showMessageDialog(this, "Vital signs updated", "Update",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter correct values",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
        modifyTextFields(false);
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodPressureJTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton saveJButton;
    // End of variables declaration//GEN-END:variables
}
