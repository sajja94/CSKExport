/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Sachitha
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

////    /**
////     * This method is called from within the constructor to initialize the form.
////     * WARNING: Do NOT modify this code. The content of this method is always
////     * regenerated by the Form Editor.
////     */
////    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cashTextField1 = new javax.swing.JTextField();
        addButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        removeButton1 = new javax.swing.JButton();
        balanceTextField1 = new javax.swing.JTextField();
        sidTextField1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        payButton1 = new javax.swing.JButton();
        quantityTextField3 = new javax.swing.JTextField();
        quantityTextField4 = new javax.swing.JTextField();
        itemComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        quantityTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        totalTextField1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cashTextField1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cashTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashTextField1ActionPerformed(evt);
            }
        });
        cashTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cashTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cashTextField1KeyTyped(evt);
            }
        });

        addButton1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        addButton1.setText("ADD");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });
        addButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addButton1KeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel21.setText("Reduce Weight");

        orderTable1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        orderTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SID", "Catagory", "Item", "Sell Price", "Quantity", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable1);

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel9.setText("Total :");

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel17.setText("Balance :");

        removeButton1.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        removeButton1.setText("Remove Item");
        removeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButton1ActionPerformed(evt);
            }
        });

        balanceTextField1.setEditable(false);
        balanceTextField1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        sidTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidTextField1ActionPerformed(evt);
            }
        });
        sidTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sidTextField1KeyPressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel22.setText("Cash :");

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("Payment No:");

        payButton1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        payButton1.setText("Print");
        payButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButton1ActionPerformed(evt);
            }
        });

        quantityTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextField3ActionPerformed(evt);
            }
        });
        quantityTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityTextField3KeyTyped(evt);
            }
        });

        quantityTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextField4ActionPerformed(evt);
            }
        });
        quantityTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityTextField4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityTextField4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityTextField4KeyTyped(evt);
            }
        });

        itemComboBox1.setEditable(true);
        itemComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComboBox1ActionPerformed(evt);
            }
        });
        itemComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemComboBox1KeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel6.setText("Cynnamon Type");

        quantityTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextField5ActionPerformed(evt);
            }
        });
        quantityTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityTextField5KeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel15.setText("Gross Weight");

        totalTextField1.setEditable(false);
        totalTextField1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        totalTextField1.setForeground(new java.awt.Color(255, 0, 0));
        totalTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextField1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel23.setText("Wet Weight");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(payButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel22)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(balanceTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(cashTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(itemComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(sidTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(quantityTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(27, 27, 27)
                        .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantityTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(quantityTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel15)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(removeButton1)
                        .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(cashTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(balanceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(payButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Main");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem1");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem1");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem1");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem5.setText("jMenuItem1");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem1");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("jMenuItem1");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cashTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashTextField1ActionPerformed

    private void cashTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashTextField1KeyPressed

    private void cashTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashTextField1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cashTextField1KeyReleased

    private void cashTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashTextField1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cashTextField1KeyTyped

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButton1ActionPerformed

    private void addButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButton1KeyPressed

    private void removeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeButton1ActionPerformed

    private void sidTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidTextField1ActionPerformed

    private void sidTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sidTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidTextField1KeyPressed

    private void payButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payButton1ActionPerformed

    private void quantityTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField3ActionPerformed

    private void quantityTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextField3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField3KeyPressed

    private void quantityTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextField3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField3KeyReleased

    private void quantityTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextField3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField3KeyTyped

    private void quantityTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField4ActionPerformed

    private void quantityTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextField4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField4KeyPressed

    private void quantityTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextField4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField4KeyReleased

    private void quantityTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextField4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField4KeyTyped

    private void itemComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemComboBox1ActionPerformed

    private void itemComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemComboBox1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemComboBox1KeyPressed

    private void quantityTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField5ActionPerformed

    private void quantityTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField5KeyPressed

    private void quantityTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextField5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField5KeyReleased

    private void quantityTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextField5KeyTyped

    private void totalTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton1;
    private javax.swing.JTextField balanceTextField1;
    private javax.swing.JTextField cashTextField1;
    private javax.swing.JComboBox itemComboBox1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable1;
    private javax.swing.JButton payButton1;
    private javax.swing.JTextField quantityTextField3;
    private javax.swing.JTextField quantityTextField4;
    private javax.swing.JTextField quantityTextField5;
    private javax.swing.JButton removeButton1;
    private javax.swing.JTextField sidTextField1;
    private static javax.swing.JTextField totalTextField1;
    // End of variables declaration//GEN-END:variables
}