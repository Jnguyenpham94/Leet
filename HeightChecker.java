import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HeightChecker {

    /**
     * 
     * @param heights array of student heights
     * @return number of indices that are in the correct location {1,1,4,2,1,3}
     *         expected {1,1,1,2,3,4} return 3 for the three values in the
     *         unexpected location
     */
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int output = 0;
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {
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
     * @return the max value if less than 3 max values 2,2,3,1 EXPECTED 1
     */
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num : nums) {
            if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }

            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == null) {
            return max;
        }
        return thirdMax;
    }

    /**
     * 
     * @param nums array of numbers
     * @return numbers missing from 1 to n in the list
     * actual : { 4, 3, 2, 7, 8, 2, 3, 1 }
     * Sorted : { 1, 2, 2, 3, 3, 4, 7, 8 }
     * Missing :{ 5, 6 }
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a = new ArrayList<>();
        HashSet<Integer> numsSet = new HashSet<>();
        for (int i : nums) {
            numsSet.add(i);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!numsSet.contains(i)){
                a.add(i);
            }
        }
        PrintStuff pr = new PrintStuff();
        pr.printArray(a);
        return a;
    }
}
