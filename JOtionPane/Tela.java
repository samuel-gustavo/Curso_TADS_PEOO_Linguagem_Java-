package exercicos.JOtionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tela {
    
    public static void main(String[] args) {

        java.net.URL caminho = Tela.class.getResource("assets/image.png");
        
        ImageIcon icon = new ImageIcon(caminho);

        Object[] botoes = {"Aceitar", "Recusar"};

        int escolha = JOptionPane.showOptionDialog(
            null, "Você aceita entrar nesse ambiente?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, botoes, botoes[0]);

        if(escolha == 0) {
            JOptionPane.showMessageDialog(null, "Você Aceitou!");
        } else if(escolha == 1) {
            JOptionPane.showMessageDialog(null, "Você Recusou!");
        } else {
            JOptionPane.showMessageDialog(null, "Você fechou a janela sem escolher!");
        }
    }
}
