//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 복습
//        Cat cat = new Cat();
//        cat.cry.action();



        // 복습2
//        전사 a전사 = new 전사();
//        a전사.이름 = "카니";
//        a전사.나이 = 20;
//        a전사.a무기 = new 칼();
//        a전사.공격();
//
//        a전사.이름 = "초코";
//        a전사.나이 = 58;
//        a전사.a무기 = new 활();
//        a전사.공격();


// 생성자
//        캐릭터 a플레이어_캐릭터;
//
//        a플레이어_캐릭터 = new 전사("김철수");
//        a플레이어_캐릭터.공격();
//        // 출력 : 전사가 대검으로 공격합니다.
//
//        a플레이어_캐릭터 = new 마법사("안나");
//        a플레이어_캐릭터.공격();
//        // 출력 : 마법사가 파이어볼로 공격합니다.




// 생성자2
//        전사 a전사0 = new 전사();
//        a전사0.나이 = 20;
//        a전사0.이름 = "칸";
//        a전사0.성격 = "차가움";
////        a전사0.a무기 = new 활();
//
//        전사 a전사1 = new 전사();
//        전사 a전사2 = new 전사();
//        전사 a전사3 = new 전사();
//        전사 a전사4 = new 전사();
//        전사 a전사5 = new 전사();
//
//        System.out.println(a전사0.이름);
//        // 출력 : 칸
//        System.out.println(a전사1.이름);
//        // 출력 : No Name
//        System.out.println(a전사2.이름);
//        // 출력 : No Name
//        System.out.println(a전사3.이름);
//        // 출력 : No Name
//        System.out.println(a전사4.이름);
//        // 출력 : No Name
//        System.out.println(a전사5.이름);
//        // 출력 : No Name



// 생성자3
//        사람 a사람 = new 사람();
//        a사람.나이 = 10;
//        a사람.a왼팔 = new 팔();
//
//        System.out.println(a사람.a왼팔.길이 + "cm");
//        // 출력 : 100cm



// 생성자3-2
//        사람 a사람 = new 사람();
//        a사람.나이 = 10;
//
//        System.out.println(a사람.a왼팔.길이 + "cm");
//        // 출력 : 100cm



// 생성자4
//        // 문제 : 사람의 걷다 메서드에 this. 를 적절한 곳에 추가해주세요.
//        // 지역변수 => 하루살이 변수
//        int k = 10; // main 함수 안에서만 산다.
//
//        사람 a사람 = new 사람();
//        a사람.나이 = 20;
//
//        int dan = 8;  // main 함수 안에서만 산다.
//        for ( int i = 1; i < 9; i++ ) {
//            // i => for block 안에서만 산다.
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//
//        System.out.println(a사람.나이);
//        a사람.걷다();


// 생성자5
//        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;
//
//        System.out.println(엄지손가락_길이 + "cm");
//        // 출력 : 5cm




// 생성자6
//        병사 a병사 = new 병사();
//        a병사.이름 = "홍길동";
//        a병사.자기소개();
//        // 안녕하세요. 저는 홍길동 이병 입니다.
//        a병사.진급();
//        a병사.자기소개();
//        // 안녕하세요. 저는 홍길동 일병 입니다.
//        a병사.진급();
//        a병사.자기소개();
//        // 안녕하세요. 저는 홍길동 상병 입니다.



// 생성자7
//        전사 a전사 = new 홍길동();
//        a전사 = new 홍길순();



// 생성자8
//        전사 a전사 = new 홍길동();
//        a전사.무기 = new 활();
//        a전사.공격();
//        // 출력 => 홍길동이(가) 공격합니다.
//        a전사 = new 홍길순();
//        a전사.공격();
//        a전사.무기 = new 창();
//        a전사.공격();
//        // 출력 => 홍길동이(가) 공격합니다.



// 상속 중복제거
//        전사타입A a전사타입A = new 전사타입A();
//        a전사타입A.공격();
//
//        전사타입B a전사타입B = new 전사타입B();
//        a전사타입B.공격();
//
//        전사타입C a전사타입C = new 전사타입C();
//        a전사타입C.공격();
//
//        전사타입D a전사타입D = new 전사타입D();
//        a전사타입D.공격();



