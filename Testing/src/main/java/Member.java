import java.util.ArrayList;

public class Member {
    private String forename;
    private String surname;

    ArrayList<Item> itemOut;

    Member(String forename, String surname) {
        this.setForename(forename);
        this.setSurname(surname);
        itemOut = new ArrayList();
    }

    public void updateMember(String name, String surname) {
        this.setForename(name);
        this.setSurname(surname);
    }

    public void checkOut(Item item) {
        this.itemOut.add(item);
    }

    public void checkIn(Item item){
        this.itemOut.remove(item);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }
}