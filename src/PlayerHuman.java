
public class PlayerHuman {

    InputPlayerHuman inputPlayer = new InputPlayerHuman();


    String [][] tabuleiroPlayerHuman = new String [10][10];
    boolean firstGame = true;


    String submarino = " N ";//navio
    String resultado = "";
    int acertoSubmarino = 10;
    boolean fimDeJogo = false;

    public void MontadorDeTabuleiroPlayerHuman()
    {
        for(int i = 0; i < tabuleiroPlayerHuman.length; i++)
        {
            for(int j = 0; j < tabuleiroPlayerHuman[i].length; j++)
            {
                tabuleiroPlayerHuman[i][j] =" ~ ";
            }
        }
    }

    public void PosicionadorDeSubmarinosPlayerHuman()
    {
        for(int i = 0; i < 2; i++)
        {
            if(firstGame)
            {
                System.out.println("Vamos posicionar seus SUBMARINOS");
                MostrarTabelaPlayerHuman();
                firstGame = false;
            }
            inputPlayer.InputLinha();
            inputPlayer.InputColuna();
            System.out.println("SUBMARINO posicionado na linha "+inputPlayer.linha+" e na coluna "+inputPlayer.coluna);
            tabuleiroPlayerHuman[inputPlayer.linha][inputPlayer.coluna] = submarino;
            MostrarTabelaPlayerHuman();
        }
    }


    public void MostrarTabelaPlayerHuman()
    {
        System.out.println("Tabela do Player");
        System.out.println("   0   1   2   3   4   5   6   7   8   9"); //numero da coluna
        System.out.println(" _________________________________________");
        for(int i = 0; i < tabuleiroPlayerHuman.length; i++)
        {
            System.out.print(i);
            for(int j = 0; j < tabuleiroPlayerHuman[i].length; j++)
            {
                System.out.print("|"+tabuleiroPlayerHuman[i][j]);
            }
            System.out.print("|");
            System.out.println();
            System.out.println(" _________________________________________");
        }
        System.out.println();
    }


    public String[][] Tabuleiro()
    {
        for(int i = 0; i < tabuleiroPlayerHuman.length; i++)
        {
            for(int j = 0; j < tabuleiroPlayerHuman[i].length; j++)
            {

            }

        }
        return tabuleiroPlayerHuman;
    }

    //Jogadas do palyer human
    void HumanPlays(String[][] tabuleiro)
    {
        inputPlayer.LinhaDaTabelaDoPlayerMachine();
        inputPlayer.ColunaDaTabelaDoPlayerMachine();
        resultado = (tabuleiro[inputPlayer.linhaDaTabelaDoPlayerMachine][inputPlayer.colunaDaTabelaDoPlayerMachine]);

        //Possiveis acertos
        switch (resultado)
        {
            case " N ":
                resultado = " * ";
                tabuleiro[inputPlayer.linhaDaTabelaDoPlayerMachine][inputPlayer.colunaDaTabelaDoPlayerMachine] = " * ";
                System.out.println("Você acertou um dos SUBMARINOS do Machine");
                acertoSubmarino -= 1;
                if (acertoSubmarino == 0)
                {
                    fimDeJogo = true;
                }
                break;
            case " * ":
                resultado = " X ";
                System.out.println("JÁ HAVIA UM SUBMARINO ABATIDO");
                tabuleiro[inputPlayer.linhaDaTabelaDoPlayerMachine][inputPlayer.colunaDaTabelaDoPlayerMachine] = " X ";
                break;
            default:
                resultado = " - ";
                tabuleiro[inputPlayer.linhaDaTabelaDoPlayerMachine][inputPlayer.colunaDaTabelaDoPlayerMachine] = " - ";
                System.out.println("ÁGUA");
            }
        }
    }

