package exerciciocommetodos;

/**
 *
 * @author gusta
 */
public class ExercicioComMetodos {

    //Procedimento soma
    /*
    * Metodos statics são funções que não dependem de nenhuma variavel de instância,
    * quando chamados executam uma função sem a dependencia do conteúdo de um objeto 
    * ou a execucao de uma instancia da classe.
     */
    static void soma (int a, int b){
        int s = a + b;
        System.out.println("O valor é "+s);
    }
    
   //Metodo com retorno
    static int subtracao(int a, int b){
        int s = a - b;
        return s;
 
    }
    public static void main(String[] args) {
        
        System.out.println("Calculando soma...");
        
        //Chamando procedimento soma
        soma(10,12);
        
        int calculoSubttracao = subtracao(12,10);
        System.out.println("O valor da subtração é "+calculoSubttracao);
        
        System.out.println("Finalizado");
        
        int total = 0;
        
        int c[] = new int [13];
        
        for(int i = 0; i < c.length; i++){
            c[i] = i + i;
            
            System.out.println(c[i]);
            
        }
        
        for(int a = 0; a < c.length; a++){
            total += c[a]  ;
            
            System.out.println(total+"--");
        }
        

    }
    
}
