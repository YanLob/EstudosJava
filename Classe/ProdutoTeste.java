package Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Calvão De Cria";
        p1.preço = 20.00;
        p1.descontoDeCria = 0.25;

        var p2 = new Produto();
        p2.nome = "Americano";
        p2.preço = 35.00;
        p2.descontoDeCria = 0.25;

        double preçoFinal1 = p1.preçoComDesconto();
        double preçoFinal2 = p1.preçoComDesconto(0.1);

        double meuCarrinho = (preçoFinal1 + preçoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", meuCarrinho);

    }

}
