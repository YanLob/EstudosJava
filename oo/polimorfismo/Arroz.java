package polimorfismo;

public class Arroz {
    public double peso;

    public Arroz (double peso){
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
