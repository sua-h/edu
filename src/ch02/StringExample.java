package ch02;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "안녕하세요";   // str1 에 저장되는 것 : 주소 값 하나
        System.out.println(str1);

        System.out.println(str1 + "네~~" + str1);  // 사칙 연산의 + 가 아니라 문자열 합치기의 + 로 사용

        str1 = str1 + 13;  // str1 + (String)13 문자열로 형변환
        System.out.println(str1);

        String str2 = 10 + 10 + "10";  // (String)(10 + 10) + "10", 앞에서부터 순차적으로 계산한다
        System.out.println(str2);

        String str3 = "10" + 10 + 10;  // "101010"
        System.out.println(str3);
    }
}

// byte < char < short < int < long < float < double << String
