/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer13;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Teste {
    public static void main(String[] args) {
        double h=0,pesoIdeal=0;
        
        String sexo="";
        
        sexo = JOptionPane.showInputDialog("Qual o seu sexo? "
                + "\ndigite: \nM-Masculino \nF-Feminino");

        h = Double.parseDouble(JOptionPane.showInputDialog(" Qual a sua altura? "));
        
        
        if("M".equals(sexo)){
            pesoIdeal=(72.7*h)-58;
            JOptionPane.showMessageDialog(null,"Seu peso Ideal"
                    + " é: "+pesoIdeal);
        }
        else{
            pesoIdeal=(62.1*h)-44.7;
            JOptionPane.showMessageDialog(null,"Seu peso  femIdeal"
                    + " é: "+pesoIdeal);
            
        }
    }
    
}
