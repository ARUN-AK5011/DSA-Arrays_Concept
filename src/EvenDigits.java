public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(EvenDigitCount(arr));
    }

    static int EvenDigitCount(int[] arr){
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if(IsEven(arr[i])){
                ans ++;
            }
        }
        return ans;
    }
    static boolean IsEven(int digits){
        int count = 0;
        while (digits > 0){
            count ++;
            digits = digits / 10;
        }

        return count % 2 == 0;
    }
}
