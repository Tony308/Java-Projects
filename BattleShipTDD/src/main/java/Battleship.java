public class Battleship extends Ships {


    Battleship(String type) {
            this.setType(type);
    }

    public String getType() {
        return this.shipIdentifier;
    }
}
