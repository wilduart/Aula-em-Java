/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decimal;

import javax.swing.JOptionPane;
public class NewExer001 {
    public static void main(String[] args) {
        String nome;
        byte opcao=4;
        float dep=0,saque=0,saldo=0;
        
        nome=JOptionPane.showInputDialog("**Banco Java**\nInforme seu nome: ");
        
        
        while(opcao!=0){
            opcao=Byte.parseByte(JOptionPane.showInputDialog("ola, "+nome+"\nescolha uma das"
                + " opcoes\nDeposito - 1\nSaque - 2\nSaldo - 3\nSair - 0"));
            if(opcao==1){
                dep=Float.parseFloat(JOptionPane.showInputDialog("informe o valor do deposito: "));
                saldo=saldo+dep;
            }else if(opcao==2){
                saque=Float.parseFloat(JOptionPane.showInputDialog("informe o valor do saque: "));
                saldo=saldo-saque;
            }else if(opcao==3){
                JOptionPane.showMessageDialog(null,"seu saldo e: "+saldo);
            }
            
        }
    }
    
}
