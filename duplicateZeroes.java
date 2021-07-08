public class duplicateZeroes {
    
    //copy:{1,0,2,3,0,4,5,0}
    //EXPECTED arr:{1,0,0,2,3,0,0,4}
    public void duplicateZeros(int[] arr) {
        int [] copy = arr.clone();
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i] == 0){
                arr[i+1] = 0;
                System.arraycopy(copy, i+1, arr, i+2, arr.length);
                i++;
            }
        }
        arrayPrint(arr);
    }

    public void arrayPrint(int [] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
}
}
