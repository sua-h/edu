package ch03;

public class OperatorExample3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2;  // true
        boolean result2 = n3 > n4;   // false

        System.out.println(result1 && result2);  // 전부 ture 여야만 결과값이 ture
        System.out.println(result1 || result2);  // 둘중 하나만 true 여도 결과값이 true (전부 false 여야 false)

        // 연산의 단계를 줄여야 성능이 좋기 때문에 &&연산은 false값을 앞에, ||연산은 true를 앞에 두는 것이 좋다. (최적화)
        System.out.println(true && true && false && true && true);  // false
        System.out.println(n1 >= n2 || n3 < n4 || n1 > n4);         // true

        System.out.println( !(result1 && result2) );

    }
}
