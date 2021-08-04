package sim_classes.vehicle_classes;

public class Fuel {
    // Variables set
    private String name;
    private double e_per_km; // emmissions per kilometer (allows us to calculate the emmissions later)
    // Constructor
    public Fuel (String x, double y) {
        this.name = x;
        this.e_per_km = y;
    }
    // Getters/Setters
    public String getName() {
        return this.name;
    }
    public void setName(String x) {
        this.name = x;
    }
    public double getEmissionsPerKM() {
        return this.e_per_km;
    }
    public void setEmissionsPerKM(double x) {
        this.e_per_km = x;
    }
}