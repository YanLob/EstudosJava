package Curso.EstruturasdeControle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa dizer" +
                    "\nas palavras mágicas!");

            System.out.println("Quer sair? ");
            texto = input.nextLine();

        } while (!texto.equalsIgnoreCase("por favor"));

        input.close();
    }
}
