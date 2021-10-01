package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1;   // 얕은 복사 (shallow copy) - 주소 값을 복사한다. 같은 공간을 가르킴.

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        arr2[0] = 5;

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        System.out.println(arr1 == arr2);   // 주소값이 같이 때문 (레퍼런스 변수의 특징)
    }
}
