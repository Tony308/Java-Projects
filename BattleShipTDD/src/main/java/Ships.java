import javax.print.DocFlavor;

public abstract class Ships{

    private int x,y;
    protected int size;

    protected String shipIdentifier;

    protected void setType(String identifier) {
        this.shipIdentifier = identifier;
    }

    public String getType() {
        return this.shipIdentifier;
    }

}