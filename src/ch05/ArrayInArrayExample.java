package ch05;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        System.out.println(arr.length);   // 줄수 (여기서는2) 가 뜸
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        arr[1][1] = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("(%d, %d) : %d\t", i, j, arr[i][j]);
            }
            System.out.println();
        }
    }
}
