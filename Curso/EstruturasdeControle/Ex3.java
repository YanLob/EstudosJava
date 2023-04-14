// Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0
// imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
// caso contrário imprime no console "Reprovado".

package Curso.EstruturasdeControle;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("APROVADO");

        }

        else if (media < 7.0 && media > 4) {
            System.out.println("RECUPERAÇÂO");

        }

        else {
            System.out.println("REPROVADO");
        }

        input.close();
    }
}
