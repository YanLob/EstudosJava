package polimorfismo;

public class Arroz {
    public int peso;

    public Arroz (int peso){
        setPeso(peso);
    }

    public int getPeso (){
        return peso;
    }

    public void setPeso (int peso){
        if (peso >= 0){
            this.peso = peso;
        }
        else{
            System.out.print("Peso informado menor que zero!");
        }
    }
}