//        청둥오리 a청둥오리 = new 청둥오리();
////        a청둥오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        흰오리 a흰오리 = new 흰오리();
////        a흰오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        고무오리 a고무오리 = new 고무오리();
////        a고무오리.날다();
//        // 출력 : 저는 날 수 없어요. ㅜㅠ
//
//        고무2오리 a고무2오리 = new 고무2오리();
////        a고무2오리.날다();
//        // 출력 : 저는 날 수 없어요. ㅜㅠ
//
//        로켓오리 a로켓오리 = new 로켓오리();



// 전사
//  문제: 온라인 게임을 구현해주세요.
//  조건: 전사객체를 만들고 순서대로 칼, 창, 지팡이로 공격하게 해주세요.
//  단: 전사는 무기라는 것이 존재한다는 것은 알지만 칼, 창, 지팡이에 대해선 몰라야 합니다.
        // 구현 시작
        전사 a전사 = new 전사();
        a전사.a무기 = new 칼();
        a전사.a무기.공격();
        a전사.a무기 = new 창();
        a전사.a무기.공격();
        a전사.a무기 = new 지팡이();
        a전사.a무기.공격();
        a전사.a무기 = new 전설의지팡이();
        a전사.a무기.공격();

        // 구현 끝

        // 출력
    /*
    칼(으)로 공격합니다.
    데미지 : 78
    창(으)로 공격합니다.
    데미지 : 80
    지팡이(으)로 공격합니다.
    데미지 : 12
    전설의_지팡이(으)로 공격합니다.
    데미지 : 120
    */
    }
}








// 전사1
class 전사 {
    무기 a무기;
    전사 () {
        a무기 = new 무기();
    }
}
class 무기 {
    static String 이름;
    static int 데미지;
    void 공격(){
        System.out.printf("%s(으)로 공격합니다.\n데미지: %d\n", this.이름, this.데미지);
    };
}
class 칼 extends 무기 {
    칼() {
       이름 = "칼";
       데미지 = 78;
    }
}
class 창 extends 무기 {
    창() {
        이름 = "창";
        데미지 = 80;
    }
}
class 지팡이 extends 무기{
    지팡이() {
        이름 = "지팡이";
        데미지 = 12;
    }
}
class 전설의지팡이 extends 무기{
    전설의지팡이() {
        이름 = "전설의_지팡이";
        데미지 = 120;
    }
}




//class 오리 {
//     오리() {
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
//}
//class 고무오리 {
//    고무오리() {
//        System.out.println("저는 날 수 없어요.ㅜㅠ");
//    }
//}
//class 로켓오리 {
//    로켓오리() {
//        System.out.println("로켓 오리 푸슝 발사");
//    }
//}
//class 청둥오리 extends 오리 {
//}
//class 흰오리 extends 오리 {
//}
//class 고무2오리 extends 고무오리 {
//}



// 상속 중복제거
//class 전사 {
//}
//
//class 전사타입A extends 전사 {
//    void 공격() {
//        new 칼().공격();
//    }
//}
//
//class 전사타입B extends 전사 {
//    void 공격() {
//        new 칼().공격();
//    }
//}
//
//class 전사타입C extends 전사 {
//    void 공격() {
//        new 활().공격();
//    }
//}
//
//class 전사타입D extends 전사 {
//    void 공격() {
//        new 활().공격();
//    }
//}
//class 칼 {
//    void 공격(){
//        System.out.println("칼로 공격");
//    }
//}
//class 활 {
//    void 공격(){
//        System.out.println("활로 공격");
//    }
//}


// 생성자7
//class 전사 {
//    static String 이름;
//    무기 무기;
//    void 공격() {}
//}
//class 홍길동 extends 전사 {
//    홍길동() {
//        System.out.println("홍길동");
//        이름 = "홍길동";
//    }
//    void 공격() {
//        System.out.printf("%s이(가) %s로 공격합니다.\n", 이름, 무기.무기);
//    }
//}
//class 홍길순 extends 전사 {
//    홍길순() {
//        System.out.println("홍길순");
//        이름 = "홍길순";
//    }
//    void 공격() {
//        System.out.printf("%s이(가) %s로 공격합니다.\n", 이름, 무기.무기);
//    }
//}
//class 무기  {
//    static String 무기;
//}
//class 활 extends 무기{
//    활() {
//        무기 = "활";
//    }
//}
//class 창 extends 무기{
//    창() {
//        무기 = "창";
//    }
//}



