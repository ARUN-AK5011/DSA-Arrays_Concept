import java.util.Arrays;

public class FirstAndLastocuurence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 4, 4, 5, 6, 7};
        int target = 9;

        int[] ans = FindOccurence(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] FindOccurence(int[] nums, int target){

       int startIndex = FindStart(nums, target, true );
       int lastIndex = FindStart(nums, target, false);

       return new int[]{startIndex, lastIndex};
    }

    static int FindStart(int[] nums, int target, boolean isStart){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }else if (nums[mid] < target) {
                start = mid + 1;
            }else {
                ans = mid;
                if(isStart){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
