package sim_classes;

public class Environment {
    // Variables set
    private int vehicle_speed;
    private double safety_distance;
    // Constructor
    public Environment(int x) {
        this.vehicle_speed = x;
        this.safety_distance = (double) (x / 2) / 1000;
    }
    // Methods
    public int getVehicleSpeed() {
        return this.vehicle_speed;
    }
    public double getSafetyDistance() {
        return this.safety_distance;
    }
    public void setVehicleSpeed(int x) {
        this.vehicle_speed = x;
        this.safety_distance = (double) (x / 2) / 1000;
    }
}