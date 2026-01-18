public class FindMinInRSA {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println(FindAnswer(arr));
    }

    static int FindAnswer(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start  <= end ){
            int mid = start + (end - start) / 2;
            System.out.println("START IS " + nums[start] + " MID IS " + nums[mid] + " END WILL BE " + nums[end]);
            if( mid < end && nums[mid] > nums[mid + 1]){
                System.out.println(" CASE 1 :START IS " + nums[start] + " MID IS " + nums[mid] + " END WILL BE " + nums[end]);
                return nums[mid];
            }else if( mid > start && nums[mid] < nums[mid -1]){
                System.out.println(" case 2 : START IS " + nums[start] + " MID IS " + nums[mid] + " END WILL BE " + nums[end]);
                return  nums[mid];
            }else if(nums[mid] <= nums[start]){
                System.out.println("CASE 3 : START IS " + nums[start] + " MID IS " + nums[mid] + " END WILL BE " + nums[end]);
                end = mid -1;
            }else {
                System.out.println("CASE 4 : START IS " + nums[start] + " MID IS " + nums[mid] + " END WILL BE " + nums[end]);
                start = mid + 1;
            }
        }

        return nums[start] < nums[0] ? nums[start] : nums[0];
    }
}