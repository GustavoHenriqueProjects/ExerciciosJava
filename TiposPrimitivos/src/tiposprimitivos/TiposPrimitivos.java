package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        
        float nota = (float) 8.5;
        float nota2 = (float) 9.5;
        //float nota = 8.5f;
        
        System.out.println("A nota é " + nota);
        
        System.out.println("-----------------------------------------------");
        
        String nome = "Gustavo";
        String nome2 = "Fernanda";
        
        System.out.printf("A nota do %s é %.2f \n", nome,nota);
        
        System.out.format("A nota da %s é %.2f \n", nome2,nota2);
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Utilizando Scanner para entrada de dados");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do(a) aluno(a): ");
        String nomeDoAluno = teclado.nextLine();
        
        System.out.print("Digite a nota do(a) aluno(a):");
        float notaDoAluno = teclado.nextFloat();
        
        System.out.printf("A nota do(a) aluno(a) %s é %.2f \n", nomeDoAluno, notaDoAluno);
        
        
        
    }
    
}
