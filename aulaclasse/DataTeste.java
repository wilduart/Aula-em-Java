
package aulaclasse;


public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2021;
        
        var d2 = new Data();
        
        d2.dia = 29;
        d2.mes = 07;
        d2.ano = 2023;
        
        System.out.printf("%d/%d/%d inicio das aulas\n",d1.dia,d1.mes,d1.ano);
        System.out.printf("%d/%d/%d Fim das Aulas\n",d2.dia,d2.mes,d2.ano);
    }
    
}
