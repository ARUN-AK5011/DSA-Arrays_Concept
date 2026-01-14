public class SQRT {
    public static void main(String[] args) {
        System.out.println(FindSqrt(8));
    }

    static int FindSqrt(int x){
        int start = 1;
        int end = x / 2;
        int ans = 0;

        while(start <= end){
            int mid = start + ( end - start ) / 2;
            if((long) mid * mid == x){
                return mid;
            }else if((long) mid * mid < x){
                ans = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
