
package tabeladeexerc;

import javax.swing.JOptionPane;
public class Exer18 {
    public static void main(String[] args) {
        
        String codigovalido="";
        int codigo;
        
        codigovalido=JOptionPane.showInputDialog("Informe o seu codigo"
                + " de 1 a 3: ");
        if(codigovalido!="null"){
            
            codigo=Integer.parseInt(codigovalido);
            switch (codigo){
                case 1:
                    codigovalido="1";
                    JOptionPane.showMessageDialog(null,"cod: 1");
                    break;
                    
                    case 2:
                    codigovalido="2";
                    JOptionPane.showMessageDialog(null,"cod: 2");
                    break;
                    
                    case 3:
                    codigovalido="3";
                    JOptionPane.showMessageDialog(null,"cod: 3");
                    break;
                    
                    default:
                        codigovalido="codigo invalido";
                        JOptionPane.showMessageDialog(null,"esse codigo "
                                + "nao serve");
                    
                    
            };
        }
    }
    
}
