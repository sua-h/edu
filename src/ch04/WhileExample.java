package ch04;

public class WhileExample {
    public static void main(String[] args) {
        // while문 - 기한이나 정해진 횟수가 없는 경우에 주로 사용. ()안의 조건식에 만족할 때 까지 반복한다.
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
