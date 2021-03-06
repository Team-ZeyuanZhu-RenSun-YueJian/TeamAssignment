/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompanyInterface;

import InterfaceMain.MainJFrame;
import UserInterface.Sysadmin.*;
import com.br.dao.UserDao;
import com.br.daoImpl.UserDaoImpl;
import com.br.entity.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex Zhu
 */
public class ManageDriver extends javax.swing.JPanel {

    private UserDao userDao = new UserDaoImpl();
    public static User viewDriver = null;
    
    /**
     * Creates new form ManageDriver
     */
    public ManageDriver() {
        initComponents();
        try {
            initTable();
        } catch (SQLException ex) {
            Logger.getLogger(ManageDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User Name", "Password", "Status", "Standby"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Manage Driver");

        btnBack.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnView.setText("View Driver");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnDelete.setText("Ban Driver");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnAdd.setText("Add Driver");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnVerify.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnVerify.setText("Verfiy Driver");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Driver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(btnVerify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(9, 9, 9)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        Integer id = (Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        viewDriver = userDao.selectById(id);
        ViewDriver vd = new ViewDriver();
        MainJFrame.jSplitPane1.setRightComponent(vd);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        JPanel cp = new CompanyMain();
        MainJFrame.jSplitPane1.setRightComponent(cp);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddDriver ad = new AddDriver();
        MainJFrame.jSplitPane1.setRightComponent(ad);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Integer id = (Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        		User u = userDao.selectById(id);
        		u.setStatus("0");
        		Boolean updateFlag = userDao.updateUser(u);
        		if(updateFlag == true) {
        			JOptionPane.showMessageDialog(null, "设置回未认证成功");
        			try {
						initTable();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
        		}else {
        			JOptionPane.showMessageDialog(null, "发生错误，设置失败");
        		}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        // TODO add your handling code here:
        Integer id = (Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        		User u = userDao.selectById(id);
        		u.setStatus("1");
        		Boolean updateFlag = userDao.updateUser(u);
        		if(updateFlag == true) {
        			JOptionPane.showMessageDialog(null, "认证成功");
        			try {
						initTable();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
        		}else {
        			JOptionPane.showMessageDialog(null, "发生错误，认证失败");
        		}
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Integer id = (Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        		Boolean deleteFlag = userDao.deleteUser(id);
        		if(deleteFlag == true) {
        			JOptionPane.showMessageDialog(null, "删除成功");
        			try {
						initTable();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
        		}else {
        			JOptionPane.showMessageDialog(null, "发生错误，删除失败");
        		}
    }//GEN-LAST:event_jButton1ActionPerformed

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void initTable() throws SQLException {
		DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
		dtm.setRowCount(0);
		ResultSet rs = userDao.selectAllByType("司机");
		while (rs.next()) {
			Vector v = new Vector();
			v.add(rs.getInt("id"));
			v.add(rs.getString("user_name"));
			v.add(rs.getString("user_number"));
			v.add(rs.getString("user_password"));
			if(("0").equals(rs.getString("status"))) {
				v.add("未认证");
			}else {
				v.add("已认证");
			}
			if(("0").equals(rs.getString("status_by"))) {
				v.add("未接单");
			}else {
				v.add("已使用");
			}
			dtm.addRow(v);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnVerify;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
