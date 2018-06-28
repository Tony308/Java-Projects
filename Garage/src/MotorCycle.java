public class MotorCycle extends Vehicle {

    private int maxSpeed;

    MotorCycle(String id, String type, String make, String model, int maxSpeed) {
        super(id,type,make,model);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {return this.maxSpeed;}

    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed;}

    @Override
    public void getAll() {
        System.out.println(this.getID() + this.getType() + this.getMake() + this.getModel() + this.getMaxSpeed());
    }


}
