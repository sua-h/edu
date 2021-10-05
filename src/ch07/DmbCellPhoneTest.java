package ch07;

public class DmbCellPhoneTest {
    public static void main(String[] args) {
//        DmbCellPhone dcp = new DmbCellPhone();
//        dcp.color = "black";
//        dcp.model = "갤럭시 S21";

        DmbCellPhone dcp = new DmbCellPhone("갤럭시 S21", "block", 10);

        dcp.powerOn();
        dcp.powerOff();
        dcp.printInfo();
        dcp.sendMsg("안녕");
    }
}
