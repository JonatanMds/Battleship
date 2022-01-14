import java.util.Scanner;

public class Battleship {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        PlayerMachine machine = new PlayerMachine();
        PlayerHuman human = new PlayerHuman();
        GameRules rules = new GameRules();

        int options; //Opções para iniciar o jogo.


        do{
            System.out.println("1: Regras do jogo");
            System.out.println("2: Comece a jogar");
            options = scan.nextInt();
            while(options != 1 && options != 2)
            {
                System.out.println("Por favor digite números válidos");
                System.out.println("1: Regras do jogo");
                System.out.println("2: Começar a jogar");
                options = scan.nextInt();
            }
        }while(options != 1 && options != 2);


        if(options == 1)
        {
            rules.Regras();
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


        machine.MachineMountBoard();
        human.MontadorDeTabuleiroPlayerHuman();
        human.PosicionadorDeSubmarinosPlayerHuman();



//      Jogadas Human/Machine
        while(human.fimDeJogo == false && machine.fimDeJogo == false)//As duas condições ja vem como falsas
        {
            machine.MachinePlays(human.Tabuleiro());
            human.MostrarTabelaPlayerHuman();
            if(machine.fimDeJogo == false)
            {
            human.HumanPlays(machine.MostrandoOPosicionamentoNaTelas());
            }
        }

        //      Fim de jogo
        if(machine.fimDeJogo == true)
        {
            System.out.println("Um humano nunca conseguira ganhar de uma máquina \n"+"MACHINE WINS!!!!!!!");
        }else
        {
            System.out.println("Você Venceu! Parabéns.");
        }
    }
}
