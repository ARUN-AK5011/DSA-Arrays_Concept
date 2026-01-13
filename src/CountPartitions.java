import com.sun.source.tree.ReturnTree;

public class CountPartitions {
    public static void main(String[] args) {
        int[] arr = {10,10,3,7,6};
        System.out.println(countPartition(arr));
    }

    static int countPartition(int[] arr) {
        int ans = 0;
        int sumOfLeft = 0;
        int sumOfRight = 0;
        int SOL = 0;
        int SOR = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (SOL = 0; SOL < i + 1; SOL++) {
                sumOfLeft += arr[SOL];
            }
            System.out.println("Left round  " + i + " value "+ sumOfLeft );

            for (SOR = SOL; SOR < arr.length ; SOR++) {
               sumOfRight += arr[SOR];
            }
            System.out.println("Right round  " + i + " value "+ sumOfRight );

            int difference = sumOfLeft - sumOfRight;
            if (difference % 2 == 0){
                ans ++;
            }

            sumOfLeft = 0;
            sumOfRight = 0;
        }
        return ans;
    }
}
