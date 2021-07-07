public class duplicateZeroes {
    
    //{1,0,2,3,0,4,5,0}
    public void duplicateZeros(int[] arr) {
        int [] copy = arr.clone();
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 0){
                arr[i+1] = 0;
                System.arraycopy(src, srcPos, dest, destPos, length);
            }
        }
    }
}
