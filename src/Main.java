import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 복습
        // 구현 시작
//        전사 a전사 = new 전사();
//        a전사.a무기 = new 칼();
//        a전사.a무기.공격();
//        a전사.a무기 = new 창();
//        a전사.a무기.공격();
//        a전사.a무기 = new 지팡이();
//        a전사.a무기.공격();
//        a전사.a무기 = new 전설의_지팡이();
//        a전사.a무기.공격();
//        // 구현 끝
//
//        // 출력
//        /*
//        칼(으)로 공격합니다.
//        데미지 : 78
//        창(으)로 공격합니다.
//        데미지 : 80
//        지팡이(으)로 공격합니다.
//        데미지 : 12
//        전설의_지팡이(으)로 공격합니다.
//        데미지 : 120
//        */



//        복습2
//        청둥오리 a청둥오리 = new 청둥오리();
//        a청둥오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        흰오리 a흰오리 = new 흰오리();
//        a흰오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        고무오리 a고무오리 = new 고무오리();
//        a고무오리.날다();
//        // 출력 : 저는 날 수 없어요. ㅜㅠ
//
//        고무2오리 a고무2오리 = new 고무2오리();
//        a고무2오리.날다();
//        // 출력 : 저는 날 수 없어요. ㅜㅠ
//
//        a고무2오리.a비행아이템 = new 로켓비행아이템();
//        a고무2오리.날다();
//        // 출력 : 로켓파워로 날아갑니다.




//        자동차 차1 = new 자동차();
//        차1.시동();
//
//        자동차 차2 = new 벤츠();
//        차2.시동();
//
//
//        벤츠 차3 = new 벤츠();
//        차3.시동(100);




        String numbers = "onetwothreefourfivesixseveneightnine";
        long answer = 0;
        String answer_str = "";
        String[] eng_arr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < eng_arr.length; i++) {
            numbers = numbers.replace(eng_arr[i], Integer.toString(i+1));
        }
        answer = Long.parseLong(numbers);
        System.out.println(answer);


// super메소드
//    new 사람();



//        칼 a무기1 = new 칼();
//        활 a무기2 = new 활();
//        총 a무기3 = new 총();
//
//        무기[] 무기들 = new 무기[3];
//        무기들[0] = a무기1; // 칼
//        무기들[1] = a무기2; // 활
//        무기들[2] = a무기3; // 총
//
//        for(int i = 0; i < 무기들.length; i++ ) {
//            무기 a무기 = 무기들[i];
//            a무기.작동();
//        }
//
//// new 무기();
//        // class abstract이면 해당클래스로 객체를 만드는게 불가능하다.


// 인터페이스 Animal, Pet
//        Cat c = new Cat();
//        Dog d = new Dog();
//
//        c.cry();
//        c.play();
//        d.cry();
//        d.play();



//        사람 a사람 = new 사람();
//        a사람.set나이(20);
//        System.out.println("나이는 "+a사람.get나이());
//
//        // getter, setter
//        a사람.set이름("홍길동");
//        System.out.println("이름은 "+a사람.get이름()+"입니다.");

    }
}


//class 사람 {
//    private int 나이;
//    private String 이름;
//
//    void set나이(int 나이) {
//        if(나이 > 0) this.나이 = 나이;
//    }
//    int get나이() {
//        return this.나이;
//    }
//    void set이름(String 이름) {
//        this.이름 = 이름;
//    }
//    String get이름() {
//        return this.이름;
//    }
//}




//인터페이스 Animal => cry()
//인터페이스 Pet => play()
//interface Animal {
//    void cry();
//}
//interface Pet {
//    void play();
//}
//class Cat implements Animal, Pet {
//    public void cry() {
//        System.out.println("냐옹");
//    }
//    public void play() {
//        System.out.println("낚시 장난감을 가지고 놉니다.");
//    }
//}
//class Dog implements Animal, Pet {
//    public void cry() {
//        System.out.println("멍멍");
//    }
//    public void play() {
//        System.out.println("공을 가지고 놉니다.");
//    }
//}




