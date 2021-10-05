package other;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        int removeVal = list.remove(0);

        System.out.println("removeVal : " + removeVal);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("(%d) - %d\n", i, list.get(i));
        }

//        MyArrayList myList = new MyArrayList();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.print();

    }
}
