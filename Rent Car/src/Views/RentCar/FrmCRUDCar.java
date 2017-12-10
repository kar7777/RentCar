/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.RentCar;

import javax.swing.JOptionPane;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 28/11/2017
 *
 */
public class FrmCRUDCar extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegisterCar
     */
    public FrmCRUDCar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    //Method to close session
    private void LogOut() {
        JOptionPane.showMessageDialog(null, "Finalized session");
        FrmLogin out = new FrmLogin();
        out.setVisible(true);
        dispose();
    }  
    
    //Method to go admin menu
    private void goMenu(){
        FrmMenuAdmin menu = new FrmMenuAdmin();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        dispose();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        lblWallpaper = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFind = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblWallpaper1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblWallpaper2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbarFile = new javax.swing.JMenu();
        mniMenuAdmin = new javax.swing.JMenuItem();
        mniLogOut = new javax.swing.JMenuItem();
        mbarExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegister.setBackground(new java.awt.Color(102, 102, 0));
        btnRegister.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 120, -1));

        lblWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/Wallpaper_Second.jpg"))); // NOI18N
        jPanel1.add(lblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 550));

        jTabbedPane1.addTab("Register", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFind.setBackground(new java.awt.Color(102, 102, 0));
        btnFind.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("Find");
        jPanel2.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 100, 30));

        btnUpdate.setBackground(new java.awt.Color(102, 102, 0));
        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, -1));

        btnDelete.setBackground(new java.awt.Color(102, 102, 0));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 100, -1));

        lblWallpaper1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/Wallpaper_Second.jpg"))); // NOI18N
        jPanel2.add(lblWallpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 550));

        jTabbedPane1.addTab("Update", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 220));

        lblWallpaper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/Wallpaper_Second.jpg"))); // NOI18N
        jPanel3.add(lblWallpaper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 550));

        jTabbedPane1.addTab("See all", jPanel3);

        mbarFile.setText("File");

        mniMenuAdmin.setText("Menu");
        mbarFile.add(mniMenuAdmin);

        mniLogOut.setText("Log Out");
        mniLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogOutActionPerformed(evt);
            }
        });
        mbarFile.add(mniLogOut);

        jMenuBar1.add(mbarFile);

        mbarExit.setText("Exit");
        mbarExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbarExitActionPerformed(evt);
            }
        });
        jMenuBar1.add(mbarExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogOutActionPerformed
        LogOut();
    }//GEN-LAST:event_mniLogOutActionPerformed

    private void mbarExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbarExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mbarExitActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCRUDCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCRUDCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCRUDCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCRUDCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCRUDCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblWallpaper;
    private javax.swing.JLabel lblWallpaper1;
    private javax.swing.JLabel lblWallpaper2;
    private javax.swing.JMenu mbarExit;
    private javax.swing.JMenu mbarFile;
    private javax.swing.JMenuItem mniLogOut;
    private javax.swing.JMenuItem mniMenuAdmin;
    // End of variables declaration//GEN-END:variables
}
