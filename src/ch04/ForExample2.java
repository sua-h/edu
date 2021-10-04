package ch04;

public class ForExample2 {
    public static void main(String[] args) {
        // 중첩 for문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d - %d\n", i, j);
            }
        }


    }
}
