import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[][] arr2d =  new int[3][2];
//
//        for (int row = 0; row < arr2d.length; row++) {
//            for (int col = 0; col < arr2d[row].length; col++) {
//                arr2d[row][col] = in.nextInt();
//            }
//        }
//
//        for (int[] row : arr2d) {
//            System.out.println(Arrays.toString(row));
//        }

        int[][] two2darray = {
                {1, 5, 32, 2},
                {12, 3, 10},
                {9, 7, 0, 11, 13}
        };

        int[] ans = Search2dArr(two2darray, 131);

        System.out.println(Arrays.toString(ans));
    }

    static int[] Search2dArr(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
