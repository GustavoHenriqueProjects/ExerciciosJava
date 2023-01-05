package exerciciovetor5array;

import java.util.Arrays;

public class ExercicioVetor5Array {

    public static void main(String[] args) {
       
        int vetor[] = new int [20];//20 casas 19 indices
        Arrays.fill(vetor, 3);// todas as casas do vetor terão vetor valor 5
        
        for(int valor : vetor){
            System.out.println(valor);
        }
    }
    
}
