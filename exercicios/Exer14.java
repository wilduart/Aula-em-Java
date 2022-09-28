
package exer12;

import java.util.Scanner;
public class Exer14 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        float valor1,valor2;
        float maior,menor,dif;
        
        System.out.println("Digite o valor 1: ");
        valor1=ler.nextFloat();
        System.out.println("Digite o valor 2: ");
        valor2=ler.nextFloat();
        
        maior=Math.max(valor1, valor2);
        menor=Math.min(valor1,valor2);
        dif=maior-menor;
        
        System.out.println("Maior = "+maior);
        System.out.println("Menor = "+menor);
        System.out.println("A diferenca entre eles e: "+dif);
    }
    
}
