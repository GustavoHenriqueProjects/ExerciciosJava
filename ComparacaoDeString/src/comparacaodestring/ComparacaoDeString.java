package comparacaodestring;

public class ComparacaoDeString {

    public static void main(String[] args) {
        
        //String objeto
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String nome4 = new String("Gustavo");
        /* Nome1 e Nome2 sao iguais, mas como nome3 foi instanciado como objeto ele é diferente*/
        // Nome3 e Nome4 sao obejetos instanciados diferentes, não são iguais
        // .eguals verifica so o conteudo que esta dentro do obejeto é iqual, nesse caso todos sao verdadeiros
        
        String resultado;
        resultado = (nome1 == nome2)?"Igual":"Diferente";
        
        String resultadoConteudo;
        resultadoConteudo = (nome1.equals(nome3))?"Igual":"Diferente";
        
        System.out.println(resultado);
        System.out.println(resultadoConteudo);
    }
    
}
