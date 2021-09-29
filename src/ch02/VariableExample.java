package ch02;

public class VariableExample {
    public static void main(String[] args) {
        // 정수 타입 - 저장할 수 있는 용량이 다름
        byte b;
        short s;
        int i;
        long l;

        int score;
        score = 10;
        System.out.println(score);
        System.out.println(10);

        score = 20;
        System.out.println(score);
        System.out.println(20);

        System.out.println(score + score);
        System.out.println(score);

        score = score + score + score;
        System.out.println(score);

        short s1 = -129;
        byte b1 = (byte)s1;
        System.out.println(b1);

        final int score2 = 100;
        //score2 = 90;  불가. 상수는 한 번 입력된 값은 바꿀 수 없다
    }
}
