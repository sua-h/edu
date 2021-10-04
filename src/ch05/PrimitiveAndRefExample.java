package ch05;

public class PrimitiveAndRefExample {
    public static void main(String[] args) {
        int val = 10;

        Box box1 = new Box();
        box1.val = 10;

        System.out.println("val : " + val);
        changeVal(val);
        System.out.println("val : " + val);

        System.out.println("--------------");

        Box box2 = box1;
        box2.val = 120; // box1 과 box2 는 같은 주소값을 가르키기 때문에 값이 변한다.

        // 주소값을 넘겨주게 되면 주소에게 영향을 미친다.
        System.out.println("box.val : " + box1.val);
        System.out.println("box2.val : " + box2.val);
        changeVal(box1);
        System.out.println("box.val : " + box1.val);
        System.out.println("box2.val : " + box2.val);
    }

    public static void changeVal(int pVal) {
        pVal = 30;
    }

    public static void changeVal(Box pBox) {
        pBox.val = 30;
    }
}

class Box {
    int val;
}

