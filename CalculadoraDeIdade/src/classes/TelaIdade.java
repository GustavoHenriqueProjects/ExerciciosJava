/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class TelaIdade extends javax.swing.JFrame {

    /**
     * Creates new form telaIdade
     */
    public TelaIdade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDiaMesAnoIdade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxData = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabelIdadeCompleta = new javax.swing.JLabel();

        jLabelDiaMesAnoIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ano de Nascimento:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 130, 123, 20);

        jPanel1.setBackground(new java.awt.Color(165, 249, 153));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Calcule sua idade de forma simples e rápida:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 360, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/users.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 50, 130, 140);

        jButtonCalcular.setBackground(new java.awt.Color(204, 255, 204));
        jButtonCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Click.png"))); // NOI18N
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalcular);
        jButtonCalcular.setBounds(20, 260, 100, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Idade:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 40, 30);
        getContentPane().add(jLabelIdade);
        jLabelIdade.setBounds(80, 170, 280, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nome:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 90, 60, 20);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(80, 83, 190, 26);

        jComboBoxData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", " " }));
        jComboBoxData.setToolTipText("");
        getContentPane().add(jComboBoxData);
        jComboBoxData.setBounds(280, 130, 70, 22);

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBoxMes);
        jComboBoxMes.setBounds(222, 130, 50, 22);

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBoxDia);
        jComboBoxDia.setBounds(160, 130, 50, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Você tem:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 210, 70, 20);
        getContentPane().add(jLabelIdadeCompleta);
        jLabelIdadeCompleta.setBounds(100, 210, 390, 20);

        setSize(new java.awt.Dimension(517, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite seu nome", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            funcaoCalcular();
        }

    }//GEN-LAST:event_jButtonCalcularActionPerformed
    private void funcaoCalcular() {

        try {

            Date date = Calendar.getInstance().getTime();
            DateFormat formato = new SimpleDateFormat("yyyy");
            // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            String anoAtual = formato.format(date);

            int anoDeNascimento = Integer.parseInt(jComboBoxData.getSelectedItem().toString());
            int mesDeNascimento = Integer.parseInt(jComboBoxMes.getSelectedItem().toString());
            int diaDeNascimento = Integer.parseInt(jComboBoxDia.getSelectedItem().toString());
            int idade = Integer.parseInt(anoAtual) - anoDeNascimento;

            String nome = jTextFieldNome.getText();

            jLabelIdade.setText((idade) + " anos de idade.");

            DateTimeFormatter formatandoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate hoje = LocalDate.now();
            LocalDate anoMesDiaDeNascimento = LocalDate.of(anoDeNascimento, mesDeNascimento, diaDeNascimento);
            String anoMesDiaDeNascimentoString = anoMesDiaDeNascimento.toString();

            LocalDate anoMesDiaDeNascimentoParse = LocalDate.of(anoDeNascimento, mesDeNascimento, diaDeNascimento);

            Period periodo = Period.between(anoMesDiaDeNascimentoParse, hoje);
            Integer ano = periodo.getYears();
            Integer mes = periodo.getMonths();
            Integer dia = periodo.getDays();

            jLabelIdadeCompleta.setText(nome + " você tem " + ano.toString() + " anos de idade " + mes.toString() + " mêses " + " e " + dia + " dias.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Atenção, digite uma data válida", "ERRO", JOptionPane.WARNING_MESSAGE);
        }

    }
    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIdade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JComboBox<String> jComboBoxData;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDiaMesAnoIdade;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelIdadeCompleta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
