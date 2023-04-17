package JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tabuleiro campo = new Tabuleiro();
        boolean jogo = true;

        while(jogo){
            campo.Mostrar();
            System.out.print("Digite a casa que você quer jogar: ");
            int jogada = entrada.nextInt();
            campo.Jogada(jogada, "X");

            
        }

    }
}
