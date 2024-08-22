package org.example;

import org.example.Article.Article;
import org.example.Article.ArticleController;
import org.example.System.SystemController;

import java.util.*;
public class App {
    List articleList = new ArrayList();
    SystemController systemController;
    ArticleController articleController;

    App() {
        systemController = new SystemController();
        articleController = new ArticleController();
    }

    public void run() {
        System.out.println("== 게시판 앱 ==");
        while(true) {
            System.out.printf("명령) ");
            String input = Container.getSc().nextLine().trim();

            if(input.equals("종료")) {
                systemController.exit();
                break;

            } else if (input.equals("등록")) {
                articleController.add();

            } else if (input.equals("목록")) {
                articleController.list();

            } else if (input.contains("?")) {
                String order = input.split("\\?")[0].trim();
                String url_request;
                int id;

                //----------예외처리------------//
                //예외1: 파라미터가 필요한 명령어가 맞는지 확인
                if (!(order.equals("삭제")||order.equals("수정"))) {
                    System.out.println("파라미터가 필요한 명령어가 아닙니다.");
                    continue;
                }
                //예외2: ?뒤에 입력된 파라미터가 없을 때
                try {
                    url_request = input.split("\\?")[1].trim();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("입력된 파라미터가 없습니다.");
                    continue;
                }

                //예외3: 입력된 파라미터가 옯바른지 검사하면서 가져오기
                if (url_request.split("=")[0].equals("id")) {
                    //예외3-1: 입력된 파라미터가 id인 경우 값이 정수인지
                    try {
                        id = Integer.parseInt(url_request.split("=")[1].trim());
                    } catch (Exception e) {
                        System.out.println("입력된 id값이 정수가 아닙니다.");
                        continue;
                    }
                } else {
                    System.out.println("삭제 명령어에 대한 올바른 파라미터가 아닙니다.");
                    continue;
                }

                for (int i = 0; i < articleList.size(); i++) {
                    Article article = (Article) articleList.get(i);
                    if (article.getId() == id) {
                        if (order.equals("삭제")) {
                            articleList.remove(i);
                            System.out.println(article.getId() + "번 게시물이 삭제되었습니다.\n");
                        } else if (order.equals("수정")) {
                            System.out.println("제목(기존) : " + article.getTitle());
                            System.out.printf("제목2 : ");
                            String new_title = Container.getSc().nextLine().trim();
                            System.out.println("내용(기존) : " + article.getContent());
                            System.out.printf("내용2 : ");
                            String new_content = Container.getSc().nextLine().trim();
                            Article article2 = new Article(id, new_title, new_content);
                            articleList.remove(i);
                            articleList.add(i, article2);
                            System.out.println(article.getId() + "번 게시물 수정되었습니다. \n");
                        }
                    }
                }
            } else {
                System.out.println("유효한 명령어가 아닙니다.");
            }
        }
    }
}