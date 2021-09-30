package ch04;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        System.out.println("나이 : " + age);
    }
}
