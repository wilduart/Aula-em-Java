
package vetorusandopane;

import javax.swing.JOptionPane;


public class VetorUsandoPane {

    
    public static void main(String[] args) {
        final int TOTAL_ALUNOS=3;
        final int TOTAL_BIMESTRE=4;
        final double NOTA_MINIMA=7.0;
        
        String[] nomeAlunos=new String[TOTAL_ALUNOS];
        double[][] notaAlunos=new double[TOTAL_ALUNOS][TOTAL_BIMESTRE];
        double[] mediaAlunos=new double[TOTAL_ALUNOS];
        
        for(int i=0;i<TOTAL_ALUNOS;++i){
            nomeAlunos[i]=JOptionPane.showInputDialog("Informe o nome"
                    + " do "+(i+1)+"º aluno");
        }
        for(int i=0;i<TOTAL_ALUNOS;++i){
            for(int j=0;j<TOTAL_BIMESTRE;++j){
                notaAlunos[i][j]=Double.parseDouble(JOptionPane.showInputDialog(""
                        + "Informe a nota do "
                        + "aluno "+nomeAlunos[i]+" para o "+(j+1)+" "
                                + "º Bimestre"));
            }
        }
        for(int i=0;i<TOTAL_ALUNOS;++i){
            for(int j=0;j<TOTAL_BIMESTRE;++j){
                mediaAlunos[i]+=notaAlunos[i][j];
            }
            mediaAlunos[i]/=TOTAL_BIMESTRE;
        }
        for(int i=0;i<TOTAL_ALUNOS;++i){
            if(mediaAlunos[i]>=NOTA_MINIMA){
                JOptionPane.showMessageDialog(null,"Nome "
                        + ""+nomeAlunos[i]+" Media "
                                + ""+mediaAlunos[i]+" "
                                        + "Situação Aprovado");
                continue;
            }
            JOptionPane.showMessageDialog(null,"Nome "
                        + ""+nomeAlunos[i]+" Media "
                                + ""+mediaAlunos[i]+" "
                                        + "Situação Reprovado");
            
        }
    }
    
}
