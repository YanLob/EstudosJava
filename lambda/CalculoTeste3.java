package lambda;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo valor: ");
        int n2 = entrada.nextInt();

        BinaryOperator<Integer> calc = (x, y)-> { return x + y; };
        System.out.println(calc.apply(n1, n2));
    }
}
