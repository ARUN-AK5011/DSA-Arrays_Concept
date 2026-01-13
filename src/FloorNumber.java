public class FloorNumber {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 9, 11, 14, 16};
        int target = 12;

        System.out.println(FloorSearch(nums, target));
    }

    static int FloorSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start) / 2;
            System.out.println("Start is " + start + " end is " + end + " mid is " + mid);

            if(arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return arr[end];
    }
}
