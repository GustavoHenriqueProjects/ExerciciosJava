package br.senai.projeto;

/**
 *
 * @author gusta
 */
public class telaGenio extends javax.swing.JFrame {

    /**
     * Creates new form telaGenio
     */
    public telaGenio() {
        initComponents();
        jLabelFrase.setText("<html>Vou pensar em um número entre <strong>1 e 5</strong> tente adivinhar :</html> ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinnerNumero = new javax.swing.JSpinner();
        jButtonCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFrase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSpinnerNumero.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(jSpinnerNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jButtonCalcular.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonCalcular.setText("Click");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("VALOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 50, -1));

        jLabelFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabelFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bolha-de-pensamento.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 247));

        setSize(new java.awt.Dimension(462, 287));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        double a = 1 + Math.random() *(6 - 1);
        int valor = (int) a;
        
        int numeroUsuario = Integer.parseInt(jSpinnerNumero.getValue().toString());
        
        String a1 = "Acertou!";
        String a2 = "<html>Errou! eu pensei no valor "+valor+"</html>";
        
        String res = (valor == numeroUsuario)? a1:a2;
        
        jLabelFrase.setText(res);
    }//GEN-LAST:event_jButtonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFrase;
    private javax.swing.JSpinner jSpinnerNumero;
    // End of variables declaration//GEN-END:variables
}
