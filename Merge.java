import java.util.Arrays;

public class Merge {
    
    /**
     * 
     * @param nums1 {1,2,3,0,0,0}
     * @param m number of ints in nums1
     * @param nums2 {2,5,6}
     * @param n number of ints in nums2
     * EXPECTED nums1: {1,2,2,3,5,6}
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, nums1.length-n, n);
        Arrays.sort(nums1);
        arrayPrint(nums1);
    }

    public void arrayPrint(int [] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}