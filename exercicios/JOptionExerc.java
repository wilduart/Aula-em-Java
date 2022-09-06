/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercontabancaria;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLEditorKit;
public class JOptionExerc {
    public static void main(String[] args) {
        
        String formal,nome,sNome,aux;
        int idade;
                
        formal=JOptionPane.showInputDialog("entre com seu tipo formal: Sr. ou Sra.");
        nome=JOptionPane.showInputDialog("Informe seu nome");
        sNome=JOptionPane.showInputDialog("Informe seu sobre nome");
        
        aux=JOptionPane.showInputDialog("Informe sua idade");
        idade =Integer.parseInt(aux);
        
        if(idade>=18){
            aux = "maior de idade";
        }else{
            aux = "menor de idade";
        }
        
        JOptionPane.showMessageDialog(null,formal+ " " + nome + " " +sNome+ " sua idade é " +idade+ " voce é " +aux);
        
    }
    
}
