public class FindElementInInfinityArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        int target = 12;
        System.out.println(FindIndex(arr, target));
    }

    static int FindIndex(int[] arr, int target){
        int start = 0;
        int end = 5;

        while (start < end){
            if (arr[end] == target) return end;
            if(arr[end] < target){
                start = end + 1;
                end += 5;
            }
            int mid = start + ( end - start) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
