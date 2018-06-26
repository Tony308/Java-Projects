public class Van extends Vehicle {

    private int capacity;

    Van (String id, String type, String make, String model, int capacity ) {
        super(id, type, make, model);
        this.capacity = capacity;
    }

    public int getCapacity(){ return this.capacity;}

    public void setCapacity(int capacity) {this.capacity = capacity;}

}
