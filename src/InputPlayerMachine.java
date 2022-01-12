import java.util.Random;
import java.util.Scanner;

public class InputPlayerMachine {
    Scanner scan = new Scanner(System.in);

    Random numberGenerator = new Random();


    int machineLinha;
    int machineColuna;

    int linhaDaTabelaDoPlayerHuman;
    int colunaDaTabelaDoPlayerHuman;


    public int NumberGeneratorMachineLinha(){
        machineLinha = numberGenerator.nextInt(10);
        return machineLinha;
    }
    public int NumberGeneratorMachineColuna(){
        machineColuna = numberGenerator.nextInt(10);
        return machineColuna;
    }



    //Imputs para certar os navios do playerMachine
    public int LinhaDaTabelaDoPlayerMachine(){
        System.out.println("Digite a linha de acerto do seu adiversário: ");
        linhaDaTabelaDoPlayerHuman = scan.nextInt();
        return linhaDaTabelaDoPlayerHuman;
    }

    public int ColunaDaTabelaDoPlayerMachine(){
        System.out.println("Digite a coluna de acerto do seu adiverário: ");
        colunaDaTabelaDoPlayerHuman = scan.nextInt();
        return colunaDaTabelaDoPlayerHuman;
    }
}
