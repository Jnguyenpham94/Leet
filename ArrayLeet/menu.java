package ArrayLeet;

import java.util.Scanner;

import Recursive.ReverseString;

//s = ["h","e","l","l","o"]
/**
 * class for the menu options to run in main
 */
public class menu {

    public void mainMenuChoices() {
        System.out.println("0. EXIT");
        System.out.println("1. Array stuff");
        System.out.println("2. Recursive stuff");
    }

    public void arrayChoices1() {
        System.out.println("0. EXIT");
        System.out.println("1. find Max Consecutive.");
        System.out.println("2. Two Sum");
        System.out.println("3. Find even numbers");
        System.out.println("4. Find sorted squares");
        System.out.println("5. Duplicate zeros");
        System.out.println("6. Merge and sort 2 arrays");
        System.out.println("7. Remove chosen value from array");
        System.out.println("8. Remove dups from array");
        System.out.println("9. Next Page");
    }

    public void arrayChoices2() {
        System.out.println("0. EXIT");
        System.out.println("1. Check if double exists");
        System.out.println("2. Valid mountain array");
        System.out.println("3. Replace Element");
        System.out.println("4. Move Zeroes");
        System.out.println("5. Sort by Parity");
        System.out.println("6. Height Checker");
        System.out.println("7. Third max");
        System.out.println("8. Find Disappeared Numbers");
    }

    public void mainMenu() {
        Scanner in = new Scanner(System.in);
        mainMenuChoices();
        int choice = in.nextInt();
        switch (choice) {
            case 0:
                System.out.println("GOODBYE");
                in.close();
                System.exit(0);
            case 1:
                arrayMenu();
                break;
            case 2:
                recursiveMenu();
                break;
            default:
                in.close();
                break;
        }
    }

    public void arrayMenu() {
        Scanner in = new Scanner(System.in);
        arrayChoices1();
        int choice = in.nextInt();
        switch (choice) {
            case 0:
                System.out.println("GOODBYE");
                in.close();
                System.exit(0);
            case 1:
                int[] array = { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, };
                ConsecutiveOnes test = new ConsecutiveOnes();
                test.findMaxConsecutiveOnes(array);
                break;
            case 2:
                twoSum test2 = new twoSum();
                int[] nums = { 2, 7, 11, 15 };
                int target = 9;
                System.out.println("SumTwo: ");
                test2.sumTwo(nums, target);
                break;
            case 3:
                System.out.println("find Even numbers: ");
                findNumbers test3 = new findNumbers();
                int[] array2 = { 12, 345, 2, 6, 7896 };
                test3.findEvenNumbers(array2);
                break;
            case 4:
                sortedSquares test4 = new sortedSquares();
                System.out.println("find sorted squares: ");
                int[] array3 = { -4, -1, 0, 3, 10 };
                test4.sortedSquareArray(array3);
                break;
            case 5:
                duplicateZeroes test5 = new duplicateZeroes();
                int[] arr4 = { 1, 0, 2, 3, 0, 4, 5, 0 };
                test5.duplicateZeros(arr4);
            case 6:
                Merge test6 = new Merge();
                int[] merge1 = { 1, 2, 3, 0, 0, 0 };
                int[] merge2 = { 2, 5, 6 };
                int m = 3;
                int n = 3;
                test6.merge(merge1, m, merge2, n);
            case 7:
                RemoveElement test7 = new RemoveElement();
                int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
                int val = 3;
                test7.removeElement(nums2, val);
            case 8:
                RemoveDuplicates test8 = new RemoveDuplicates();
                int[] nums3 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
                test8.removeDuplicates(nums3);
            case 9:
                arrayMenu2();
            default:
                in.close();
                break;
        }
    }

    public void arrayMenu2() {
        Scanner in = new Scanner(System.in);
        arrayChoices2();
        int choice = in.nextInt();
        switch (choice) {
            case 0:
                System.out.println("GOODBYE");
                in.close();
                System.exit(0);
            case 1:
                CheckDouble test9 = new CheckDouble();
                int[] num4 = { 3, 1, 7, 11 };
                test9.checkIfExist(num4);
            case 2:
                ValidMoutainArray test10 = new ValidMoutainArray();
                int[] num5 = { 0, 3, 2, 1 };
                test10.validMountainArray(num5);
            case 3:
                ReplaceElement test1 = new ReplaceElement();
                int[] arr = { 17, 18, 5, 4, 6, 1 };
                test1.replaceElements(arr);
                break;
            case 4:
                MoveZeroes test2 = new MoveZeroes();
                int[] nums = { 0, 1, 0, 3, 12 };
                test2.moveZeroes(nums);
            case 5:
                SortArrayParity test3 = new SortArrayParity();
                int[] nums2 = { 3, 1, 2, 4 };
                test3.sortArrayByParity(nums2);
            case 6:
                HeightChecker test4 = new HeightChecker();
                int[] heights = { 1, 1, 4, 2, 1, 3 };
                test4.heightChecker(heights);
            case 7:
                HeightChecker test5 = new HeightChecker();
                int[] nums3 = { 2, 2, 3, 1 };
                test5.thirdMax(nums3);
            case 8:
                HeightChecker test6 = new HeightChecker();
                int[] nums4 = { 4, 3, 2, 7, 8, 2, 3, 1 };
                test6.findDisappearedNumbers(nums4);
            default:
                in.close();
                break;
        }
    }

    public void recursiveMenu() {
        Scanner in = new Scanner(System.in);
        recursiveMenu();
        int choice = in.nextInt();
        switch (choice) {
            case 0:
                System.out.println("GOODBYE");
                in.close();
                System.exit(0);
            case 1:
                char[] s = { 'h', 'e', 'l', 'l', 'o' };
                ReverseString test1 = new ReverseString();
                test1.reverseString(s);
                break;
            default:
                in.close();
                break;
        }
    }
}