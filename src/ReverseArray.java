import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 42, 41, 9, 10 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            Swap(arr, start, end);
            start ++;
            end --;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void Swap(int[] arr, int start, int end ){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
