import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Garage main = new Garage();

        Car mini = new Car("BB8 BLL", "Car", "Mini Cooper","A3", 1.3, "450 Hemi", 5);
        Van white = new Van("C3P0 VAN", "Van", "Ford", "Crap", 100);
        MotorCycle harley = new MotorCycle("HA47 LEY", "MotorCycle", "Harley Davidson", "IDK", 200);

        main.addVehicle(mini);
        main.addVehicle(white);
        main.addVehicle(harley);

        main.removeVehicle("C3P0 VAN", "Van");
        main.searchVehicle("C3P0 VAN", "Van");
    }
}
