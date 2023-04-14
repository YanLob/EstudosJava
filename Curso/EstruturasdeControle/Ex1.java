// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

package Curso.EstruturasdeControle;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um número de 0 a 10 par: ");
        int valor = input.nextInt();

        if (valor >= 0 && valor <= 10 && valor % 2 == 0) {
            System.out.println("Esse valor está entre 0 e 10 e é par!");

        }

        else {
            System.out.println("O valor digitado é menor que zero ou maior que dez ou não é par!");
        }

        input.close();
    }
}
