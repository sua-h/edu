package ch04;

public class ForExample4 {
    public static void main(String[] args) {
        int n = 10;
        int result;

        for (int i = 1; i < n; i++) {
            for (int j = 2; j < n; j++) {
                result = j * i;
                System.out.printf("%d * %d = %d\t", j, i, result);
            }
            System.out.println();
        }
    }
}
