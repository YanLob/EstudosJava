package Array;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);

        double totalAlunosA = 0;
        for (int i = 0;i < notasAlunoA.length;i++){
            totalAlunosA += notasAlunoA[i];
        }

        System.out.println(totalAlunosA / notasAlunoA.length);

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

        double totalAlunosB = 0;
        for (int i = 0;i < notasAlunoB.length;i++){
            totalAlunosB += notasAlunoB[i];
        }

        System.out.println(totalAlunosB / notasAlunoB.length);

    }
}
