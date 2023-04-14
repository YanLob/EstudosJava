package Classe.defafio;

public class Jantar {

    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.800);

        Comida c2 = new Comida("Carne", 0.500);

        Pessoa p = new Pessoa("Lucas", 72.500);

        System.out.println(p.apresentar());
        p.comer(c1);

        System.out.println(p.apresentar());
        p.comer(c2);

        System.out.println(p.apresentar());
    }
}
