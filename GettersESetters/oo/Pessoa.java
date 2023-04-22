package oo;

public class Pessoa {
    public int idade;

    Pessoa(int idade){
        SetIdade(idade);
    }

    public int GetIdade(){
        return idade;
    }

    public void SetIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }
}
