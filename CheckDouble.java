import java.util.Arrays;

public class CheckDouble {
    /**
     * 
     * @param arr array of elements {10,2,5,3}
     * @return true if a double of a value exists false other
     */
    public boolean checkIfExist(int[] arr) {
        //TODO: supposed to be false got true. -->{-950 -933 -918 -909 -892 -880 -857 -852 -815 -814 -803 -797 -741 -738 -691 -637 -592 -584 -488 -485 -453 -448 -360 -334 -242 -191 -132 -124 -93 -87 -40 26 50 74 88 98 102 250 304 356 360 449 457 461 476 508 522 540 563 639 665 745 750 802 806 833 840 868 881 883 991 999 -950}
        if(arr == null || arr.length == 0){
            return false;
        }
        Arrays.sort(arr);//{-20,-10,,-8,12,15}
        for(int i = 0; i < arr.length -1;i++){
            int m = arr[i] * 2;
            int n = arr[i]/2;
            for(int k = i+1; k < arr.length; k++){
                if(m == arr[k] || n == arr[k]){
                    return true;
                }
            }
        }
        return false;
    }
}
