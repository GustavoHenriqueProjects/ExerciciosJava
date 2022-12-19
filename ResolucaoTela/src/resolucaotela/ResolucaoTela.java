package resolucaotela;


import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        
        Toolkit resolucaoTela = Toolkit.getDefaultToolkit();
        Dimension tamanho = resolucaoTela.getScreenSize();
        
        System.out.println("A largura da sua tela é : " + tamanho.width+"px");
        System.out.println("A altura da sua tela é : " + tamanho.height+"px");
        
    }
    
}
