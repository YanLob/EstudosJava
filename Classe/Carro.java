package Classe;

public class Carro {

    String modelo;
    int limite;
    String nome;

    Carro(){
    this.modelo = "modeloAntigo";
    this.limite = 100;
    this.nome = "airton sena";
    }

    Carro(String modeloRecebido, int limiteRecebido) {
        this.modelo = modeloRecebido;
        this.limite = limiteRecebido;
        this.nome = "Anônimo";

    }

    Carro(String modeloRecebido, int limiteRecebido, String nomeRecebido) {
        this.modelo = modeloRecebido;
        this.limite = limiteRecebido;
        this.nome = nomeRecebido;
    }

    void leitura () {
        System.out.printf("Modelo -> %s   Limite -> %d Piloto %s \n", this.modelo, this.limite, this.nome);
        System.out.println();
    }

}
