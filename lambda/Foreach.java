package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Luan", "Pedro");

        System.out.println("Forma Traducional...");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando lambda...");
        aprovados.forEach((nome) -> { System.out.println(nome + "!!!"); ;});

        System.out.println("\nMethod reference");
        aprovados.forEach(System.out::println);
    }
}
