
package notaalunosvetor;

import java.util.Scanner;


public class NotaAlunosMatriz {
    public static void main(String[] args) {
        final int TOTAL_ALUNOS=4;
        final int TOTAL_BIMESTRE=4;
        final double NOTA_MINIMA=70.0;
        
        Scanner input = new Scanner(System.in);
        String[] nomeAlunos=new String[TOTAL_ALUNOS];
        double[][]notaAlunos=new double[TOTAL_ALUNOS][TOTAL_BIMESTRE];
        double[] mediaAlunos=new double[TOTAL_ALUNOS];
        
        //Obter nome dos alunos
        for(int i=0;i<TOTAL_ALUNOS;++i){
            System.out.println("Informe o nome do "+(i+1)+"º aluno");
            nomeAlunos[i]=input.nextLine();
        }
        System.out.println("\n");
        
        //Obter notas dos Alunos, todos os Bimestres
        for(int i = 0;i<TOTAL_ALUNOS;++i){
            for(int j=0;j<TOTAL_BIMESTRE;++j){
                System.out.println("Informe a nota do "
                        + "aluno "+nomeAlunos[i]+" para o "+(j+1)+""
                                + "º Bimestre");
                notaAlunos[i][j]=input.nextDouble();
                
            }
        }
        //calcular media alunos
        for(int i = 0;i<TOTAL_ALUNOS;++i){
            for(int j=0;j<TOTAL_BIMESTRE;++j){
                mediaAlunos[i]+=notaAlunos[i][j];
                
            }
            mediaAlunos[i]/=TOTAL_BIMESTRE;
        }
        //mostrar Situação dos Alunos
        System.out.println("======RESULTADO FINAL======");
        
        for(int i=0;i<TOTAL_ALUNOS;++i){
            if(mediaAlunos[i]>=NOTA_MINIMA){
                System.out.println("Nome: "+nomeAlunos[i]+""
                        + "Media "+mediaAlunos[i]+""
                                + " Situação:Aprovado");
                continue;
            }
            System.out.println("Nome: "+nomeAlunos[i]+""
                        + " Media "+mediaAlunos[i]+""
                                + " Situação:Reprovado");
        }
    }
    
}
