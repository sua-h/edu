package ch04;

public class ForExample3 {
    public static void main(String[] args) {
        // 구구단 출력하기
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
