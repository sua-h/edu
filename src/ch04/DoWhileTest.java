package ch04;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, val = 0;

        do {
            System.out.println("숫자를 입력하세요 (정지 : 0) : ");
            val = scanner.nextInt();
            sum = sum + val;
        } while (val != 0);

        System.out.println("합계 : " + sum);
    }
}
