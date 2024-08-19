import java.util.Arrays;
import java.util.*;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        // 1단계
//        while(true) {
//            try {
//                input = sc.nextLine();
//                if (input.equals("종료")) {
//                    System.out.println("종료합니다.");
//                    break;
//                } else {
//                    System.out.println("유효한 명령어가 존재하지 않습니다.");
//                }
//            } catch (Exception e) {
//                System.out.println("Invalid input");
//            }
//        }

        // 2단계
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
}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
