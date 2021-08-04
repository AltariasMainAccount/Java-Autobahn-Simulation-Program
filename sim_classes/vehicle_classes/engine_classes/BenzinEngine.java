package sim_classes.vehicle_classes.engine_classes;

import sim_classes.vehicle_classes.*;

public class BenzinEngine implements IEngine {
    // Variables set
    private double emmissions; // emmissions of the vehicle
    private Fuel fuel = new Fuel("Benzin", 123.4);
    // Constructor
    public BenzinEngine() {}
    // Function to calculate the emmissions by using the getEmissionsPerKM() function
    public double getEmissions() {
        return this.fuel.getEmissionsPerKM();
    }
    public void setEmissions(double x) {
        this.fuel.setEmissionsPerKM(x);
    }
}