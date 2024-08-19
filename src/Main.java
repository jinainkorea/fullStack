import java.util.Arrays;
import java.util.*;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        int answer = 0;

        //코드 시작
        boolean isThere = false;
        for (String word:dic) {
            System.out.println(word);

            // spell을 모두 사용할 수 있는 길이면 다음 단어로 스킵
            if(word.length() != spell.length) {
                System.out.println("안맞어");
                continue;
            }

            int cnt = 0;
//            if (word.charAt(i) == spell[j].charAt(0)) {
//                System.out.println(word.charAt(i)+":"+spell[j].charAt(0));
            if (cnt == spell.length) {
                answer++;
            } else {
                System.out.println("안맞어");
            }
        }

        //코드 끝

        System.out.println(answer);
    }
}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
