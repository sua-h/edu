package other;

// 다른 패키지의 클래스를 가져올 경우 import 시켜줘야 한다.
import ch06.PrivateClass;

// 패키지만 다르면 같은 이름의 클래스를 만들 수 있다.
public class PrivateClassTest {
    PrivateClass pc = new PrivateClass();

    //pc.defaultVal = 10;   // default - 다른 패키지 접근 불가능
}
