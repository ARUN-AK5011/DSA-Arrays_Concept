public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 42, 41, -9 };
        System.out.println(Min(arr));
    }

    static int Max(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        return index;
    }

    static int Min(int[] arr) {
        int minimum_value = Integer.MAX_VALUE;
        if(arr.length == 0){
            return minimum_value;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minimum_value){
                minimum_value = arr[i];
            }
        }

        return minimum_value;
    }
}
