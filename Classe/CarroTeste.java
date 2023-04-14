package Classe;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carrox = new Carro("fiat unox", 300);

        Carro carrox2 = new Carro("rondocap", 120, "cria de cria");

        Carro carroHetero = new Carro();

        carrox.leitura();
        carrox2.leitura();
        carroHetero.leitura();

    }
}
