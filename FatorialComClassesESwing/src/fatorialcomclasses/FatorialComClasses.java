package fatorialcomclasses;

public class FatorialComClasses {

    public static void main(String[] args) {

        //Crio Objeto com o nome da classe para ter todos os metodos da classe 
        CalculoDeFatorial f = new CalculoDeFatorial();
        f.setValor(3);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
      
    }
}
