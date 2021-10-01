package ch04;

public class BreakExample2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 100; j < 110; j++) {
                if (j == 103) {
                    break;          // 인쩍 for문 break.
                }
                System.out.printf("%d - %d\n", i, j);
            }
        }

        System.out.println("------------------------");

        OUT_FOR :   // 레이블 (lable), 이름은 사용자 마음대로 정해도 되지만 주로 상수 형태로 적는다.
        for (int i = 0; i < 10; i++) {
            for (int j = 100; j < 110; j++) {
                if (j == 103) {
                    break OUT_FOR;      // 비낕쩍 fpr믄 break.
                }
                System.out.printf("%d - %d\n", i, j);
            }
        }
    }
}
