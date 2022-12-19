package horadosistema;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HoraDoSistema {

    
    public static void main(String[] args) {
        
        //Quando utiliza a palavra new você está criando um novo objeto
        Date relogio = new Date();
        
        System.out.println("A hora é:");
        
        //Convetendo data para string se utiliza o metodo toString
        System.out.println(relogio.toString());
        
        //data sendo formatada com o formato correto utilizando DateFormat
        System.out.println("-----------------------------------------------");
        Date today = Calendar.getInstance().getTime();
        DateFormat formato = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String todayString = formato.format(today);
        
        System.out.println(todayString);
        
    }
    
}
