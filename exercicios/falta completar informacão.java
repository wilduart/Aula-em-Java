
package exer20;

import java.util.Scanner;

public class Exer20 {

    
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int a,b,c;
       boolean infoValidas=false;
       do{
           System.out.println("entre com um valor para A:");
           a=ler.nextInt();
           
           System.out.println("entre com um valor para B");
           b=ler.nextInt();
           
           System.out.println("entre com um valor para C");
           c=ler.nextInt();
           
           if(a<0||b<0||c<0){
               System.out.println("Informação invalida");
           }else{
               infoValidas=true;
               System.out.println("informaçoes validas");
           }
           System.out.println("o menor valor lido foi "+Math.min(a, b));
           System.out.println("o maior valido entre: "+Math.max(c, b));
           System.out.println("a multiplicação do menor pelo "
                   + "maior é: "+Math.multiplyExact(a, c));
           System.out.println("a divisão entre o maior e "
                   + "o menor e: "+Math.divideExact(c, a));
           
           
       }while(!infoValidas);
    }
    
}
