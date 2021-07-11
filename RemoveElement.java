public class RemoveElement {
    /**
     * 
     * @param nums array of elements {0,1,2,2,3,0,4,2}
     * EXPECTED nums = {0,1,4,0,3,_,_,_}
     * @param val = 3 element(s) to be removed from nums 
     * @return k = number of values remaining in nums
     */
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
