import java.util.Scanner;

public class App {
    Scanner sc;
    App(Scanner sc) {
        this.sc = sc;
    }

    // 2단계
    void run() {
        String input;
        while(true) {
            try {
                input = sc.nextLine();
                if (input.equals("등록")) {
                    System.out.printf("명언: 현재를 사랑하라.\n작가: 작자미상\n1번 명언이 등록되었습니다.\n");
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
