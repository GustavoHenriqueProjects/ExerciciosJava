package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
            
        Locale idiomaSO = Locale.getDefault();
        
        System.out.println(idiomaSO);
        
        System.out.println("-------------------------");
        
        //Formato pt
        System.out.println(idiomaSO.getLanguage());
        
        System.out.println("-------------------------");
        
        //Formato português
        System.out.println(idiomaSO.getDisplayLanguage());
        
    }
    
}
