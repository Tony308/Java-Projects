public class PatrolBoat extends Ships{

    PatrolBoat(String type) {
        this.setType(type);
    }

    public String getType() {
        return this.shipIdentifier;
    }
}
