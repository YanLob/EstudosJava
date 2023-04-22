package oo;

public class Pessoa {
    public int idade;

    Pessoa(int idade){
        this.idade = idade;
    }

    public int GetIdade(){
        return idade;
    }

    public void SetIdade(int novaIdade){
        this.idade = novaIdade;
    }
}
