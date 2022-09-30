
package operacaoaritimetica;

import java.util.Scanner;


public class OperacaoAritimetica {

    /**
     * @Usando a classe Scanner para entrada de dados, 
     * elabore uma classe que receba dois valores numéricos 
     * (v1 e v2) e apresente em tela o resultado de cinco 
     * operações aritméticas básicas entre eles: soma, 
     * subtração, divisão, multiplicação e resto da divisão,
     * Raiz Quadrada e Elevado ao Quadrado.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v1;
        int v2;
        int quadrado=1;
        int soma=0,sub=0,mult=1;
        float div=0,resto=0,raiz=0;
        byte opcao=10;
        
        while(opcao!=0){
            System.out.println("escolha a opção \nSoma-1"
                    + "\nSubtração-2"
                    + "\nDivisão-3"
                    + "\nMultiplicação -4"
                    + "\nResto-5"
                    + "\nElevedo ao Quadrado-6"
                    + "\nRaiz Quadrada-7"
                    + "\nSair-0");
            opcao=ler.nextByte();

            
            if(opcao==1){
                System.out.println("Entre com um numero");
                v1 = ler.nextInt();

                System.out.println("entre com outro numero");
                v2 = ler.nextInt();
                soma=v1+v2;
                System.out.println("a Soma é: "+soma);
                
            }else if(opcao==2){
                System.out.println("Entre com um numero");
                v1 = ler.nextInt();

                System.out.println("entre com outro numero");
                v2 = ler.nextInt();
                sub=v1-v2;
                System.out.println("a Subtração é: "+sub);
                
            }else if(opcao==3){
                System.out.println("Entre com um numero");
                v1 = ler.nextInt();

                System.out.println("entre com outro numero");
                v2 = ler.nextInt();
                div=v1/v2;
                System.out.println("A divisão é: "+div);
                
            }else if(opcao==4){
                System.out.println("Entre com um numero");
                v1 = ler.nextInt();

                System.out.println("entre com outro numero");
                v2 = ler.nextInt();
                mult=v1*v2;
                System.out.println("a Multiplicação é "+mult);
                
            }else if(opcao==5){
                System.out.println("Entre com um numero");
                v1 = ler.nextInt();

                System.out.println("entre com outro numero");
                v2 = ler.nextInt();
                resto=v1%v2;
                System.out.println("o Resto da Divis é "+resto);
            }else if(opcao==6){
                System.out.println("Entre com um numero");
                v1 = ler.nextInt();
                quadrado=(int)Math.pow(v1, 2);
                System.out.println("o quadado dele é: "+quadrado);
            }else if(opcao==7){
                System.out.println("Entre com um numero");
                v1 = ler.nextInt();
                raiz=(int)Math.sqrt(v1);
                System.out.println("a Raiz quadrada é: "+raiz);
            }
            else{
                System.out.println("opcao invalida");
            }
                
        
        
    }
        
        
        
        
    }
    
}
