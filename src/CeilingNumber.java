public class CeilingNumber {

    public static void main(String[] args) {
        char[] nums = {'a', 'c', 'd', 'e'};
        char target ='e';

        System.out.println(FindCeiling(nums, target));
    }

    static char FindCeiling(char[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        if(target >= nums[end]){
            return nums[start];
        }
        while (start <= end){
            int mid = start + (end - start) / 2 ;
//            System.out.println("Start is " + start + " end is " + end + " mid is " + mid);
            if(target == nums[mid]) {
                return nums[mid + 1];
            }
            if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
