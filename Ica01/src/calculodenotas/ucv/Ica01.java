/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodenotas.ucv;

/**
 *
 * @author TICVC
 */
public class Ica01 extends javax.swing.JFrame {

    public Double value;
    public double cont[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,0.0};

    /**
     * Creates new form Ica01
     */
    public Ica01() {
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
        txt100 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProdut = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt50 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        btnExec = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtVal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtResult1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt050 = new javax.swing.JTextField();
        txt010 = new javax.swing.JTextField();
        txt05 = new javax.swing.JTextField();
        txt025 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor do produto");

        txt100.setText(" ");
        txt100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt100ActionPerformed(evt);
            }
        });

        jLabel2.setText("100 R$");

        jLabel3.setText("50 R$");

        jLabel4.setText("5 R$");

        jLabel5.setText("20 R$");

        jLabel6.setText("1R$(Moeda)");

        txtProdut.setText(".00");
        txtProdut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutActionPerformed(evt);
            }
        });

        txt20.setText(" ");
        txt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt20ActionPerformed(evt);
            }
        });

        txt50.setText(" ");
        txt50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt50ActionPerformed(evt);
            }
        });

        txt5.setText(" ");
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        txt1.setText(" ");
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        btnExec.setText("Efetuar");
        btnExec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor recebido");

        txtVal.setText(".00");
        txtVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValActionPerformed(evt);
            }
        });

        jLabel8.setText("Troco");

        txtResult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResult1ActionPerformed(evt);
            }
        });

        jLabel9.setText("10 R$");

        txt10.setText(" ");
        txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt10ActionPerformed(evt);
            }
        });

        jLabel10.setText("50 C$(Moeda)");

        jLabel11.setText("25 C$ (Moeda)");

        jLabel12.setText("5 C$ (Moeda)");

        jLabel13.setText("10 C$ (Moeda)");

        txt050.setText(" ");
        txt050.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt050ActionPerformed(evt);
            }
        });

        txt010.setText(" ");
        txt010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt010ActionPerformed(evt);
            }
        });

        txt05.setText(" ");
        txt05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt05ActionPerformed(evt);
            }
        });

        txt025.setText(" ");
        txt025.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt025ActionPerformed(evt);
            }
        });

        txt2.setText(" ");
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        jLabel14.setText(" 2 R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProdut, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt100, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel6))
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt05, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addComponent(txt010, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt025, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt050, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(txtResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExec)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResult1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt050, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt025, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt010, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(48, 48, 48)
                .addComponent(btnExec)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt100ActionPerformed

    private void txtProdutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutActionPerformed

    private void txt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20ActionPerformed

    private void txt50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt50ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void btnExecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecActionPerformed
        // TODO add your handling code here:
        txt100.setText("");
        txt20.setText("");
        txt50.setText("");
        txt5.setText("");
        txt2.setText("");
        txt1.setText("");
        txt10.setText("");
        txt050.setText("");
        txt025.setText("");
        txt010.setText("");
        txt05.setText("");

        for (int i = 0; i < this.cont.length; i++) {
            cont[i] = 0.0;
        }

        this.value = Double.parseDouble(txtVal.getText()) - Double.parseDouble(txtProdut.getText());

        if (this.value < 0) {
            this.value *= -1;
        }
        
        

        txtResult1.setText(String.format("%.2f", this.value));

        while (this.value > 0) {

            if (this.value - 100 >= 0) {

                txt100.setText( String.format("%.0f",++this.cont[0]));;
                this.value -= 100;
            } else if (this.value - 50 >= 0) {
                txt50.setText( String.format("%.0f",++this.cont[1]));
                this.value -= 50;
            } else if (this.value - 20 >= 0) {
                txt20.setText( String.format("%.0f",++this.cont[2]));
                this.value -= 20;
            } else if (this.value - 10 >= 0) {
                txt10.setText( String.format("%.0f",++this.cont[3]));
                this.value -= 10;
            } else if (this.value - 5 >= 0) {
                txt5.setText( String.format("%.0f",++this.cont[4]));
                this.value -= 5;
            } else if (this.value - 1 >= 0) {
                txt1.setText( String.format("%.0f",++this.cont[5]));
                this.value--;
            }else if (this.value - 2 >= 0) {
                txt1.setText( String.format("%.0f",++this.cont[6]));
                this.value--;
            } else if (this.value - 0.5 >= 0) {
                txt050.setText( String.format("%.0f",++this.cont[7]));
                this.value -= 0.5;
            } else if (this.value - 0.25 >= 0) {
                txt025.setText( String.format("%.0f",++this.cont[8]));
                this.value -= 0.25;
            } else if (this.value - 0.10 >= 0) {
                txt010.setText( String.format("%.0f",++this.cont[9]));
                this.value -= 0.1;
            } else if (this.value - 0.05 >= 0) {
                txt05.setText( String.format("%.0f",++this.cont[10]));
                this.value -= 0.05;
            } else {
                this.value = 0.0;
            }
        }
    }//GEN-LAST:event_btnExecActionPerformed

    private void txtValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValActionPerformed

    private void txtResult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResult1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResult1ActionPerformed

    private void txt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt10ActionPerformed

    private void txt050ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt050ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt050ActionPerformed

    private void txt010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt010ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt010ActionPerformed

    private void txt05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt05ActionPerformed

    private void txt025ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt025ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt025ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ica01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt010;
    private javax.swing.JTextField txt025;
    private javax.swing.JTextField txt05;
    private javax.swing.JTextField txt050;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt100;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt50;
    private javax.swing.JTextField txtProdut;
    private javax.swing.JTextField txtResult1;
    private javax.swing.JTextField txtVal;
    // End of variables declaration//GEN-END:variables
}
