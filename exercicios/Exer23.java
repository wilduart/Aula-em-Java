
package exer22;

import javax.swing.JOptionPane;


public class Exer23 {
    public static void main(String[] args) {
        float v1,v2;
        float media=0;
        byte opcao=5;
        
        while(opcao!=0){
            opcao=Byte.parseByte(JOptionPane.showInputDialog("Escolha "
                    + "a opção que deseja utilizar: \nMultiplo - 1 "
                    + "\n(NUM)Par - 2"
                    + "\nMEDIA - 3"
                    + "\nSair - 0"));
            
            if (opcao == 1) {
                v1 = Float.parseFloat(JOptionPane.showInputDialog("entre com o "
                        + "primeiro valor: "));

                v2 = Float.parseFloat(JOptionPane.showInputDialog("entre "
                        + "com o segundo valor"));
                if(v1%v2==0){
                    JOptionPane.showMessageDialog(null,"eles são multiplo "
                            + " um do outro");
                }else{
                    JOptionPane.showMessageDialog(null,"eles não são multiplos");
                }
                

            }
            else if(opcao==2){
                v1 = Float.parseFloat(JOptionPane.showInputDialog("entre com o "
                        + "primeiro valor: "));

                v2 = Float.parseFloat(JOptionPane.showInputDialog("entre "
                        + "com o segundo valor"));
                if(v1%2==0&&v2%2==0){
                    JOptionPane.showMessageDialog(null,"Eles são Par");
                }else if(v1%2==0&&v2%2!=0){
                    JOptionPane.showMessageDialog(null,"Somente o primeiro é Par");
                }else if(v1%2!=0&&v2%2==0){
                    JOptionPane.showMessageDialog(null,"Somente o segundo é Par");
                }else{
                    JOptionPane.showMessageDialog(null,"eles não Par");
                }
                
                
            }
            else if(opcao==3){
                v1 = Float.parseFloat(JOptionPane.showInputDialog("entre com o "
                        + "primeiro valor: "));

                v2 = Float.parseFloat(JOptionPane.showInputDialog("entre "
                        + "com o segundo valor"));
                media=(v1+v2)/2;
                if(media>=7){
                    JOptionPane.showMessageDialog(null,"Media maior que 7");
                }else{
                    JOptionPane.showMessageDialog(null,"Media menor que 7");
                }
                
            }
            
        }
    }
    
}
