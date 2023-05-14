package polimorfismo.polimorfismoStatico;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(90);
        System.out.println(p1.getPeso());

        //Arroz ingrediente1 = new Arroz(1.0);
        //Feijao ingrediente2 = new Feijao(2.5);
        
        //p1.comer(ingrediente1);
        //p1.comer(ingrediente2);

        System.out.println(p1.getPeso());

        //Sorvete sobremesa = new Sorvete(3.8);

        //p1.comer(sobremesa);
        
        System.out.println(p1.getPeso());
        
    }
}
