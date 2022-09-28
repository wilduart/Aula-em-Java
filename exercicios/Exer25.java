
package exer25;

import javax.swing.JOptionPane;


public class Exer25 {
/**
 *
 * @Faça um programa que receba dois números e gere uma lista
 * dos números impares que existem entre eles e outra 
 * lista com os números pares.
 */
    
    public static void main(String[] args) {
        int valor1=0;
        int valor2=0;
        int maior=0;
        int menor=0;
        
        valor1=Integer.parseInt(JOptionPane.showInputDialog("Entre"
                + " com um numero"));
        
        valor2=Integer.parseInt(JOptionPane.showInputDialog("Entre"
                + " com outro numero"));
        
        maior=Math.max(valor1, valor2);
        menor=Math.min(valor1, valor2);
        
        for(int x=menor;x<maior;x++){
            if(x%2!=0){
                JOptionPane.showMessageDialog(null,"Valor "
                        + "Impar "+x);
            }else if(x%2==0){
                JOptionPane.showMessageDialog(null,"Valor "
                        + "Par "+x);
            }
        }
        
                
    }
    
}
