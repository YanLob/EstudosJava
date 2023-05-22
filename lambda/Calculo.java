package lambda;

@FunctionalInterface
public interface Calculo {
    public abstract double executar(double a, double b);

    default String legal (){ return "Legal!"; }

    default String meioLegal (){ return "Meio Legal!"; }

    static String muitoLegal (){ return "Muito Legal!"; }

}
