package ch03;

public class OperatorExample4 {
    public static void main(String[] args) {
        // 증감식 - 증가
        // 증감식은 실제로 변수의 값이 변한다.
        int n1 = 10;
        n1++;
        ++n1;

        System.out.println(n1);

        // 증감식 - 감소
        n1--;

        System.out.println(n1);
        System.out.println("----------");

        int n2 = 40;
        System.out.println(n2++);   // n2를 먼저 읽고 증가 시킴
        System.out.println(n2);
        System.out.println(++n2);   // 읽기 전에 먼저 증가 시킨 후 읽음
        System.out.println(n2);
        System.out.println("----------");

        int n3 = 50;
        n3 = n3 + 3;   // 오른쪽 항 계산 후 왼쪽 항에 저장 n3 = 53
        n3 = n3 + 3;
        System.out.println("n3 : " + n3);
        System.out.println("----------");

        // 위 식의 축약형
        int n4 = 50;
        n4 += 3;
        n4 += 3;
        System.out.println("n4 : " + n4);
    }
}
