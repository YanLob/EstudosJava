package Classe;

public class Produto {

    String nome;
    double preço;
    double descontoDeCria;


    double preçoComDesconto(double descontoDeGerente) {
        return preço * (1 - descontoDeCria + descontoDeGerente);
    }
    double preçoComDesconto() {
        return preço * (1 - descontoDeCria);
    }
}
