//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int num2 = 3;
        int num1 = 1;
        int[] numbers = {1, 2, 3, 4, 5};


        ClassName obj = new ClassName();
        System.out.println(obj.age);
        System.out.println(obj.name);


        Car bmw = new Car();
        bmw.speed = 100;
        System.out.println(bmw.speed);
        Car benz = new Car();
        benz.speed = 150;
        System.out.println(benz.speed);

        Person hi = new Person();         // => 클래스 Person 가져오기
        hi.introduce();                   // => 가져온 클래스 안에 있는 메소드 introduce() 사용



        Car1 car1 = new Car1();
        car1.type = "qm3";
        car1.speed = 80;
        car1.run();
        Car1 car2 = new Car1();
        car2.type = "xm3";
        car2.speed = 90;
        car2.run();


        Calc calc = new Calc();
        calc.plus(1, 2);
        calc.miuns(1, 2);
        calc.multiple(1, 2);
        calc.divide(1, 2);
        calc.plus(1, 2, 3);


        int answer = 0;
        String my_string = "aAb1B2cC34oOp";
        for (char c : my_string.toCharArray()) {
            if (Character.is(c)) {
                System.out.println(c);
            }
            answer += (int) c;
        }
        System.out.println(answer);

    }
}


class ClassName {
    String name = "홍길동";
    int age = 20;
}

class Car {
    int speed;
}

class Person {
    String name = "홍길동";
    int age = 20;
    boolean marryBool = false;

    void introduce() {
        String marry;
        if(marryBool) {
            marry = "기혼";
        } else {
            marry = "미혼";
        }
        System.out.printf("저는 %s입니다. 그리고 %d살이며 결혼은 %s인 상태입니다.\n", name, age, marry);
    }
}

class Car1 {
    String type;
    int speed;
    void run() {
        System.out.printf("%s이 속력 %dkm로 달립니다.\n", type, speed);
    }
}

class Calc {
    void plus(int a, int b) {
        System.out.println(a + b);
    }
    void miuns(int a, int b) {
        System.out.println(a - b);
    }
    void multiple(int a, int b) {
        System.out.println(a * b);
    }
    void divide(int a, int b) {
        System.out.println((double)a / b);
    }

    void plus(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    void multiple(int a, int b, int c) {
        System.out.println(a * b * c);
    }
}