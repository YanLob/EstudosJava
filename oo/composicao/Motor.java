package oo.composicao;

public class Motor {
    public final Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    protected Motor(Carro carro){
        this.carro = carro;
    }

    public int giros(){
        if (!ligado){
            return 0;
        }else{
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
