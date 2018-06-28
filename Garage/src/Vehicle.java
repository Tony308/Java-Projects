abstract public class Vehicle {

    protected String ID, vehicleType, make, model;

     Vehicle (String id, String type, String make, String model) {
        this.ID = id;
        this.vehicleType = type;
        this.make = make;
        this.model = model;
    }

    abstract public void getAll();

    public String getID() {
        return this.ID;
    }

    public void setID(String id) {this.ID = id;}

    public String getType() {
        return this.vehicleType;
    }

    public void setType(String type){
        this.vehicleType = type;
    }

    public String getMake() { return this.make;}

    public void setMake(String make) { this.make = make;}

    public String getModel() { return this.model;}

    public void setModel(String model) { this.model = model;}
}
