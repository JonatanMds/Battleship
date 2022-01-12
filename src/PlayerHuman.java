import java.util.List;
import java.util.Scanner;

public class PlayerHuman {

    Scanner scan = new Scanner(System.in);
    InputPlayerHuman inputPlayer = new InputPlayerHuman();

    String [][] tabuleiroPlayerHuman = new String [10][10];


    String navio = "n";
    boolean human = true;
    String resultado = "";
    int acertoNavio = 2;

    public void PlayerHumanTabuleiro(){
        for(int i = 0; i < tabuleiroPlayerHuman.length; i++){
            for(int j = 0; j < tabuleiroPlayerHuman[i].length; j++){
                tabuleiroPlayerHuman[i][j] ="n";
            }
        }
    }

    public void PosicionarSeusNavios(){
        for(int i = 0; i < 2; i++){
            inputPlayer.InputLinha();
            inputPlayer.InputColuna();
        tabuleiroPlayerHuman[inputPlayer.linha][inputPlayer.coluna] = navio;
        }
    }


    public void MostrarTabelaPlayerHuman(){
        for(int i = 0; i < tabuleiroPlayerHuman.length; i++){
            for(int j = 0; j < tabuleiroPlayerHuman[i].length; j++){
                System.out.print("|"+tabuleiroPlayerHuman[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
    }
    public String[][] Tabuleiro(){
        for(int i = 0; i < tabuleiroPlayerHuman.length; i++){
            for(int j = 0; j < tabuleiroPlayerHuman[i].length; j++){

            }

        }
        return tabuleiroPlayerHuman;
    }


    void HumanPlays(String[][] tabuleiro) {
        if (human == true) { //Verifica se é a vez da maquina de jogar
            do {
                inputPlayer.LinhaDaTabelaDoPlayerMachine();
                inputPlayer.ColunaDaTabelaDoPlayerMachine();
                resultado = (tabuleiro[inputPlayer.linhaDaTabelaDoPlayerMachine][inputPlayer.colunaDaTabelaDoPlayerMachine]);
            } while (resultado == "*");

            //Possiveis acertos
            switch (resultado) {
                case "~":
                    resultado = "-";
                    tabuleiro[inputPlayer.linhaDaTabelaDoPlayerMachine][inputPlayer.colunaDaTabelaDoPlayerMachine] = "-";
                    System.out.println("ÁGUA");
                    break;
                case "n":
                    resultado = "*";
                    tabuleiro[inputPlayer.linhaDaTabelaDoPlayerMachine][inputPlayer.colunaDaTabelaDoPlayerMachine] = "*";
                    System.out.println("ACERTOU");
                    acertoNavio -= 1;
                    break;
                case "*":
                    resultado = "X";
                    System.out.println("JÁ AVIA UM NAVIO ABATIDO");
                    break;
            }
        }
    }
}
