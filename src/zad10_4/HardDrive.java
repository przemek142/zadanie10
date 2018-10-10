package zad10_4;

public class HardDrive extends Component {
    private double Capacity;

    public double getCapacity() {
        return Capacity;
    }

    public void setCapacity(double capacity) {
        Capacity = capacity;
    }

    public HardDrive(String componentName, String manufacturerName, int serialNumber, double capacity) {
        super(componentName, manufacturerName, serialNumber);
        Capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("N:%s, M:%s, SN: %d, Cap:%.0fMB",
                getComponentName(), getManufacturerName(), getSerialNumber(),getCapacity());
    }
}
