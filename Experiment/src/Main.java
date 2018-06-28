import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter(",");
        /*String input = sc.nextLine();
        String[] items = input.split(",");*/
        System.out.println("Enter values: ");
        String input = sc.nextLine();

        String[] values = input.split(",");

        sc.close();
        Person tony = new Person(values[0], values[1], values[2], Integer.parseInt(values[3]));
        System.out.println(tony.getForename());
    }
}
