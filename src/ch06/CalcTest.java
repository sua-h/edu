package ch06;

public class CalcTest {
    public static void main(String[] args) {
        // static 메소드
        int result1 = StaticCalc.sum(10, 20);
        System.out.println("static sum : " + result1);

        // 비슷한 구조
        String str = "10";
        int intStr = Integer.parseInt(str);
        System.out.println(intStr + 10);



        // none-static 메소드
        Calc calc = new Calc();
        calc.n1 = 10;
        calc.n2 = 20;

        int result2 = calc.sum();
        System.out.println("instance sum : " + result2);
    }
}
