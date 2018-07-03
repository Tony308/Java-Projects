public class Main {
    public static void main(String[] args) {

        Library manchesterLibrary = new Library("Manchester Library");
        Book SQL = new Book("SQL Injection", "James Bay", "Wiley", "ISBN-01");
        manchesterLibrary.add(SQL);

    }

}
