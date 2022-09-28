
package exer25;

import java.util.Scanner;

/**
 *
 * @Escreva um programa que calcule e exiba a soma dos 
 * quadrados dos 20 primeiros números inteiros positivos 
 * ímpares a partir do número informado pelo usuário menor que 10
 * e maior que zero.
 */
public class Exer29 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quadrado=0;
        int num=1;
        int somaQuadrado=0;
        
        while(num>0&&num<10){
            System.out.println("Digite um  numero");
            num=ler.nextInt();
            
            if(num>0&&num%2!=0){
                quadrado=(int)Math.pow(num, 2);
                somaQuadrado=somaQuadrado+quadrado;
                System.out.println("o quadrado dele "
                        + "é: "+quadrado);
                System.out.println("a soma dos "
                        + "quadrados é "+somaQuadrado);
            }
        }
        
    }
    
}
