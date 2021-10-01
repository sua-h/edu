package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
        int rVal = getRandom(30, 40);  // 30~40 랜덤한 값을 리턴하는 메소드를 구현
        System.out.println(rVal);

        int absVal = getAbs(10);
        int absVal2 = getAbs(-10);
        System.out.printf("%d, %d", absVal, absVal2);
    }

    public static int getRandom(int n1, int n2) {
        return (int)((Math.random() * (n2 - n1 + 1) ) + n1);
    }

    public static int getAbs(int val) {
//        if (val < 0) {
//            return -val;
//        }
//        return val;
        return val < 0 ? -val : val;
    }
}
