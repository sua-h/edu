package ch06;

public class CarTest {
    public static void main(String[] args) {
        // Car = 타입, Car 타입의 객체만 저장할 수 있다. 객체화시 new 를 쓴다.
        Car car1 = new Car();

        car1.brand = "현대";
        car1.nm = "소나타";
        car1.drive();
        car1.stop();

        Car car2 = new Car();
        car2.brand = "기아";
        car2.nm = "K5";
        car2.drive();
        car2.stop();

        System.out.println(car1 == car2);  // false - 주소값이 다르다.
    }
}
