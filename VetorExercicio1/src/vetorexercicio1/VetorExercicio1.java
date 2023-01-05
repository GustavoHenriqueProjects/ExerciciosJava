package vetorexercicio1;

public class VetorExercicio1 {

    public static void main(String[] args) {
       
        int n[] = {3,2,4,6,8,9};
        
        /*
        6 casas    {3,2,4,6,8,9}
        5 indices   0 1 2 3 4 5
        
        */
        
        System.out.println("Total de casas na posição n é "+ n.length);// 6 casas porque possui 6 números
        
        for(int c=0; c<=n.length-1; c++){
            System.out.println("Na posição " +c+" Temos o valor "+n[c]);//Mostra n na posição c
            
        }
    }
    
}
