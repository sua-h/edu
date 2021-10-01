package ch05;

public class ArrayInArrayExample2 {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0},
                {0, 0, 0}
        };

        // 배열 마다 값의 갯수를 다르게 할 수 있음. 추천은 X
        int[][] arr2 = {
                {0, 0, 0, 0},
                {0, 0, 0},
                {0, 0, 0, 0}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("(%d, %d) : %d\t", i, j, arr[i][j]);
            }
            System.out.println();
        }
    }
}
