package ch04;

public class ForTest4 {
    public static void main(String[] args) {
        /*

        if star = 2
        _*
        **

        if star = 3
        __*
        _**
        ***

        if star = 4
        ___*
        __**
        _***
        ****

        */

        int star = (int)(Math.random() * 5) + 2;
        System.out.println(star);

        for (int i = star; i > 0; --i) {

            for (int j = 1; j <= star; j++) {
                if (j < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int i = star; i > 0; --i) {

            for (int j = 1; j <= star; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
