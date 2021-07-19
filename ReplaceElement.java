public class ReplaceElement {
    
    /**
     * 
     * @param arr array of elements
     * @return Given an array arr, replace every element in 
     * that array with the greatest element among the elements to its right, 
     * and replace the last element with -1.
     * array  = {17,18,5,4,6,1}
     * EXPECTED {18,6,6,6,1,-1}
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
            greatest = current;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > current){
                    greatest = arr[j];
                }
            }
            arr[i] = greatest;
        }
        //for the end arr value == -1
        if(arr[arr.length-1] != -1){
            arr[arr.length-1] = -1;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        return arr;
        
    }
}
