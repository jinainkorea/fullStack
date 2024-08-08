import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        IntStream.range(1, 10).forEach(i -> {
//            System.out.println(i);
//        });



//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] resultArr = Arrays.stream(arr).map(e -> {return e * 2;})
//                                            .toArray();
//        Arrays.stream(resultArr).forEach(System.out::println);



//        IntStream.range(1, 20).forEach(i -> {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        });
//
//        int sum = IntStream.range(1, 10).map(e -> {return e*e;}).filter(i -> i % 2 == 0).sum();
//        System.out.println(sum);
//
//        IntStream.range(10, 50).filter(i -> i >= 15).forEach(System.out::println);
//
//        IntStream.range(1, 10).map(n->n*3).forEach(System.out::println);
//
//        IntStream.range(10, 50).filter(n -> n % 2 == 0).average().ifPresent(System.out::println);



//        System.out.println("=== ArrayStream 연습1 ===");
//        // 주어진 배열 출력하기
//        int[] arr = {1, 2, 3, 4, 5};
//        Arrays.stream(arr).forEach(System.out::println);
//
//        System.out.println("=== ArrayStream 연습2 ===");
//        // 주어진 배열에서 짝수만 출력하기
//        int[] arr2 = {10, 15, 20, 25, 30};
//        Arrays.stream(arr2).filter(i->i%2==0).forEach(System.out::println);
//
//        System.out.println("=== ArrayStream 연습3 ===");
//        // 주어진 배열에서 모든 요소 다 더하기
//        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
//        int sum2 = Arrays.stream(arr3).sum();
//        System.out.println(sum2);
//
//        System.out.println("=== ArrayStream 연습4 ===");
//        // 주어진 배열에서 홀수 없애고 곱하기 2한 리스트 반환
//        int[] arr4 = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};
//        int[] resultArr4 = Arrays.stream(arr4).filter(i->i%2==0).map(i->{return i*2;}).toArray();
//        Arrays.stream(resultArr4).forEach(System.out::println);



//        String[] keyinput = {"left", "right", "up", "right", "right"};
        String[] keyinput = {"right", "right", "right", "right", "right", "left"};
//        int[] board = {11,11};
        int[] board = {9, 5};
        int[] answer = {0, 0};
        board[0] = (board[0]-1)/2;
        board[1] = (board[1]-1)/2;
        System.out.println("Board: " + Arrays.toString(board));
        for (String way : keyinput) {
            System.out.println("step:"+way);
            System.out.println("before:"+answer[0]+":"+answer[1]);
            switch (way) {
                case "left":
                    System.out.println(Math.abs(answer[0]));
                    if (Math.abs(answer[0]) < board[0]) {
                        answer[0]--;
                    }
                    break;
                case "right":
                    System.out.println(Math.abs(answer[0])+":"+board[0]);
                    if (Math.abs(answer[0]) < board[0]) {
                        answer[0]++;
                    }
                    break;
                case "down":
                    System.out.println(Math.abs(answer[1])+":"+board[1]);
                    if (Math.abs(answer[1]) < board[1]) {
                        answer[1]--;
                    }
                    break;
                case "up":
                    System.out.println(Math.abs(answer[1]));
                    if (Math.abs(answer[1]) < board[1]) {
                        answer[1]++;
                    }
                    break;
            }
            System.out.println("after:"+answer[0]+":"+answer[1]);
        }
        Arrays.stream(answer).forEach(System.out::println);

    }
}