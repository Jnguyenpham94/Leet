import java.util.Arrays;

public class HeightChecker {
    
    /**
     * 
     * @param heights array of student heights
     * @return number of indices that are in the correct location
     * {1,1,4,2,1,3}
     * expected {1,1,1,2,3,4}
     * return 3 for the three values in the unexpected location
     */
    public int heightChecker(int[] heights) {
        int [] expected = heights.clone();
        Arrays.sort(expected);
        int output = 0;
        for (int i = 0; i < heights.length; i++) {
            if(expected[i] != heights[i]){
                output++;
            }
        }
        System.out.println("OUTPUT: " + output + "\n");
        PrintStuff pr = new PrintStuff();
        pr.printArray(expected);
        return output;
    }

    /**
     * 
     * @param nums array of numbers
     * @return the third highest value but iff there are 3 max values
     * @return the max value if less than 3 max values
     * 2,2,3,1
     * EXPECTED 1
     */
    public int thirdMax(int[] nums) {
        int first = 0; //greatest
        int second = 0; //second
        int third = 0; // third largest values
        Arrays.sort(nums);
        if(nums.length < 3){
            return 0;
        }
        first = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > first){
                first = nums[i];
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] > second && nums[j] < first){
                second = nums[j];
            }
        }
        for(int k = 0; k < nums.length; k++){
            if(nums[k] > third && nums[k] < second){
                third = nums[k];
            }
        }
        if(nums.length > 3){
            return first;
        }
        else{
            return Math.max(first, Math.max(second, third));
        }
    }
}
