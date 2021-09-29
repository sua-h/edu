package ch02;

public class VariableExample3 {
    public static void main(String[] args) {
        //
        char c = 'B'; // 홑따옴표 사용, 쌍따옴표는 레퍼런스 타입
        System.out.printf("%c : %d\n", c, (int) c);

        int i = 69;
        System.out.printf("%c : %d\n", (char) i, i);

        boolean bl = false;
        System.out.println(bl);
    }
}


// <원시 타입>
// boolean
// byte < char < short < int < long < float < double
// 자동형변환 가능 (순서) -->      <-- (순서) 자동 형변환 불가능