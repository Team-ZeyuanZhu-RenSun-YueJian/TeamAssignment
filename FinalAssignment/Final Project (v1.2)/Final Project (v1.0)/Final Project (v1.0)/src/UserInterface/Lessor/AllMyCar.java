/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lessor;

import CompanyInterface.*;
import InterfaceMain.MainJFrame;
import com.br.dao.CarDao;
import com.br.daoImpl.CarDaoImpl;
import com.br.entity.Car;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex Zhu
 */
public class AllMyCar extends javax.swing.JPanel {
    
    private CarDao carDao = new CarDaoImpl();
    public static Car viewCar = null;

    /**
     * Creates new form CarManage
     */
    public AllMyCar() {
        initComponents();
        try {
            initTable();
        } catch (SQLException ex) {
            Logger.getLogger(AllMyCar.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBan = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Car List");

        btnBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Brand", "Model", "Car Number", "Status", "status_by"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnBan.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnBan.setText("Take back a car");
        btnBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnView.setText("View car");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
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
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBan, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnBan)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addContainerGap(220, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        JPanel lessorPanel = new LessorMain();
        MainJFrame.jSplitPane1.setRightComponent(lessorPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanActionPerformed
        // TODO add your handling code here:
        Integer id = (Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        if(("1").equals(carDao.selectById(id).getStatus_by())){
            JOptionPane.showMessageDialog(null, "该车正在使用，暂不能收回");
        }else{
            Boolean deleteFlag = carDao.deleteCar(id);
            if(deleteFlag == true) {
                    JOptionPane.showMessageDialog(null, "take back successfully");
                    try {
                                    initTable();
                            } catch (SQLException e1) {
                                    e1.printStackTrace();
                            }
            }else {
                    JOptionPane.showMessageDialog(null, "take back failed");
            }
        }
        
    }//GEN-LAST:event_btnBanActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        Integer id = (Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        viewCar = carDao.selectById(id);
        ViewCar vc = new ViewCar();
        MainJFrame.jSplitPane1.setRightComponent(vc);
    }//GEN-LAST:event_btnViewActionPerformed

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void initTable() throws SQLException {
		DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
		dtm.setRowCount(0);
		ResultSet rs = carDao.selectSelfCar(MainJFrame.currentUser.getId());
		while (rs.next()) {
			Vector v = new Vector();
			v.add(rs.getInt("id"));
			v.add(rs.getString("brand"));
			v.add(rs.getString("model"));
			v.add(rs.getString("car_number"));
			if(("0").equals(rs.getString("status"))) {
				v.add("unverify");
			}else {
				v.add("verify");
			}
			if(("0").equals(rs.getString("status_by"))) {
				v.add("Idle");
			}else {
				v.add("using");
			}
			dtm.addRow(v);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBan;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
