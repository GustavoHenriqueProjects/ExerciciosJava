package contadorcomwhile;

public class ContadorComWhile {

    public static void main(String[] args) {
        
        int cc = 0;
        
        while(cc<10){
           cc++;
            if(cc == 5 || cc == 7){
                continue;//Retorno para While
               
            }
            
            System.out.println("Cambalhota "+cc);
            //cc++; // cc = cc + 1
        }
        
    }
    
}
