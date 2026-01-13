public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {22, 21, 19, 18, 15, 13, 13, 7, 6, 3};
        int target = 3;

        if(nums[0] > nums[nums.length - 1]){
            System.out.println(DSCBS(nums, target));
        }else{
            System.out.println(ASCBS(nums, target));
        }

    }

    static int ASCBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end ) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }else if (nums[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int DSCBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end ) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
