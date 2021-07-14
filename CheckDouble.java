import java.util.Arrays;

public class CheckDouble {
    /**
     * 
     * @param arr array of elements {10,2,5,3}
     * @return true if a double of a value exists false other
     */
    public boolean checkIfExist(int[] arr) {
        //TODO: negative value did not work -->{-10,12,-20,-8,15}
        if(arr == null || arr.length == 0){
            return false;
        }
        Arrays.sort(arr);//{-20,-10,,-8,12,15}
        for(int i = 0; i < arr.length -1;i++){
            int m = arr[i] * 2;
            if(arr[i] < 0){//accounts for negative values
                for(int j = arr.length -i; j >= 0; j--){
                    m = arr[j]/2;
                }
            }
            System.out.println(arr[i]);
            for(int k = i+1; k < arr.length; k++){
                if(m == arr[k]){
                    return true;
                }
            }
        }
        return false;
    }
}
