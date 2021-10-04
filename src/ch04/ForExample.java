package ch04;

public class ForExample {
    public static void main(String[] args) {
        /*

        for (A; B; C) {
            A: 초기화
            B: 조건식 - 이 조건식이 true일 경우에만 for문이 반복된다.
            C: 증감식
        }

        */

        for (int i = 0; i < 10; i++) {
            System.out.println("i : " + i);
        }
    }
}
