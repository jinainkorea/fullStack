//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
//        // 자동 형변환
//        int i = 10;
//        double d = i;
//        System.out.println(d);
//
//        // 명시적 형변환
//        double d2 = 5.5;
//        int i2 = (int) d2;
//        System.out.println(i2);
//
//
//        // 클래스의 자동 형변환
//        무기 soword = new 칼();
//        soword.run();
//        // 클래스의 명시적 형변환
//
//
//
//
//
//        // 연습
//        전사 a전사 = new 전사();
//
//        a전사.a무기 = new 칼1();
////        a전사.a무기.작동();
//        a전사.공격();
//
//        a전사.a무기 = new 활1();
////        a전사.a무기.작동();
//        a전사.공격();
//
//
//        // 연습문제
//        전사2 b전사 = new 전사2();
//
//        b전사.공격(/* 수정가능지역 시작 */
//            "브라이언", "칼"
//        /* 수정가능지역 끝 */);
//        // 브라이언이(가) 칼(으)로 공격합니다.
//
//        b전사.공격(/* 수정가능지역 시작 */
//            "필립", "창"
//        /* 수정가능지역 끝 */);
//        // 필립이(가) 창(으)로 공격합니다.
//
//        b전사.공격(/* 수정가능지역 시작 */
//            "마크", "지팡이"
//        /* 수정가능지역 끝 */);
//        // 마크(가) 지팡이(으)로 공격합니다.



//        // 연습문제2
//        전사2 b전사 = new 전사2();
//
//        b전사.공격(/* 수정가능지역 시작 */ "브라이언", "칼"/* 수정가능지역 끝 */);
//        // 브라이언이(가) 칼(으)로 공격합니다.
//
//        b전사.재공격();
//        // 브라이언이(가) 칼(으)로 공격합니다.
//
//        b전사.공격(/* 수정가능지역 시작 */"필립", "창" /* 수정가능지역 끝 */);
//        // 필립이(가) 창(으)로 공격합니다.
//
//        b전사.공격(/* 수정가능지역 시작 */"마크", "지팡이" /* 수정가능지역 끝 */);
//        // 마크(가) 지팡이(으)로 공격합니다.
//
//        b전사.재공격();
//        // 마크(가) 지팡이(으)로 공격합니다.
//
//        b전사.재공격();
//        // 마크(가) 지팡이(으)로 공격합니다.



        // 연습문제3
//        전사 a전사 = new 전사();
//        a전사.a무기 = new 칼();
//        a전사.공격("브라이언");
//        a전사.a무기 = new 활();
//        a전사.공격("필립");



//        28강 연습문제1
//        샤오미Tv a샤오미Tv = new 샤오미Tv();
//        삼성Tv a삼성Tv = new 삼성Tv();
//        LGTv aLGTv = new LGTv();
//
//        a샤오미Tv.켜기();
//        // 출력 => 샤오미Tv 켜집니다.
//        a샤오미Tv.끄기();
//        // 출력 => 샤오미Tv 꺼집니다.
//        a샤오미Tv.vr켜기();
//        // 출력 => 샤오미Tv vr켜기!
//
//        a삼성Tv.켜기();
//        // 출력 => 삼성Tv 켜집니다.
//        a삼성Tv.끄기();
//        // 출력 => 삼성Tv 꺼집니다.
//        a삼성Tv.ar켜기();
//        // 출력 => 삼성Tv ar켜기!
//
//        aLGTv.켜기();
//        // 출력 => LGTv 켜집니다.
//        aLGTv.끄기();
//        // 출력 => LGTv 꺼집니다.
//        aLGTv.게임모드전환();
//        // 출력 => LGTv 게임모드전환!



