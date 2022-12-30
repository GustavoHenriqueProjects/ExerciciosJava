package br.senai.projeto;

import java.util.Scanner;

public class CalculoDeMedia {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float a1 = teclado.nextFloat();
        float a2 = teclado.nextFloat();
        float resposta = (a1 + a2)/2;
        System.out.println("Sua nota é "+resposta);
        
    }
    
}
