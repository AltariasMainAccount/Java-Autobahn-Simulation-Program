package sim_classes;

// Die vehicle_classes
import sim_classes.vehicle_classes.*;
import sim_classes.vehicle_classes.engine_classes.*;

public class Vehicle {
    // Variables set
    private double length;
    // Irrelevant width
    private String manufacturer;
    private vehicleType type;
    private IEngine engine;
    // Constructor
    public Vehicle(double x, String y, vehicleType z, IEngine w) {
        this.length = x / 1000; // In Kilometers
        this.manufacturer = y;
        this.type = z;
        this.engine = w;
    }
    // Methods
    public double getLength() {
        return this.length;
    }
    public void setLength(double x) {
        this.length = x;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    public void setManufacturer(String x) {
        this.manufacturer = x;
    }
    public vehicleType getType() {
        return this.type;
    }
    public void setType(vehicleType x) {
        this.type = x;
    }
    public IEngine getEngine() {
        return engine;
    }
    public void setEngine(IEngine x) {
        this.engine = x;
    }
}