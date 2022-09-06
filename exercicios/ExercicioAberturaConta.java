/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classscanner;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class ExercicioAberturaConta {
    public static void main(String[] args) {
        /*Usando a classe Scanner para entrada de dados, faça uma classe que
        simule a abertura de uma conta bancária cujo saldo inicial é zero. 
        A seguir, simule um deposito num valor qualquer e mostre o saldo atual. 
        Depois disso, simule uma retirada(débito), 
        qualquer e apresente o saldo final.   */
        
        
        float saldo =0f, saltotal = 0;
        try{
            Scanner texto = new Scanner(System.in);
            String nome;
            System.out.println("entre com seu nome");
            nome = texto.nextLine();
            System.out.println("bem vindo " +nome+ " seu saldo atual é \n"+saldo);
            
            System.out.println("qual valor será depositado para abert da conta?");
            int valor = texto.nextInt();
            System.out.println("seu novo saldo é: \n"+valor);
            
            System.out.println("Digite 1 caso queira fazer uma retirada");
            int comando = texto.nextInt();
            
            System.out.println("qual valor deseja retirar: ");
            int retirada = texto.nextInt();
           
            saltotal = valor - retirada;
            
            System.out.println("muito bem seu novo saldo foi atualizado "+saltotal);
            
            
            
            
            
        }catch (Exception e){
            
        }
    }
    
}
