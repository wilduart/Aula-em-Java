
package metodos;


public class Metodos {

    
    public static void main(String[] args) {
        Produtos p1 = new Produtos();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;
        
        var p2 = new Produtos();
        p2.nome = "caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;
        
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
        System.out.printf("media do carrinho = R$%.2f.",mediaCarrinho);
    }
    
}
