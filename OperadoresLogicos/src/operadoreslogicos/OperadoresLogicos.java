package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        
        int x,y,z;
        boolean r;
        
        x = 4;
        y = 7;
        z = 12;
        
        r = (x<y || y<z)?true:false;
        System.out.println(r);
        
    }
    
}
