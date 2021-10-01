package ch05;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*
        숫자 3개를 입력해주세요.
        숫자1 :
        숫자2 :
        숫자3 :

        합계 :
        평균 :
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("몇개의 숫자를 사용할 것 입니까?");
        int len = scanner.nextInt();

        int[] numberArr = new int[len];
        System.out.printf("숫자 %d개를 입력해주세요.\n", numberArr.length);

        int sum = 0;

        for (int i = 0; i < numberArr.length; i++) {
            System.out.printf("숫자%d : ", (i + 1));
            numberArr[i] = scanner.nextInt();
        };

        for (int i = 0; i < numberArr.length; i++) {
            sum += numberArr[i];
        }

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (float)sum / numberArr.length);


    }
}
