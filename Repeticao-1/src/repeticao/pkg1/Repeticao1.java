package repeticao.pkg1;

import java.util.Scanner;

public class Repeticao1 {

    public static void main(String[] args) {
        
        int cc = 0;
        do {   
            
            System.out.println("Java"+cc);
            cc++;
        } while (cc<4);
        
        System.out.println("-------------------------");
        
        int n, s = 0;
        String resposta;
        
        Scanner teclado = new Scanner(System.in);
        
        do {  
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n; // s = s + n
            System.out.println("Quer continuar? [S/N]");
            resposta = teclado.next();
            
        } while (resposta.equals("S"));
        System.out.println("A soma dos valores é: "+s);
        
}
    
}
