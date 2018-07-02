import java.util.ArrayList;

public class Paint {
    private int coverage;
    private double price;
    private int litres;
    private String name;

    public ArrayList<Paint> paints = new ArrayList<>();

    Paint(int coverage, double price, int litres, String name) {
        this.setCoverage(coverage);
        this.setPrice(price);
        this.setLitres(litres);
        this.setName(name);
    }

    public double waste(int room) {
        double noTins = 0;

        noTins = room /(double)this.getCoverage();

        return (Math.ceil(noTins) - noTins) * 100;
    }

    public double cheapestPaint(int room) {
        double cost = 0;

        cost = (room/(double)this.getCoverage())* this.getPrice();
        return cost;
    }

    public void addToList(Paint item) {
        paints.add(item);
    }

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
