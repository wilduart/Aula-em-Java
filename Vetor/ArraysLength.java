
package notaalunosvetor;


public class ArraysLength {
    public static void main(String[] args) {
        int i;
        int[]x=new int[10];
        //da posicao 4 até a posicao 7 ele vai receber 1
        //java.util.Arrays.fill(x,4,7,1 );
        //no metodo abaixo eu faço com o vetorX receba 1 em todas as posi
        java.util.Arrays.fill(x,1);
        //x.length vai buscar a comprimento correto do meu vetorX
        for(i=0;i<x.length;++i){
            System.out.println(x[i]);
        }
    }
    
}
