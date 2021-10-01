package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        // input 0, output 0 (비 void형)
        int result = sum(10, 20);

        System.out.println("sum : " + result);
    }

    // 메소드 선언부의 타입과 return 타입이 같아야한다.
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
