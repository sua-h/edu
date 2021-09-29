package ch02;

public class VariableExample2 {
    public static void main(String[] args) {
        // 실수 타입
        float f;
        double d;

        int n1;
        //n1 = 0.11;  정수 타입은 소수 저장 불가

        f = 0.11f;  // 실수는 그냥 표기시 기본 double 타입. float 타입 이용 시에는 실수 뒤에 f를 붙인다.
        f = (float)0.11;  // 또는 형변환
        d = 0.11;

        double d2 = f * f;  // 자동 형변환 => f * f 먼저 계산 후 double 로 형변환  ==>  double d2 = (double)(f * f)

        double d3 = (double)f * f;   // 뒤의 형변환 하지 않은 float 타입의 f는 double 타입으로 자동 형변환 된다.

        //float f2 = d * d;  쟈동 형변환 안됨
        float f2 = (float)(d * d);  // 수동 형변환 해줘야 한다
        float f3 = (float)d * (float)d;
    }
}
