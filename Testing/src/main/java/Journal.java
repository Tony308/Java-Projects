public class Journal extends Item {

    private int volume  ;

    Journal (String title, String author, String publisher, int volume ) {
        super(title, author, publisher);
        this.setVolume(volume);
    }

    public void update(String title, String author, String publisher, int volume){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setVolume(volume);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}
