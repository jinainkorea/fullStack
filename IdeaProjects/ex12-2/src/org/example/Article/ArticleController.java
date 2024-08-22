package org.example.Article;

import org.example.Container;
import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    List articleList = new ArrayList();
    int lastId = 1;

    public void add() {
        System.out.printf("제목: ");
        String title = Container.getSc().nextLine().trim();
        System.out.printf("내용: ");
        String content = Container.getSc().nextLine().trim();
        System.out.println(lastId + "번 게시글이 등록되었습니다.\n");

        Article article = new Article(lastId, title, content);
        articleList.add(article);
        lastId++;
    }

    public void list() {
        System.out.println("번호 / 제목 / 내용");
        System.out.println("---------------------------");
        for (int i = articleList.size() - 1; i >= 0; i--) {
            Article article = (Article) articleList.get(i);
            System.out.println(article.getId() + " / " + article.getContent() + " / " + article.getTitle());
        }
        System.out.println("\n");
    }

}
