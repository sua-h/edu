package ch04;

public class ForTest3 {
    public static void main(String[] args) {
        int result;

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                result = i * j;
                System.out.printf("%d * %d = %d\n", i, j, result);
            }
            if (!(i == 9)) {
                System.out.println("--------------");
            }
        }
    }
}
