public class PlayerMachine {

    InputPlayerMachine inputMachine = new InputPlayerMachine();
    String [][] tabuleiroMachine = new String[10][10];
//    String [][] tabuleiroPlayer = new String[10][10];

//    Random numberGenerator = new Random();
    String navio = "n";
    int acertoNavio = 2;
    boolean machine = true;
    String resultado = "";


//        Montando tabuleiro da maquina
        public void MachineMountBoard(){
            for(int i = 0; i < tabuleiroMachine.length; i++) {
                for (int j = 0; j < tabuleiroMachine[i].length; j++) {
                    tabuleiroMachine[i][j] = "~";
                }
            }
            for(int i = 0; i < 2; i++){
                inputMachine.NumberGeneratorMachineLinha();
                inputMachine.NumberGeneratorMachineColuna();
                tabuleiroMachine[inputMachine.machineLinha][inputMachine.machineColuna] = navio;
            }
        }


        String[][] MostrandoOPosicionamentoNaTelas(){
            for(int i = 0; i < tabuleiroMachine.length; i++){
            for(int j = 0; j < tabuleiroMachine[i].length; j++){
                System.out.print("|"+tabuleiroMachine[i][j]);
            }
                System.out.print("|");
                System.out.println();
            }
            return tabuleiroMachine;
        }


//        Jogadas da maquina
        void MachinePlays(String[][] tabuleiro){
            System.out.println("Machine jogando.....");
        if(machine == true){
            do{
                inputMachine.NumberGeneratorMachineLinha();
                inputMachine.NumberGeneratorMachineColuna();
                resultado = (tabuleiro[inputMachine.machineLinha][inputMachine.machineColuna]);
            }while(resultado == "*");

            //Possiveis acertos
        switch (resultado){
            case "~":
                resultado = "-";
                tabuleiro[inputMachine.machineLinha][inputMachine.machineColuna] = "-";
                System.out.println("ÁGUA"+ " linha " + inputMachine.machineLinha + " coluna "+inputMachine.machineColuna);
                break;
            case "n":
                resultado = "*";
                tabuleiro[inputMachine.machineLinha][inputMachine.machineColuna] = "*";
                System.out.println("ACERTOU"+ " linha " + inputMachine.machineLinha + " coluna "+inputMachine.machineColuna);
                acertoNavio -= 1 ;
                break;
            case "*":
                resultado = "X";
                System.out.println("JÁ AVIA UM NAVIO ABATIDO"+ " linha " + inputMachine.machineLinha + " coluna "+inputMachine.machineColuna);
                break;
            }
        }

    }

}


