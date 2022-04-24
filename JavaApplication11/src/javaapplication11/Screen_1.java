package javaapplication11;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Screen_1 extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    /**
     * Creates new form Counties
     */
    public Screen_1() {
        initComponents();
        conn=MySQL_DB_Connection.ConnectDb();   //MySQL Connection Class
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jTextField_FarmerName = new javax.swing.JTextField();
        jTextField_PhysicalAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_City = new javax.swing.JTextField();
        jTextField_EmailAddress = new javax.swing.JTextField();
        jButton_AddNew = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Password = new javax.swing.JTextField();
        jButton_Exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_State = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_ZipCode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_FarmerID = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Farmers Registration", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Farmer Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Physical Address");

        jTextField_Search.setBackground(java.awt.Color.black);
        jTextField_Search.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField_Search.setForeground(java.awt.Color.green);
        jTextField_Search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Search.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Farmer ID or Username to Search", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.white)); // NOI18N
        jTextField_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("City");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Email Address");

        jButton_AddNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_AddNew.setForeground(new java.awt.Color(0, 0, 51));
        jButton_AddNew.setText("Add New");
        jButton_AddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddNewActionPerformed(evt);
            }
        });

        jButton_Update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(0, 0, 51));
        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Delete.setForeground(new java.awt.Color(0, 0, 51));
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(0, 0, 51));
        jButton_Clear.setText("Clear");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Password");

        jButton_Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Exit.setForeground(new java.awt.Color(0, 0, 51));
        jButton_Exit.setText("Exit");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Phone Number");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("State");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Zip Code");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Farmer ID");

        jButton_Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Search.setForeground(java.awt.Color.blue);
        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_FarmerName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_PhysicalAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_City, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_State, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ZipCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_EmailAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_FarmerID, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Search))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton_AddNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Update)
                        .addGap(6, 6, 6)
                        .addComponent(jButton_Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Exit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_FarmerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_FarmerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_PhysicalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_ZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_AddNew)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_Delete)
                    .addComponent(jButton_Clear)
                    .addComponent(jButton_Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // Close form
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to CLOSE this form?", "Close", JOptionPane.YES_NO_OPTION);
        if (p == 0)
            dispose();
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_AddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddNewActionPerformed
        // Checks if textfields are empty
        if (jTextField_FarmerID.getText().isEmpty() || jTextField_FarmerName.getText().isEmpty()
                || jTextField_PhysicalAddress.getText().isEmpty() || jTextField_City.getText().isEmpty()
                || jTextField_State.getText().isEmpty() || jTextField_ZipCode.getText().isEmpty()
                || jTextField_PhoneNumber.getText().isEmpty() || jTextField_EmailAddress.getText().isEmpty()
                || jTextField_Username.getText().isEmpty() || jTextField_Password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill the blank fields", "Blank Field", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            //insert query statement with values from jForm textfields
            String sql = "INSERT INTO Farmer (FarmerID, FarmerName, PhysicalAddress, City, State, ZipCode, "
                    + "PhoneNumber, EmailAddress, Username, Password) "
                    + "VALUES(" + jTextField_FarmerID.getText() + ", '" + jTextField_FarmerName.getText() + "', "
                    + "'" + jTextField_PhysicalAddress.getText() + "', '" + jTextField_City.getText() + "', "
                    + "'" + jTextField_State.getText() + "', '" + jTextField_ZipCode.getText() + "', "
                    + "'" + jTextField_PhoneNumber.getText() + "', '" + jTextField_EmailAddress.getText() + "', "
                    + "'" + jTextField_Username.getText() + "', '" + jTextField_Password.getText() + "')";

            pst = conn.prepareStatement(sql);
            pst.execute();

            //Message dialog on the screen
            JOptionPane.showMessageDialog(null, "New Farmer Successfully Added");

            //Clears the text fields after successful addition
            jTextField_Search.setText(null);
            jTextField_FarmerID.setText(null);
            jTextField_FarmerName.setText(null);
            jTextField_PhysicalAddress.setText(null);
            jTextField_City.setText(null);
            jTextField_State.setText(null);
            jTextField_ZipCode.setText(null);
            jTextField_PhoneNumber.setText(null);
            jTextField_EmailAddress.setText(null);
            jTextField_Username.setText(null);
            jTextField_Password.setText(null);
        } //Exception handling
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new Farmer");
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_AddNewActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // Search for a farmer to update
        if (jTextField_Search.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Farmer ID or Username to Search");
            jTextField_Search.requestFocus();
            return;
        }

        try {
            String sql = "SELECT * FROM Farmer WHERE FarmerID = ? || Username = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_Search.getText());
            pst.setString(2, jTextField_Search.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("FarmerID");
                jTextField_FarmerID.setText(add1);
                String add2 = rs.getString("FarmerName");
                jTextField_FarmerName.setText(add2);
                String add3 = rs.getString("PhysicalAddress");
                jTextField_PhysicalAddress.setText(add3);
                String add4 = rs.getString("City");
                jTextField_City.setText(add4);
                String add5 = rs.getString("State");
                jTextField_State.setText(add5);
                String add6 = rs.getString("zipCode");
                jTextField_ZipCode.setText(add6);
                String add7 = rs.getString("PhoneNumber");
                jTextField_PhoneNumber.setText(add7);
                String add8 = rs.getString("EmailAddress");
                jTextField_EmailAddress.setText(add8);
                String add9 = rs.getString("Username");
                jTextField_Username.setText(add9);
                String add10 = rs.getString("Password");
                jTextField_Password.setText(add10);
                jTextField_Search.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "The Farmer does not exist");
                jTextField_Search.requestFocus();

                //Clears the text fields
                jTextField_FarmerID.setText(null);
                jTextField_FarmerName.setText(null);
                jTextField_PhysicalAddress.setText(null);
                jTextField_City.setText(null);
                jTextField_State.setText(null);
                jTextField_ZipCode.setText(null);
                jTextField_PhoneNumber.setText(null);
                jTextField_EmailAddress.setText(null);
                jTextField_Username.setText(null);
                jTextField_Password.setText(null);
                jTextField_Search.requestFocus();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // Clears text from textfields
        int p = JOptionPane.showConfirmDialog(null, "Information Displayed would be cleared", "Clear", JOptionPane.YES_NO_OPTION);
        if (p == 0)
            try {
                jTextField_Search.setText(null);
                jTextField_FarmerID.setText(null);
                jTextField_FarmerName.setText(null);
                jTextField_PhysicalAddress.setText(null);
                jTextField_City.setText(null);
                jTextField_State.setText(null);
                jTextField_ZipCode.setText(null);
                jTextField_PhoneNumber.setText(null);
                jTextField_EmailAddress.setText(null);
                jTextField_Username.setText(null);
                jTextField_Password.setText(null);
                jTextField_Search.requestFocus();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // Update selected data
        if (jTextField_FarmerID.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please select record to be updated first");
            return;
        } else {
            int p = JOptionPane.showConfirmDialog(null, "Do you really want to UPDATE Farmer Info?", "Update", JOptionPane.YES_NO_OPTION);
            if (p == 0)
                
                try {
                String sql = "UPDATE Farmer SET FarmerName = '" + jTextField_FarmerName.getText() + "', "
                        + "PhysicalAddress = '" + jTextField_PhysicalAddress.getText() + "', City = '" + jTextField_City.getText() + "', "
                        + "State = '" + jTextField_State.getText() + "', ZipCode= '" + jTextField_ZipCode.getText() + "', "
                        + "PhoneNumber = '" + jTextField_PhoneNumber.getText() + "', EmailAddress = '" + jTextField_EmailAddress.getText() + "', "
                        + "Username = '" + jTextField_Username.getText() + "', Password = '" + jTextField_Password.getText() + "'"
                        + "WHERE FarmerID = '" + jTextField_FarmerID.getText() + "'";

                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Farmer Details Successfully UPDATED");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // Deletes selected record
        if (jTextField_FarmerID.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please select record to be deleted first");
        } else {

            int p = JOptionPane.showConfirmDialog(null, "Do you really want to DELETE Farmer?", "Delete", JOptionPane.YES_NO_OPTION);
            if (p == 0)
                
                try {
                String sql = "DELETE FROM Farmer WHERE FarmerID = '" + jTextField_FarmerID.getText() + "'";
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Farmer Deleted");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Screen_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddNew;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_City;
    private javax.swing.JTextField jTextField_EmailAddress;
    private javax.swing.JTextField jTextField_FarmerID;
    private javax.swing.JTextField jTextField_FarmerName;
    private javax.swing.JTextField jTextField_Password;
    private javax.swing.JTextField jTextField_PhoneNumber;
    private javax.swing.JTextField jTextField_PhysicalAddress;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_State;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JTextField jTextField_ZipCode;
    // End of variables declaration//GEN-END:variables
}
