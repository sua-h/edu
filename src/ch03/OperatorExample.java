package ch03;

public class OperatorExample {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        int result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.printf("%d + %d = %d\n", n1, n2, result);

        result = n1 + (-n2);
        System.out.printf("%d + -%d = %d\n", n1, n2, result);

        // 비교연산자의 결과 타입은 boolean 이다.
        boolean result2 = n1 > n2;
        System.out.printf("%d > %d = %b\n", n1, n2, result);
        System.out.printf("%d < %d = %b\n", n1, n2, n1 < n2);
        System.out.println();
        System.out.printf("%d >= %d = %b\n", n1, n2, n1 >= n2);
        System.out.printf("%d <= %d = %b\n", n1, n2, n1 <= n2);
        System.out.println();
        System.out.printf("%d == %d = %b\n", n1, n2, n1 == n2);
        System.out.printf("%d != %d = %b\n", n1, n2, n1 != n2);

    }
}
