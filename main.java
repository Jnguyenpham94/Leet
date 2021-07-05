public class main{
    
public static void main(String[] args) {
    int [] array = {1,1,1,1,0,1,1,1,1,1,};
    arrayLeet test = new arrayLeet();
    //test.findMaxConsecutiveOnes(array);
    
    twoSum test2 = new twoSum();
    int [] nums = {2,7,11,15};
    int target = 9;
    System.out.println("SumTwo: ");
    //test2.sumTwo(nums, target);

    System.out.println("find Even numbers: ");
    findNumbers test3 = new findNumbers();
    int [] array2 = {12,345,2,6,7896};
    //test3.findEvenNumbers(array2);

    sortedSquares test4 = new sortedSquares();
    System.out.println("find sorted squares: ");
    int [] array3 = {-4,-1,0,3,10};
    test4.sortedSquareArray(array3);
}

}