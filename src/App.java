import java.util.*;
public class App {
    Scanner sc;
    List list = new ArrayList();
    App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 게시판 앱 ==");
        while(true) {
            System.out.printf("명령) ");
            String input = sc.nextLine().trim();

            if(input.equals("종료")) {
                System.out.println("종료합니다.");
                break;

            } else if (input.equals("등록")) {
                int lastId = list.size() + 1;
                System.out.printf("제목: ");
                String title = sc.nextLine().trim();
                System.out.printf("내용: ");
                String content = sc.nextLine().trim();
                Article article = new Article(lastId, title, content);
                list.add(article);
                System.out.println(list.size() + "번 게시글이 등록되었습니다.\n");

            } else if (input.equals("목록")) {
                System.out.println("번호 / 제목 / 내용");
                System.out.println("---------------------------");
                for (int i = list.size() - 1; i >= 0; i--) {
                    Article article = (Article) list.get(i);
                    System.out.println(article.getId() + " / " + article.getContent() + " / " + article.getTitle());
                }
                System.out.println("\n");

            } else if (input.contains("?")) {
                String order = input.split("\\?")[0].trim();
                String url_request;
                int id;

                // 예외처리
                if (except_handling(order)) {
                       continue;
                }
                if ()

                for (int i = 0; i < list.size(); i++) {
                    Article article = (Article) list.get(i);
                    if (article.getId() == id) {

                        if (order.equals("삭제")) {
                            list.remove(i);
                            System.out.println(article.getId() + "번 게시물이 삭제되었습니다.\n");
                        } else if (order.equals("수정")) {
                            System.out.println("제목(기존) : " + article.getTitle());
                            System.out.printf("제목2 : ");
                            String new_title = sc.nextLine();
                            System.out.println("내용(기존) : " + article.getContent());
                            System.out.printf("내용2 : ");
                            String new_content = sc.nextLine();

                            Article article2 = new Article(id, new_title, new_content);
                            list.remove(i);
                            list.add(i, article2);
                            System.out.println(article.getId() + "번 게시물 수정되었습니다. \n");
                        }

                    }
                }
            } else {
                System.out.println("유효한 명령어가 아닙니다.");
            }
        }
    }

    public void except_handling(String order) {
        //예외1: 파라미터가 필요한 명령어가 맞는지 확인
        if (!(order.equals("삭제")||order.equals("수정"))) {
            System.out.println("파라미터가 필요한 명령어가 아닙니다.");
            return true;
        }
        //예외2: ?뒤에 입력된 파라미터가 없을 때
        try {
            url_request = input.split("\\?")[1].trim();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("입력된 파라미터가 없습니다.");
            return true;
        }
        //예외3: 입력된 파라미터가 옯바른지
        if (url_request.split("=")[0].equals("id")) {
            //예외3-1: 입력된 파라미터가 id인 경우 값이 정수인지
            try {
                id = Integer.parseInt(url_request.split("=")[1].trim());
            } catch (Exception e) {
                System.out.println("입력된 id값이 정수가 아닙니다.");
                return true;
            }
        } else {
            System.out.println("삭제 명령어에 대한 올바른 파라미터가 아닙니다.");
            return true;
        }

        public int getId(int listSize){
            for (int i = 0; i < listSize; i++) {
                Article article = (Article) list.get(i);
                if (article.getId() == id) {
                    return id;
                }
            }

        }
    }
}

