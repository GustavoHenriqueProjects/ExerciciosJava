package exercicios.swing;

public class HelloWord extends javax.swing.JFrame {

    public HelloWord() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCabecalho = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonClick = new javax.swing.JButton();
        jLabelText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(74, 251, 149));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelCabecalho.setBackground(new java.awt.Color(13, 246, 121));
        jPanelCabecalho.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setText("Olá, seja muito bem vindo");
        jPanelCabecalho.add(jLabelTitulo);
        jLabelTitulo.setBounds(70, 10, 310, 42);

        getContentPane().add(jPanelCabecalho);
        jPanelCabecalho.setBounds(0, 0, 438, 60);

        jButtonClick.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonClick.setForeground(new java.awt.Color(0, 255, 153));
        jButtonClick.setText("Clique");
        jButtonClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClickActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClick);
        jButtonClick.setBounds(150, 230, 110, 50);

        jLabelText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        getContentPane().add(jLabelText);
        jLabelText.setBounds(110, 110, 200, 60);

        setSize(new java.awt.Dimension(454, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClickActionPerformed
        jLabelText.setText("Hello Word");
    }//GEN-LAST:event_jButtonClickActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelloWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClick;
    private javax.swing.JLabel jLabelText;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCabecalho;
    // End of variables declaration//GEN-END:variables
}
