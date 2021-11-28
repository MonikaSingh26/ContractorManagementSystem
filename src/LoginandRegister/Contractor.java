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
public class Contractor extends javax.swing.JFrame {

    /**
     * Creates new form Contractor
     */
    public Contractor() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewcon = new javax.swing.JButton();
        viewlv = new javax.swing.JButton();
        viewsal = new javax.swing.JButton();
        viewtmsh = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONTRACTOR SECTION");

        viewcon.setBackground(new java.awt.Color(204, 204, 255));
        viewcon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewcon.setText("VIEW MY DETAILS");
        viewcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewconActionPerformed(evt);
            }
        });

        viewlv.setBackground(new java.awt.Color(255, 255, 153));
        viewlv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewlv.setText("VIEW MY LEAVE DETAILS");
        viewlv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewlv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewlvActionPerformed(evt);
            }
        });

        viewsal.setBackground(new java.awt.Color(204, 255, 204));
        viewsal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewsal.setText("VIEW MY SALARY DETAILS");
        viewsal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewsalActionPerformed(evt);
            }
        });

        viewtmsh.setBackground(new java.awt.Color(255, 153, 255));
        viewtmsh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewtmsh.setText("VIEW TIMESHEET DETAILS");
        viewtmsh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewtmsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtmshActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 204, 153));
        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("LOGOUT");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(153, 255, 204));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("BACK");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout))
                    .addComponent(viewtmsh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(viewsal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewlv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(307, 307, 307))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(viewcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(viewlv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(viewsal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(viewtmsh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout)
                    .addComponent(back))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        Login obj= new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        Welcome obj= new Welcome();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contractor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewcon;
    private javax.swing.JButton viewlv;
    private javax.swing.JButton viewsal;
    private javax.swing.JButton viewtmsh;
    // End of variables declaration//GEN-END:variables
}
