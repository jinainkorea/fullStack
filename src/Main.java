import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // 예외처리 1
//        try{
//            int k = 10/0;
//            System.out.println(k);
//        }catch(ArithmeticException e){
//            System.out.println("0으로 나누면 안됩니다.");
//        }


        // 스캐너
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();      // 표준입력: 문자열 받기
//        System.out.println(s);


        // 예외처리 2
//        int age;
//        while (true) {
//            try {
//                System.out.println("나이를 입력하세요.");
//                age = sc.nextInt();
//                sc.nextLine();      //버퍼 초기화
//                if (age < 1) {
//                    System.out.println("나이는 1살 이상부터 입력 가능합니다. ");
//                    continue;
//                }
//                System.out.println("입력받은 나이는 "+age+" 입니다. ");
//            } catch (InputMismatchException e) {
//                System.out.println("숫자를 입력해주세요.");
//                sc.nextLine();    // 버퍼 초기화
//                continue;
//            }
//            break;
//        }



        // 예외처리 3
//        Scanner sc = new Scanner(System.in);
//        int key;
//        while (true) {
//            try {
//                System.out.println("키를 입력해주세요.");
//                key = sc.nextInt();
//                sc.nextLine();    // 버퍼 초기화
//                if (key < 100) {
//                    System.out.println("키의 값은 100 이상의 값만 가능합니다. ");
//                    continue;
//                }
//                System.out.println("입력받은 키는 "+key+"cm 입니다.");
//            } catch (InputMismatchException e) {
//                System.out.println("숫자를 입력해주세요.");
//                sc.nextLine();    // 버퍼 초기화
//                continue;
//            }
//            break;
//        }


        // ArrayList
//        ArrayList<Integer> even = new ArrayList<>();
//        ArrayList<Integer> odd = new ArrayList<>();
//        int odd_sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {       // 짝수
//                even.add(i);
//                System.out.println("even: "+i);
//            } else {                // 홀수
//                odd.add(i);
//                odd_sum += i;
//            }
//        }
//        System.out.println("Odd sum: "+odd_sum);
//
//        ArrayList<Integer> fifty = new ArrayList<>();
//        for (int i = 1; i <= 50; i++) {
//            if (50 % i == 0) {
//                fifty.add(i);
//                System.out.println("digit: "+i);
//            }
//        }




        //제네릭



        // ArrayList와 제네릭
//        List<Article> arr = new ArrayList<Article>();
////        Article ar1 = new Article(01, "제목1", "내용1");
////        arr.add(ar1);
////        ar1.printList();
//
//        arr.add(new Article(01, "제목1", "내용1"));
//        arr.add(new Article(02, "제목2", "내용2"));
//        arr.add(new Article(03, "제목3", "내용3"));
//        arr.get(0).printList();
//        arr.get(1).printList();
//        arr.get(2).printList();




        // Map - HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 19);
        map.put("심청", 23);
        map.put("짱구", 4);
        System.out.println(map);
        System.out.println(map.get("심청"));



        // Map - HashMap2
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("철수", 170);
        map2.put("길동", 180);
        map2.put("영희", 165);
        map2.put("수현", 159);
        map2.put("짱구", 120);
        System.out.println(map2);
        System.out.println(map2.keySet());
        System.out.println(map2.values());
        String[] keys = map2.keySet().toArray(new String[0]);
        for (String key : keys) {
            System.out.println(map2.get(key));
        }
        Integer[] values = map2.values().toArray(new Integer[0]);           //toArray()는 기본타입으로 변환할 수 없다.
        for (int val : values) {
            System.out.println(val);
        }


    }
}




// ArrayList 클래스 이용
class Article {
    private int id;
    private String title;
    private String content;
    public Article(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    public void printList() {
        System.out.println(id + "\t" + title + "\t" + content);
    }
}



// 제네릭
class 저장소 <T> {
    private T value;

    void set저장소(T value) {
        this.value = value;
    }
    T get저장소() {
        return value;
    }
}