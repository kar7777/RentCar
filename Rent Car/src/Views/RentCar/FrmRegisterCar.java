/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.RentCar;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 28/11/2017
 *
 */
public class FrmRegisterCar extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegisterCar
     */
    public FrmRegisterCar() {
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

        lblMain = new javax.swing.JLabel();
        lblLicensePlate = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMain.setText("ADD A NEW CAR");
        getContentPane().add(lblMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        lblLicensePlate.setText("License Plate:");
        getContentPane().add(lblLicensePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, -1, -1));
        getContentPane().add(txtLicensePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 137, -1));

        jLabel3.setText("Brand:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, -1, -1));
        getContentPane().add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 137, -1));

        lblModel.setText("Model:");
        getContentPane().add(lblModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 231, -1, -1));
        getContentPane().add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 137, -1));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/Wallpaper_Second.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmRegisterCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegisterCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblModel;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtModel;
    // End of variables declaration//GEN-END:variables
}
