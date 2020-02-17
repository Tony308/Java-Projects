public class Destroyer extends Ships {
    Destroyer(String type) {
        this.setType(type);
    }
    public String getType() {
        return this.shipIdentifier;
    }

}
