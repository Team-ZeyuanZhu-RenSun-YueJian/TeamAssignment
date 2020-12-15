/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Sysadmin;

import InterfaceMain.MainJFrame;
import com.br.dao.UserDao;
import com.br.daoImpl.UserDaoImpl;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Zhu
 */
public class ViewLessor extends javax.swing.JPanel {
    
    private UserDao userDao = new UserDaoImpl();

    /**
     * Creates new form ViewDriver
     */
    public ViewLessor() {
        initComponents();
        txtUserName.setEditable(false);
                txtPassword.setEditable(false);
                txtName.setEditable(false);
                txtID.setEditable(false);
                txtPhoneNo.setEditable(false);
                txtAge.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        btnUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel6.setText("User Name");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Lessor View");

        jLabel7.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel7.setText("Password");

        btnBack.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtUserName.setText(UserInterface.Sysadmin.ManageLessor.viewLessor.getUserNumber());

        jLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel2.setText("Age");

        txtPassword.setText(UserInterface.Sysadmin.ManageLessor.viewLessor.getUserPassword());

        jLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel3.setText("Driver license ID");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel4.setText("Name ");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number");

        txtName.setText(UserInterface.Sysadmin.ManageLessor.viewLessor.getUserName());

        txtID.setText(UserInterface.Sysadmin.ManageLessor.viewLessor.getUserDriverLicenseId());

        txtPhoneNo.setText(UserInterface.Sysadmin.ManageLessor.viewLessor.getUserTel());

        txtAge.setText(UserInterface.Sysadmin.ManageLessor.viewLessor.getUserAge());

        btnSave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(149, 149, 149)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel1)))))
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addGap(97, 97, 97))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageLessor mlo = new ManageLessor();
        MainJFrame.jSplitPane1.setRightComponent(mlo);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtUserName.setEditable(true);
                txtPassword.setEditable(true);
                txtName.setEditable(true);
                txtID.setEditable(true);
                txtPhoneNo.setEditable(true);
                txtAge.setEditable(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String user_number = txtUserName.getText().toString();
        		String user_password = txtPassword.getText().toString();
        		String user_name = txtName.getText().toString();
        		String user_tel = txtPhoneNo.getText().toString();
        		String user_driver_license_id = txtID.getText().toString();
        		String user_age = txtAge.getText().toString();
        		if(("").equals(user_number) || ("").equals(user_password) || ("").equals(user_name) 
        				|| ("").equals(user_driver_license_id) || ("").equals(user_age) || ("").equals(user_tel)) {
        			JOptionPane.showMessageDialog(null, "Please enter complete information");
        		}else {
        			if(userDao.selectByNumber(user_number,"出租者") != null && userDao.selectByNumber(user_number,"出租者").getId() != UserInterface.Sysadmin.ManageLessor.viewLessor.getId()) {
        				JOptionPane.showMessageDialog(null, "The username has been used");
        			}else {
        				UserInterface.Sysadmin.ManageLessor.viewLessor.setUserName(user_name);
        				UserInterface.Sysadmin.ManageLessor.viewLessor.setUserNumber(user_number);
        				UserInterface.Sysadmin.ManageLessor.viewLessor.setUserPassword(user_password);
        				UserInterface.Sysadmin.ManageLessor.viewLessor.setUserDriverLicenseId(user_driver_license_id);
        				UserInterface.Sysadmin.ManageLessor.viewLessor.setUserAge(user_age);
        				UserInterface.Sysadmin.ManageLessor.viewLessor.setUserTel(user_tel);
            			Boolean upadteFlag = userDao.updateUser(UserInterface.Sysadmin.ManageLessor.viewLessor);
            			if(upadteFlag == true) {
            				JOptionPane.showMessageDialog(null, "update successfully");
            				ManageLessor mlo = new ManageLessor();
            				MainJFrame.jSplitPane1.setRightComponent(mlo);
            			}else {
            				JOptionPane.showMessageDialog(null, "update failed");
            			}
        			}
        		}
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
