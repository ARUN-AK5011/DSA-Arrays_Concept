//Q NO : 4 Leet code

public class FMSA {
    public static void main(String[] args) {
        int[] m = {2,2,4,4};
        int[] n = {2,2,2,4,4};

        System.out.println(findMedianSortedArrays(m, n));
    }

    static double findMedianSortedArrays(int[]  nums1, int[]nums2){
        double ans = 0;
        int m = nums1.length;
        int n = nums2.length;

        int length = m + n;
        System.out.println("total length " + length);
        for (int i = 0; i < nums1.length; i++) {
            ans += nums1[i];
            System.out.println("1st array value  " + nums1[i] + " ans will be " + ans);
        }

        for (int j = 0; j < nums2.length; j++) {
            ans += nums2[j];
            System.out.println("2nd array value " + nums2[j] + " ans will be " + ans);
        }

        ans = ans / length;
        return ans;
    }
}
