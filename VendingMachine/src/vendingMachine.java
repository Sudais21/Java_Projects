import javax.swing.JOptionPane;
/**
 * @author Yousafzai
 */
public class vendingMachine extends javax.swing.JFrame {

    public vendingMachine() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        moneyTF = new javax.swing.JTextField();
        changeTF = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        spriteRB = new javax.swing.JRadioButton();
        cokeRB = new javax.swing.JRadioButton();
        pepsiRB = new javax.swing.JRadioButton();
        waterRB = new javax.swing.JRadioButton();
        lemonadeRB = new javax.swing.JRadioButton();
        beerRB = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        purchaseBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("VENDING MACHINE");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 5, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 500, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Insert Money:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Change:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));
        getContentPane().add(moneyTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 116, -1));

        changeTF.setEditable(false);
        getContentPane().add(changeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 116, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select an Item"));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spriteRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spriteRB.setText("Sprite $1.25");
        spriteRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteRBActionPerformed(evt);
            }
        });
        jPanel1.add(spriteRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        cokeRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cokeRB.setText("Coke $1.25");
        cokeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeRBActionPerformed(evt);
            }
        });
        jPanel1.add(cokeRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        pepsiRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pepsiRB.setText("Pepsi $1.50");
        pepsiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiRBActionPerformed(evt);
            }
        });
        jPanel1.add(pepsiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        waterRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        waterRB.setText("Water $1.00");
        waterRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterRBActionPerformed(evt);
            }
        });
        jPanel1.add(waterRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        lemonadeRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lemonadeRB.setText("Lemonade $2.00");
        lemonadeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadeRBActionPerformed(evt);
            }
        });
        jPanel1.add(lemonadeRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        beerRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        beerRB.setText(" Beer $1.25");
        beerRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beerRBActionPerformed(evt);
            }
        });
        jPanel1.add(beerRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cold.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 480, 120));

        purchaseBtn.setBackground(new java.awt.Color(0, 255, 0));
        purchaseBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purchaseBtn.setText("Purchase");
        purchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBtnActionPerformed(evt);
            }
        });
        getContentPane().add(purchaseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 30));

        clearBtn.setBackground(new java.awt.Color(255, 255, 51));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, 30));

        cancelBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softdrinks.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 760, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 160));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 160, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed

        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        spriteRB.setSelected(false);
        cokeRB.setSelected(false);
        waterRB.setSelected(false);
        lemonadeRB.setSelected(false);
        beerRB.setSelected(false);
        pepsiRB.setSelected(false);
        
        moneyTF.setText(" ");
        changeTF.setText(" ");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void spriteRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteRBActionPerformed

        if(spriteRB.isSelected()){
            cokeRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);
            lemonadeRB.setSelected(false);
            beerRB.setSelected(false);
        }
    }//GEN-LAST:event_spriteRBActionPerformed

    private void cokeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeRBActionPerformed

        if(cokeRB.isSelected()){
            spriteRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);
            lemonadeRB.setSelected(false);
            beerRB.setSelected(false);
    }//GEN-LAST:event_cokeRBActionPerformed
    }
    private void pepsiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiRBActionPerformed

        if(pepsiRB.isSelected()){
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            waterRB.setSelected(false);
            lemonadeRB.setSelected(false);
            beerRB.setSelected(false);
        }
    }//GEN-LAST:event_pepsiRBActionPerformed

    private void waterRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterRBActionPerformed

        if(waterRB.isSelected()){
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            pepsiRB.setSelected(false);
            lemonadeRB.setSelected(false);
            beerRB.setSelected(false);
    }//GEN-LAST:event_waterRBActionPerformed
    }
    private void lemonadeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeRBActionPerformed
     
        if(lemonadeRB.isSelected()){
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);
            beerRB.setSelected(false);
    }//GEN-LAST:event_lemonadeRBActionPerformed
    }
    private void beerRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beerRBActionPerformed

           if(beerRB.isSelected()){
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);
            lemonadeRB.setSelected(false);
    }//GEN-LAST:event_beerRBActionPerformed
    }
    private void purchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBtnActionPerformed
        // TODO add your handling code here:
        double money=0;
        money=Double.parseDouble(moneyTF.getText());
        
        if(spriteRB.isSelected()){
            money=money-1.25;
        }else if(cokeRB.isSelected()){
            money=money-1.25;
        }else if(pepsiRB.isSelected()){
            money=money-1.50;
        }else if(waterRB.isSelected()){
            money=money-1.00;
        }else if(lemonadeRB.isSelected()){
            money=money-2.00;
        }else if(beerRB.isSelected()){
            money=money-1.25;
        }
        if(money<0){
            JOptionPane.showMessageDialog(rootPane,"Sorry You Do Not Have Enough Money");
        }else{
            changeTF.setText(Double.toString(money));
        }
            
    }//GEN-LAST:event_purchaseBtnActionPerformed

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
            java.util.logging.Logger.getLogger(vendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendingMachine().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton beerRB;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField changeTF;
    private javax.swing.JButton clearBtn;
    private javax.swing.JRadioButton cokeRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton lemonadeRB;
    private javax.swing.JTextField moneyTF;
    private javax.swing.JRadioButton pepsiRB;
    private javax.swing.JButton purchaseBtn;
    private javax.swing.JRadioButton spriteRB;
    private javax.swing.JRadioButton waterRB;
    // End of variables declaration//GEN-END:variables
}
