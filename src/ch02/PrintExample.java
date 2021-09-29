package ch02;

public class PrintExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("-------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");

        // printf 이용하기
        // 홍길동의 키는 180.8cm, 나이는 17세, 혈액형은 B형 이다.

        String nm = "홍길동";
        int age = 17;
        float height = 180.8f;
        char bloodType = 'A';

        System.out.println(nm + "의 키는 " + height + "cm, 나이는 " + age + "세, 혈액형은 " + bloodType + "형 이다.");

        System.out.printf("%s의 키는 %fcm, 나이는 %d세, 혈액형은 %c형 이다.\n", nm, height, age, bloodType);


        System.out.printf("%s의 키는 %9.2fcm, 나이는 %,09d세, 혈액형은 %c형 이다.", nm, height, age, bloodType);
        // %s - 문자열 / %F - 실수 / %d - 정수 / %c - 문자
        // %n.mf - 소수점 앞 (n) : 앞 공백 n칸 / 소수점 뒤 (m) : 실수 소수점 m만큼 표시 / %,09d - 09 : 변수와 빈자리의 0을 채워 9자리를 만듬 / , : 천단위에 ,
    }
}
