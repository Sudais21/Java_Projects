import java.text.DecimalFormat;
/**
 * @author Sudais Yousafzai
 */
public class Coffee extends javax.swing.JFrame {
    /**
     * Creates new form Coffee
     */
    public Coffee() {
        initComponents();
        this.setLocation(50,20);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        radCoffee = new javax.swing.JRadioButton();
        radCap = new javax.swing.JRadioButton();
        radTea = new javax.swing.JRadioButton();
        chkBag = new javax.swing.JCheckBox();
        chkCro = new javax.swing.JCheckBox();
        chkToa = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSub = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTax = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTot = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEnt = new javax.swing.JButton();
        btnCle = new javax.swing.JButton();
        btnExi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Coffee Shop");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 340, -1));

        radCoffee.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        radCoffee.setForeground(new java.awt.Color(0, 0, 204));
        radCoffee.setText("Coffee $1.00");
        radCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCoffeeActionPerformed(evt);
            }
        });
        getContentPane().add(radCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 200, -1));

        radCap.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        radCap.setForeground(new java.awt.Color(0, 0, 255));
        radCap.setText("Cappuccino $1.25");
        radCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCapActionPerformed(evt);
            }
        });
        getContentPane().add(radCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        radTea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        radTea.setForeground(new java.awt.Color(0, 0, 255));
        radTea.setText("Tea $1.00");
        radTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTeaActionPerformed(evt);
            }
        });
        getContentPane().add(radTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 160, -1));

        chkBag.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chkBag.setForeground(new java.awt.Color(0, 0, 255));
        chkBag.setText("Bagels $1.25");
        getContentPane().add(chkBag, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        chkCro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chkCro.setForeground(new java.awt.Color(0, 0, 255));
        chkCro.setText("Croissant $1.15");
        getContentPane().add(chkCro, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));

        chkToa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chkToa.setForeground(new java.awt.Color(0, 0, 255));
        chkToa.setText("Toast $.50");
        getContentPane().add(chkToa, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));

        jScrollPane1.setViewportView(txtSub);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 117, -1));

        jScrollPane2.setViewportView(txtTax);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 117, -1));

        jScrollPane3.setViewportView(txtTot);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 117, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("Subtotal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("Tax");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Total");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        btnEnt.setBackground(new java.awt.Color(0, 255, 0));
        btnEnt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnt.setText("Enter");
        btnEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 70, -1));

        btnCle.setBackground(new java.awt.Color(255, 255, 51));
        btnCle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCle.setText("Clear");
        btnCle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleActionPerformed(evt);
            }
        });
        getContentPane().add(btnCle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 70, -1));

        btnExi.setBackground(new java.awt.Color(255, 0, 0));
        btnExi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExi.setText("Exit");
        btnExi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExiActionPerformed(evt);
            }
        });
        getContentPane().add(btnExi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Manufacture By Sudais Yousafzai");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCoffeeActionPerformed
        // TODO add your handling code here:
        if(radCoffee.isSelected())
            radCap.setSelected(false);
            radTea.setSelected(false);
            
    }//GEN-LAST:event_radCoffeeActionPerformed

    private void radCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCapActionPerformed
        // TODO add your handling code here:
        if(radCap.isSelected())
            radCoffee.setSelected(false);
            radTea.setSelected(false);
            
    }//GEN-LAST:event_radCapActionPerformed

    private void radTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTeaActionPerformed
        // TODO add your handling code here:
           if(radTea.isSelected())
            radCoffee.setSelected(false);
            radCap.setSelected(false);
    }//GEN-LAST:event_radTeaActionPerformed

    private void btnEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntActionPerformed
        // TODO add your handling code here:
        DecimalFormat df=new DecimalFormat("0.00");
        double total;
        double subtotal = 0;
        final double TAXRATE =0.8;
        double tax;
        
        if(radCoffee.isSelected()){
            subtotal=subtotal + 1;
        }
        else if(radCap.isSelected()){
            subtotal=subtotal + 1.25;
        }
        else if(radTea.isSelected()){
            subtotal=subtotal + 1;
        }
        if(chkBag.isSelected()){
            subtotal=subtotal + 1.25;
        }
        if(chkCro.isSelected()){
            subtotal=subtotal + 1.15;
        }
        if(chkToa.isSelected()){
            subtotal=subtotal + .5;
        }
        txtSub.setText(Double.toString(subtotal));
        subtotal=Double.parseDouble(txtSub.getText());
        tax=subtotal*TAXRATE;
        total=tax+subtotal;
        
        txtTax.setText(Double.toString(tax));
        txtTot.setText(Double.toString(total));
        
        txtTax.setText(df.format(tax));
        txtSub.setText(df.format(subtotal));
        txtTot.setText(df.format(total));
    }//GEN-LAST:event_btnEntActionPerformed

    private void btnExiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExiActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExiActionPerformed

    private void btnCleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleActionPerformed
        // TODO add your handling code here:
        radCoffee.setSelected(false);
        radCap.setSelected(false);
        radTea.setSelected(false);
        chkBag.setSelected(false);
        chkCro.setSelected(false);
        chkToa.setSelected(false);
        txtTot.setText("");
        txtTax.setText("");
        txtSub.setText("");
    }//GEN-LAST:event_btnCleActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coffee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCle;
    private javax.swing.JButton btnEnt;
    private javax.swing.JButton btnExi;
    private javax.swing.JCheckBox chkBag;
    private javax.swing.JCheckBox chkCro;
    private javax.swing.JCheckBox chkToa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radCap;
    private javax.swing.JRadioButton radCoffee;
    private javax.swing.JRadioButton radTea;
    private javax.swing.JTextPane txtSub;
    private javax.swing.JTextPane txtTax;
    private javax.swing.JTextPane txtTot;
    // End of variables declaration//GEN-END:variables
}
