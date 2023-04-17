package JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tabuleiro campo = new Tabuleiro();
        boolean jogo = true;
        int cont = 0;

        System.out.print("Jogador 1 => Digite seu simbolo: ");
        String simbolo1 = entrada.nextLine();

        System.out.print("Jogador 2 => Digite seu simbolo: ");
        String simbolo2 = entrada.nextLine();
        
        while(jogo){
            
            System.out.print("Digite a casa que você quer jogar [jogador 1]: ");
            String jogador1 = entrada.nextLine();
            campo.Jogada(jogador1, simbolo1);
            
            cont++;
            
            campo.Mostrar();
            
            System.out.println("-=-=-=-==-=-=-");
            System.out.println("    Vencedor: "+campo.Ganhou(cont));
            
            System.out.print("Digite a casa que você quer jogar [jogador 2]: ");
            String jogador2 = entrada.nextLine();
            campo.Jogada(jogador2, simbolo2);
            
            cont++;
            
            campo.Mostrar();
            
            System.out.println("-=-=-=-==-=-=-");
            
            
        }
        
    }
}
