package zad10_4;

public class Main {
    public static void main(String[] args) {

        Memory memory = new Memory("mem1", "man1", 345,
                2000, 2000, 130.0, 100, 2048, 1);

        CPU cpu = new CPU("cpu1", "man1", 1234, 2000,
                2000, 150, 100);

        HardDrive hardDrive = new HardDrive("driveA", "man1",
                231, 1000);

        Computer computer = new Computer(memory, cpu, hardDrive);

        System.out.println(computer);
        overclock(2400, cpu, computer);
        overclock(8400, cpu, computer);
        overclock(8400, memory, computer);
        overclock(2100, memory, computer);
    }


    public static void overclock(int newClock, OverclockableComponent overclockableComponent, Computer computer) {
        try {
            overclockableComponent.overclock(newClock);
        } catch (OverclockingTemperatureExeption e) {
            System.out.println("*** Za duża częstotliwość, nie wprowadzono zmiany ***");
        } finally {
            System.out.println(computer);
        }

    }
}
