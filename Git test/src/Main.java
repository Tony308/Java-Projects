import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();


        Square sq = new Square(5.2);
        Rectangle rectangle = new Rectangle(11.00, 2.00);
        Circle circle = new Circle(2.3);
        /*Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();*/

        //double num = Double.parseDouble(input);

        list.add(sq);
        list.add(rectangle);
        list.add(circle);

        for (Shape item: list){
            System.out.println(item);
            if (item instanceof Rectangle){
                Rectangle temp = (Rectangle) item;
                ((Rectangle) item).getPerimeter();
            }
        }
    }
}
