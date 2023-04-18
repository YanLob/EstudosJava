package JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tabuleiro campo = new Tabuleiro();
        boolean jogo = true;
        int cont = 0, jogadas = 0;

        System.out.print("Jogador 1 => Digite seu simbolo: ");
        String simbolo1 = entrada.next();

        System.out.print("Jogador 2 => Digite seu simbolo: ");
        String simbolo2 = entrada.next();
        
        campo.Mostrar();

        while(jogo){
            
            do{
                System.out.print("Digite a casa que você quer jogar [jogador 1]: ");
                String posicao = entrada.next();
                
                campo.Mostrar();
                
                System.out.println("-=-=-=-==-=-=-");

                while(!campo.Validacao(posicao)){
                    System.out.print("Tente novamente!");
                    System.out.print("Digite a casa que você quer jogar [jogador 1]: ");
                    posicao = entrada.next();
                    valido = 0;
                }
                campo.Jogada(posicao, simbolo1);

            }while(valido == 0);
            
        }
        
        System.out.println("    Vencedor: "+campo.Ganhou(cont));
    }
}
