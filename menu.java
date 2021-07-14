import java.util.Scanner;

/**
 * class for the menu options to run in main
 */
public class menu {

    public void menuChoices(){
        System.out.println("1. find Max Consecutive.");
        System.out.println("2. Two Sum");
        System.out.println("3. Find even numbers");
        System.out.println("4. Find sorted squares");
        System.out.println("5. Duplicate zeros");
        System.out.println("6. Merge and sort 2 arrays");
        System.out.println("7. Remove chosen value from array");
        System.out.println("8. Remove dups from array");
        System.out.println("9. Check if double exists");
    }
    
    public void mainMenu(){
        Scanner in = new Scanner(System.in);
        menuChoices();
        int choice = in.nextInt();
        switch(choice){
            case 1:
            int [] array = {1,1,1,1,0,1,1,1,1,1,};
            ConsecutiveOnes test = new ConsecutiveOnes();
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
            case 6:
            Merge test6 = new Merge();
            int [] merge1 = {1,2,3,0,0,0};
            int [] merge2 = {2,5,6};
            int m = 3;
            int n = 3;
            test6.merge(merge1, m, merge2, n);
            case 7:
            RemoveElement test7 = new RemoveElement();
            int [] nums2 = {0,1,2,2,3,0,4,2};
            int val = 3;
            test7.removeElement(nums2, val);
            case 8:
            RemoveDuplicates test8 = new RemoveDuplicates();
            int [] nums3 = {0,0,1,1,1,2,2,3,3,4};
            test8.removeDuplicates(nums3);
            case 9:
            CheckDouble test9 = new CheckDouble();
            int [] num4 = {-10,12,-20,-8,15};
            test9.checkIfExist(num4);
            default:
            in.close();
        }

    }
}
