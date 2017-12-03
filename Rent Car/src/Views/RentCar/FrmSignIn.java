/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.RentCar;

import BO.RentCar.CustomerBO;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import Logic.RentCar.Customer;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 19/11/2017
 *
 */
public class FrmSignIn extends javax.swing.JFrame {

    private LinkedList<Customer> customerList;
    private File file;
    private String photo;

    /**
     * Creates new form FrmSignIn
     */
    public FrmSignIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        customerList = new LinkedList<>();
    }

    public FrmSignIn(LinkedList<Customer> customerList) {
        this.customerList = customerList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblDirection = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        lblPassword2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDirection = new javax.swing.JTextArea();
        password1 = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        lblPhoto = new javax.swing.JLabel();
        btnSelectPhoto = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblRegister = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID:");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lblName.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        lblLastname.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblLastname.setForeground(new java.awt.Color(255, 255, 255));
        lblLastname.setText("Lastname:");
        getContentPane().add(lblLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        lblTelephone.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblTelephone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelephone.setText("Telephone:");
        getContentPane().add(lblTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        lblDirection.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblDirection.setForeground(new java.awt.Color(255, 255, 255));
        lblDirection.setText("Direction:");
        getContentPane().add(lblDirection, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        lblPassword1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword1.setText("Password:");
        getContentPane().add(lblPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        lblPassword2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblPassword2.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword2.setText("Password:");
        getContentPane().add(lblPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        txtID.setBackground(new java.awt.Color(51, 51, 51));
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, -1));

        txtName.setBackground(new java.awt.Color(51, 51, 51));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, -1));

        txtLastname.setBackground(new java.awt.Color(51, 51, 51));
        txtLastname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, -1));

        txtTelephone.setBackground(new java.awt.Color(51, 51, 51));
        txtTelephone.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 120, -1));

        txaDirection.setBackground(new java.awt.Color(51, 51, 51));
        txaDirection.setColumns(20);
        txaDirection.setForeground(new java.awt.Color(255, 255, 255));
        txaDirection.setRows(5);
        jScrollPane1.setViewportView(txaDirection);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 250, 100));

        password1.setBackground(new java.awt.Color(51, 51, 51));
        password1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 136, -1));

        password2.setBackground(new java.awt.Color(51, 51, 51));
        password2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 136, -1));
        getContentPane().add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 144, 154));

        btnSelectPhoto.setBackground(new java.awt.Color(152, 120, 22));
        btnSelectPhoto.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        btnSelectPhoto.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/imagen.png"))); // NOI18N
        btnSelectPhoto.setText("Select a photo");
        btnSelectPhoto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/imagen (1).png"))); // NOI18N
        btnSelectPhoto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/imagen (1).png"))); // NOI18N
        btnSelectPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPhotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelectPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        btnRegister.setBackground(new java.awt.Color(152, 120, 22));
        btnRegister.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 80, -1));

        lblRegister.setBackground(new java.awt.Color(255, 153, 0));
        lblRegister.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("REGISTER");
        getContentPane().add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 100, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 26, 180, 40));

        lblWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/Wallpaper_Second.jpg"))); // NOI18N
        getContentPane().add(lblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method for find a photo
    private void findPhoto() {
        int result;
        FrmPhoto frm = new FrmPhoto();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG and PNG", "jpg", "png");
        frm.jfchPhoto.setFileFilter(filter);
        result = frm.jfchPhoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == result) {
            file = frm.jfchPhoto.getSelectedFile();
            try {
                ImageIcon icon = new ImageIcon(file.toString());
                photo = file.toString();
                Icon picture = new ImageIcon(icon.getImage().getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_DEFAULT));
                lblPhoto.setText("");
                lblPhoto.setIcon(picture);
            } catch (Exception ex) {
                System.out.println("Error opening the image" + ex);
            }
        }
    }

    //Method to register
    private void registerNewCustomer() {
        try {
            CustomerBO cbo = new CustomerBO();
            Customer c = new Customer();
            c.setId_customer(Integer.parseInt(txtID.getText()));
            c.setName(txtName.getText());
            c.setLastname(txtLastname.getText());
            c.setTelephone(Integer.parseInt(txtTelephone.getText()));
            c.setDirection(txaDirection.getText());
            c.setPhoto(photo);

            if (password1.getText().equals(password2.getText())) {
                c.setPassword(password1.getText());

                if (cbo.register(c)) {
                    JOptionPane.showMessageDialog(null, "Registered");
                }
                System.out.println(c.getName() + " " + c.getLastname());

                goLogin();

            } else {
                JOptionPane.showMessageDialog(null, "Passwords do not match");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    //Method to go to the login
    private void goLogin() {
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        dispose();
    }


    private void btnSelectPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPhotoActionPerformed
        findPhoto();
    }//GEN-LAST:event_btnSelectPhotoActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        registerNewCustomer();
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
            java.util.logging.Logger.getLogger(FrmSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSelectPhoto;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDirection;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblWallpaper;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextArea txaDirection;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
