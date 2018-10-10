package zad10_4;

public class Memory extends OverclockableComponent implements Overclock {
    private static int degPer100Mhz = 15;
    private int numberOfUnits;
    private double Capacity;

    public double getCapacity() {
        return Capacity;
    }

    public void setCapacity(double capacity) {
        Capacity = capacity;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public static int getDegPer100Mhz() {
        return degPer100Mhz;
    }

    public static void setDegPer100Mhz(int degPer100Mhz) {
        Memory.degPer100Mhz = degPer100Mhz;
    }

    public Memory(String componentName, String manufacturerName, int serialNumber, int defaultClock, int overclockedClock, double safeTemperature, double defaultTemperature, int numberOfUnits, double capacity) {
        super(componentName, manufacturerName, serialNumber, defaultClock, overclockedClock, safeTemperature, defaultTemperature);
        this.numberOfUnits = numberOfUnits;
        Capacity = capacity;
    }

    @Override
    public void overclock(int newClock) throws OverclockingTemperatureExeption {
        if (readTemperature(newClock) > getSafeTemperature()) {
            throw new OverclockingTemperatureExeption("Memory");
        } else {
            setOverclockedClock(newClock);
        }

    }

    @Override
    public double readTemperature(int newClock) {
        double temp;
        temp = getDefaultTemperature() + (degPer100Mhz * ((newClock - getDefaultClock()) / 100));
        if (temp >= 0) {
            return temp;
        } else
            return getDefaultTemperature();
    }

    @Override
    public String toString() {
        return String.format("Q: %d, Cap: %.0fMB, N:%s, M:%s, SN: %d, C:%dMhz, O:%dMhz, T:%.0foC", numberOfUnits,
                getCapacity(), getComponentName(), getManufacturerName(), getSerialNumber(), getDefaultClock(),
                getOverclockedClock(), getSafeTemperature());
    }
}
