public class ReplaceElement {
    
    /**
     * 
     * @param arr array of elements
     * @return Given an array arr, replace every element in 
     * that array with the greatest element among the elements to its right, 
     * and replace the last element with -1.
     */
    public int[] replaceElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        int greatest = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                
            }
        }
        return arr;
        
    }
}
