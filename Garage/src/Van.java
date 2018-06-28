public class Van extends Vehicle {

    private int capacity;
    private Garage main = new Garage();

    Van (String id, String type, String make, String model, int capacity ) {
        super(id,type,make,model);
        this.capacity = capacity;
    }

    public int getCapacity(){ return this.capacity;}

    public void setCapacity(int capacity) {this.capacity = capacity;}

    @Override
    public void getAll() {
        System.out.println("ID : " + this.getID() + "Type :" + this.getType() + "Make: " +
                this.getMake() + "Model: " + this.getModel() + "Capacity :" + this.getCapacity());
    }

}
