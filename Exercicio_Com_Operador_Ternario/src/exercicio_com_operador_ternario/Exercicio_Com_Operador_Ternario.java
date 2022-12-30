package exercicio_com_operador_ternario;

public class Exercicio_Com_Operador_Ternario {
    public static void main(String[] args) {
        
        int n1,n2,r,s;
        
        n1 = 4;
        n2 = 8;
        
        /*Se o n1 for maior que n2*, r recebe 0 senão r recebe 1
        > : Maior
        ? : Então
        : : Senão*/
        
        r = (n1>n2)? 0:1;
        s = (n1>n2)? n1:n2;
        System.out.println(r);
        System.out.println("O maior valor é : "+s);
        
    }
    
}
