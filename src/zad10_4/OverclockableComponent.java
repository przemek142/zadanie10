package zad10_4;

public abstract class OverclockableComponent extends Component implements Overclock {
    private int defaultClock, overclockedClock;
    private double safeTemperature, defaultTemperature;

    public double getDefaultTemperature() {
        return defaultTemperature;
    }

    public void setDefaultTemperature(double defaultTemperature) {
        this.defaultTemperature = defaultTemperature;
    }

    public int getDefaultClock() {
        return defaultClock;
    }

    public void setDefaultClock(int defaultClock) {
        this.defaultClock = defaultClock;
    }

    public int getOverclockedClock() {
        return overclockedClock;
    }

    public void setOverclockedClock(int overclockedClock) {
        this.overclockedClock = overclockedClock;
    }

    public double getSafeTemperature() {
        return safeTemperature;
    }

    public void setSafeTemperature(double safeTemperature) {
        this.safeTemperature = safeTemperature;
    }

    public OverclockableComponent(String componentName, String manufacturerName, int serialNumber, int defaultClock, int overclockedClock, double safeTemperature, double defaultTemperature) {
        super(componentName, manufacturerName, serialNumber);
        this.defaultClock = defaultClock;
        this.overclockedClock = overclockedClock;
        this.safeTemperature = safeTemperature;
        this.defaultTemperature = defaultTemperature;
    }
}
