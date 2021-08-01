import java.util.List;

public class PrintStuff {
    
    public void printArray(int [] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void printArray(List<Integer> a) {
        for (Integer i : a) {
            System.out.print(i + " ");
        }
    }
}
