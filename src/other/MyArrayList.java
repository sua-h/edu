package other;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int val) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = val;

        arr = temp;
    }

//    public void print() {
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d", arr[i]);
//            if (i != (arr.length - 1)) {
//                System.out.print(", ");
//            }
//        }
//        System.out.print("]");
//    }
}
