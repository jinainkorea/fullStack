import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc;
    int num = 0;
    String[] ws_arr = {
            "명언: 현재를 사랑하라.\n작가: 작자미상"
    };
    App(Scanner sc) {
        this.sc = sc;
    }

    // 2단계
    void run() {
        String input;
        System.out.println("== 명언 앱 ==");
        while(true) {
            try {
                System.out.printf("명령)");
                input = sc.nextLine().trim();
                if (input.equals("등록")) {
                    System.out.println(ws_arr[0]);
                    System.out.println((num+1)+"번 명언이 등록되었습니다.\n");
                    this.num++;
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
