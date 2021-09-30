package ch04;

public class ForTest {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8) + 2;   // 2~9
        int result;

        for (int i = 1; i < 10; i++) {
            result = dan * i;
            System.out.printf("%d * %d = %d\n", dan, i, result);
        }

        System.out.println();

        for (int i = 10; i < 19; i++) {
            result = dan * (i - 9);
            int n = i - 9;
            System.out.printf("%d * %d = %d\n", dan, n, result);
        }
    }
}
