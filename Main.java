// Import java's Utility classes
import java.util.*;
// Import the classes needed for the simulation
import sim_classes.*;
import sim_classes.vehicle_classes.*;
import sim_classes.vehicle_classes.engine_classes.*;

// Start of the Program itself

class Main {
    public static void main(String[] args) {
        
        EngineData iEngine = new EngineData();
        iEngine.createEngine("Diesel", new DieselEngine());
        iEngine.createEngine("Benzin", new BenzinEngine());
        iEngine.createEngine("Electrical", new ElectricalEngine());
        iEngine.createEngine("Gas", new GasEngine());

        // Street
        Street newStreet = new Street("A4", 2, 2, 10); // 10 - Length of the street in kilometer
        // Environment
        Environment newEnvironment = new Environment(100);
        // Simulation 
        Simulation newSimulation = new Simulation(newStreet, newEnvironment);
        // Program
        newSimulation.percentageFillStreet(iEngine);
        
        // Output the emissions of the street
        System.out.println("\nThe street given produces " + newSimulation.calc_emissions() + "kg CO2 per 10 km that the randomly generated cars drive.");
    }
}