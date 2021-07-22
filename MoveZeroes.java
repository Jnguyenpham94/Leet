public class MoveZeroes {

    /**
     * 
     * @param nums array of ints 
     * nums: 0,1,0,3,12 
     * expected : 1,3,12,0,0
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int lastSeenZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastSeenZero++] = nums[i];
            }
        }
        for(int j = lastSeenZero; j < nums.length;j++){
            nums[j] = 0;
        }

        //PrintStuff pr = new PrintStuff();
        //pr.printArray(nums);

    }
}
