
package UserInterface.TravelAgency;

/**
 *
 * @author SUNREN
 */
import Business.Airliner.Airliner;
import Business.TravelAgency.TravelAgency;
import Business.TravelOffice.TravelOffice;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageTravelOfficeJPanel extends javax.swing.JPanel {

    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;
    public ManageTravelOfficeJPanel(TravelAgency travelAgency, JPanel cardSequenceJPanel) {
        initComponents();
        this.travelAgency = travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
        populate();
    }
    public void populate(){
        List<TravelOffice> travelOfficeList = travelAgency.getTravelOfficeDirectory().getTravelOfficList();
        DefaultTableModel dtm = (DefaultTableModel)travelOffJTable.getModel();
        dtm.setRowCount(0);
        
        for(TravelOffice to : travelOfficeList){
            Object[] row = new Object[travelOffJTable.getColumnCount()];
            row[0] = to;
            row[1] = to.getName();
            row[2] = to.getCustomerDirectory().getCustomerNum();
            row[3] = to.getPendingTicket().size();
            row[4] = to.getTicketDirectory().getTicketList().size();
            
            dtm.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        travelOffJTable = new javax.swing.JTable();
        viewOffBtn = new javax.swing.JButton();
        newOffBtn = new javax.swing.JButton();
        deleteOffjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Manage Offices");

        travelOffJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Name", "Customer Number", "Pending Tickets Number", "Total Tickets Number"
            }
        ));
        jScrollPane1.setViewportView(travelOffJTable);

        viewOffBtn.setText("View Office");
        viewOffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOffBtnActionPerformed(evt);
            }
        });

        newOffBtn.setText("New Office");
        newOffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOffBtnActionPerformed(evt);
            }
        });

        deleteOffjButton.setText("Delete Office");
        deleteOffjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOffjButtonActionPerformed(evt);
            }
        });

        backjButton.setText("Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backjButton)
                    .addComponent(deleteOffjButton)
                    .addComponent(newOffBtn)
                    .addComponent(viewOffBtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(viewOffBtn)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(newOffBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteOffjButton)
                .addGap(18, 18, 18)
                .addComponent(backjButton)
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewOffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOffBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = this.travelOffJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }else{
            TravelOffice travelOffice = (TravelOffice)this.travelOffJTable.getValueAt(selectedRow, 0);
            ViewTravelOfficeJPanel viewTO = new ViewTravelOfficeJPanel(travelOffice, cardSequenceJPanel);
            cardSequenceJPanel.add(viewTO);
            CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_viewOffBtnActionPerformed

    private void newOffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOffBtnActionPerformed
        // TODO add your handling code here:
        NewTravelOfficeJPanel newPanel = new NewTravelOfficeJPanel(travelAgency, cardSequenceJPanel);
        cardSequenceJPanel.add(newPanel);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_newOffBtnActionPerformed

    private void deleteOffjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOffjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = this.travelOffJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }else{
            TravelOffice to = (TravelOffice)this.travelOffJTable.getValueAt(selectedRow, 0);
            travelAgency.removeTravelOffice(to);
            populate();
            JOptionPane.showMessageDialog(null, "Delete successfully!");
        }
    }//GEN-LAST:event_deleteOffjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JButton deleteOffjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newOffBtn;
    private javax.swing.JTable travelOffJTable;
    private javax.swing.JButton viewOffBtn;
    // End of variables declaration//GEN-END:variables
}
