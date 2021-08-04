package sim_classes;

// Import java's Utility classes
import java.util.*;
import sim_classes.vehicle_classes.*;
import sim_classes.vehicle_classes.engine_classes.*;

// Start the class
public class Simulation {
    // Variables set
    private Street street;
    private ArrayList<ArrayList<Vehicle>> streetlanes;
    private Environment simEnvironment;

    // randomizer
    private Random randomizer = new Random();
    // Constructor
    public Simulation (Street x, Environment y) {
        this.street = x;
        this.simEnvironment = y;
    }
    // Methods
    private void generateStreetlaneArray() {
        // Get the number of Street lanes from the Street that has been given 
        // This is a horrible way of doing it but I have no better clue
        Street useStreet = this.street;
        int num_lanes = useStreet.getStreetlanes_A() + useStreet.getStreetlanes_B();
        // Create an ArrayList of Integers and iterate an ArrayList of Vehicle over each value
        ArrayList<ArrayList<Vehicle>> lanes = new ArrayList<ArrayList<Vehicle>>();
        for (int i = 0; i < num_lanes; i++) {
            lanes.add(new ArrayList<Vehicle>());
        }
        // Set that output as the Streetlanes variable.
        this.streetlanes = lanes;
    }

    public void fillStreet(Vehicle... cars) {
        // Handle VarArgs
        int carArrLength = cars.length;
        // Variables for the function
        boolean isFull = false;
        double length = this.street.getStreet_length();
        double carsize;
        int rn;
        // The ArrayList
        this.generateStreetlaneArray();
        ArrayList<ArrayList<Vehicle>> Street_lanes = this.streetlanes;
        
        // Function
        for (int i = 0; i < Street_lanes.size(); i++) { 
            carsize = cars[0].getLength() + this.simEnvironment.getSafetyDistance(); // Just used as an initializer
            while(carsize < length) {
                rn = randomizer.nextInt(carArrLength);
                carsize = cars[rn].getLength() + this.simEnvironment.getSafetyDistance();
                Street_lanes.get(i).add(cars[rn]);
                length = length - carsize;
            }
            length = this.street.getStreet_length();
        }       
    }

    private double genDouble(double min, double max) {
        return min + (max - min) * randomizer.nextDouble();
    }

    public void percentageFillStreet (EngineData x) { // fillStreet mit der Prozentualangabe
        // Variables for the function
        EngineData iEngine = x;
        boolean isFull = false;
        double length = this.street.getStreet_length();
        double carsize;
        int rn1;
        double rn2;
        // The ArrayList
        this.generateStreetlaneArray();
        ArrayList<ArrayList<Vehicle>> Street_lanes = this.streetlanes;    
    
        // Function
        for (int i = 0; i < Street_lanes.size(); i++) {
            carsize = 0; // Just used as an initializer
            while(carsize < length) {
                rn1 = randomizer.nextInt(100);
                if (rn1 > 0 && rn1 <= 82) {
                    rn2 = genDouble(0.0, 100.0);
                    if (rn2 > 0 && rn2 <= 7) {
                        // mini
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.MINI, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 7 && rn2 <= 25.7) {
                        // kleinwagen
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.KLEINWAGEN, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 25.7 && rn2 <= 50.8) {
                        // kompakt
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.KOMPAKT, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 50.8 && rn2 <= 64.0) {
                        // mittelklasse
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.MITTELKLASSE, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 64.0 && rn2 <= 68.0) {
                        // obere mittelklasse
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.OBEREMITTELKLASSE, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 68.0 && rn2 <= 68.6) {
                        // oberklasse
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.OBERKLASSE, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 68.6 && rn2 <= 76.5) {
                        // SUV
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.SUV, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 76.5 && rn2 <= 81.9) {
                        // Gelaende
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.GELAENDE, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 81.9 && rn2 <= 83.8) {
                        // Sportwagen
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.SPORT, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 83.8 && rn2 <= 88.0) {
                        // Minivan
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.MINIVAN, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 88.0 && rn2 <= 92.2) {
                        // Großraumvan
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.GROSSRAUMVAN, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 92.2 && rn2 <= 96.2) {
                        // Nutzfahrzeug
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.NUTZFAHRZEUG, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else if (rn2 > 96.2 && rn2 <= 97.4) {
                        // Wohnmobile
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.WOHNMOBIL, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    } else {
                        // Sonstige
                        Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.OTHERPKW, iEngine.getEngineByType("Diesel")));
                        carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                        length = length - carsize;
                    }
                } else if (82 < rn1 && rn1 <= 88) {
                    Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.TRUCK, iEngine.getEngineByType("Diesel")));
                    carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                } else {
                    Street_lanes.get(i).add(new Vehicle(4.2f, "", vehicleType.OTHERTYPE, iEngine.getEngineByType("Diesel")));
                    carsize = Street_lanes.get(i).get(Street_lanes.get(i).size()-1).getLength() + this.simEnvironment.getSafetyDistance();
                }

            }
            length = this.street.getStreet_length();
        }
    }

    public double calc_emissions() {
        double emissions = 0;
        double lane_emissions = 0;
        for(int j = 0; j < this.streetlanes.size(); j++) {
            for(int i = 0; i < this.streetlanes.get(j).size(); i++) {
                IEngine temp_engine = this.streetlanes.get(j).get(i).getEngine();
                lane_emissions = (temp_engine.getEmissions() * this.street.getStreet_length()) + lane_emissions;
            }
            emissions = emissions + lane_emissions;
        }
        emissions = emissions / 1000; // To get KG
        return emissions;
    }

    // Get/Set Methods
    public Street getStreet() {
        return street;
    }
    public void setStreet(Street x) {
        this.street = x;
    }
    public ArrayList<ArrayList<Vehicle>> getStreetlanes() {
        return streetlanes;
    }
    public void setStreetlanes(ArrayList<ArrayList<Vehicle>> x) {
        this.streetlanes = x;
    }
    public Environment getSimEnvironment() {
        return simEnvironment;
    }
    public void getSimEnvironment(Environment x) {
        this.simEnvironment = x;
    }
}