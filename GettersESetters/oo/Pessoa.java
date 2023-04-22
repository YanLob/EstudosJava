package oo;

public class Pessoa {
    public int idade;
    public String nome;

    Pessoa(String nome ,int idade){
        Setnome(nome);
        SetIdade(idade);
    }

    public String Getnome(String nome){
        return nome;
    }

    public void Setnome(String novoNome){
        this.nome = novoNome;
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
