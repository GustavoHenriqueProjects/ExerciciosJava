package vetorexercicio4foreach;

import java.util.Arrays;

public class VetorExercicio4ForEach {

    public static void main(String[] args) {
        
        int vetor[] = {1,2,3,4,5,6,7};
        
        int posicao = Arrays.binarySearch(vetor, 7);
       //Ele Procurar o valor 7 no posicao esque esta 3
        
        System.out.println("O valor na posição "+posicao);
    }
    
}
