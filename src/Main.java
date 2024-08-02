import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Character c1 = new Character();
         c1.no = 1;
         c1.level = 20;
         c1.nickname = "초보자";
         c1.job = "전사";
         c1.intro();



         Person p1 = new Person();
         p1.age = 20;
         p1.total_age += p1.age;
         p1.run();
         Person p2 = new Person();
         p2.age = 30;
         p2.total_age += p2.age;
         p2.run();



         Car2 car1 = new Car2();
         Car2 car2 = new Car2();
         car1.speed = 80;
         car1.wheels = 2;
         car1.run();
         car2.speed = 80;
         car2.wheels = 2;
         car2.run();



        Person2 per1 = new Person2();
        Person2 per2 = new Person2();
        per1.name = "김철수";
        per1.age = 18;
        per1.run();
        per2.name = "이명숙";
        per2.age = 54;
        per2.run();



        Calc calc = new Calc();
        System.out.println(calc.plus(1, 2));
        System.out.println(calc.plus(1, 2, 3));
        System.out.println(calc.minus(1, 2));
        System.out.println(calc.multiply(1, 2));
        System.out.println(calc.multiply(1, 2, 3));
        System.out.println(calc.divide(1, 2));




        WhiteCat wc =  new WhiteCat();
        wc.breath();
        wc.meow();
        wc.know_future();
        BlackCat bc =  new BlackCat();
        bc.breath();
        bc.meow();
        bc.faster();
        GrayCat gc = new GrayCat();
        gc.breath();
        gc.meow();
        gc.cure();



        Person3 per3 = new Person3();
        per3.breath();



        청둥오리 duck1 = new 청둥오리();
        흰오리 duck2 = new 흰오리();
        duck1.날다();
        duck2.날다();
        duck1.수영하다();
        duck2.수영하다();
        고무오리 duck3 = new 고무오리();
        duck3.날다();
        duck3.수영하다();
        로봇오리 duck4 = new 로봇오리();
        duck4.날다();
        duck4.수영하다();


        int[] array = {6, 8, 3, 12, 8 , 1, 4};
        Arrays.sort(array);
        int value = array[array.length-1];
        int index = 0;
        for (int i = 0; i < array.length;i++) {
            if(value == array[i]) {
                index = i;
                System.out.println("value:"+value+" array["+i+"]:"+array[i]);
            }
        }
        int[] answer = {value, index};
        System.out.println(answer[0] + ":" + answer[1]);
    }
}


class Car {
    int speed;
    static int wheels;
}

class Character {
    int no;
    int level;
    String nickname;
    String job;

    void intro() {
        System.out.printf("%d번 캐릭터, 레벨은 %d, 닉네임은 %s, 직업은 %s입니다.\n", no, level, nickname, job);
    }
}

class Person {
    int age;
    static int total_age = 0;

    void run() {
        System.out.println("age:"+age);
        System.out.println("total_age:"+total_age);
    }
}

class Car2 {
    int speed;
    int wheels;

    void run() {
        System.out.printf("%dkm 속력으로 %d갯수의 바퀴가 달립니다.\n", speed, wheels);
    }
}

class Person2 {
    String name;
    int age;

    void run() {
        System.out.printf("제 이름은 %s이고 나이는 %d입니다. \n", name, age);
    }
}

class Calc {
    int plus(int a, int b) {
        return a + b;
    }
    int plus(int a, int b, int c) {
        return a + b + c;
    }
    int minus(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    int multiply(int a, int b, int c) {
        return a * b * c;
    }
    double divide(double a, double b) {
        return a / b;
    }
}

class Cat {
    void breath() {
        System.out.println("숨쉰다");
    }
    void meow() {
        System.out.println("냥냥");
    }
}
class WhiteCat extends Cat {
    void know_future() {
        System.out.println("미래를 볼 수 있어");
    }
}
class BlackCat extends Cat {
    void faster() {
        System.out.println("빠르게 달릴 수 있어");
    }
}
class GrayCat extends Cat{
    void cure() {
        System.out.println("치료해줄 수 있어");
    }
}

class animal {
    void breath() {
        System.out.println("숨쉬다.");
    }
}
class Person3 extends animal {
    int hello;
}

class 오리 {
    void 날다() {
        System.out.println("날다");
    }
    void 수영하다() {
        System.out.println("물갈퀴로 수영합니다. ");
    }
}
class 청둥오리 extends 오리 {
    int hello;
}
class 흰오리 extends 오리 {
    int hello;
}
class 고무오리 extends 오리 {
    void 날다() {
        System.out.println("저는 날 수 없어요..");
    }
    void 수영하다() {
        System.out.println("저는 물에 둥둥떠요");
    }
}
class 고무오리2 extends 고무오리 { }
class 로봇오리 extends 오리 {
    void 날다() {
        System.out.println("저는 못날아요..");
    }
}
