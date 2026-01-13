import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(FindWealth(arr));
    }

    static int FindWealth(int[][] accounts){
        int ans = 0;

        for (int row = 0; row < accounts.length; row++) {
            int wealth = 0;

            for (int col = 0; col < accounts[row].length; col++) {
                wealth += accounts[row][col];
            }

            if(wealth > ans){
                ans = wealth;
            }

        }
        return ans;
    }
}
