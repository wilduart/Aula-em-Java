/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto002;
import java.awt.Component;
import javax.swing.JOptionPane;
public class ExerInMaCo {
    public static void main(String[] args) {
        String valor = "";
        float peso,altura,IMC=0f;
        
        valor = JOptionPane.showInputDialog("inform seu peso");
        peso = Float.parseFloat(valor);
        
        valor = JOptionPane.showInputDialog("inform sea altura");
        altura = Float.parseFloat(valor);
        
        IMC = peso/(altura*altura);
        
        JOptionPane.showMessageDialog(null,"o valor do seu IMC é: " +IMC);
        Component frame = null;
        
        if (IMC<18.5){
            JOptionPane.showInternalMessageDialog(frame,"voce esta "
                    + "com o peso abaixo do normal",
                    "seu IMC ",JOptionPane.INFORMATION_MESSAGE);
        }else if(IMC>18.5&&IMC<24.5){
            JOptionPane.showInternalMessageDialog(frame," voce esta com peso ideal "," seu IMC ",
                    JOptionPane.INFORMATION_MESSAGE);
        }else if(IMC>24.5&&IMC<29.9){
            JOptionPane.showInternalMessageDialog(frame," voce esta com pre obesidade "," seu IMC ",
                    JOptionPane.INFORMATION_MESSAGE);
    }else if(IMC>30&&IMC<34.9){
            JOptionPane.showInternalMessageDialog(frame," voce esta com obsidade cla 1 "," seu IMC ",
                    JOptionPane.INFORMATION_MESSAGE);
    }else if(IMC>35.5&&IMC<39.9){
            JOptionPane.showInternalMessageDialog(frame," voce esta com obesidade cl 2 "," seu IMC ",
                    JOptionPane.INFORMATION_MESSAGE);
    }else{
        JOptionPane.showInternalMessageDialog(frame," voce esta com obesidade morbida cl 3 "," seu IMC ",
                    JOptionPane.INFORMATION_MESSAGE);
    }
        
    
}}
    
