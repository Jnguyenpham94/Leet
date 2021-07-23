public class SortArrayParity {
    /**
     * 
     * @param nums array of numbers
     * @return array with all evens and then odds from nums
     * nums:      {3,1,2,4}
     * EXPECTED : {2, 4, 3, 1}
     */
    public int[] sortArrayByParity(int[] nums) {
        int [] nums2 = new int[nums.length]; //contains all even values 
        int ev = 0;
        for (int i : nums) {
            if(i % 2 == 0){
                nums2[ev++] = i;
            }
            else{
                nums2[ev++] = i;
            }
        }
        //load in the values
        int endOdd = nums.length - 1;//stores location of end for odd values
        int even = 0;//stores location where even values begins
        for(int j = 0; j < nums2.length ; j++){
            if(nums2[j] % 2 == 0){
                nums[even++] = nums2[j];
            }
            else{
                nums[endOdd--] = nums2[j];
            }
        }
        PrintStuff pr = new PrintStuff();
        pr.printArray(nums);
        return nums;
    }
}
