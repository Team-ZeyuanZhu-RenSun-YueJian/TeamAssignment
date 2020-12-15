/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Sysadmin;

import InterfaceMain.MainJFrame;

/**
 *
 * @author Alex Zhu
 */
public class UserAdminMain extends javax.swing.JPanel {

    /**
     * Creates new form CarRentCompanyMain
     */
    public UserAdminMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLesee = new javax.swing.JButton();
        btnDriver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLesor = new javax.swing.JButton();

        btnLesee.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLesee.setText("Lessee Manage");
        btnLesee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeseeActionPerformed(evt);
            }
        });

        btnDriver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDriver.setText("Driver Manage");
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("User Admin");

        btnLesor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLesor.setText("Lessor Manage");
        btnLesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(367, 367, 367)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(346, 346, 346)
                            .addComponent(btnLesee)))
                    .addComponent(btnLesor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(btnLesee)
                .addGap(18, 18, 18)
                .addComponent(btnLesor)
                .addGap(18, 18, 18)
                .addComponent(btnDriver)
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeseeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeseeActionPerformed
        // TODO add your handling code here:
        ManageLessee mle = new ManageLessee();
        MainJFrame.jSplitPane1.setRightComponent(mle);
    }//GEN-LAST:event_btnLeseeActionPerformed

    private void btnLesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLesorActionPerformed
        // TODO add your handling code here:
        ManageLessor mlo = new ManageLessor();
        MainJFrame.jSplitPane1.setRightComponent(mlo);
    }//GEN-LAST:event_btnLesorActionPerformed

    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverActionPerformed
        // TODO add your handling code here:
        ManageDriver md = new ManageDriver();
        MainJFrame.jSplitPane1.setRightComponent(md);
    }//GEN-LAST:event_btnDriverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDriver;
    private javax.swing.JButton btnLesee;
    private javax.swing.JButton btnLesor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}