package Curso.EstruturasdeControle;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numsorteado, num, tentativa = 0;

        System.out.println("Sorteando um número de 0-100...");
        Random numbase = new Random();
        numsorteado = numbase.nextInt(101);

        do{
            System.out.println("[-1] para sair...\n" +
                    "Digite um valor:");
            num = input.nextInt();

            tentativa++;

            if (num == -1) {
                System.out.println("-FIM-");
                break;
            }

            else if (tentativa >= 10) {
                System.out.println("Limite de tentativas exercida!\n" +
                        "Tente novamente");
                break;
            }

            else if (num > numsorteado) {
                System.out.println("O número é menor!\n");
            }

            else if (num < numsorteado) {
                System.out.println("O número é maior!\n");
                }

            else if (num == numsorteado) {
                System.out.println("Acertou");
                System.out.println("Quantidade de tentativas feitas -> " + tentativa);
                System.out.println("Quantidade de tentativas restantes -> " + (10 - tentativa));

                break;
            }

        } while (num != -1);

        input.close();
    }
}
