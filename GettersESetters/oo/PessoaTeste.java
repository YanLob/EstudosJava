package oo;

public class PessoaTeste {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Evandro", -30);
        p1.SetIdade(22);
        p1.Setnome("Luan Santana");

        System.out.println(p1.idade);
        System.out.print(p1.nome);
    }
}
