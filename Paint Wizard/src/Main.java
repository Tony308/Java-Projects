import com.sun.org.apache.xpath.internal.CachedXPathAPI;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) {

        Paint cheapoMax = new Paint(10, 19.99, 20, "CheapoMax");
        Paint averageJoes = new Paint(11, 17.99, 15, "AverageJoes");
        Paint dulux = new Paint(20, 25, 10, "DuluxurousPaints");

        ArrayList<Paint> list = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.00");

        list.add(cheapoMax);
        list.add(averageJoes);
        list.add(dulux);

        Paint waste = null;
        for (int x = 1; x < list.size();x++) {
            if (list.get(x - 1).waste(10) < list.get(x).waste(10)) {
                waste = list.get(x);
            }
        }

        System.out.println("Paint that wastes the most: " + waste.getName());


    }
}
