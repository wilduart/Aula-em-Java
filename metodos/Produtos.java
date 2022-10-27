
package metodos;


public class Produtos {
    String nome;
    double preco;
    double desconto;
    //podemos ter metodos com nomes iguais com parametros diferentes
    double precoComDesconto(){
        return preco*(1-desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco*(1-desconto+descontoDoGerente);
    }
}
