import java.util.Random;

public class PlayerMachine {

    String [][] tabuleiroMachine = new String[10][10];
    String [][] tabuleiroPlayer = new String[10][10];

    Random numberGenerator = new Random();
    String navio = "n";
    int contagemDeNavios = 10;
    int machineLinha;
    int machineColuna;
    boolean machine = true;
    String resultado = "";


//        Montando tabuleiro da maquina
        void MachineMountBoard(){
            for(int i = 0; i < tabuleiroMachine.length; i++) {
                for (int j = 0; j < tabuleiroMachine[i].length; j++) {
                    tabuleiroMachine[i][j] = "~";
                }
            }
            for(int i = 0; i < 10; i++){
                machineLinha = numberGenerator.nextInt(10);
                machineColuna = numberGenerator.nextInt(10);
                tabuleiroMachine[machineLinha][machineColuna] = navio;
            }
        }

//        Tabeleiro player, apenas para testar se as jogadas da maquina está funcionando
       void TabuleiroPlayer(){
        for(int i = 0; i < tabuleiroPlayer.length; i++){
        for(int j = 0; j < tabuleiroPlayer[i].length; j++){
            tabuleiroPlayer[i][j] = "~";
        }}}


//    void PosicionandoOsNaviosNoTabuleiroMachine(){
//        for(int i = 0; i < 10; i++){
//        machineLinha = numberGenerator.nextInt(10);
//        machineColuna = numberGenerator.nextInt(10);
//        tabuleiroMachine[machineLinha][machineColuna] = navio;
//      }
//    }

//        void MostrandoOPosicionamentoNaTelas(){
//            for(int i = 0; i < tabuleiroMachine.length; i++){
//            for(int j = 0; j < tabuleiroMachine[i].length; j++){
//                System.out.print("|"+tabuleiroMachine[i][j]);
//            }
//                System.out.print("|");
//                System.out.println();
//            }}


//        Jogadas da maquina
        void MachinePlays(){
        if(machine == true){ //Verifica se é a vez da maquina de jogar
            do{
            machineLinha = numberGenerator.nextInt(10); //Número alaetório para linha
            machineColuna = numberGenerator.nextInt(10); //Número aleatótio para coluna
            resultado = (tabuleiroPlayer[machineLinha][machineColuna]); //Vai ao tabuleiro do player e acessa o resultado
            }while(resultado == "*"); // se já houver um navio abatido ele faz esse processo novamente, se não ele continua

            //Possiveis acertos
        switch (resultado){
            case "~":
                resultado = "-";
                tabuleiroPlayer[machineLinha][machineColuna] = "-";
                System.out.println("ÁGUA");
                break;
            case "n":
                resultado = "*";
                tabuleiroPlayer[machineLinha][machineColuna] = "*";
                System.out.println("ACERTOU");
                break;
            case "*":
                resultado = "X";
                System.out.println("JÁ AVIA UM NAVIO ABATIDO");
                break;
            }
        }

//      Mostrar o tabuleiro do player, !!apenas para teste das jogadas da maquina!!
        for(int i = 0; i < tabuleiroPlayer.length; i++){
        System.out.print(i);
        for(int j = 0; j < tabuleiroPlayer[i].length; j++){
            System.out.print("|"+tabuleiroPlayer[i][j]);
        }
        System.out.print("|");
        System.out.println();
    }

}
}

