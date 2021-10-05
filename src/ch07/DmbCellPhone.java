package ch07;

public class DmbCellPhone extends CellPhone{
    int channel;

//    // 파라미터가 있으면 자동으로 기본생성자 생성 X 직접 만들어 주어야 한다.
//    public DmbCellPhone() {}
//
//    public DmbCellPhone(int channel) {
//        this.channel = channel;
//    }

    // 은닉화, 캡슐화
    // 은닉화 된 멤버필드에 값을 넣을 수 있는 방법 >> 1. setter 메소드 이용 (값 변경 가능)  2. 생성자 이용 (생성할 때 값을 1번 넣을 수 있음 값 바뀌지 않음)
    // 객체에 은닉화 된 멤버 필드에 값을 빼는 방법 >> 1. getter 메소드 이용

    // this.~ : 멤버필드, 멤버 메소드 사용할 떼
    // super.~ :
    // this(); : 생성자 호출 (나 자신의 생성자 호출)
    // super(); : 생성자 호출 (부모의 생성자 호출)

    public DmbCellPhone(String model, String color, int channel) {
        // super();                 // 생략되어 있지만 기본으로 가장 위에 들어감.
        super("","");   // ***부모에 기본 생성자가 없는 경우는 super();을 명시해 주어야 한다.
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    // 오버라이딩 : 메소드 재정의, 부모에 정의된 메소드를 그대로 사용하지 않고, 새롭게 정의하는 것

    @Override
    void printInfo() {
        super.printInfo();
        System.out.printf("channel : %s \n", channel);
    }
}
