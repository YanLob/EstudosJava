package Classe.defafio;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    void comer(Comida comida){
        if(comida != null){
            pesoPessoa += comida.pesoComida;
        }
    }

    String apresentar(){
        return "Olá meu nome é " + nomePessoa + " e eu peso " + pesoPessoa + " Kgs.";
    }
}
