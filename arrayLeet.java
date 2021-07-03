public class arrayLeet{

    //{1,1,0,1,1,1} == 3
    public int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to 
        // keep track of how many 1's you've seen in a row.
        int count = 0;
        int max = 0;
        int count1 = 0;
        int count0 = 0;
        for (int k : nums) {
            // Do something with element nums[i].
            if(k == 1){
                count1++; 
            }
            else if (k == 0){
                count0++;
            }
            if(k == 1){
                count++;
            }
            else{
                if(count >= max){
                    max = count;
                }
                count = 0;
            }
        }
        if(count >= max){
            max = count;
        }
        System.out.println(max);
        System.out.println("1: " + count1);
        System.out.println("0: " + count0);
        return max;
    }
}

