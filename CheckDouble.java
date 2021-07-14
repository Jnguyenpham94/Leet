import java.util.Arrays;

public class CheckDouble {
    /**
     * 
     * @param arr array of elements {10,2,5,3}
     * @return true if a double of a value exists false other
     */
    public boolean checkIfExist(int[] arr) {
        if(arr == null || arr.length == 0){
            return false;
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length -1;i++){
            int m = arr[i] * 2;
            System.out.println(arr[i]);
            for(int j = i+1; j < arr.length; j++){
                if(m == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
