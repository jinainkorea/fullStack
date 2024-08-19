import java.util.ArrayList;

public class Article {
    private int id;
    private String title;
    private String author;
    static private ArrayList ws_list = new ArrayList();

    Article(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
