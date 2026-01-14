import java.util.Arrays;

public class BSIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {13, 23, 33, 43},
                {16, 26, 36, 46},
                {19, 29, 39, 49}
        };

        System.out.println(Arrays.toString(SearchTarget(arr, 1)));
    }

    static int[] SearchTarget(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[] {row, col};
            }else if(arr[row][col] < target){
                row++;
            }else {
                col --;
            }
        }

        return new int[] {-1, -1};
    }
}
