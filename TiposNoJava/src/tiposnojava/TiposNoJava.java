package tiposnojava;

public class TiposNoJava {

    public static void main(String[] args) {
        
        System.out.println("--- Utilizando Integer e toString ---");
        
        Integer idade = 30;
        
        String valor = idade.toString();
        
        System.out.println("A sua idade é : " + valor);
        
        System.out.println("-------------------------------------");
        
        System.out.println(" Convertendo int para toString ");
        
        System.out.println("");
        
        int idade2 = 20;
        
        //Classe involucro Wapper classes
        String valor2 = Integer.toString(idade2);
        
        System.out.printf("A idade da Fernanda é de %s anos de idade \n", valor2 );
        
        System.out.println("-------------------------------------");
        
        System.out.println("Convertendo String para int");
        
        String valor3 = "15";
        
        int idade3 = Integer.parseInt(valor3);
        
        System.out.println("A idade do Paulo é de " + idade3 +" anos de idade");
        
        
                
    }
    
}
