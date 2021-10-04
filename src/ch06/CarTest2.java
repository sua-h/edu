package ch06;

public class CarTest2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.nm = "320";

        // 얕은 복사
        Car car2 = car1;

        car1.drive();
        car2.stop();
        car2.drive();
        car2.stop();

        System.out.println(car1 == car2);  // true - 주소값이 같다.

        // 값 가져오기도 가능
        System.out.println("car1의 브랜드 : " + car1.brand);
        System.out.println("car2의 브랜드 : " + car2.brand);
    }
}
