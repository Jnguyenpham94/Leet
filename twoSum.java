public class twoSum {

    //{3,2,4}
    public int[] sumTwo(int[] nums, int target) {
        int sum = 0;
        int [] index = {0,0};
        if(sum != target){
            for(int i = 0; i < nums.length;i++){
                if(sum != target){
                index[0] = i;
                for(int k = i+1; k< nums.length;k++){
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