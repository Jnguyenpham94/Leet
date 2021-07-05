public class findNumbers {
    
    public int findEvenNumbers(int[] nums) {
        int count = 0;
        int digit = 0;
        int temp = 0;
        for(int i = 0; i < nums.length;i++){
            temp = nums[i];
            while(temp >= 1){
                temp = temp/10;
                digit++;
            }
            if(digit % 2 == 0){
                count++;
            }
            digit = 0;
        }
        System.out.println(count);
        return count;
    }
}
