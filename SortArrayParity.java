public class SortArrayParity {
    /**
     * 
     * @param nums array of numbers
     * @return array with all evens and then odds from nums
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
        return nums;
    }
}
