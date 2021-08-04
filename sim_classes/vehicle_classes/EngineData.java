package sim_classes.vehicle_classes;

import java.util.*;
import sim_classes.vehicle_classes.engine_classes.*;

public class EngineData {
    HashMap<String, IEngine> Engines = new HashMap<>();
    
    public void createEngine(String x, IEngine y) {
        Engines.put(x, y);
    }

    public IEngine getEngineByType(String type) {
        return Engines.get(type);
    }

    public double getEngineEmissionByType (String type) {
        return Engines.get(type).getEmissions();
    }
}