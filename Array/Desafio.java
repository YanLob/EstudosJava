package Array;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        int qtDeNotas = entrada.nextInt();

        double[] notas = new double[qtDeNotas];

        for (int i = 0;i < notas.length; i++){
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota : notas){
            total += nota;
        }

        double media = (total / qtDeNotas);
        System.out.println(media);

        entrada.close();
    }
}
