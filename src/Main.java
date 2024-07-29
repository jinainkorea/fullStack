//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(100);

        System.out.print("Hello World\n");
        System.out.print(100);

        // 데이터타입 변수명 = 데이터;
        int v1 = 1010;
        System.out.println(v1);

        // 사칙연산
//        int a = 2;
//        int b = 3;
//        int c = a + b;    // 5
//        System.out.println(c);
//        System.out.println(a + b);
//        System.out.println(a - b);


        ////// 문제1
        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
        // `int` => a라는 공간에는 정수만 담을 수 있다.
        // `;` => 문장이 끝남을 알린다.
//        int a;
//        a = 5;
//
//        System.out.println(a);
//        System.out.println(a + 10);
//
//        int b = 10;
//
//        // `+` => 문장과 문자을 합친다.
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
//
//        // 여기서 부터
//        //-- ver1 --//
//        b = 5;
//        a = 10;
//        //-- ver2 --//
//        a = 5;
//        b = 10;
//        int c = b;
//        b = a;
//        a = c;
//        // 여기까지 수정 가능
//
//        System.out.println("a : " + a);
//        // 출력 : a : 10
//        System.out.println("b : " + b);
//        // 출력 :  b : 5



        // 출력문 안에서의 사칙연산
        int x = 10;
        System.out.println("x"); // 출력 : x
        System.out.println(x); // 출력 : 10
        System.out.println("x" + x); // 출력 : x10
        System.out.println("x : " + x); // 출력 : x : 10
        System.out.println("x : " + x * 10); // 출력 : x : 100
        System.out.println("x : " + x + 10); // 출력 : x : 1010
        System.out.println("x : " + (x + 10)); // 출력 : x : 20


        int age = 17;
        if (age <= 19) {
            System.out.println("미성년자입니다.");
        }
        if (age > 19){
            System.out.println("성인입니다.");
        }



        //// 문제2
        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;

        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참1");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓1");
        }

        if ( a > 10 ) {
            System.out.println("거짓2");
        }

        if ( a >= 10 ) {
            System.out.println("참2");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참3");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if ( c ) {
            System.out.println("거짓3");
        }

        if ( c == false ) {
            System.out.println("참4");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("참5");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("거짓4");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참6");
        }

        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
            System.out.println("거짓6");
        }

        if ( 10 != 10 || 10 < 2 ) {
            System.out.println("거짓7");
        }




        //////문제3
        // 문제 : 할인 대상인지 아닌지 출력해주세요.
        // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
        // 조건 : 출력예시 처럼 출력되어야 합니다.
        // 조건 : `구현시작` 부분만 수정 할 수 있습니다.
        // 조건 : 4가지 이상의 방법으로 풀어야 합니다.
        // 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.
        int age1 = 19; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age1 + "살 입니다.");

        // 구현시작
        System.out.println("===ver1===");
        if ( age1 <= 19 ) {
            System.out.println("할인 대상입니다. ");
        }
        if ( age1 >= 60 ) {
            System.out.println("할인 대상입니다. ");
        }
        if ( age1 > 19 && age1 < 60 ) {
            System.out.println("할인 대상이 아닙니다. ");
        }

        System.out.println("===ver2===");
        if ( age1 >= 60 ) {
            System.out.println("할인 대상입니다.");
        } else if ( age1 <= 19 ) {
            System.out.println("할인 대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다. ");
        }

        System.out.println("===ver3===");
        if ( age1 <= 19 || age1 >= 60 ) {
            System.out.println("할인 대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다. ");
        }

        System.out.println("===ver3===");
        if ( age1 >= 60 ) {
            System.out.println("할인 대상입니다.");
        } else if ( age1 <= 19 ) {
            System.out.println("할인 대상입니다.");
        } else if ( age1 > 19 ) {
            if ( age1 < 60 ){
                System.out.println("할인 대상이 아닙니다. ");
            }
        }
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.




        //구구단 문제1
        System.out.println("구구단1");

        // 출력
        /*
        8 * 1 = 8
        8 * 2 = 16
        8 * 3 = 24
        8 * 4 = 32
        8 * 5 = 40
        8 * 6 = 48
        8 * 7 = 56
        8 * 8 = 64
        8 * 9 = 72
        */
        System.out.println("8 * 1 = 8");
        System.out.println("8 * 2 = 16");
        System.out.println("8 * 3 = 24");
        System.out.println("--------");



        //구구단 문제2
        int dan = 8;
        System.out.printf("%d * 1 = 8\n", dan);
        System.out.printf("%d * 2 = 16\n", dan);
        System.out.printf("%d * 3 = 24\n", dan);
        System.out.println("------");




        //구구단 문제3
        System.out.println("===구구단3===");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, i * dan);
        }

        //구구단 문제4
        System.out.println("===구구단4===");
        int i = 1;
        while (i < 10) {
            System.out.printf("%d * %d = %d\n", dan, i, i * dan);
            i++;
        }


        //1부터 100까지 출력
        for (i = 1; i < 101; i++) {
            System.out.println(i);
        }

        //1부터 5까지 더하기
        int sum = 0;
        for (i = 1; i < 6; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);





    }
}