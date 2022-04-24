package javaapplication11;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Screen_2 extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

    /**
     * Creates new form Screen_1
     */
    public Screen_2() {
        initComponents();
        conn=MySQL_DB_Connection.ConnectDb();
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
        jTextField_AnimalControlNumber = new javax.swing.JTextField();
        jTextField_AnimalType = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_AnimalGender = new javax.swing.JTextField();
        jTextField_BreedDescription = new javax.swing.JTextField();
        jButton_AddNew = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Search = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_DateOfBirth = new javax.swing.JTextField();
        jButton_Exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_FarmerID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_AnimalID = new javax.swing.JTextField();
        jButton_Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Animals", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Animal Control Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Animal Type");

        jTextField_Search.setBackground(java.awt.Color.black);
        jTextField_Search.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField_Search.setForeground(java.awt.Color.green);
        jTextField_Search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Search.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Animal ID OR ACN to Search", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.white)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Animal Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Breed Description");

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

        jButton_Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Search.setForeground(java.awt.Color.blue);
        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Date of Birth");

        jButton_Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Exit.setForeground(new java.awt.Color(0, 0, 51));
        jButton_Exit.setText("Exit");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("FarmerID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Animal ID");

        jButton_Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(0, 0, 51));
        jButton_Clear.setText("Clear");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Search)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_DateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField_BreedDescription, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_AnimalGender, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_AnimalType, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_AnimalControlNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_FarmerID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_AnimalID, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton_AddNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Exit)
                .addContainerGap(65, Short.MAX_VALUE))
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
                    .addComponent(jLabel7)
                    .addComponent(jTextField_AnimalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_FarmerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_AnimalControlNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_AnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_AnimalGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_BreedDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_AddNew)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_Delete)
                    .addComponent(jButton_Exit)
                    .addComponent(jButton_Clear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (jTextField_AnimalID.getText().isEmpty() || jTextField_FarmerID.getText().isEmpty()
                || jTextField_AnimalControlNumber.getText().isEmpty() || jTextField_AnimalType.getText().isEmpty()
                || jTextField_AnimalGender.getText().isEmpty() || jTextField_BreedDescription.getText().isEmpty()
                || jTextField_DateOfBirth.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill the blank fields", "Blank Field", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            //insert query statement with values from jForm textfields
            String sql = "INSERT INTO Animal (AnimalID, FarmerID, AnimalControlNumber, AnimalType, AnimalGender, "
                    + "BreedDescription, DateofBirth) "
                    + "VALUES(" + jTextField_AnimalID.getText() + ", '" + jTextField_FarmerID.getText() + "', "
                    + "'" + jTextField_AnimalControlNumber.getText() + "', '" + jTextField_AnimalType.getText() + "', "
                    + "'" + jTextField_AnimalGender.getText() + "', '" + jTextField_BreedDescription.getText() + "', "
                    + "'" + jTextField_DateOfBirth.getText() + "')";

            pst = conn.prepareStatement(sql);
            pst.execute();

            //Message dialog on the screen
            JOptionPane.showMessageDialog(null, "New Animal Successfully Added");

            //Clears the text fields after successful addition
            jTextField_Search.setText(null);
            jTextField_AnimalID.setText(null);
            jTextField_FarmerID.setText(null);
            jTextField_AnimalControlNumber.setText(null);
            jTextField_AnimalType.setText(null);
            jTextField_AnimalGender.setText(null);
            jTextField_BreedDescription.setText(null);
            jTextField_DateOfBirth.setText(null);
        } //Exception handling
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new Animal");
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_AddNewActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        //Clears the text fields
        int p = JOptionPane.showConfirmDialog(null, "Information Displayed would be cleared", "Clear", JOptionPane.YES_NO_OPTION);
        if (p == 0)
            try {
                jTextField_Search.setText(null);
                jTextField_AnimalID.setText(null);
                jTextField_FarmerID.setText(null);
                jTextField_AnimalControlNumber.setText(null);
                jTextField_AnimalType.setText(null);
                jTextField_AnimalGender.setText(null);
                jTextField_BreedDescription.setText(null);
                jTextField_DateOfBirth.setText(null);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // Deletes selected record
        if (jTextField_AnimalID.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please select record to be deleted first");
        } else {
            int p = JOptionPane.showConfirmDialog(null, "Do you really want to DELETE Animal?", "Delete", JOptionPane.YES_NO_OPTION);
            if (p == 0)
                
                try {
                String sql = "DELETE FROM Animal WHERE AnimalID = '" + jTextField_AnimalID.getText() + "'";
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Animal Deleted");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // Update selected data
        if (jTextField_AnimalID.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please select record to be updated first");
            return;
        } else {

            int p = JOptionPane.showConfirmDialog(null, "Do you really want to UPDATE Animal Info?", "Update", JOptionPane.YES_NO_OPTION);
            if (p == 0)
                
                try {
                String sql = "UPDATE Animal SET FarmerID = '" + jTextField_FarmerID.getText() + "', "
                        + "AnimalControlNumber = '" + jTextField_AnimalControlNumber.getText() + "', "
                        + "AnimalType = '" + jTextField_AnimalType.getText() + "', AnimalGender = '" + jTextField_AnimalGender.getText() + "', "
                        + "BreedDescription = '" + jTextField_BreedDescription.getText() + "', DateofBirth = '" + jTextField_DateOfBirth.getText() + "'"
                        + "WHERE AnimalID = '" + jTextField_AnimalID.getText() + "'";

                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Animal Details Successfully UPDATED");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // Search for an animal to update
        if (jTextField_Search.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Animal ID or Animal Control Number to Search");
            jTextField_Search.requestFocus();
            return;
        }

        try {
            String sql = "SELECT * FROM Animal WHERE AnimalID = ? || AnimalControlNumber = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_Search.getText());
            pst.setString(2, jTextField_Search.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("AnimalID");
                jTextField_AnimalID.setText(add1);
                String add2 = rs.getString("FarmerID");
                jTextField_FarmerID.setText(add2);
                String add3 = rs.getString("AnimalControlNumber");
                jTextField_AnimalControlNumber.setText(add3);
                String add4 = rs.getString("AnimalType");
                jTextField_AnimalType.setText(add4);
                String add5 = rs.getString("AnimalGender");
                jTextField_AnimalGender.setText(add5);
                String add6 = rs.getString("BreedDescription");
                jTextField_BreedDescription.setText(add6);
                String add7 = rs.getString("DateofBirth");
                jTextField_DateOfBirth.setText(add7);
                jTextField_Search.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "The Animal does not exist");
                jTextField_Search.requestFocus();

                //Clears the text fields
                jTextField_AnimalID.setText(null);
                jTextField_FarmerID.setText(null);
                jTextField_AnimalControlNumber.setText(null);
                jTextField_AnimalType.setText(null);
                jTextField_AnimalGender.setText(null);
                jTextField_BreedDescription.setText(null);
                jTextField_DateOfBirth.setText(null);
                jTextField_Search.requestFocus();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(Screen_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen_2().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_AnimalControlNumber;
    private javax.swing.JTextField jTextField_AnimalGender;
    private javax.swing.JTextField jTextField_AnimalID;
    private javax.swing.JTextField jTextField_AnimalType;
    private javax.swing.JTextField jTextField_BreedDescription;
    private javax.swing.JTextField jTextField_DateOfBirth;
    private javax.swing.JTextField jTextField_FarmerID;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
