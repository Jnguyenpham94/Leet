public class InsertionSort {
    

    public static void main(String[] args) {

        int [] arr = {8,3,6,8,2,1,7,5,12,52,20};
        sort(arr);

        PrintStuff pr = new PrintStuff();
        pr.printArray(arr);
        
    }
    
    /**
     * 
     * @param arr array of numbers
     * sorted in ascending order
     */
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
