
package projeto002;

import javax.swing.JOptionPane;
public class JOption003 {
    public static void main(String[] args) {
        Object[] options = {"ok","CANCEL"};
        JOptionPane.showOptionDialog(null,"Click OK or CANCEL","Warning",JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,null,options,options[0]);
        
        Object[]possibleValues={"primeiro","segundo","terceiro"};
        Object selectedValue=JOptionPane.showInputDialog(null,"escolha um",
                "envie um",JOptionPane.INFORMATION_MESSAGE,null,
                possibleValues,possibleValues[0]);
        Object argumentos=null;
    }    
    
    
}
