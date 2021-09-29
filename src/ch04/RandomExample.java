package ch04;

public class RandomExample {
    public static void main(String[] args) {
        // Math.random() : 0.0 ~ 0.999999999..
        int num = (int)(Math.random() * 6);
        // random()의 최댓값- 0.9999~ * 6 = 5.4
        // (int)(5.4) = 5
        // 결과는 0 ~ 5

        System.out.println("num : " + num);

        // 2~7
        int num2 = (int)(Math.random() * 6) + 2;

        System.out.println(num2);

        // 55~108
        int num3 = (int)(Math.random() * 54) + 55;

        System.out.println(num3);
    }
}
