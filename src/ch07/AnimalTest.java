package ch07;

public class AnimalTest {
    public static void main(String[] args) {
        /*
        - 다형성 (여러가지 형태가 있는 성질)
        1. 부모 타입은 자식객체 주소값 저장할 수 있다. (가리킬 수 있다.)
        2. 자식 타입은 부모객체 주소값 저장할 수 없다. (가리킬 수 없다.) >> 컴파일에러 발생
        3. 메소드 호출은 타입이 알고 있는 것만 호출할 수 있고, 내용은 객체 기준이다.
        */

        // 부모타입에 자식타입의 주소값을 저장할 수 있다. (자동 형변환이 이루어짐)
        BigCat bigCat = new BigCat();
        Cat cat = new Cat();
        Animal animal1 = new BigCat();      // Animal animal1 = (Animal)new BigCat();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();
        Object object = new Animal();

        // Cat cat1 = new Animal();   // 자식 타입으로는 부모 객체를 가르킬 수 없다.

        Cat cat2 = new BigCat();
        cat2.crying();      // BigCat에 crying() 메소드가 없다면 부모인 Cat까지 가서 crying() 메소드를 찾음.
        //cat2.sleep();     // 불가능

        BigCat bigCat2 = (BigCat)cat2;   // 강제 형변환
        bigCat2.sleep();

    }
}