//interface 무기 {
//    void 작동(); // 리모콘 버튼 전용
//    // 추상 메서드
//}
//
//class 칼 implements 무기 {
//    public void 작동() {
//        System.out.println("칼 작동");
//    }
//}
//
//class 활 implements 무기 {
//    public void 작동() {
//        System.out.println("활 작동");
//    }
//}
//
//class 총 implements 무기 {
//    public void 작동() {
//        System.out.println("총 작동");
//    }
//}




// 인터페이스
//interface 자동차인터페이스 {
//    void 달리다();
//    void 멈추다();
//}
//interface 오토바이인터페이스 {
//    void 달리다();
//    void 멈추다();
//    void 클락션을_울리다();
//}
//class 자동차 implements 자동차인터페이스, 오토바이인터페이스 {
//    @Override
//    public void 달리다() {
//
//    }
//
//    @Override
//    public void 멈추다() {
//
//    }
//
//    @Override
//    public void 클락션을_울리다() {
//
//    }
//}




// super메소드
//class 동물 {
//    동물(String 이름) {
//        System.out.println("동물(String 이름) 실행됨!");
//        System.out.println("이름 : " + 이름);
//    }
//    동물(String 이름, int 나이) {
//        System.out.println("동물(String 이름, int 나이) 실행됨!");
//        System.out.println("이름 : " + 이름);
//        System.out.println("나이 : " + 나이);
//    }
//}
//
//class 사람 extends 동물 {
//    사람() {
////        super("강아지");
//        super("강아지", 4);
//    }
//}



//class 자동차 {
//    void 시동 () {
//       System.out.println("수동 시동");
//    }
//}
//
//class 벤츠 extends 자동차 {
//    void 시동 () {
//        System.out.println("자동 시동");
//    }
//    void 시동 (int speed) {
//        System.out.printf("%d 속력 자동 시동", speed);
//    }
//}



// 복습2
//abstract class 오리 {
//    비행아이템 a비행아이템;
//
//    오리() {
//        a비행아이템 = new 날개비행아이템();
//    }
//
//    void 날다() {
//        a비행아이템.작동();
//    }
//}
//
//class 흰오리 extends 오리 {
//
//}
//
//class 청둥오리 extends 오리 {
//
//}
//
//class 고무오리 extends 오리 {
//    고무오리() {
//        a비행아이템 = new 못나는비행아이템();
//    }
//}
//
//class 고무2오리 extends 오리 {
//    고무2오리() {
//        a비행아이템 = new 못나는비행아이템();
//    }
//}
//
//abstract class 비행아이템 {
//    abstract void 작동();
//}
//
//class 날개비행아이템 extends 비행아이템 {
//    void 작동() {
//        System.out.println("날개로 날아갑니다.");
//    }
//}
//
//class 못나는비행아이템 extends 비행아이템 {
//    void 작동() {
//        System.out.println("저는 못 날아요 ㅠㅠ");
//    }
//}
//
//class 로켓비행아이템 extends 비행아이템 {
//    void 작동() {
//        System.out.println("로켓파워로 날아갑니다.");
//    }
//}



//복습
//class 전사 {
//    무기 a무기;
//    전사() {
//        a무기 = new 무기();
//    }
//}
//class 무기 {
//    String 이름;
//    int 데미지;
//    void 공격() {
//        System.out.printf("%s(으)로 공격합니다.\n데미지 : %d\n", 이름, 데미지);
//    }
//}
//class 칼 extends 무기 {
//    칼() {
//        이름 = "칼";
//        데미지 = 78;
//    }
//}
//class 창 extends 무기 {
//    창() {
//        이름 = "창";
//        데미지 = 80;
//    }
//}
//class 지팡이 extends 무기 {
//    지팡이() {
//        이름 = "지팡이";
//        데미지 = 12;
//    }
//}
//class 전설의_지팡이 extends 무기 {
//    전설의_지팡이() {
//        이름 = "전설의_지팡이";
//        데미지 = 120;
//    }
//}