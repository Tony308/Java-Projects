public class Book extends Item {

    private String ISBN;

    Book (String title, String author, String publisher, String ISBN) {
        super(title, author, publisher);
        this.setISBN(getISBN());
    }

    public void update(String title, String author, String publisher,String ISBN) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setISBN(ISBN);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
