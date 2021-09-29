package ch04;

public class IfTest3 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101);
        // random 이용해서 60 ~ 100점
        int newScore = (int)(Math.random() * 41) + 60;

        char grade = 'D';  // 등급
        char pm = ' ';     // +, -

        int n = score % 10;


        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }

        if (score >= 70) {
            if (n >= 7 || score == 100) {
                pm = '+';
            } else if (n <= 3) {
                pm = '-';
            }
        }



        System.out.printf("%c%c", grade, pm);
    }
}
