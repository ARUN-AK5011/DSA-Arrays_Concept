public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,5,6,7,0,0,1,2};
        int target = 0;
        System.out.println(Handler(arr, target));
    }

    static int Handler(int[] nums, int target){
        int Pivot = findPivot(nums);
        System.out.println("Attempt 1: Find value in the first half, the start index is "+ 0 + " " + "end will be " + Pivot);
        int ans = FindTarget(nums, 0, Pivot, target);
        if(ans == -1){
            int start = Pivot + 1;
            int end = nums.length - 1;
            System.out.println("Element not found in the first half");
            System.out.println("Attempt 2: Find value in the first half, the start index is "+ start + " " + "end  will be" + end);

            ans = FindTarget(nums, start, nums.length -1, target);
        }
        return ans;
    }

    static int FindTarget(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            System.out.println("FROM THE BEGINNING THE START WILL " + start + " MID WILL BE " + mid + " END WILL BE " + end);
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                System.out.println("MID VALUE WILL BE " + arr[mid] + " TARGET WILL BE" + target);
                start = mid + 1;
                System.out.println("UPDATED START WILL BE " + start);
            }else {
                end = mid -1;
                System.out.println("NONE OF THIS SATISFIED, UPDATED END WILL BE " + end);

            }
        }

        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start  <= end ){
          int mid = start + (end - start) / 2;
          if( mid < end && arr[mid] > arr[mid + 1]){
              return mid;
          }else if( mid > start && arr[mid] < arr[mid -1]){
                return  mid - 1;
          }else if(arr[mid] <= arr[start]){
              end = mid -1;
          }else {
              start = mid + 1;
          }
        }
        return -1;
    }
}
