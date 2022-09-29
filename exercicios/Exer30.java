
package exer30;

import java.util.Scanner;

public class Exer30 {

    /**
     * @Escreva um programa que leia um conjunto de números 
     * positivos que serão informados pelo usuário, e 
     * apresente qual foi o maior e o menor a cada interação, 
     * isso é cada vez que o usuário informar um número valide 
     * se ele é o menor ou o maior já digitado. Quando o 
     * usuário desistir de informar ele deve ter 
     * opção de sair. (while). 
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num=1;
        int maior=Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        while(num>0){
            System.out.println("Informe um numero");
            num=ler.nextInt();
            
            if(num>maior){
                maior=num;
                System.out.println("este é o novo maior numero "+maior);
                
            }
            else if(num<menor){
                menor=num;
                System.out.println("este é novo menor numero "+menor);
            }
        }
        System.out.println("o maior numero é "+maior);
        System.out.println("o menor numero é "+menor);
        
    }
    
}
