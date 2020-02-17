public class Carrier extends Ships {


    Carrier (String type) {
        this.setType(type);
    }
    public String getType() {
        return this.shipIdentifier;
    }
}
