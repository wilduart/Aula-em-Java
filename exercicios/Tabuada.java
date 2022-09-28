/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        System.out.println("Entre com um numero para gerar a"
                + " TABUADA:");
        int num=ler.nextInt();
        
        System.out.println("Tabuada de "+num+ ":");
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
    
}
