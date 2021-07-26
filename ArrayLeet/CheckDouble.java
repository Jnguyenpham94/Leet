package ArrayLeet;
import java.util.HashSet;
import java.util.Set;

public class CheckDouble {
    /**
     * 
     * @param arr array of elements {3,1,7,11}
     * @return true if a double of a value exists false other
     */
    public boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        Set<Integer> array = new HashSet<Integer>();
        for (int i : arr) {
            if(array.contains(2 * i) || i % 2 == 0 && array.contains(i/2)){
                System.out.println("TRUE");
                return true;
            }
            array.add(i);
        }
        System.out.println("FALSE");
        return false;
    }
}
