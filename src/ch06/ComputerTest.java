package ch06;

public class ComputerTest {
    public static void main(String[] args) {
        // static 변수
        Computer.brand = "삼성";
        System.out.println("Computer brand : " + Computer.brand);

        // none-static 변수
        Computer computer = new Computer();
        computer.cpu = 10;
        System.out.println("Computer cpu : " + computer.cpu);

        System.out.println("----------------");

        Computer computer2 = new Computer();
        computer2.brand = "애플";
        computer2.cpu = 20;

        System.out.println("Computer2 brand : " + computer2.brand);
        System.out.println("Computer brand : " + Computer.brand);
        System.out.println("Computer2 cpu : " + computer2.cpu);

        System.out.println("----------------");
        System.out.println("Computer brand : " + computer.brand);
        System.out.println("Computer brand : " + Computer.brand);
        System.out.println("Computer cpu : " + computer.cpu);
    }
}
