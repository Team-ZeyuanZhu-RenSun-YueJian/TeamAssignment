/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.TravelAgency.TravelAgency;
import Business.UserAccount.UserAccount;
import UserInterface.Airliner.AirlinerSplitLifeJPanel;
import UserInterface.TravelAgency.TravelAgencyBtnJPanel;
import UserInterface.TravelOffice.TravelOfficeBtnJPanel;

/**
 *
 * @author 25434
 */
public class TravelAgencyMain extends javax.swing.JFrame {
    TravelAgency travelAgency;
    UserAccount userAccount;
    
    TravelAgencyMain(TravelAgency travelAgency, UserAccount userAccount) {
        initComponents();
        this.userAccount = userAccount;
        this.travelAgency = travelAgency;
        setButton(this.userAccount);
    }
    public void setButton(UserAccount userAccount){
        if(userAccount.getRole().equals("TravelAgency")){
            System.out.print("ta");
            TravelAgencyBtnJPanel travelAgencyBtn = new TravelAgencyBtnJPanel(travelAgency,cardSequenceJPanel);
            subJSplitPane2.setLeftComponent(travelAgencyBtn);
        }else if(userAccount.getRole().equals("Airliner")){
            AirlinerSplitLifeJPanel airlinerBtnJPanel = new AirlinerSplitLifeJPanel(userAccount,cardSequenceJPanel);
            subJSplitPane2.setLeftComponent(airlinerBtnJPanel);
        }else if(userAccount.getRole().equals("TravelOffice")){
            TravelOfficeBtnJPanel travelOfficeBtnJPanel = new TravelOfficeBtnJPanel(userAccount,cardSequenceJPanel);
            subJSplitPane2.setLeftComponent(travelOfficeBtnJPanel);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        mainJSplitPane = new javax.swing.JSplitPane();
        rightJPanel = new javax.swing.JPanel();
        subJSplitPane2 = new javax.swing.JSplitPane();
        cardSequenceJPanel = new javax.swing.JPanel();
        btnJPanel = new javax.swing.JPanel();
        upJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainJSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        mainJSplitPane.setMinimumSize(new java.awt.Dimension(0, 0));
        mainJSplitPane.setPreferredSize(new java.awt.Dimension(1300, 900));

        rightJPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightJPanel.setLayout(new java.awt.CardLayout());

        subJSplitPane2.setDividerLocation(300);

        cardSequenceJPanel.setBackground(new java.awt.Color(255, 255, 255));
        cardSequenceJPanel.setPreferredSize(new java.awt.Dimension(1000, 200));
        cardSequenceJPanel.setLayout(new java.awt.CardLayout());
        subJSplitPane2.setRightComponent(cardSequenceJPanel);

        btnJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btnJPanelLayout = new javax.swing.GroupLayout(btnJPanel);
        btnJPanel.setLayout(btnJPanelLayout);
        btnJPanelLayout.setHorizontalGroup(
            btnJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        btnJPanelLayout.setVerticalGroup(
            btnJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        subJSplitPane2.setLeftComponent(btnJPanel);

        rightJPanel.add(subJSplitPane2, "card2");

        mainJSplitPane.setRightComponent(rightJPanel);

        upJPanel.setBackground(new java.awt.Color(51, 51, 51));
        upJPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        upJPanel.setPreferredSize(new java.awt.Dimension(1200, 80));
        upJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        upJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Travel Agency System");
        upJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        upJPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(959, 40, 120, -1));

        mainJSplitPane.setLeftComponent(upJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainJSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainJSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnJPanel;
    private javax.swing.JPanel cardSequenceJPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JSplitPane mainJSplitPane;
    private javax.swing.JPanel rightJPanel;
    private javax.swing.JSplitPane subJSplitPane2;
    private javax.swing.JPanel upJPanel;
    // End of variables declaration//GEN-END:variables
}
