package zad10_4;

public class CPU extends OverclockableComponent {
    private static int degPer100Mhz = 10;

    public static int getDegPer100Mhz() {
        return degPer100Mhz;
    }

    public static void setDegPer100Mhz(int degPer100Mhz) {
        CPU.degPer100Mhz = degPer100Mhz;
    }

    public CPU(String componentName, String manufacturerName, int serialNumber, int defaultClock, int overclockedClock, double safeTemperature, double defaultTemperature) {
        super(componentName, manufacturerName, serialNumber, defaultClock, overclockedClock, safeTemperature, defaultTemperature);
    }

    @Override
    public void overclock(int newClock) throws OverclockingTemperatureExeption {
        if (readTemperature(newClock) > getSafeTemperature()) {
            throw new OverclockingTemperatureExeption("CPU");
        } else {
            setOverclockedClock(newClock);
        }
    }

    @Override
    public double readTemperature(int newClock) {
        double temp;
        temp = getDefaultTemperature() + (degPer100Mhz * ((newClock - getDefaultClock()) / 100));
        if (temp >= 0){
            return temp;
        }else
            return getDefaultTemperature();
    }

    @Override
    public String toString() {
        return String.format("N:%s, M:%s, SN: %d, C:%dMhz, O:%dMhz, T:%.1foC",
                getComponentName(), getManufacturerName(), getSerialNumber(), getDefaultClock(),
                getOverclockedClock(), getSafeTemperature());
    }
}
