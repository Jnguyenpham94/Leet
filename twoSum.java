public class twoSum {

    /**
     * 
     * @param nums array of elements
     * @param target value to be add the 2 values to
     * @return 
     */
    // {3,2,4}
    public int[] sumTwo(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    index[0] = i;
                    index[1] = k;
                    System.out.println(index[0]);
                    System.out.println(index[1]);
                    return new int[] { i, k };
                }
            }
        }
        return new int[] {};
    }

}