// Criar um programa que receba um número e diga se ele é um número primo.

package Curso.EstruturasdeControle;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Digite um valor: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("par");

        }

        else {
            System.out.println("Número primo");
        }

        input.close();
    }
}
