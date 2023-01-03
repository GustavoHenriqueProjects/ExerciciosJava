package br.senai.projetos;

public class swingTriangulo extends javax.swing.JFrame {

    public swingTriangulo() {
        initComponents();
        jPanelResposta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSliderA = new javax.swing.JSlider();
        jSliderB = new javax.swing.JSlider();
        jSliderC = new javax.swing.JSlider();
        jLabelA = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonResposta = new javax.swing.JButton();
        jPanelResposta = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Segmento A");

        jLabel2.setText("Segmento B");

        jLabel3.setText("Segmento C");

        jSliderA.setMaximum(20);
        jSliderA.setValue(0);
        jSliderA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderAStateChanged(evt);
            }
        });

        jSliderB.setMaximum(20);
        jSliderB.setValue(0);
        jSliderB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderBStateChanged(evt);
            }
        });

        jSliderC.setMaximum(20);
        jSliderC.setValue(0);
        jSliderC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderCStateChanged(evt);
            }
        });

        jLabelA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelA.setForeground(new java.awt.Color(153, 153, 153));
        jLabelA.setText("0");

        jLabelB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelB.setForeground(new java.awt.Color(153, 153, 153));
        jLabelB.setText("0");

        jLabelC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelC.setForeground(new java.awt.Color(153, 153, 153));
        jLabelC.setText("0");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/triangulo.png"))); // NOI18N

        jButtonResposta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButtonResposta.setForeground(new java.awt.Color(153, 255, 153));
        jButtonResposta.setText("Click");
        jButtonResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRespostaActionPerformed(evt);
            }
        });

        jLabelStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(102, 204, 0));
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus.setText("Forma ou não ?");

        jLabelTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(0, 153, 255));
        jLabelTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTipo.setText("Tipo de triângulo");

        javax.swing.GroupLayout jPanelRespostaLayout = new javax.swing.GroupLayout(jPanelResposta);
        jPanelResposta.setLayout(jPanelRespostaLayout);
        jPanelRespostaLayout.setHorizontalGroup(
            jPanelRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRespostaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelRespostaLayout.setVerticalGroup(
            jPanelRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRespostaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTipo)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonResposta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSliderA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSliderB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSliderC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabelC))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabelB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabelA)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(59, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jSliderA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelA))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jSliderB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelB))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSliderC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelC))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonResposta)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanelResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        setSize(new java.awt.Dimension(488, 415));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRespostaActionPerformed
        jPanelResposta.setVisible(true);
        int a = jSliderA.getValue();
        int b = jSliderB.getValue();
        int c = jSliderC.getValue();
        
        if(a<b+c && b<a+c && c<a+b){
            jLabelStatus.setText("Formam um triângulo");
            if(a == b && b == c){
                jLabelTipo.setText("Equilátero");
            }else if(a!=b && b!=c && a!=c){
                jLabelTipo.setText("Ele é escaleno");
            }else{
                jLabelTipo.setText("Ele é isóceles");
            }
        }else{
            jLabelStatus.setText("Não Formam um Triângulo");
            jLabelTipo.setText("---------");
        }
    }//GEN-LAST:event_jButtonRespostaActionPerformed

    private void jSliderAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderAStateChanged
        jLabelA.setText(Integer.toString(jSliderA.getValue()));
    }//GEN-LAST:event_jSliderAStateChanged

    private void jSliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderBStateChanged
        jLabelB.setText(Integer.toString(jSliderB.getValue()));
    }//GEN-LAST:event_jSliderBStateChanged

    private void jSliderCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderCStateChanged
        jLabelC.setText(Integer.toString(jSliderC.getValue()));
    }//GEN-LAST:event_jSliderCStateChanged

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
            java.util.logging.Logger.getLogger(swingTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(swingTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(swingTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(swingTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new swingTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResposta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanelResposta;
    private javax.swing.JSlider jSliderA;
    private javax.swing.JSlider jSliderB;
    private javax.swing.JSlider jSliderC;
    // End of variables declaration//GEN-END:variables
}
