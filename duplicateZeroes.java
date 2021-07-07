public class duplicateZeroes {
    
    //{1,0,2,3,0,4,5,0}
    //EXPECTED:{1,0,0,2,3,0,0,4}
    public void duplicateZeros(int[] arr) {
        int [] copy = arr.clone();
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 0){
                arr[i+1] = 0;
                if(i != arr.length){
                    System.arraycopy(copy, copy[i+1], arr, arr[i+1], arr.length);
                }
            }
        }
        arrayPrint(arr);
    }

    public void arrayPrint(int [] arr){
        for (int i : arr) {
            System.out.println(i);
        }
}
}