// 생성자6
// class 병사 {
//    String 이름;
//    String 계급;
//    int 공격력;
//    병사() {
//        계급 = "이병";
//        공격력 = 1;
//    }
//    void 자기소개() {
//        System.out.printf("안녕하세요. 저는 %s %s 이고 공격력은 %d입니다.\n", 이름, 계급, 공격력);
//    }
//    void 진급() {
//        if(계급.equals("이병")) {
//            this.계급 = "일병";
//        } else {
//            this.계급 = "상병";
//        }
//        공격력 += 1;
//    }
//}


// 생성자5
//class 사람 {
//    왼팔 a왼팔;
//    사람() {
//        a왼팔 = new 왼팔();
//        a왼팔.a손 = new 손();
//        a왼팔.a손.a엄지손가락 = new 길이();
//        a왼팔.a손.a엄지손가락.길이 = 5;
//    }
//}
//class 왼팔 {
//    손 a손;
//}
//class 손 {
//    길이 a엄지손가락;
//}
//class 길이 {
//    int 길이;
//}



// 생성자4
//class 사람 {
//    // 인스턴스 변수
//    int 나이;
//
//    void 걷다() {
//        int 나이 = 22;
//        System.out.println(this.나이 + "살인 홍길동씨가 걷습니다.");
//    }
//}


// 생성자3-2
//class 사람 {
//    int 나이;
//    팔 a왼팔 = new 팔();
//
//}
//class 팔 {
//    int 길이 = 100;
//}


// 생성자3
//class 사람 {
//    int 나이;
//    팔 a왼팔;
//
//}
//class 팔 {
//    int 길이 = 100;
//}


// 생성자2
//class 전사 {
//    int 나이;
//    String 이름;
//    String 성격;
//    무기 a무기;
//
//    // `전사()` 는 생성자 메서드 이다.
//    // 클래스 명과 같은 이름의 메서드를 생성자 메서드 라고 한다.
//    // 생성자 메서드는 자동으로 호출됩니다.
//    // 생성자 메서드는 new 할때(객체 생성할 때) 자동으로 호출됩니다.
//    // 생성자 메서드는 다른 모든 메서드 보다 가장 먼저 딱 1번 실행됩니다.
//    // 생성자 메서드는 리턴타입이 없습니다.
//    // 당연하지만 생성자 메서드는 리턴값도 없습니다.
//    전사() {
//        // 수정가능지역 시작
//        this.나이 = 20;
//        this.이름 = "No Name";
//        this.성격 = "온순함";
//        this.a무기 = new 칼();
//        // 수정가능지역 끝
//    }
//}
//
//abstract class 무기 {
//
//}
//
//class 칼 extends 무기 {
//
//}



// 생성자
//abstract class 캐릭터 {
//    abstract void 공격();
//}
//class 전사 extends 캐릭터 {
//    전사 (String name) {
//        System.out.println(name+", 전사가 생성되었습니다.");
//    }
//    void 공격() {
//        System.out.println("전사공격");
//    }
//}
//class 마법사 extends 캐릭터 {
//    마법사 (String name) {
//        System.out.println(name+", 마법사가 생성되었습니다.");
//    }
//    void 공격() {
//        System.out.println("마법사공격");
//    }
//}


// 복습2
//class 전사 {
//    String 이름;
//    int 나이;
//    무기 a무기;
//
//    void 공격() {
//        a무기.공격();
//    }
//}
//class 무기 {
//    void 공격() {
//        System.out.println("");
//    }
//}
//class 칼 extends 무기 {
//    void 공격() {
//        System.out.println("칼로 공격");
//    }
//}
//class 활 extends 무기 {
//    void 공격() {
//        System.out.println("활로 공격");
//    }
//}


//// 복습
//class Cat {
//    Cry cry = new Cry();
//}
//class Cry {
//    void action() {
//        System.out.println("고양이가 웁니다.");
//    }
//}