package condicionalcomswitch;

import java.util.Scanner;


public class CondicionalComSwitch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int pernas = teclado.nextInt();
        
        
        String tipo;
        
        switch(pernas){
            case 1:
                tipo ="Saci";
                break;
            case 2 :
                tipo = "Bípete";
                break;
            case 3 :
                tipo = "Tripé";
                break;
            case 4 :
                tipo = "Quadrupte";
            case 6 :
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
                
        }
        
        System.out.println("Isto é um(a) " + tipo);   
        
    }
    
}
