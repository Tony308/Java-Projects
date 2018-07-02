import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class testLibrary {

    @Test
    public void addBook() {
        Library home = new Library();
        Book SQL = new Book("SQL Injection", "James Bay");
        //what todo.
    }

    @Test
    @Ignore
    public void removeBook() {
        Library home = new Library();
        home.addBook(SQL);
        home.remove(SQL);
        assertTrue("Return true is removed", home.removeBook(SQL));

    }

    @Test
    @Ignore
    public void addMember() {
        Library home = new Library();
        home.addMember(newguy);
    }

    @Test
    @Ignore
    public void checkOutTest(){
        Book b1 = new Book();
        Member m1 = new Member();
        m1.bookLlist.add(b1);
        m1.checkOut(b1);
        assertEquals(1,m1.list.size());
    }

}
