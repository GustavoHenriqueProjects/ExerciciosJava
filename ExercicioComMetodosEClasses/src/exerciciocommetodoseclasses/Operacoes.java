package exerciciocommetodoseclasses;

public class Operacoes {
    public static String contador(int i, int f){
        String s = " ";
        
        for(int c = i; c <= f; c++){
            s += c + " "; // s = s + c
        }
        return s;
    }
}
