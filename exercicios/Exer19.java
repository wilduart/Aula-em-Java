
package tabeladeexerc;

import java.util.Scanner;


public class Exer19 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        float a,b,c;
        float sa=0f,sb=0f,sc=0f;
        
        System.out.println("Informe o Lado A do seu Triangulo");
        a=ler.nextFloat();
        
        System.out.println("Informe o Lado B do seu Triangulo");
        b=ler.nextFloat();
        
        System.out.println("Informe o Lado C do seu Triangulo");
        c=ler.nextFloat();
        
        sa=b+c;
        sb=a+c;
        sc=a+b;
        
        
        if((a!=b&&b==c)||(b!=c&&b==a)){
            System.out.println("Esse Triangulo e Equilatero");
            System.out.println("os valores digitados sao: "
                    + " "+a+" "+b+" "+c);
        }else if((b==c)&&(a==b)&&(a==c)){
            System.out.println("Esse triangulo e Isoceles todos "
                    + "os lados são iguais");
            System.out.println("os valores digitados sao: "
                    + " "+a+" "+b+" "+c);
        }else if(a!=b&&b!=c){
            System.out.println("Esse triangulo e Escaleno "
                    + "ele possui todos os lados diferentes um do "
                    + "outro");
            System.out.println("os valores digitados sao: "
                    + " "+a+" "+b+" "+c);
        }else{
            System.out.println("as medidas fornecidas, NAO "
                    + "representam um Triangulo");
        }
        
    }
    
}
