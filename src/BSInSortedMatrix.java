public class BSInSortedMatrix {

    public static void main(String[] args) {

    }

    static int[] BS(int[][] arr, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + ( cEnd - cStart ) / 2;
            if (arr[row][mid] == target) {
                return  new int[] {row, mid};
            } else if(arr[row][mid] > target){
                cEnd = mid - 1;
            }else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] FindAns(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
           return BS(matrix, 0, 0, cols - 1, target);
        }
        return new int[] {-1, -1};
    }
}
