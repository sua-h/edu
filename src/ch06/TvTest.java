package ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.setBrand("삼성");
        tv1.setInch(50);
        System.out.println("Tv brand : " + tv1.getBrand());
        System.out.println("Tv inch : " + tv1.getInch());
        //tv1.brand = "삼성";   // direct로 변수 사용 불가

        Tv tv2 = new Tv();
        tv2.setBrand("LG");
        tv2.setInch(60);
        System.out.println("Tv brand : " + tv2.getBrand());
        System.out.println("Tv inch : " + tv2.getInch());
        //tv2.brand = "LG";
    }
}
