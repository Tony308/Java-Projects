import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Main form = new Main();

        /*System.out.println(form.blackJack(21, 19));
        form.uniqueSum(2,1,1);
        form.tooHot(60, true);
        form.peopleLoop();
        form.searchName("Tony");
        */


    }

    public int blackJack(int num1, int num2) {
        int result = 0;
        if ( (21 - num1) < 0 || (21 - num2) < 0){
            result = 0;
        } else if ( (21 - num1 ) < (21 - num2) ){
            result = num1;
        } else if ((21 - num1) > ( 21 - num2) ){
            result = num2;
        }

        return result;
    }

    public void uniqueSum(int num1, int num2, int num3) {
        int result = 0;

        if (num1 == num2 && num1 == num3) {
            result = 0;
        } else if (num1 == num2) {
            result = num3;
        } else if (num1 == num3) {
            result = num2;
        } else if (num2 == num3) {
            result = num1;
        } else {
            result = num1 + num2 + num3;
        }

        System.out.println(result);
    }

    public void tooHot(int temp, boolean summer) {
        if (!summer && (temp >= 60) && (temp <= 90) ) {
            System.out.println("Not summer: hot");
        } else if (summer && (temp >= 90) && (temp <= 100)){
            System.out.println("Summer: hot");
        } else {
            System.out.println("Not hot");
        }
    }

    public void peopleLoop() {

        People tony = new People("Tony", 21, "IT Consultant");
        People james = new People("James", 21, "Nurse");

        ArrayList<People> multi = new ArrayList();

        multi.add(tony);
        multi.add(james);
        for (People STUFF: multi) {
            System.out.print(STUFF.getName() + " " + STUFF.getAge() + " " );
            System.out.println(STUFF.getJobTitle());
        }
    }

    void searchName(String name) {
        People tony = new People("Tony", 21, "IT Consultant");
        People james = new People("James", 21, "Nurse");
        //tony.getAll();

        ArrayList<People> multi = new ArrayList();

        multi.add(tony);
        multi.add(james);

        for (People item: multi ) {
            if (name == item.getName()) {
                System.out.print(item.getName() + " " + item.getAge() + " ");
                System.out.println(item.getJobTitle());
            }
        }

    }
}