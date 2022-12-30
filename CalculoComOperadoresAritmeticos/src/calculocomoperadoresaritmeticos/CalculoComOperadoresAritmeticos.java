package calculocomoperadoresaritmeticos;

public class CalculoComOperadoresAritmeticos {

    
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        
        float m = (n1 + n2)/2;
        System.out.println("A media é iqual a "+ m);
        
        System.out.println("------------Encremento-------------");
        int numero = 5;
        numero++;
        System.out.println(numero);
        
        System.out.println("------------Pré-encremento---------");
        
        int numero1 = 6;
        int numero2 = 6;
        //Primeiro ele soma e depois incrementa = 11.
        int valor = 5 + numero1++;
        //Primeiro ele incrementa e depois soma
        System.out.println("Encremento normal: " + valor);
        
        int valor2 = 5 + ++numero2;
        System.out.println("Com pré-incremento: " + valor2);
        
        System.out.println("------------- Encrementos com: ( -- )       ");
        int numero3 = 10;
        int valor3 = 4 + numero3--;
        int valor4 = 4 + --numero3;
        System.out.println("Encremento nomal: " +valor3);
        System.out.println("Pre-encremento: " +valor4);
        
        System.out.println("------------Encremento com atribuição X = X+2 --------");
        
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);
        
        double raiz = Math.pow(5,2);
         
        System.out.println(raiz);
       
    }
    
}
