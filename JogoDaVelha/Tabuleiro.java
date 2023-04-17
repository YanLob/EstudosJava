package JogoDaVelha;

public class Tabuleiro {

    private String [][] m = {{"1","2","3"},
                            {"4","5","6"},
                            {"7","8","9"}};

    public String Mostrar(){
        for (int li = 0; li < 3; li++){
            for (int co = 0; co < 3; co++){
                System.out.print("   " + m[li][co]);
            }
            System.out.println();
        }
        return null;
    }

    public boolean Validacao(string p){
        for (int li = 0; li < 3; li++){
            for (int co = 0; co < 3; co++){
                if (m[li][co].equals(p)){
                    return true;
                }
            }
        }
        return false;
    }

    public void Jogada(string p, string j){
        if (p.equals("1")){
            m[0][0] = j;
        }else if (p.equals("2")){
            m[0][1] = j;
        }else if (p.equals("3")){
            m[0][2] = j;
        }else if (p.equals("4")){
            m[1][0] = j;
        }else if (p.equals("5")){
            m[1][1] = j;
        }else if (p.equals("6")){
            m[1][2] = j;
        }else if (p.equals("7")){
            m[2][0] = j;
        }else if (p.equals("8")){
            m[2][1] = j;
        }else if (p.equals("9")){
            m[2][2] = j;
        }

    }

    public string Ganhou(int jogadas){
        string[] T = new string[8];
        string vencedor = "null";

        if (jogadas == 9){
            vencedor = "EMPATE";
        }

        T[0] = m[0][0] + m[0][1] + m[0][2];
        T[1] = m[1][0] + m[1][1] + m[1][2];
        T[2] = m[2][0] + m[2][1] + m[2][2];

        T[3] = m[0][0] + m[1][0] + m[2][0];
        T[4] = m[0][1] + m[1][1] + m[2][1];
        T[5] = m[0][2] + m[1][2] + m[2][2];

        T[3] = m[0][0] + m[1][1] + m[2][2];
        T[4] = m[0][2] + m[1][1] + m[2][0];

        for (int i = 0; i < T.length; i++){
            if (T[i].equals("XXX")){
                vencedor = "Jogador 1";
            }

            else if (T[i].equals("OOO")){
                vencedor = "Jogador 2";
            }
        }
        return vencedor;
    }
}
