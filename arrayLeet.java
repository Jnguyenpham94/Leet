public class arrayLeet{
    
    public int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to 
        // keep track of how many 1's you've seen in a row.
        int count = 0;
        int [] size = new int[5];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            // Do something with element nums[i].
            if(nums[i] == 1){
                count++;
            }
            else if(nums[i] == 0){
                size[j] = count;
                j++;
            }
        }
        int max = 0;
        for(int temp : size){
            if(temp >= max){
                max = temp;
            }
        }
        return max;
    }
}

