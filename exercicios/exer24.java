
package exer22;

import javax.swing.JOptionPane;


public class exer24 {
    public static void main(String[] args) {
        double h=0,pesoIdeal=0;
        
        String sexo="";
        
        sexo = JOptionPane.showInputDialog("Qual o seu sexo? "
                + "\ndigite: \nM-Masculino \nF-Feminino");

        h = Double.parseDouble(JOptionPane.showInputDialog(" Qual a sua altura? "));
        
        
        if(sexo=="M"){
            pesoIdeal=(72.7*h)-58;
            JOptionPane.showMessageDialog(null,"Seu peso Ideal"
                    + " é: "+pesoIdeal);
        }
        else{
            pesoIdeal=(62.1*h)-44.7;
            JOptionPane.showMessageDialog(null,"Seu peso Ideal"
                    + " é: "+pesoIdeal);
            
        }


        
        
    }
    
}
