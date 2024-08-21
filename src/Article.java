public class Article {
    private int id;
    private String content;
    private String title;

    public Article() {}
    public Article(int id, String title, String content) {
        this.id = id;
        this.content = content;
        this.title = title;
    }
    public int getId() {
        return id;
    }
    public String getContent() {
        return this.content;
    }
    public String getTitle() {
        return this.title;
    }
}