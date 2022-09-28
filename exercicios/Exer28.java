
package exer25;

import java.util.Scanner;

/**
 *
 * @Escrever um programa que leia um conjunto de números positivos,
 * e exiba se o número lido é par ou ímpar. Exiba ao final a soma 
 * total dos números pares lidos e também a soma dos números 
 * ímpares lidos. Continuar até o usuário digitar um número 
 * negativo que será utilizado para sinalizar o fim do programa.
 */
public class Exer28 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int somaPar=0;
        int somaImpar=0;
        int n1=0;
        while(n1>=0){
            System.out.println("Entre com numero");
            n1 = ler.nextInt();
            if(n1%2==0&&n1>=0){
                System.out.println("numero Par "+n1);
                if(n1%2==0){
                    somaPar=somaPar+n1;
                    System.out.println("a Soma "
                            + "dos Pares: "+somaPar);
                }
            }else if(n1%2!=0&&n1>=0){
                System.out.println("numero Impar "+n1);
                if(n1%2!=0){
                    somaImpar=somaImpar+n1;
                    System.out.println("a soma "
                            + "dos impares: "+somaImpar);
                }
            }
            
                
            
            
        }
        
        
    }
    
}
