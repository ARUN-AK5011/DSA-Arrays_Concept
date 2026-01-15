public class FindMinInRSA {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println(FindAnswer(arr));
    }

    static int FindAnswer(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }

        if(start < nums.length - 1){
            return nums[start + 1];
        }else {
            return nums[0];
        }
    }
}