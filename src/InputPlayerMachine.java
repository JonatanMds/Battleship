import java.util.Random;

public class InputPlayerMachine {


    Random numberGenerator = new Random();


    int machineLinha;
    int machineColuna;

    public int NumberGeneratorMachineLinha()
    {
        machineLinha = numberGenerator.nextInt(10);
        return machineLinha;
    }
    public int NumberGeneratorMachineColuna()
    {
        machineColuna = numberGenerator.nextInt(10);
        return machineColuna;
    }

}
