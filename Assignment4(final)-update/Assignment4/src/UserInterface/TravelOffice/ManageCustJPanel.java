
package UserInterface.TravelOffice;

import Business.TravelOffice.Customer.Customer;
import Business.TravelOffice.Customer.CustomerDirectory;
import Business.TravelOffice.TravelOffice;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 25434
 */
public class ManageCustJPanel extends javax.swing.JPanel {

    private CustomerDirectory customerDirectory;
    private JPanel cardSequenceJPanel;
    private TravelOffice travelOffice;
    
    
    public ManageCustJPanel(JPanel cardSequenceJPanel, TravelOffice travelOffice) {
        initComponents();
        this.travelOffice = travelOffice;
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.customerDirectory = travelOffice.getCustomerDirectory();
        System.out.println("1");
        System.out.println(customerDirectory.getCustomerList());
        populateTable(customerDirectory.getCustomerList());
    }
    public void populateTable(List<Customer> customerList){
        DefaultTableModel dtm = (DefaultTableModel)customerJTable.getModel();
        dtm.setRowCount(0);
        
        customerList.forEach((Customer customer) -> {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = customer;
            row[1] = customer.getId();
            row[2] = customer.getIdentityType() + customer.getIdentityID();
            row[3] = customer.getOfficeInfo();
            dtm.addRow(row);
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        customerJTable = new javax.swing.JTable();
        viewCustomerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        createCustomer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        customerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer", "Member ID", "Identity Info", "Office Info"
            }
        ));
        jScrollPane2.setViewportView(customerJTable);

        viewCustomerBtn.setBackground(new java.awt.Color(255, 255, 255));
        viewCustomerBtn.setText("View Customer");
        viewCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        createCustomer.setBackground(new java.awt.Color(255, 255, 255));
        createCustomer.setText("Create Customer");
        createCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setText("Customer List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(createCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCustomerBtn)
                    .addComponent(createCustomer)
                    .addComponent(backBtn))
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }else{
            Customer customer = (Customer) customerJTable.getValueAt(selectedRow, 0);
            ViewCustomerJPanel panel = new ViewCustomerJPanel(cardSequenceJPanel, customer, customerDirectory);
            cardSequenceJPanel.add(panel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_viewCustomerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustomerActionPerformed
        // TODO add your handling code here:
        Customer customer = new Customer(travelOffice);
        CreateNewCustJPanel panel = new CreateNewCustJPanel(cardSequenceJPanel, customer, customerDirectory);
        cardSequenceJPanel.add(panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_createCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createCustomer;
    private javax.swing.JTable customerJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton viewCustomerBtn;
    // End of variables declaration//GEN-END:variables
}
