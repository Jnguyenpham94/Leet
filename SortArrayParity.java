public class SortArrayParity {
    /**
     * 
     * @param nums array of numbers
     * @return array with all evens and then odds from nums
     * nums:      {3,1,2,4}
     * EXPECTED : {2, 4, 3, 1}
     */
    public int[] sortArrayByParity(int[] nums) {
        int [] evens = new int[nums.length]; //contains all even values 
        int [] odds = new int[nums.length]; //contains all odd values
        int ev = 0;
        int od = 0;
        for (int i : nums) {
            if(i % 2 == 0){
                evens[ev++] = i;
            }
            else{
                odds[od++] = i;
            }
        }
        //load in the values
        for(int j = ev; j ; j--){
            nums[j] = evens[j];
        }
        return nums;
    }
}
