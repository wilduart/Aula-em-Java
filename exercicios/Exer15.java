package exer12;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, recup;
        float media = 0, novamedia = 0;

        System.out.println("Informe sua nota 1");
        nota1 = ler.nextFloat();

        System.out.println("Informe sua nota 2");
        nota2 = ler.nextFloat();

        System.out.println("Informe sua nota 3");
        nota3 = ler.nextFloat();

        System.out.println("Informe sua nota 4");
        nota4 = ler.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua media foi " + media);

        if (media >= 7) {
            System.out.println("APROVADO");

        } 
        else if (media < 7) {
            System.out.println("Infome nova nota após "
                    + "recuperacao");
            recup = ler.nextFloat();
            novamedia = (media + recup) / 2;
            System.out.println("sua noma media e: " + novamedia);
            if (novamedia >= 7) {
                System.out.println("Aprovado, após Recuperacao");
            }
            else {
            System.out.println("Reprovado, suas média anual foi "
                    + " " + novamedia);
        }

        } 

    }

}
