public class twoSum {

    int [] index = {0,0};
    
    public int[] sumTwo(int[] nums, int target) {
        int sum = 0;

        if(sum != target){
            for(int i = 0; i < nums.length - 1;i++){
                for(int k = 1; k< nums.length - 1;k++){
                    if(sum != target){
                        index[0] = i;
                        index[1] = k; 
                        sum = nums[i] + nums[k];
                    }
                }
            }
        }
        System.out.println(index.toString());
        return index;
}

    /*overrides toString for the above 
    to show the index values in String format [#,#]
    */
    @Override
    public String toString() {
        return "[" + index[0] + ", " + index[1] + "]";
    }
}