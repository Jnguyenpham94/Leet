public class duplicateZeroes {
    
    //copy:{1,0,2,3,0,4,5,0}
    //EXPECTED arr:{1,0,0,2,3,0,0,4}
    public void duplicateZeros(int[] arr) {
        int [] copy = arr.clone();
        int temp = 0;
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i] == 0){
                arr[i+1] = 0;
                temp = i + 1;
                for(int j = i+1; j < copy.length-1;j++){
                    arr[j+1] = copy[temp];
                    temp++;
                }
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
