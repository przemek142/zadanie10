package zad10_4;

public class Component {
    private String componentName, manufacturerName;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Component(String componentName, String manufacturerName, int serialNumber) {
        this.componentName = componentName;
        this.manufacturerName = manufacturerName;
        this.serialNumber = serialNumber;
    }
}
