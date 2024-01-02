package leetcode;

/**
 * @author Picker
 * @date 2022/4/11 0:34
 */
public class leetcode_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length + nums2.length];
        int a = 0, b = 0;
        while (a < nums1.length&&b < nums2.length) {

            if (nums1[a] >= nums2[b]) {
                num[a + b] = nums2[b];
                b++;
            }
            if (nums1[a] < nums2[b]) {
                num[a + b] = nums1[a];
                a++;
            }


        }
        
        if (a == nums1.length-1) {
            num[a + b] = nums2[b];
            b++;
        }
        if (b == nums2.length-1) {
            num[a + b] = nums1[a];
            a++;
        }
        int n = num.length;
        if (n / 2 == 0) {
            double t = (num[(n/2) - 1] + num[n/2] )/ 2;
            return t;
        } else {
            return (double) num[n / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        double n =findMedianSortedArrays(nums1,nums2);
        System.out.println(n);
    }
}
