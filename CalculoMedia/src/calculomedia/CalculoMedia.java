package calculomedia;

import java.util.Scanner;

public class CalculoMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua nota do primeiro semestre: ");
        float a1 = teclado.nextFloat();
        
        System.out.println("Digite a nota do segundo semestre: ");
        float a2 = teclado.nextFloat();
        
        float m = (a1+a2)/2;
        
        System.out.println("A sua nota final é "+m);
        
        if(m>9.0){
            System.out.println("Parabens");
        }else{
            System.out.println("continue se esforçando");
        }
    }
    
}
