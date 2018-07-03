import java.util.ArrayList;

public class Library {
    private String siteName;

    public ArrayList<Item> itemStorage;
    public ArrayList<Member> membersList;

    Library (String name){
        this.setName(name);
        itemStorage = new ArrayList();
        membersList = new ArrayList();
    }

    public void add(Item item) {
        this.itemStorage.add(item);
    }

    public void remove(Item item) {
        this.itemStorage.remove(item);
    }

    public void remove(Member member) {
        this.membersList.remove(member);
    }

    public void add(Member item) {
        this.membersList.add(item);
    }

    public String getName() {
        return siteName;
    }

    public void setName(String name) {
        this.siteName = name;
    }
}
