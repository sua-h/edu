package ch04;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                break;   // 반복문을 멈춘다. (반복문을 빠져나감)
            }
            System.out.println(i);
        }
    }
}
