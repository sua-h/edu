package ch04;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5 || i == 7) {
                continue;   // skip (아래 구문 실행하지 않고 반복문을 계속 진행한다.)
            }
            System.out.println(i);
        }
    }
}
