package ArrayLeet;
import java.util.Arrays;

public class sortedSquares {
    /**
     * 
     * @param nums array of elements
     * @return array values squared and sorted by asc
     */
    public int[] sortedSquareArray(int[] nums) {
        
        for(int i = 0; i < nums.length;i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
            System.out.println(nums[i]);
        }
        return nums;
    }
}
