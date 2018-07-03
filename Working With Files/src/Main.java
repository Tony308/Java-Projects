import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Person> list;
    public static void main(String[] args) {

        Main main = new Main();
        main.list = new ArrayList<>();

        Person tony = new Person("Tony", "Consultant", 21);
        Person jesus = new Person("Jesus", "Son of God", 0);
        Person charles = new Person("Charles", "X-MEN", 81);
        Person daniel = new Person("Daniel", "Consultant", 21);
        Person clone = new Person("Daniel", "Consultant", 1);

        main.list.add(tony);
        main.list.add(jesus);
        main.list.add(charles);
        main.list.add(daniel);
        main.list.add(clone);

        try {
            File file = new File("C:\\Users\\Admin\\IdeaProjects\\Working With Files\\People.csv");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            String input = null;

            for (Person item : main.list) {
                input = item.getName()  + ", " + item.getOccupation() + ", "  + item.getAge() + "\r\n";
                bw.write(input);
            }
            bw.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        try {
            File file = new File("C:\\Users\\Admin\\IdeaProjects\\Working With Files\\People.csv");
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            ArrayList<String> reader = new ArrayList<>();
            String input;

            while ((input = br.readLine()) != null) {
                reader.add(input.split(",").toString());
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }
}