package ch04;

public class ContinueTest {
    public static void main(String[] args) {
        /*
            1~100까지 숫자 중에 continue를 활용하여 짝수 값만 모두 더하기
            for문 끝나면 전부 더한 값을 출력하기
        */

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
        }

        System.out.println("sum : " + sum);
    }
}
