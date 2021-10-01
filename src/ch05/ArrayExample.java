package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        // 배열 (Array)
        // 같은 타입의 값을 여러개 저장할 때 좋음
        // for문과 사용하면 좋음

        // 배열 만든 후 초기화
        // 타입 뒤에[] 혹은 변수명 뒤에[]를 붙인다. 타입[]를 추천. (타입만 보고 배열인지 알 수 있음)
        int[] scores = { 83, 90, 87, 100, 88 };   // int형 배열 => 레퍼런스타입 (주소값을 저장한다)

        System.out.println(scores[1]);

        scores[1] = 11;
        System.out.println(scores[1]);

        System.out.println(scores.length);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
