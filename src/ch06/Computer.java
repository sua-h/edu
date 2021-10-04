package ch06;

public class Computer {
    // static이 있는 변수는 객체 하나만 저장한다.
    // static이 없는 변수는 객체화한 각 객체마다 값을 저장할 수 있다.
    static String brand;
    int cpu;

    public void print() {
        System.out.printf("컴퓨터 브랜드는 %s이고 cpu는 %d입니다.", brand, cpu);
    }

    // static인 메소드 print2와 멤버필드 brand는 바로 메모리에 올라가지만
    // none-static 멤버필드인 cpu는 객체화 전이기 때문에 아직 메모리에 올라가지 않은 상태이다.
    public static void print2() {
        //System.out.printf("컴퓨터 브랜드는 %s이고 cpu는 %d입니다.", brand, cpu);    // 불가
        System.out.printf("컴퓨터 브랜드는 %s입니다.", brand);                      // 가능
    }
}
