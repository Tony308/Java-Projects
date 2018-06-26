import java.util.ArrayList;
import java.util.Vector;

public class Garage {

    ArrayList<Vehicle> storage;

    Garage() {
        storage = new ArrayList<>();
    }

    public void addVehicle(Vehicle addition) {
            storage.add(addition);
    }

    public void searchVehicle(String id, String type) {
        int counter = 0;
        for (Vehicle item: storage) {
            if (item.getID() == id && item.getType() == type){
                item.getAll();
            }/* else if (counter == storage.size()){
                System.out.println("No such result.");
            }
            counter++;*/
        }
    }

    public void removeVehicle(String id, String type) {

         for (Vehicle item: storage) {
             if (item.getID() == id && item.getType() == type){
                 storage.remove(item);
             }
         }
    }

}