//        28강 연습문제2
//        System.out.println("== 표준Tv 리모콘 들여오기 전 ==");
//
//        샤오미Tv a샤오미Tv = new 샤오미Tv();
//        삼성Tv a삼성Tv = new 삼성Tv();
//        LGTv aLGTv = new LGTv();
//
//        a샤오미Tv.켜기();
//        // 출력 => 샤오미Tv 켜집니다.
//        a샤오미Tv.끄기();
//        // 출력 => 샤오미Tv 꺼집니다.
//        a샤오미Tv.vr켜기();
//        // 출력 => 샤오미Tv vr켜기!
//
//        a삼성Tv.켜기();
//        // 출력 => 삼성Tv 켜집니다.
//        a삼성Tv.끄기();
//        // 출력 => 삼성Tv 꺼집니다.
//        a삼성Tv.ar켜기();
//        // 출력 => 삼성Tv ar켜기!
//
//        aLGTv.켜기();
//        // 출력 => LGTv 켜집니다.
//        aLGTv.끄기();
//        // 출력 => LGTv 꺼집니다.
//        aLGTv.게임모드전환();
//        // 출력 => LGTv 게임모드전환!
//
//        System.out.println("== 표준Tv 리모콘 들여온 후 ==");
//
//        // 표준Tv 리모콘을 만든다.
//        표준Tv a표준Tv;
//
//        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
//        a표준Tv = a샤오미Tv;
//        a표준Tv.켜기();
//        // 출력 : 샤오기TV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : 샤오기TV 꺼집니다.
//
//        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
//        a표준Tv = a삼성Tv;
//        a표준Tv.켜기();
//        // 출력 : 삼성TV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : 삼성TV 꺼집니다.
//
//        // a표준Tv 변수에 LGTv 객체를 연결한다.
//        a표준Tv = aLGTv;
//        a표준Tv.켜기();
//        // 출력 : LGTV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : LGTV 꺼집니다.
//
//        // LGTV만의 고유 기능을 표준Tv 리모콘을 이용해서 호출하기 => 불가능
//        // (LGTv) => a표준Tv 변수에 있던 표준Tv 리모콘이 LGTv리모콘화 해서 `aLGTv2` 변수에 들어간다.
//        LGTv aLGTv2 = (LGTv)a표준Tv;
//        aLGTv2.게임모드전환();



//       28강 연습문제3
//       문제 : `a무기.공격();` 가 실행되는 세부과정을 자세히 쓰세요.
//        무기 a무기 = new 칼();
//
//        // 타입이 무기인 변수 a무기에 자식클래스 칼을 담는다.
//        // a무기.공격();은 클래스 칼의 메소드 공격을 실행한다.
//        a무기.공격();



//      자동, 수동 형변환 연습
//      자동차 리모콘으로 페라리 객체를 연결한 후 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.
//        페라리 차1 = new 페라리();
//        자동차 차2 = 차1;
//
//        자동차 차3 = new 자동차();
//        페라리 차4 = (페라리) 차3;



////        30강 연습문제
//        전사 a전사 = new 전사();
//        a전사.이름 = "카니";
//        a전사.나이 = 22;
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 전사가 칼로 공격합니다.
//
//        a전사.이름 = "초코";
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 전사가 활로 공격합니다.



//      30강 기본문제1
//        사람 a사람 = new 사람();
//
//        a사람.나이 = 20;
//        a사람.a왼팔 = new 팔();



//       30강 기본문제2
//        전사 a전사 = new 전사();
//
//        a전사.나이 = 20;
//        a전사.a무기 = new 활();
//        a전사.a무기 = new 칼();



//        30강 기본문제3
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.이름 = "철수";
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.


    }
}

// 30강 기본문제3
class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    static int 나이;
    // 인스턴스 변수
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }
    void 공격() {
        a무기.공격(this.이름);
    }
}

class 무기 {
    void 공격(String name) {

    }
}

class 칼 extends 무기 {
    void 공격(String name) {
        System.out.printf("%s가 칼로 공격합니다.\n", name);
    }
}

class 활 extends 무기 {
    void 공격(String name) {
        System.out.printf("%s가 활로 공격합니다.\n", name);
    }
}



// 30강 기본문제2
//class 전사 {
//    int 나이;
//    무기 a무기;
//}
//class 무기 {}
//class 활 extends 무기 {}
//class 칼 extends 무기 {}



// 30강 기본문제1
//class 사람 {
//    // 클래스안에 변수를 정의 할 수 있다.
//    팔 a왼팔;
//    int 나이;
//}
//class 팔 {
//
//}



// 30강 연습문제
//class 전사 {
//    String 이름;
//    int 나이;
//    무기 a무기;
//
//    void 공격(){
//        a무기.공격();
//    };
//}
//class 무기 {
//    void 공격() {}
//}
//class 칼 extends 무기 {
//    void 공격() {
//        System.out.println("전사가 칼로 공격합니다.");
//    }
//}
//class 활 extends 무기 {
//    void 공격() {
//        System.out.println("전사가 활로 공격합니다.");
//    }
//}



