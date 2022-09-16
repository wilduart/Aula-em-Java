/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decimal;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat km= new DecimalFormat("##.##Km/h");
        DecimalFormat lkm= new DecimalFormat("##.##L/Km");
        DecimalFormat Hr = new DecimalFormat ("##.#Hs");
        
        float tempo;
        
        float dist;
        float litros;
        float velmed;
        
        tempo=Float.parseFloat(JOptionPane.showInputDialog("Informe"
                + "o tempo gasto na viagem"));
        velmed=Float.parseFloat(JOptionPane.showInputDialog("Informe"
                + "a velocidade media usada na viagem"));
        
        dist=tempo*velmed;
        litros=dist/12;
        velmed=dist/tempo;
        
        JOptionPane.showMessageDialog(null,"a velocidade media da viagem fio "+km.format(velmed)+ "\n"
                + "o tempo gasto na viagem foi "+Hr.format(tempo)+ "\na distancia percorrida foi "+
                km.format(dist)+ "\na quantidade de litros utilizado foi "+lkm.format(litros));
    }
    
}
