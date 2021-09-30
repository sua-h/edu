package ch04;

public class ForStarTest {
    public static void main(String[] args) {
        /*

        if star = 2
        **
        **

        if star = 3
        ***
        ***
        ***

        if star = 4
        ****
        ****
        ****
        ****

        */

        int star = (int)(Math.random() * 5) + 2;  // 2 ~ 5
        System.out.println(star);

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