// 자동, 수동 형변환 연습
//class 자동차 {
//    void 달리다() {}
//    void 서다() {}
//}
//class 페라리 extends 자동차 {
//    void 뚜껑이_열리다() {}
//}



// 28강 연습문제3
//class 무기 {
//    void 공격() {}
//}
//
//class 칼 extends 무기 {
//    void 공격() { }
//}



// 28강 연습문제2
//class 표준Tv {
//    void 켜기() {}
//    void 끄기() {}
//}
//class 샤오미Tv extends 표준Tv {
//    String name = "샤오미Tv";
//    void 켜기() {
//        System.out.println("샤오미Tv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("샤오미Tv 꺼집니다.");
//    }
//
//    void vr켜기() {
//        System.out.println("샤오미Tv vr켜기!");
//    }
//}
//class 삼성Tv extends 표준Tv {
//    String name = "삼성Tv";
//    void 켜기() {
//        System.out.println("삼성Tv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("삼성Tv 꺼집니다.");
//    }
//
//    void ar켜기() {
//        System.out.println("삼성Tv ar켜기!");
//    }
//}
//class LGTv extends 표준Tv {
//    String name = "LGTv";
//    void 켜기() {
//        System.out.println("LGTv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("LGTv 꺼집니다.");
//    }
//
//    void 게임모드전환() {
//        System.out.println("LGTv 게임모드전환!");
//    }
//}



// 28강 연습문제1
//class 샤오미Tv {
//    String name = "샤오미Tv";
//    void 켜기(){
//        System.out.println(name+" 켜집니다.");
//    }
//    void 끄기() {
//        System.out.println(name+" 꺼집니다.");
//    }
//    void vr켜기() {
//        System.out.println(name+" vr켜기!");
//    }
//}
//class 삼성Tv {
//    String name = "삼성Tv";
//    void 켜기(){
//        System.out.println(name+" 켜집니다.");
//    }
//    void 끄기() {
//        System.out.println(name+" 꺼집니다.");
//    }
//    void ar켜기() {
//        System.out.println(name+" ar켜기!");
//    }
//}
//class LGTv {
//    String name = "LGTv";
//    void 켜기(){
//        System.out.println(name+" 켜집니다.");
//    }
//    void 끄기() {
//        System.out.println(name+" 꺼집니다.");
//    }
//    void 게임모드전환() {
//        System.out.println(name+" 게임모드전환!");
//    }
//}




// 연습문제3
//class 전사 {
//    무기 a무기;
//    void 공격(String name) {
//        a무기.공격(name);
//    };
//}
//class 무기 {
//    void 공격(String name) {}
//}
//class 칼 extends 무기 {
//    void 공격(String name) {
//        System.out.printf("%s(이)가 %s로 공격합니다.\n", name, "칼");
//    }
//}
//class 활 extends 무기 {
//    void 공격(String name) {
//        System.out.printf("%s(이)가 %s로 공격합니다.\n", name, "활");
//    }
//}



//// 클래스의 형변환
//class 무기 {
//    void run() {
//        System.out.println("무기");
//    }
//}
//class 칼 extends 무기 {
//    void run() {
//        System.out.println("칼");
//    }
//}
//class 활 extends 무기 {
//    void run() {
//        System.out.println("활");
//    }
//}



//// 연습문제
//class 전사 {
//    무기1 a무기;
//
//    void 공격() {
//        a무기.작동();
//    }
//}
//class 무기1 {
//    void 작동() {
//        System.out.println("무기로 공격합니다.");
//    }
//}
//class 칼1 extends 무기1 {
//    void 작동() {
//        System.out.println("칼로 공격합니다.");
//    }
//}
//class 활1 extends 무기1 {
//    void 작동() {
//        System.out.println("활로 공격합니다.");
//    }
//}



//// 연습문제2
//class 전사2 {
//    static String name;
//    static String weapon;
//
//    void 공격(String name, String weapon) {
//        System.out.printf("%s(이)가 %s로 공격합니다.\n", name, weapon);
//        this.name = name;
//        this.weapon = weapon;
//    }
//    static void 재공격() {
//        System.out.printf("%s(이)가 %s로 공격합니다.\n", name, weapon);
//    }
//}