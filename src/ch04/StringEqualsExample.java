package ch04;

public class StringEqualsExample {
    public static void main(String[] args) {
        // 문자열 비교!, 절대 == 비교하면 안된다.

        // 레퍼런스 타입의 변수는 값이 바로 저장되는 것이 아니라 값이 저장되어 있는 주소값이 저장된다.
        // 같은 값일지라도 값을 저장한 주소는 다르기 때문에 String의 주소값은 같아질 수 없다.
        // == 비교는 주소값이 같은지를 비교한다.
        String str1 = new String("안녕하세요");
        String str2 = new String("안녕하세요");
        System.out.println(str1 == str2);

        // str2의 주소값을 가져와서 str3에 저장.
        // 때문에 str3과 str2의 주소값은 같다.
        String str3 = str2;
        System.out.println(str3 == str2);

        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str2.equals(str1) : " + str2.equals(str1)); // String에 내장 된 똑같은 메소드를 이용하기 때문에 둘 다 같은 비교임.
        System.out.println("str3.equals(str1) : " + str3.equals(str1));
    }
}
