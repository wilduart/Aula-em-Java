package projeto002;

import javax.swing.JOptionPane;
import java.awt.Component;

public class JOption002 {

    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "mensagem dentro da caixa", "mensagem de titulo", JOptionPane.ERROR_MESSAGE);
            Component frame = null;

            JOptionPane.showInternalMessageDialog(frame, "information in the cash", "inform de titulo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }

    }
}
