import java.util.Scanner;

public class Battleship {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        PlayerMachine machine = new PlayerMachine();
        PlayerHuman human = new PlayerHuman();

//        boolean fimGame = (human.acertoNavio > 0 && machine.acertoNavio > 0);
        int options;
//        System.out.println(fimGame);


        do{
            System.out.println("Bem vindo ao Naval Battle");
            System.out.println("1: Regras do jogo");
            System.out.println("2: Começar a jogar");
            options = scan.nextInt();
            while(options != 1 && options != 2){
                System.out.println("Por favor digite números validos");
                System.out.println("1: Regras do jogo");
                System.out.println("2: Começar a jogar");
                options = scan.nextInt();
            }
        }while(options != 1 && options != 2);

        if(options == 1){
            System.out.println("Regras do jogo..........");
        }

        System.out.println("                        |`-:_\n" +
                "  ,----....____            |    `+.\n" +
                " (             ````----....|___   |\n" +
                "  \\     _                      ````----....____\n" +
                "   \\    _)                                     ```---.._\n" +
                "    \\                                                   \\\n" +
                "  )`.\\  )`.   )`.   )`.   )`.   )`.   )`.   )`.   )`.   )`.   )`.\n" +
                "-'   `-'   `-'   `-'   `-'   `-'   `-'   `-'   `-'   `-'   `-'   `"
        );


        human.PlayerHumanTabuleiro();
        human.PosicionarSeusNavios();
        machine.MachineMountBoard();






        while(human.acertoNavio > 0 & machine.acertoNavio > 0){
            machine.MachinePlays(human.Tabuleiro());
            human.MostrarTabelaPlayerHuman();
            human.HumanPlays(machine.MostrandoOPosicionamentoNaTelas());
            System.out.println("Machineeeee");
            machine.MostrandoOPosicionamentoNaTelas();
            System.out.println(machine.acertoNavio);
            }
        }
    }
