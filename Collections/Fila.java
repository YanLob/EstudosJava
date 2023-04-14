package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!

        fila.add("Ana"); // Retorna false
        fila.offer("Carlos"); // Lança uma exceção
        fila.add("Lua");
        fila.offer("Rafael");
        fila.add("Bia");
        fila.offer("Ricardo");

        // Peek e Element -> Obter o proximo item da fila (sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção
        System.out.println(fila.element());

        System.out.println();

        // Pool e Remove-> Obter o proximo elemento da fila e remove
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
