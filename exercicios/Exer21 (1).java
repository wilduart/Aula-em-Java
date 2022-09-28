package tabeladeexerc;

import java.util.Scanner;

public class Exer21 {

    public static void main(String[] args) {
       Scanner ler=new Scanner(System.in);
        int num; 
        
        System.out.println("entre com um numero: ");
        num=ler.nextInt();
        
        if(num<0){
            System.out.println("\n o valor digitado é Negativo");
        }else
            System.out.println("Numero é Positivo");
    }

}
