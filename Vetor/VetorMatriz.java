
package notaalunosvetor;


public class VetorMatriz {
    public static void main(String[] args) {
        double[][]x = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[i].length;++j){
                System.out.print(i+"|"+j+"="+x[i][j]+"\t");
            }
            System.out.println("\n");
        }
        
    }
    
}
