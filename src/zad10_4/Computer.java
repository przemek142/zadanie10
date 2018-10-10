package zad10_4;

public class Computer {
    private Memory memory;
    private CPU cpu;
    private HardDrive hardDrive;

    public Computer(Memory memory, CPU cpu, HardDrive hardDrive) {
        this.memory = memory;
        this.cpu = cpu;
        this.hardDrive = hardDrive;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory= " + memory +
                ",\ncpu= " + cpu +
                ",\nhardDrive= " + hardDrive +
                '}';
    }
}
