/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.curso.soma;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class TelaDeSoma extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeSoma
     */
    public TelaDeSoma() {
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldParcela1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldParcela2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jButtonSoma = new javax.swing.JButton();
        jButtonSubtracao = new javax.swing.JButton();
        jTextFieldMinuento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSubtraento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabelResultado2 = new javax.swing.JLabel();
        jButtonMultiplicacao = new javax.swing.JButton();
        jTextFieldFator1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFator2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabelProduto = new javax.swing.JLabel();
        jButtonDivisao = new javax.swing.JButton();
        jTextFieldDividendo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDivisor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabelQuociente = new javax.swing.JLabel();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 36)); // NOI18N
        jLabel1.setText("Calcudora 3.0");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 20, 260, 56);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matematicas.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 80, 64);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 90);

        jTextFieldParcela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldParcela1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldParcela1);
        jTextFieldParcela1.setBounds(190, 140, 80, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("+");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 140, 30, 32);

        jTextFieldParcela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldParcela2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldParcela2);
        jTextFieldParcela2.setBounds(330, 140, 80, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("=");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 140, 20, 32);

        jLabelResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jLabelResultado);
        jLabelResultado.setBounds(480, 140, 100, 30);

        jButtonSoma.setBackground(new java.awt.Color(204, 255, 204));
        jButtonSoma.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonSoma.setText("Soma");
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSoma);
        jButtonSoma.setBounds(20, 140, 110, 30);

        jButtonSubtracao.setBackground(new java.awt.Color(204, 255, 204));
        jButtonSubtracao.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonSubtracao.setText("Subtração");
        jButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtracaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSubtracao);
        jButtonSubtracao.setBounds(20, 200, 110, 30);

        jTextFieldMinuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMinuentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMinuento);
        jTextFieldMinuento.setBounds(190, 200, 80, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("-");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 200, 30, 32);

        jTextFieldSubtraento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubtraentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSubtraento);
        jTextFieldSubtraento.setBounds(330, 200, 80, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("=");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(430, 200, 20, 32);

        jLabelResultado2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jLabelResultado2);
        jLabelResultado2.setBounds(480, 200, 100, 30);

        jButtonMultiplicacao.setBackground(new java.awt.Color(204, 255, 204));
        jButtonMultiplicacao.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonMultiplicacao.setText("Multiplicação");
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMultiplicacao);
        jButtonMultiplicacao.setBounds(20, 260, 140, 30);

        jTextFieldFator1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFator1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFator1);
        jTextFieldFator1.setBounds(190, 260, 80, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("X");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 260, 30, 25);

        jTextFieldFator2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFator2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFator2);
        jTextFieldFator2.setBounds(330, 260, 80, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("=");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 260, 20, 32);

        jLabelProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jLabelProduto);
        jLabelProduto.setBounds(480, 260, 100, 30);

        jButtonDivisao.setBackground(new java.awt.Color(204, 255, 204));
        jButtonDivisao.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonDivisao.setText("Divisão");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDivisao);
        jButtonDivisao.setBounds(20, 320, 140, 30);

        jTextFieldDividendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDividendoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDividendo);
        jTextFieldDividendo.setBounds(190, 320, 80, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("/");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 320, 30, 32);

        jTextFieldDivisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDivisorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDivisor);
        jTextFieldDivisor.setBounds(330, 320, 80, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("=");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(430, 320, 20, 32);

        jLabelQuociente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jLabelQuociente);
        jLabelQuociente.setBounds(480, 320, 100, 30);

        jButtonLimpar.setBackground(new java.awt.Color(255, 102, 153));
        jButtonLimpar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar);
        jButtonLimpar.setBounds(20, 390, 100, 40);

        setSize(new java.awt.Dimension(607, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldParcela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldParcela2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParcela2ActionPerformed

    private void jButtonSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomaActionPerformed
                    
        if(jTextFieldParcela1.getText().isEmpty() || jTextFieldParcela2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite um valor","Atenção",JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldParcela1.getText().matches("[A-Za-z-]+") || jTextFieldParcela2.getText().matches("[A-Za-z-]+")){
            
            JOptionPane.showMessageDialog(this, "Digite número", "Atenção",JOptionPane.WARNING_MESSAGE);
            
        }else{
            
            double parcela1 = Double.parseDouble(jTextFieldParcela1.getText());
            double parcela2 = Double.parseDouble(jTextFieldParcela2.getText());
            
            double resultado = parcela1 + parcela2;
            
            jLabelResultado.setText(Double.toString(resultado));
        }
    }//GEN-LAST:event_jButtonSomaActionPerformed

    private void jTextFieldParcela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldParcela1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParcela1ActionPerformed

    private void jButtonSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtracaoActionPerformed
        if(jTextFieldMinuento.getText().isEmpty() || jTextFieldSubtraento.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, digite um valor","Atenção",JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldMinuento.getText().matches("[A-Za-z-]+") || jTextFieldSubtraento.getText().matches("[A-Za-z-]+")){
            
            JOptionPane.showMessageDialog(this, "Digite número não letra","Atenção",JOptionPane.WARNING_MESSAGE);
            
        }else{
             double valorSub1 = Double.parseDouble(jTextFieldMinuento.getText());
             double valorSub2 = Double.parseDouble(jTextFieldSubtraento.getText());
             
             double resultadoSub = valorSub1 - valorSub2;
             
             jLabelResultado2.setText(Double.toString(resultadoSub));
        }
    }//GEN-LAST:event_jButtonSubtracaoActionPerformed

    private void jTextFieldMinuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinuentoActionPerformed

    private void jTextFieldSubtraentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubtraentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubtraentoActionPerformed

    private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacaoActionPerformed
        if(jTextFieldFator1.getText().isEmpty() || jTextFieldFator2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, digite um número","Atenção",JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldFator1.getText().matches("[A-Za-z-]+") || jTextFieldFator2.getText().matches("[A-Za-z-]+")){
            JOptionPane.showMessageDialog(this, "Digite número não letra","Atenção",JOptionPane.WARNING_MESSAGE);
        }else{
            
            int valorMult = Integer.parseInt(jTextFieldFator1.getText());
            int valorMult2 = Integer.parseInt(jTextFieldFator2.getText());
            
            int produto = valorMult*valorMult2;
            
            jLabelProduto.setText(Integer.toString(produto));
            
        }
    }//GEN-LAST:event_jButtonMultiplicacaoActionPerformed

    private void jTextFieldFator1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFator1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFator1ActionPerformed

    private void jTextFieldFator2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFator2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFator2ActionPerformed

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
        if(jTextFieldDividendo.getText().isEmpty() || jTextFieldDivisor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, digite um número","Atenção",JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldDividendo.getText().matches("[A-Za-z-]+") || jTextFieldDivisor.getText().matches("[A-Za-z-]+")){
            JOptionPane.showMessageDialog(this, "Digite um número não letra");
        }else{
            
            double valorDividendo = Double.parseDouble(jTextFieldDividendo.getText());
            double valorDivisor = Double.parseDouble(jTextFieldDivisor.getText());
            
            double valorQuociente = valorDividendo/valorDivisor;
            
            jLabelQuociente.setText(Double.toString(valorQuociente));
          
            
            
        }
    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jTextFieldDividendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDividendoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDividendoActionPerformed

    private void jTextFieldDivisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDivisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDivisorActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        if(evt.getSource()==jButtonLimpar){
            jTextFieldParcela1.setText(null);
            jTextFieldParcela2.setText(null);
            jTextFieldMinuento.setText(null);
            jTextFieldSubtraento.setText(null);
            jTextFieldDividendo.setText(null);
            jTextFieldDivisor.setText(null);
            jTextFieldFator1.setText(null);
            jTextFieldFator2.setText(null);
            
        }
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeSoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeSoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeSoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeSoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeSoma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSubtracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelQuociente;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelResultado2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDividendo;
    private javax.swing.JTextField jTextFieldDivisor;
    private javax.swing.JTextField jTextFieldFator1;
    private javax.swing.JTextField jTextFieldFator2;
    private javax.swing.JTextField jTextFieldMinuento;
    private javax.swing.JTextField jTextFieldParcela1;
    private javax.swing.JTextField jTextFieldParcela2;
    private javax.swing.JTextField jTextFieldSubtraento;
    // End of variables declaration//GEN-END:variables
}