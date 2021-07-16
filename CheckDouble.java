
public class CheckDouble {
    /**
     * 
     * @param arr array of elements {3,1,7,11}
     * @return true if a double of a value exists false other
     */
    public boolean checkIfExist(int[] arr) {
        // TODO: {1 3 7 11} should be true
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]*2 || arr[i] == arr[j]/2) {
                    System.out.println("TRUE");
                    System.out.println(i);
                    return true;
                }
            }
        }
        System.out.println("FALSE");
        return false;
    }
}
