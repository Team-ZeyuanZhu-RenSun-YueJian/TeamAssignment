/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lessor;

import InterfaceMain.MainJFrame;

/**
 *
 * @author Alex Zhu
 */
public class LessorMain extends javax.swing.JPanel {

    /**
     * Creates new form LessorHomePage
     */
    public LessorMain() {
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

        jLabel1 = new javax.swing.JLabel();
        btnCarList = new javax.swing.JButton();
        btnAddCar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Lesseor Home Page");

        btnCarList.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnCarList.setText("All My Car");
        btnCarList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarListActionPerformed(evt);
            }
        });

        btnAddCar.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnAddCar.setText("Add a Car");
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCarList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addComponent(btnAddCar)
                .addGap(18, 18, 18)
                .addComponent(btnCarList)
                .addContainerGap(332, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarActionPerformed
        // TODO add your handling code here:
        AddCar ac = new AddCar();
        MainJFrame.jSplitPane1.setRightComponent(ac);
    }//GEN-LAST:event_btnAddCarActionPerformed

    private void btnCarListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarListActionPerformed
        // TODO add your handling code here:
        AllMyCar amc = new AllMyCar();
        MainJFrame.jSplitPane1.setRightComponent(amc);
    }//GEN-LAST:event_btnCarListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCar;
    private javax.swing.JButton btnCarList;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
