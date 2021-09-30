package ch04;

import java.util.Scanner;

public class WhileBreakTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, val = 0;

        while (true) {
            System.out.println("숫자를 입력하세요 (정지 : 0) : ");
            val = scanner.nextInt();
            if (val == 0) {
                break;
            }
            sum += val;
        }
        System.out.println("합계 : " + sum);
    }
}
