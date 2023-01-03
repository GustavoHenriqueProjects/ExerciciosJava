package exerciciojoptionpanecalculo;

import javax.swing.JOptionPane;

public class ExercicioJOptionpaneCalculo {

    public static void main(String[] args) {

        int numero;

        int totalDeValores = 0;
        int totalDePares = 0;
        int totalDeImpares = 0;
        int maiorQueCem = 0;
        int mediaDeValores = 0;
        int valorMediaDeValores = 0;
                

        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um valor<br> (0 interrompe)</html>"));

            if (numero > 0) {
                totalDeValores++;
                mediaDeValores = mediaDeValores + numero;
                
                valorMediaDeValores = mediaDeValores / totalDeValores;
                
                if (numero % 2 == 0) {
                    totalDePares++;
                }else{
                        totalDeImpares++; 
                }
            }
            
            if(numero > 100){
                maiorQueCem++;
            }

        } while (numero
                != 0);
        JOptionPane.showMessageDialog(
                null, "<html> Total de Valores: "
                + totalDeValores
                + "<br>"
                + "Total de Pares "
                + totalDePares
                + "<br>"
                + "Total de ímpares: "
                + totalDeImpares
                +"<br>"
                +"Acima de 100 : "
                +maiorQueCem
                +"<br>"
                +"Média dos valores : "
                +valorMediaDeValores
                +"<br>"
                +"</html>");

    }

}
