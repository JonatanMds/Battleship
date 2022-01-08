import java.util.Scanner;

public class Battleship {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        PlayerMachine machine = new PlayerMachine();

        int options;
        boolean victory = false;


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

        machine.MachineMountBoard();
        machine.TabuleiroPlayer();
        machine.MachinePlays();




        while(victory == false){
            if(machine.contagemDeNavios == 0){
                victory = true;
                System.out.println("Vitória");
            }
        }
    }
}
