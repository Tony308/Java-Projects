import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;

import org.junit.Test;

public class testLibrary {

    @Test
    public void addBookTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Book SQL = new Book("SQL Injection", "James Bay", "Wiley", "ISBN-01");
        manchesterLibrary.add(SQL);
        assertEquals(1, manchesterLibrary.itemStorage.size());
    }

    @Test
    public void removeBookTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Book SQL = new Book("SQL Injection", "James Bay", "Wiley", "ISBN-01");
        manchesterLibrary.add(SQL);
        manchesterLibrary.remove(SQL);
        assertEquals(0, manchesterLibrary.itemStorage.size());
    }
    @Test
    public void updateBookTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Book SQL = new Book("SQL Injection", "James Bay", "Wiley", "ISBN-01");
        SQL.update("SQL Ejaculation", "James who?", "whaley", "ISPN-69");
        assertEquals("SQL Ejaculation",SQL.getTitle());
        assertEquals("James who?", SQL.getAuthor());
        assertEquals("whaley", SQL.getPublisher());
        assertEquals("ISPN-69", SQL.getISBN());
    }


    @Test
    public void deleteMemberTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Member tony = new Member("Tony", "Huang");
        manchesterLibrary.add(tony);
        manchesterLibrary.remove(tony);
        assertEquals(0, manchesterLibrary.membersList.size());
    }
    @Test
    public void addMemberTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Member newguy = new Member("Forename", "Surname");
        manchesterLibrary.add(newguy);
        assertEquals(1, manchesterLibrary.membersList.size());
    }
    @Test
    public void updateMemberTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Member tony = new Member("Tony", "Huang");
        tony.updateMember("James", "Cameron");
        assertEquals("James", tony.getForename());
        assertEquals("Cameron", tony.getSurname());
    }

    @Test
    public void addJournalTest() {
       Library manchesterLibrary = new Library("Manchester Library");
       Journal quantum = new Journal("Possibilities of Quantum Computing", "James Arthur",
               "Wiley ", 1);
       manchesterLibrary.add(quantum);
       assertEquals(1,manchesterLibrary.itemStorage.size());
    }

    @Test
    public void removeJournalTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Journal quantum = new Journal("Possibilities of Quantum Computing", "James Arthur",
                "Wiley ", 1);
        manchesterLibrary.add(quantum);
        manchesterLibrary.remove(quantum);
        assertEquals(0, manchesterLibrary.itemStorage.size());
    }

    @Test
    public void updateJournalTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Journal quantum = new Journal("Possibilities of Quantum Computing", "James Arthur",
                "Wiley ", 1);
        quantum.update("1","2", "3", 4);
        assertEquals("1", quantum.getTitle());
        assertEquals("2", quantum.getAuthor());
        assertEquals("3", quantum.getPublisher());
        assertEquals(4, quantum.getVolume());
    }

    @Test
    public void addArticleTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Article temp = new Article("Part-time work is the new full time?", "James Cox",
                "Penguin", "Economic");
        manchesterLibrary.add(temp);
        assertEquals(1, manchesterLibrary.itemStorage.size());
    }

    @Test
    public void removeArticleTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Article temp = new Article("Part-time work is the new full time?", "James Cox",
                "Penguin", "Economic");
        manchesterLibrary.add(temp);
        manchesterLibrary.remove(temp);
        assertEquals(0, manchesterLibrary.itemStorage.size());
    }

    @Test
    public void updateArticleTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Article temp = new Article("Part-time work is the new full time?", "James Cox",
                "Penguin", "Economic");
        temp.update("part", "something","bird", "word");
        assertEquals("part", temp.getTitle());
        assertEquals("something", temp.getAuthor());
        assertEquals("bird", temp.getPublisher());
        assertEquals("word", temp.getTopic());
    }

    @Test
    public void checkOutTest() {
        Library manchesterLibrary = new Library("Manchester Library");
        Member newguy = new Member("Forename", "Surname");
        // Three items
        Article temp = new Article("Part-time work is the new full time?", "James Cox",
                "Penguin", "Economic");
        Journal quantum = new Journal("Possibilities of Quantum Computing", "James Arthur",
                "Wiley ", 1);
        Book SQL = new Book("SQL Injection", "James Bay", "Wiley", "ISBN-01");
        manchesterLibrary.add(temp);
        manchesterLibrary.add(quantum);
        manchesterLibrary.add(SQL);

        newguy.checkOut(temp);
        assertEquals(1, newguy.itemOut.size());
    }

    @Test
    public void checkOutTest2() {
        Library manchesterLibrary = new Library("Manchester Library");
        Member newguy = new Member("Forename", "Surname");
        // Three items
        Article temp = new Article("Part-time work is the new full time?", "James Cox",
                "Penguin", "Economic");
        Journal quantum = new Journal("Possibilities of Quantum Computing", "James Arthur",
                "Wiley ", 1);
        Book SQL = new Book("SQL Injection", "James Bay", "Wiley", "ISBN-01");
        newguy.checkOut(temp);
        newguy.checkOut(SQL);
        for (Item item: manchesterLibrary.itemStorage) {

        }
        assertEquals(2, newguy.itemOut.size());
    }

    @Test
    public void checkOutTest3() {
        Library manchesterLibrary = new Library("Manchester Library");
        Member newguy = new Member("Forename", "Surname");
        // Three items
        Article temp = new Article("Part-time work is the new full time?", "James Cox",
                "Penguin", "Economic");
        Journal quantum = new Journal("Possibilities of Quantum Computing", "James Arthur",
                "Wiley ", 1);
        Book SQL = new Book("SQL Injection", "James Bay", "Wiley", "ISBN-01");
        newguy.checkOut(temp);
        newguy.checkOut(SQL);
        newguy.checkOut(quantum);
        assertEquals(3, newguy.itemOut.size());

    }

    @Test
    public void checkInTest() {
        Member newguy = new Member("Forename", "Surname");
        // Three items
        Article temp = new Article("Part-time work is the new full time?", "James Cox",
                "Penguin", "Economic");
        Journal quantum = new Journal("Possibilities of Quantum Computing", "James Arthur",
                "Wiley ", 1);
        Book SQL = new Book("SQL Injection", "James Bay", "Wiley", "ISBN-01");
        newguy.checkOut(temp);
        newguy.checkOut(SQL);
        newguy.checkOut(quantum);

        newguy.checkIn(temp);
        assertEquals(2, newguy.itemOut.size());
    }
}