import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
    Scanner sc;
    App(Scanner sc) {
        this.sc = sc;
    }

    List ws_list = new ArrayList();
    int lastWiseSayingId = 0;


    // 2단계
    void run() {
        String input;
        System.out.println("== 명언 앱 ==");
        String[] line = {"명언: ", "작가: "};
        while(true) {
            try {
                System.out.printf("명령)");
                input = sc.nextLine().trim();
                if (input.equals("등록")) {
                    int id = ws_list.size() + 1;
                    System.out.printf(line[0]);
                    String content = sc.nextLine().trim();
                    System.out.printf(line[1]);
                    String author = sc.nextLine().trim();

                    Article article = new Article(id, content, author);
                    ws_list.add(article);

                    System.out.println((ws_list.size()) + "번 명언이 등록되었습니다.\n");
                } else if (input.equals("목록")) {
                    System.out.println("번호 / 작가 / 명언");
                    ws_list.stream().forEach(System.out::println);
                } else if (input.equals("종료")) {
                    System.out.println("종료합니다. ");
                    break;
                } else {
                    System.out.println("유효한 명령어가 존재하지 않습니다.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        App app = new App(sc);
        app.run();


    }
}
