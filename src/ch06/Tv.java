package ch06;

public class Tv {
    // 은닉화
    private String brand;   // 기본값(레퍼런스타입) - null
    private int inch;       // 기본값(정수, 실수 타입) - 0

    // getter, setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
