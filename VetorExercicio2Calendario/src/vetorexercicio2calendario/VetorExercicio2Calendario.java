package vetorexercicio2calendario;

public class VetorExercicio2Calendario {

    public static void main(String[] args) {
        
        String mes[] = {"Janeiro",
                        "Fevereiro",
                        "Março",
                        "Abril",
                        "Maio",
                        "Junho",
                        "julho",
                        "Agosto",
                        "Setembto",
                        "Outubro",
                        "Novembro",
                        "Dezembro"};
        
        int total[] = {31,28,31,30,31,30,31,31,30,31,30,31};
               
        for(int cmt = 0; cmt<mes.length; cmt++){
            System.out.println("---------");
            System.out.println("Mês de "+mes[cmt]+" tem "+total[cmt]);
        }
        
    }
    
}
