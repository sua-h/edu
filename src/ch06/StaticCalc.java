package ch06;

public class StaticCalc {
    // static은 메모리에 스스로 올라간다. (클래스 메모리 영역)
    // static은 미리 메모리에 올라가있다.
    // 무조건 메모리에 올리기 때문에 메모리는 차지하지만 속도가 빠르다.
    // => 객체화(인스턴스)가 필요 없다.
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    // static 메소드 장려
    // 1. 파라미터 값만 사용할 때
    // 2. 멤버 필드를 사용하는데 그 멤버 필드가 static인 경우
}
