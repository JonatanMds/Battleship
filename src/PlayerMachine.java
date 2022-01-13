public class PlayerMachine {

    InputPlayerMachine inputMachine = new InputPlayerMachine();

    String [][] tabuleiroMachine = new String[10][10];

    String submarino = " N ";
    int acertoSubmarino = 10;
    String resultado = "";
    boolean fimDeJogo = false;


//  Montando tabuleiro da maquina
    public void MachineMountBoard()
    {
        for(int i = 0; i < tabuleiroMachine.length; i++)
        {
            for (int j = 0; j < tabuleiroMachine[i].length; j++)
            {
                tabuleiroMachine[i][j] = " ~ ";
            }
        }
        for(int i = 0; i < 10; i++)
        {
            inputMachine.NumberGeneratorMachineLinha();
            inputMachine.NumberGeneratorMachineColuna();
            tabuleiroMachine[inputMachine.machineLinha][inputMachine.machineColuna] = submarino;
        }
    }


    String[][] MostrandoOPosicionamentoNaTelas()
    {
        System.out.println("Tabela do Machine");
        System.out.println("   0   1   2   3   4   5   6   7   8   9");
        System.out.println(" _________________________________________");
        for(int i = 0; i < tabuleiroMachine.length; i++)
        {
            System.out.print(i);
        for(int j = 0; j < tabuleiroMachine[i].length; j++)
        {
            System.out.print("|"+tabuleiroMachine[i][j]);
        }
            System.out.print("|");
            System.out.println();
        }
        return tabuleiroMachine;
    }


//  Jogadas da maquina
    void MachinePlays(String[][] tabuleiro){
        System.out.println("Machine jogando.....");
        do
        {
            inputMachine.NumberGeneratorMachineLinha();
            inputMachine.NumberGeneratorMachineColuna();
            resultado = (tabuleiro[inputMachine.machineLinha][inputMachine.machineColuna]);
        }while(resultado ==" * " || resultado == " - ");

        System.out.println("Irei derrotar esse humano escolho a linha "+ inputMachine.machineLinha +" e a coluna "+inputMachine.machineColuna);

        //Possiveis resultados para as jogadas da maquina
        switch (resultado)
        {
            case " N ":
                resultado = " * ";
                tabuleiro[inputMachine.machineLinha][inputMachine.machineColuna] = " * ";
                System.out.println("ACERTOU"+ " linha " + inputMachine.machineLinha + " coluna "+inputMachine.machineColuna);
                acertoSubmarino -= 1;
                if(acertoSubmarino == 0)
                {
                    fimDeJogo = true;
                }
                break;
            case " * ":
                resultado = " X ";
                System.out.println("JÁ HAVIA UM SUBMARINO ABATIDO"+ " linha " + inputMachine.machineLinha + " coluna "+inputMachine.machineColuna);
                tabuleiro[inputMachine.machineLinha][inputMachine.machineColuna] = " X ";
                break;

            default:
                resultado = " - ";
                tabuleiro[inputMachine.machineLinha][inputMachine.machineColuna] = " - ";
                System.out.println("ÁGUA"+ " linha " + inputMachine.machineLinha + " coluna "+inputMachine.machineColuna);
            }


        }

    }


