public class twoSum {

    //{3,2,4}
    public int[] sumTwo(int[] nums, int target) {
            for(int i = 0; i < nums.length;i++){
                for(int k = i+1; k< nums.length;k++){
                    if(nums[i] + nums[k] == target){
                        return new int [] {i,k};
                    }
                    }
            }
        //System.out.println(index[0]);
        //System.out.println(index[1]);
        return new int [] {};
}

}