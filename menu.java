import java.util.Scanner;

public class menu {

    public void menuChoices(){
        System.out.println("1. find Max Consecutive.");
        System.out.println("2. Two Sum");
        System.out.println("3. Find even numbers");
        System.out.println("4. Find sorted squares");
        System.out.println("5. Duplicate zeros");
    }
    
    public void mainMenu(){
        Scanner in = new Scanner(System.in);
        menuChoices();
        int choice = in.nextInt();
        switch(choice){
            case 1:
            int [] array = {1,1,1,1,0,1,1,1,1,1,};
            arrayLeet test = new arrayLeet();
            test.findMaxConsecutiveOnes(array);
            break;
            case 2:
            twoSum test2 = new twoSum();
            int [] nums = {2,7,11,15};
            int target = 9;
            System.out.println("SumTwo: ");
            test2.sumTwo(nums, target);
            break;
            case 3:
            System.out.println("find Even numbers: ");
            findNumbers test3 = new findNumbers();
            int [] array2 = {12,345,2,6,7896};
            test3.findEvenNumbers(array2);
            break;
            case 4:
            sortedSquares test4 = new sortedSquares();
            System.out.println("find sorted squares: ");
            int [] array3 = {-4,-1,0,3,10};
            test4.sortedSquareArray(array3);
            break;
            case 5:
            duplicateZeroes test5 = new duplicateZeroes();
            int [] arr4 = {1,0,2,3,0,4,5,0};
            test5.duplicateZeros(arr4);
            default:
            in.close();
        }

    }
}
