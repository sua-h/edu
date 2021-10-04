package ch06;

public class Car {
    /*
    2가지로 구성
    - 멤버필드 (변수, 상수)
    - 메소드
    */

    // 생성자
    // 1. 이름이 Class명과 같아야 한다.
    // 2. return 타입이 없어야 한다.
    // * 생섲앙가 하나도 없으면 컴파일러가 자동으로 넣어준다.
    /*
    - 생략없이 모두 적었얼 때 기본 생성자
    public Car() {
        super();
    }
    */
    Car() {}

    // 오버로딩 : 똑같은 이름의 메소드를 여러개 만들 수 있는 기술 (생성자도 메소드의 일부)
    //          매개 변수만 다르면 만들 수 있다. 타입의 종류, 타입의 갯수, 순서, 리턴타입은 상관 없음
    //Car(String a, int b) {}
    //Car(int a, String b) {}

    Car(String brand, String nm) {  // 지역변수, 전역변수
        // 멤버필드에 저장
        this.brand = brand;
        this.nm = nm;
    }


    // 멤버필드 (명사)
    String nm;
    String brand;

    // 메소드 (동사)
    public void drive() {
        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
    }

    public void stop() {
        System.out.printf("%s의 %s가 멈춘다.\n", brand, nm);
    }
}
