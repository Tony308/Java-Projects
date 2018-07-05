import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage main = new Garage();

        /*
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println(input);
        */

        //Instances of vehicle sub-classes.
        Car mini = new Car("BB8 BLL", "Car", "Mini Cooper","A3", 1.3, "450 Hemi", 5);
        Van white = new Van("C3P0 VAN", "Van", "Ford", "Crap", 100);
        MotorCycle harley = new MotorCycle("HA47 LEY", "MotorCycle", "Harley Davidson", "IDK", 300);
        Car m1 = new Car("CA41 POU", "Car", "BMW", "A1", 2.45, "V6", 4);

        //Adds the vehicle-subclass instances to the ArrayList
        //using a method in garage.
        main.addVehicle(mini);
        main.addVehicle(white);
        main.addVehicle(harley);
        main.addVehicle(m1);


        System.out.println(main.fixVehicle());

        main.removeVehicle("C3P0 VAN", "Van");
        for (Vehicle item: main.storage) {
            item.getAll();
        }
        main.emptyGarage();

    }
}
