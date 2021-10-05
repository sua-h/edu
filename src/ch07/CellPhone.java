package ch07;

// DmbCellPhone의 부모 클래스
public class CellPhone {
    String model;
    String color;

    // 기본 생성자가 존재하지 않는다.

    public CellPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    void printInfo() {
        System.out.printf("model : %s, color : %s \n", model, color);
    }

    void sendMsg(String msg) {
        System.out.println("보낸 메세지 : " + msg);
    }
}
