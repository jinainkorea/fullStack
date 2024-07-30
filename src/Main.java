//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //=== 복습 ===
//        for (int i = 1; i < 101; i++) {
//            System.out.println(i);
//        }
//
//        int sum = 0;
//        int i = 1;
//        while (i < 6) {
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);




        // 문제 : 아래와 같이 출력해주세요.
        // 문제 : 단을 * 1000까지 출력해주세요.
//        int dan = 8;
//        ==while==
//        int i = 1;
//        while (i < 1001) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i++;
//        }
//        ==for==
//        for (int i = 1; i < 1001; i++) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
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
        ...
        8 * 1000
        */




        // 문제 : -100부터 25까지 출력해주세요.
//        ==while==
//        int i = -100;
//        while (i <= 25) {
//            System.out.println(i);
//            i++;
//        }
//        ==for==
//        for (int i = -100 ; i <= 25; i++ ) {
//            System.out.println(i);
//        }




        //문제 - 구구단 8단을 출력해주세요. 1000부터 1까지 곱해주세요.
//        int dan = 8;
//        ==while==
//        int i = 1000;
//        while (i > 0) {
//            System.out.printf("%d * %d = %d\n", dan, i, i*dan);
//            i--;
//        }
//        ==for==
//        for (int i = 1000; i > 0; i--) {
//            System.out.printf("%d * %d = %d\n", dan, i, i*dan);
//        }




        //문제 - 구구단 8단을 출력해주세요. 1000부터 -500까지 곱해주세요.
//        int dan = 8;
//        ==while==
//        int i = 1000;
//        while (i >= -500) {
//            System.out.printf("%d * %d = %d\n", dan, i, i*dan);
//            i--;
//        }
//        ==for==
//        for (int i = 1000; i >= -500; i--) {
//            System.out.printf("%d * %d = %d\n", dan, i, i*dan);
//        }




        //문제 - -100부터 25까지의 합을 출력해주세요.
//        int sum = 0;
//        int i = -100;
//        while (i <=25) {
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);
//        for (int i = -100; i <= 25; i++) {
//            sum += i;
//        }
//        System.out.println(sum);




        // 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
        // 조건 : 2중 while문 사용
//        int i = 1;
//        while(i <= 10) {
//            System.out.printf("===%d번째 출력===\n", i);
//            int j = 1;
//            while (j <= 3) {
//                System.out.println(j);
//                j++;
//            }
//            i++;
//        }




//        for문 연습
//        ====1~5까지 합산===
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) sum += i;
//        System.out.println(sum);

//        ===-25~100까지 출력===
//        for (int i = -25; i <= 100; i++) System.out.println(i);
//        ===100~-25까지 출력===
//        for (int i = 100; i >= -25; i--) System.out.println(i);



//        1~100 중에 소수만 출력
//        for (int i = 1; i <= 100; i++) {
//            boolean dicimal = false;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    dicimal = true;
//                    break;
//                }
//            }
//            if (!dicimal) System.out.printf("%d는 소수입니다.\n", i);
//        }

//        124 약수의 합 구하기
//        int sum = 0;
//        for (int i = 1; i <= 124; i++) {
//            if (124 % i == 0) sum += i;
//        }
//        System.out.println(sum);




//        1~50, 짝수의 합 구하기
//        int sum = 0;
//        for (int i = 1; i <= 50; i++) if (i % 2 == 0) sum += i;
//        System.out.println(sum);





//      문자열 클래스를 만들면 같은 내용의 문자열이라도 다르다고 인식된다. 클래스, 즉 데이터의 주소값이 다르기 때문
//        String str1 = new String("Hello");
//        String str2 = new String("Hello");
//        if (str1 == str2) {
//            System.out.println("Strings are equal for 1, 2");
//        }
//
//        String str3 = "Hello";
//        String str4 = "Hello";
//        if (str3 == str4) {
//            System.out.println("Strings are equal for 3, 4");
//        }




//        int[] list = {10, 20, 30, 40};
//
//        //리스트 순회하기
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }
//
//        //평균 구하기
//        int sum = 0;
//        for (int i = 0; i < list.length; i++) {
//            sum += list[i];
//        }
//        System.out.println(sum/list.length);


        //배열 요소 중에 소수 구하기
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < list.length; i++) {
            boolean dicimal = false;
            for (int j = 2; j < list.length; j++) {
                if(list[i] % j == 0) dicimal = true; break;
            }
//            if (!dicimal && list[i] != 1) System.out.printf("%d는 소수입니다. \n", list[i]);
        }


//        String[] s1 = new String{"a", "b", "c"};

        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i]==s2[j]) {
                    answer++;
                }
            }
        }

    }
}