
package tabeladeexerc;

import java.util.Scanner;


public class Exer17 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int num;
        
        System.out.println("entre com um valor");
        num=ler.nextInt();
        
        if(num>=0&&num<=9){
            System.out.println("Valor Valido");
        }else{
            System.out.println("Valor invalido");
        }
        
        
            
    }
    
}
