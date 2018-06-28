import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Garage {

    ArrayList<Vehicle> storage;

    Garage() {
        storage = new ArrayList<>();
    }
    Main main = new Main();

    public void addVehicle(Vehicle addition) {
        storage.add(addition);
    }

    public void searchVehicle(String id, String type) {

        for (Vehicle item: storage) {
            if (item.getID().equals(id) && item.getType().equals(type)){
                item.getAll();
            }
        }
    }

    public void removeVehicle(String id, String type) {

/*            for (Vehicle item: storage) {
                if (item.getID().equals(id) && item.getType().equals(type)){
                    storage.remove(item);
                }
            }*/
            for (int x = 0; x < storage.size(); x++) {
                if (storage.get(x).getID().equals(id) && storage.get(x).getType().equals(type)){
                    storage.remove(storage.get(x));
                }
            }
    }

    public Map<String, Double> fixVehicle() {
        Map<String, Double> total  = new HashMap<String, Double>();
        double cost = 0;

        for (Vehicle item: storage) {
        cost = 0;

            switch (item.getType()) {
                case "Van":
                    cost = 1200;
                    total.put(item.getID(), cost);
                    break;

                case "Car":
                    Car car = (Car) item;
                    int engineBaseCost = 200;
                    cost = 200;

                    cost += (engineBaseCost * car.getEngineSize());
                    total.put(item.getID(), cost);
                    break;
                case "MotorCycle":
                    cost = 150;
                    total.put(item.getID(), cost);
                    break;
            }
        }
        return total;

    }

    public void emptyGarage() {
        storage.clear();
    }

}