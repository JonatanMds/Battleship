import java.util.Scanner;

public class InputPlayerHuman {

    Scanner scan = new Scanner(System.in);

    int linha;
    int coluna;

    int linhaDaTabelaDoPlayerMachine;
    int colunaDaTabelaDoPlayerMachine;



    //inputs para colocar os navios do playerHuman na tabela
    public int InputLinha()
    {
        System.out.println("Digite a linhas: ");
        linha = scan.nextInt();
        return linha;
    }

    public int InputColuna()
    {
        System.out.println("Digite a coluna: ");
        coluna = scan.nextInt();
        return coluna;
    }


    //Imputs para certar os navios do playerMachine
    public int LinhaDaTabelaDoPlayerMachine()
    {
        System.out.println("Digite a linha de acerto do seu adiversário: ");
        linhaDaTabelaDoPlayerMachine = scan.nextInt();
        return linhaDaTabelaDoPlayerMachine;
    }

    public int ColunaDaTabelaDoPlayerMachine()
    {
        System.out.println("Digite a coluna de acerto do seu adiverário: ");
        colunaDaTabelaDoPlayerMachine = scan.nextInt();
        return colunaDaTabelaDoPlayerMachine;
    }
}
