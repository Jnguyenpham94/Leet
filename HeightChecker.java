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
     * @return the max value
     * 2,2,3,1
     * EXPECTED 1
     */
    public int thirdMax(int[] nums) {
        int [] thirdMax = new int[3];
        for (int i : nums) {
            if(i > )
        }
        return 0;
    }
}
