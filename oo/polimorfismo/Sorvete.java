package polimorfismo;

public class Sorvete {
    public double peso;

    public Sorvete (double peso){
        setPeso(peso);
    }

    public double getPeso (){
        return peso;
    }

    public void setPeso (double peso){
        if (peso >= 0){
            this.peso = peso;
        }
        else{
            System.out.print("Peso informado menor que zero!");
        }
    }
}
