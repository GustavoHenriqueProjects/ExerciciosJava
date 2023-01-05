package vetorexercicio3foreach;

import java.util.Arrays;

public class VetorExercicio3ForEach {

    public static void main(String[] args) {

        double vetor[] = {3.5, 2.75, 9, 10};
        
        //para colocar o vetor em ordem crescente utilize Array.sort(vetor)
        Arrays.sort(vetor);
        
        //Para cada elemento do vetor coloque dentro do vetorValor
        for (double vetorValor : vetor) {
            
            System.out.println(vetorValor);

        }
    }

}
