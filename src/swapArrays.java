import java.util.Arrays;

public class swapArrays {
    public static void main(String[] args) {
        int[] arr = {23, 12, 43, 75, 34};

        Swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));
    }

    static void Swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
