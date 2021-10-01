package ch05;

public class MethodExample {
    /*
    리턴타입 - 리턴값이 없는 경우 : void / 리턴값이 있는 경우 : 해당 리턴값의 타입
    */

    //메소드 선언부: 리턴타입 메소드명 파라미터(매개변수)
    public static void main(String[] args) {
        //메소드 구현부

        sum(10, 20);   // 메소드명(argument);
        sum(50, 120);

        minus(100, 50, 10);
    }

    // 메소드는 클래스 구현부 안에서 작성한다. 메소드 구현부 안에 적으면 안됨.
    public static void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));
    }

    public static void minus(int n1, int n2, int n3) {
        System.out.println("minus : " + (n1 - n2 - n3));
    }
}
