public class twoSum {

    int [] index = {0,0};
    
    public int[] sumTwo(int[] nums, int target) {
        int sum = 0;

        if(sum != target){
            for(int i = 0; i < nums.length - 1;i++){
                index[0] = i;
                for(int k = 1; k< nums.length - 1;k++){
                    if(sum != target){    
                        index[1] = k; 
                        sum = nums[i] + nums[k];
                    }
                }
            }
        }
        System.out.println(index[0]);
        System.out.println(index[1]);
        return index;
}

}