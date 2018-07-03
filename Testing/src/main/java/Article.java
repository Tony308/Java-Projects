public class Article extends Item {

    private String topic;

    Article (String title, String author, String publisher, String topic){
        super(title, author, publisher);
        this.setTopic(topic);
    }

    public void update(String title, String author, String publisher, String topic) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setTopic(topic);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}
