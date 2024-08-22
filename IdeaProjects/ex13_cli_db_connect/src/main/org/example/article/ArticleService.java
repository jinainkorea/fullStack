package main.org.example.article;

import main.org.example.Container;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {
    List<Article> articleList = new ArrayList<>();
    int lastId = 1;

    public int create(String subject, String content) {
        Article article = new Article(lastId, subject, content);
        articleList.add(article);

        lastId++;
        return article.getId();
    }

    public void read() {
        for (int i = articleList.size() - 1; i >= 0; i--) {
            Article article = articleList.get(i);
            System.out.printf("%d / %s / %s\n", article.getId(), article.getSubject(), article.getContent());
        }
    }

    public void delete(Article article) {
        articleList.remove(article);
    }

    public void modify(Article article, String modifySubject, String modifyContent) {
        article.setSubject(modifySubject);
        article.setContent(modifyContent);
    }

    public Article _getFindById(int id) {
        for (Article item : articleList) {
            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }
}
