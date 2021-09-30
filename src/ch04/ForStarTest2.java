package ch04;

public class ForStarTest2 {
    public static void main(String[] args) {
        /*

        if star = 2
        *
        **

        if star = 3
        *
        **
        ***

        */

        int star = (int)(Math.random() * 5) + 2;
        System.out.println(star);

        for (int i = 0; i < star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
