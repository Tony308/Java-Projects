import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Garage implements clonable{

    ArrayList<Vehicle> storage;
    private ArrayList<Vehicle> empList;

    Garage() {
        storage = new ArrayList<>();
    }

    Garage(ArrayList<Vehicle> list) {
        empList = new ArrayList<>();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ArrayList<Vehicle> temp = new ArrayList<>();

        for (Vehicle item:storage) {
            temp.add(item);
        }

        return new Garage(temp);
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