/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercontabancaria;

import javax.swing.JOptionPane;
public class CalculosComJOption {
    public static void main(String[] args) {
        
        String aux;//declara primeiro a variavel como string
        double valor1,valor2;//declara o outro tipo de variavel que vai trabalhar
        
        aux=JOptionPane.showInputDialog("entre com valor 1");//entra com input chamando a primeira variavel
        valor1=Double.parseDouble(aux);//faz a conversao de variavel
        //a mesma coisa no próximo
        aux=JOptionPane.showInputDialog("entre com valor 2");
        valor2=Double.parseDouble(aux);
        
        JOptionPane.showMessageDialog(null,"soma \n"+(valor1+valor2)+ "\n Subtraçao é \n"+(valor1-valor2));
        
    }
    
}
