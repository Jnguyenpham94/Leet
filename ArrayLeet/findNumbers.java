package ArrayLeet;
public class findNumbers {
    /**
     * 
     * @param nums array of elements
     * @return the number of elemenents that have even number of digits
     */
    public int findEvenNumbers(int[] nums) {
        int count = 0;
        int digit = 0;
        for(int i = 0; i < nums.length;i++){
            while(nums[i] >= 1){
                nums[i] = nums[i]/10;
                digit++;
            }
            if(digit % 2 == 0){
                count++;
            }
            digit = 0;
        }
        System.out.println(count);
        return count;
    }
}
