/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginandRegister;

/**
 *
 * @author Dell
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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
        addcon = new javax.swing.JButton();
        addlv = new javax.swing.JButton();
        addsl = new javax.swing.JButton();
        addtms = new javax.swing.JButton();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        editcon = new javax.swing.JButton();
        editlv = new javax.swing.JButton();
        editsal = new javax.swing.JButton();
        edittmsh = new javax.swing.JButton();
        delcon = new javax.swing.JButton();
        dellv = new javax.swing.JButton();
        delsal = new javax.swing.JButton();
        deltmsh = new javax.swing.JButton();
        viewcon = new javax.swing.JButton();
        viewlv = new javax.swing.JButton();
        viewsal = new javax.swing.JButton();
        viewtmsh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ADMIN SECTION");

        addcon.setBackground(new java.awt.Color(204, 204, 255));
        addcon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addcon.setText("ADD CONTRACTOR");
        addcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addconActionPerformed(evt);
            }
        });

        addlv.setBackground(new java.awt.Color(255, 204, 255));
        addlv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addlv.setText("ADD LEAVE");
        addlv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addlv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlvActionPerformed(evt);
            }
        });

        addsl.setBackground(new java.awt.Color(255, 255, 204));
        addsl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addsl.setText("ADD SALARY");
        addsl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addslActionPerformed(evt);
            }
        });

        addtms.setBackground(new java.awt.Color(204, 255, 204));
        addtms.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addtms.setText("ADD TIMESHEET");
        addtms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addtms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtmsActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(102, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("BACK");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 204, 255));
        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setText("LOGOUT");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        editcon.setBackground(new java.awt.Color(204, 204, 255));
        editcon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editcon.setText("EDIT CONTRACTOR");
        editcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editconActionPerformed(evt);
            }
        });

        editlv.setBackground(new java.awt.Color(255, 204, 255));
        editlv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editlv.setText("EDIT LEAVE");
        editlv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editlv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editlvActionPerformed(evt);
            }
        });

        editsal.setBackground(new java.awt.Color(255, 255, 204));
        editsal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editsal.setText("EDIT SALARY");
        editsal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsalActionPerformed(evt);
            }
        });

        edittmsh.setBackground(new java.awt.Color(204, 255, 204));
        edittmsh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edittmsh.setText("EDIT TIMESHEET");
        edittmsh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edittmsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittmshActionPerformed(evt);
            }
        });

        delcon.setBackground(new java.awt.Color(204, 204, 255));
        delcon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delcon.setText("DELETE CONTRACTOR");
        delcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delconActionPerformed(evt);
            }
        });

        dellv.setBackground(new java.awt.Color(255, 204, 255));
        dellv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dellv.setText("DELETE LEAVE");
        dellv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dellv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dellvActionPerformed(evt);
            }
        });

        delsal.setBackground(new java.awt.Color(255, 255, 204));
        delsal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delsal.setText("DELETE SALARY");
        delsal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delsalActionPerformed(evt);
            }
        });

        deltmsh.setBackground(new java.awt.Color(204, 255, 204));
        deltmsh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deltmsh.setText("DELETE TIMESHEET");
        deltmsh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deltmsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltmshActionPerformed(evt);
            }
        });

        viewcon.setBackground(new java.awt.Color(204, 204, 255));
        viewcon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewcon.setText("VIEW CONTRACTOR DETAILS");
        viewcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewconActionPerformed(evt);
            }
        });

        viewlv.setBackground(new java.awt.Color(255, 204, 255));
        viewlv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewlv.setText("VIEW LEAVE DETAILS");
        viewlv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewlv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewlvActionPerformed(evt);
            }
        });

        viewsal.setBackground(new java.awt.Color(255, 255, 204));
        viewsal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewsal.setText("VIEW SALARY DETAILS");
        viewsal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewsalActionPerformed(evt);
            }
        });

        viewtmsh.setBackground(new java.awt.Color(204, 255, 204));
        viewtmsh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewtmsh.setText("VIEW TIMESHEET DETAILS");
        viewtmsh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewtmsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtmshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addlv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addcon, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(addsl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addtms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editcon, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(editlv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editsal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edittmsh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(delcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dellv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delsal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deltmsh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewlv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewcon, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(viewsal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewtmsh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(393, 393, 393))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addlv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editlv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dellv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewlv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editsal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delsal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewsal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addsl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtms, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edittmsh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deltmsh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtmsh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addconActionPerformed
        
        AddContractor obj= new AddContractor();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_addconActionPerformed

    private void addslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addslActionPerformed
        
        AddSalary obj= new AddSalary();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_addslActionPerformed

    private void addlvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlvActionPerformed
        
        AddLeaves obj= new AddLeaves();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_addlvActionPerformed

    private void addtmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtmsActionPerformed
        
        AddTimesheet obj= new AddTimesheet();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_addtmsActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        Welcome obj= new Welcome();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
        Login obj= new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void editconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editconActionPerformed
        
        Editcon obj= new Editcon();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_editconActionPerformed

    private void editlvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editlvActionPerformed
        
        Editlv obj= new Editlv();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_editlvActionPerformed

    private void editsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsalActionPerformed
        
        Editsal obj= new Editsal();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_editsalActionPerformed

    private void edittmshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittmshActionPerformed
         Edittimesh obj= new Edittimesh();
         obj.setVisible(true);
         dispose();
        
    }//GEN-LAST:event_edittmshActionPerformed

    private void delconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delconActionPerformed
        
        Deletecon obj= new Deletecon();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_delconActionPerformed

    private void dellvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dellvActionPerformed
        Deletelv obj= new Deletelv();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_dellvActionPerformed

    private void delsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delsalActionPerformed
        
        Deletesal obj= new Deletesal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_delsalActionPerformed

    private void deltmshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltmshActionPerformed
        Deletetimesh obj= new Deletetimesh();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_deltmshActionPerformed

    private void viewconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewconActionPerformed
        
        Viewcondetails obj= new Viewcondetails();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewconActionPerformed

    private void viewlvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewlvActionPerformed
        
        Viewlvdetails obj= new Viewlvdetails();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_viewlvActionPerformed

    private void viewsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewsalActionPerformed
        
        Viewsaldetails obj= new Viewsaldetails();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_viewsalActionPerformed

    private void viewtmshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtmshActionPerformed
        
        Viewtimedetails obj= new Viewtimedetails();
        obj.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_viewtmshActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcon;
    private javax.swing.JButton addlv;
    private javax.swing.JButton addsl;
    private javax.swing.JButton addtms;
    private javax.swing.JButton back;
    private javax.swing.JButton delcon;
    private javax.swing.JButton dellv;
    private javax.swing.JButton delsal;
    private javax.swing.JButton deltmsh;
    private javax.swing.JButton editcon;
    private javax.swing.JButton editlv;
    private javax.swing.JButton editsal;
    private javax.swing.JButton edittmsh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewcon;
    private javax.swing.JButton viewlv;
    private javax.swing.JButton viewsal;
    private javax.swing.JButton viewtmsh;
    // End of variables declaration//GEN-END:variables
}