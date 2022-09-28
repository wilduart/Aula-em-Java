
package tabeladeexerc;

import java.util.Scanner;
public class TabelaDeExerc {

    
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        float valor1,valor2,maior,menor;
        
        System.out.println("Entre com um numero: ");
        valor1=ler.nextFloat();
        System.out.println("Entro com outro numero: ");
        valor2=ler.nextFloat();
        
        maior=Math.max(valor1, valor2);
        menor=Math.min(valor1, valor2);
        System.out.println("O Maior valor entre eles e: "+maior);
        System.out.println("O menor valor é: "+menor);
        
        if(maior==menor){
            System.out.println("Os numeros são iguais");
        }
        
    }
    
}
