package exerciciojoptionpane;

import javax.swing.JOptionPane;

public class ExercicioJOptionpane {

    public static void main(String[] args) {

        int numero, soma = 0 ;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(Valor 0 Interrompe)</br>"));
            
            soma+=numero;
            
        } while (numero != 0); //Faça numero Enquando numero for diferente de 0
        
        JOptionPane.showMessageDialog(
                null, 
                "Resultado :"
                +"O Somatório é "
                +soma);
    }

}
