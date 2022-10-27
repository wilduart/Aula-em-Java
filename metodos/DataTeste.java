
package metodos;


public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 7;
        d1.mes = 10;
        d1.ano = 2021;
        
        var d2 = new Data();
        d2.dia = 19;
        d2.mes = 10;
        d2.ano = 1981;
        
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
        
    
}
