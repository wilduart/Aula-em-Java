
package exer22;

import javax.swing.JOptionPane;


public class Exer22 {

    
    public static void main(String[] args) {
        float v1,v2;
        float soma=0;
        float subt=0;
        float mult=1;
        float div=0;
        byte opcao=5;
        
        while(opcao!=0){
            opcao=Byte.parseByte(JOptionPane.showInputDialog("Escolha "
                    + "a opção que deseja utilizar: \nSoma - 1 "
                    + "\nSubtração - 2"
                    + "\nMultiplicação - 3"
                    + "\nDivisão - 4"
                    + "\nSair - 0"));
            
            if (opcao == 1) {
                v1 = Float.parseFloat(JOptionPane.showInputDialog("entre com o "
                        + "primeiro valor: "));

                v2 = Float.parseFloat(JOptionPane.showInputDialog("entre "
                        + "com o segundo valor"));
                soma=v1+v2;
                JOptionPane.showMessageDialog(null,"A Soma é "+soma);

            }
            else if(opcao==2){
                v1 = Float.parseFloat(JOptionPane.showInputDialog("entre com o "
                        + "primeiro valor: "));

                v2 = Float.parseFloat(JOptionPane.showInputDialog("entre "
                        + "com o segundo valor"));
                subt=v1-v2;
                JOptionPane.showMessageDialog(null,"A Subtração é "+subt);
                
            }
            else if(opcao==3){
                v1 = Float.parseFloat(JOptionPane.showInputDialog("entre com o "
                        + "primeiro valor: "));

                v2 = Float.parseFloat(JOptionPane.showInputDialog("entre "
                        + "com o segundo valor"));
                mult=v1*v2;
                JOptionPane.showMessageDialog(null,"A Multiplicação é "+mult);
            }else if(opcao==4){
                v1 = Float.parseFloat(JOptionPane.showInputDialog("entre com o "
                        + "primeiro valor: "));

                v2 = Float.parseFloat(JOptionPane.showInputDialog("entre "
                        + "com o segundo valor"));
                div=v1/v2;
                JOptionPane.showMessageDialog(null,"A Divisão é "+div);
                
            }
            
        }
        
//        v1=Float.parseFloat(JOptionPane.showInputDialog("entre com o "
//                + "primeiro valor: "));
//        
//        v2=Float.parseFloat(JOptionPane.showInputDialog("entre "
//                + "com o segundo valor"));
//        
//        soma=v1+v2;
//        subt=v1-v2;
//        mult=v1*v2;
//        div=v1/v2;
//        
//        JOptionPane.showMessageDialog(null,"a Soma entre eles é: "+soma+"\na"
//                + " Subtração é: "+subt+"\na Multiplicação é: "+mult+"\na"
//                        + " Divisão é: "+div);
    }
    
}
