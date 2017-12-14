/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.RentCar;


import BO.RentCar.CarBO;
import Logic.RentCar.Car;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Maria Fernanda Murillo Alfaro
 * @author Karla Ballestero Castro
 *         
 */
public class FrmRentCarCustomer extends javax.swing.JFrame {
    Car c;
    CarBO carbo;
    String Fun1;
    String Fun2;
    String Fun3;
    
    /**
     * Creates new form FrmRentCarCustomer
     */
    public FrmRentCarCustomer() {
        initComponents();
        this.setLocationRelativeTo(null);
        c = new Car();
        carbo = new CarBO();
    }

    public FrmRentCarCustomer(Car c, CarBO carbo, String Fun1, String Fun2, String Fun3) {
        this.c = c;
        this.carbo = carbo;
        this.Fun1 = Fun1;
        this.Fun2 = Fun2;
        this.Fun3 = Fun3;
    }


    
    
   //MEthod for Date and Time
   public void JSpinner(){
        Date Date1 = new Date();
       SpinnerDateModel sm = 
       new SpinnerDateModel(Date1, null, null, Calendar.HOUR_OF_DAY);
       spnDateTime2 = new javax.swing.JSpinner(sm);
       JSpinner.DateEditor de = new JSpinner.DateEditor(spnDateTime2, ("DD/MM/YYYY HH:MM:SS"));
       spnDateTime2.setEditor(de);
   }
   public void AdditionalItems(String Fun1, String  Fun2, String Fun3){
        int c1, c2, c3, suma, sum;
       
    if (!Fun1.isEmpty() || !Fun2.isEmpty() || !Fun3.isEmpty()){
      c1=Integer.parseInt(Fun1);
      c2=Integer.parseInt(Fun2);
      c3=Integer.parseInt(Fun3);
      sum = (Fun1 + Fun2 + Fun3);
      suma =  sum;
        
        lblTotalAdditional.setText(String.valueOf(suma));
     
    }
     
   }
   public void Select(){
       c.setStyle_car((String) CbxSelectVehicle.getSelectedItem());
   }
   

           
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelctVehicle = new javax.swing.JLabel();
        lblSelectDate = new javax.swing.JLabel();
        lblSelectOffice = new javax.swing.JLabel();
        lblIndicate2 = new javax.swing.JLabel();
        lblIndicate = new javax.swing.JLabel();
        lblSelectDate2 = new javax.swing.JLabel();
        lblAdditionalItems = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        spnDate = new javax.swing.JSpinner(sm);
        spnDateTime2 = new javax.swing.JSpinner(sm);
        CbxSelectVehicle = new javax.swing.JComboBox<>();
        CbxSelectOffice = new javax.swing.JComboBox<>();
        cbxItem3 = new javax.swing.JComboBox<>();
        cbxItem1 = new javax.swing.JComboBox<>();
        cbxItem2 = new javax.swing.JComboBox<>();
        lblTotalAdditional = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSelctVehicle.setBackground(new java.awt.Color(255, 255, 255));
        lblSelctVehicle.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblSelctVehicle.setForeground(new java.awt.Color(255, 255, 255));
        lblSelctVehicle.setText(" Select Vehicle:");
        getContentPane().add(lblSelctVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 30));

        lblSelectDate.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblSelectDate.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectDate.setText("Select Date and Time:");
        getContentPane().add(lblSelectDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 30));

        lblSelectOffice.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblSelectOffice.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectOffice.setText("Select Office:");
        getContentPane().add(lblSelectOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 90, 30));

        lblIndicate2.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        lblIndicate2.setForeground(new java.awt.Color(255, 255, 51));
        lblIndicate2.setText("Please  Indicate  date and time of return of the vehicle");
        getContentPane().add(lblIndicate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 340, -1));

        lblIndicate.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        lblIndicate.setForeground(new java.awt.Color(255, 255, 51));
        lblIndicate.setText("Please Indicate where, date and time of vehicle removal");
        getContentPane().add(lblIndicate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 320, -1));

        lblSelectDate2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblSelectDate2.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectDate2.setText("Select Date and Time:");
        getContentPane().add(lblSelectDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, 30));

        lblAdditionalItems.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblAdditionalItems.setForeground(new java.awt.Color(255, 255, 255));
        lblAdditionalItems.setText("Additional items:");
        getContentPane().add(lblAdditionalItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/right-tick (1).png"))); // NOI18N
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/right-tick.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/right-tick.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 60, 50));

        lblTotal.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total :");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 50, 30));

        JSpinner.DateEditor de = new JSpinner.DateEditor(spnDate, ("MM/dd/yyyy hh:mm:ss"));
        spnDate.setEditor(de);
        getContentPane().add(spnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 230, 30));

        spnDateTime2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spnDateTime2KeyPressed(evt);
            }
        });
        getContentPane().add(spnDateTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 230, 30));

        CbxSelectVehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- SELECT ----", "Automobile", "Pick up", "Microbus", "Sport" }));
        CbxSelectVehicle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CbxSelectVehicleKeyPressed(evt);
            }
        });
        getContentPane().add(CbxSelectVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        CbxSelectOffice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- SELECT ----", "Ciudad Quesada", "Alajuela", "San José", "Guanacaste" }));
        getContentPane().add(CbxSelectOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        cbxItem3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 3", "Baby seat $3" }));
        getContentPane().add(cbxItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 80, 30));

        cbxItem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "GPS $9" }));
        getContentPane().add(cbxItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 80, 30));

        cbxItem2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 2", "Booster $11" }));
        getContentPane().add(cbxItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 80, 30));
        getContentPane().add(lblTotalAdditional, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 100, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RentCar/Wallpaper_Second.jpg"))); // NOI18N
        Wallpaper.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WallpaperKeyPressed(evt);
            }
        });
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spnDateTime2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnDateTime2KeyPressed
     JSpinner();
    }//GEN-LAST:event_spnDateTime2KeyPressed

    private void CbxSelectVehicleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbxSelectVehicleKeyPressed
        
    }//GEN-LAST:event_CbxSelectVehicleKeyPressed

    private void WallpaperKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WallpaperKeyPressed
      
    }//GEN-LAST:event_WallpaperKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
 String fun1=(String) cbxItem1.getSelectedItem();
 String fun2=(String) cbxItem2.getSelectedItem();
 String Fun3=(String) cbxItem3.getSelectedItem();
        AdditionalItems(fun1, fun2, Fun3);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRentCarCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRentCarCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRentCarCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRentCarCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRentCarCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxSelectOffice;
    private javax.swing.JComboBox<String> CbxSelectVehicle;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JComboBox<String> cbxItem1;
    private javax.swing.JComboBox<String> cbxItem2;
    private javax.swing.JComboBox<String> cbxItem3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblAdditionalItems;
    private javax.swing.JLabel lblIndicate;
    private javax.swing.JLabel lblIndicate2;
    private javax.swing.JLabel lblSelctVehicle;
    private javax.swing.JLabel lblSelectDate;
    private javax.swing.JLabel lblSelectDate2;
    private javax.swing.JLabel lblSelectOffice;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalAdditional;
    private javax.swing.JSpinner spnDate;
    private javax.swing.JSpinner spnDateTime2;
    // End of variables declaration//GEN-END:variables

   
}
