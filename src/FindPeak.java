public class FindPeak {
    public static void main(String[] args) {

        int[] arr = {-2147483648, -2147483647};
//        System.out.println(PeakInMountainArray(arr));
        int target = 59;
        System.out.println(findPeakElement(arr));
    }


    static int FindElement(int[] mountainArr, int target){
        int start = 0;
        int end = PeakInMountainArray(mountainArr);
        System.out.println("Peak value " + mountainArr[end]);
        int index = SearchElement(mountainArr, target, start, end, true);
        System.out.println("final value" + index );
        if (index == -1) {
            index = SearchElement(mountainArr, target, end, mountainArr.length - 1, false);
        }

        return index;
    }

    static int SearchElement(int[] arr, int target, int start, int end, Boolean isAsc){
        while(start <= end){
            int mid = start + ( end - start) / 2;
            System.out.println(" start will be " + arr[start] +  "  end will be "+ arr[end] + " mid will be " + arr[mid]);

            if(isAsc){
                if (target == arr[mid]) {
                    return mid;
                }else if(target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target == arr[mid]) {
                    return mid;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }else {
                   end = mid - 1;
                }
            }

        }
        return  -1;
    }

    static int PeakInMountainArray (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int peak = -1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
               peak = mid;
               end = mid;
            }else if(arr[mid] < arr[mid + 1]){
                peak = mid + 1;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return peak;
    }

    static int findPeakElement(int[] nums) {
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

        return start;
    }
}
