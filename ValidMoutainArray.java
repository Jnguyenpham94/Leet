public class ValidMoutainArray {
    /**
     * 
     * @param nums array of elements to check
     * @return 
     */
    public boolean validMountainArray(int[] nums) {
        int N = nums.length;
        int i = 0;

        // walk up
        while (i+1 < N && nums[i] < nums[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && nums[i] > nums[i+1])
            i++;

        return i == N-1;
    }
}
