public class BinarySearch {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // round down (eliminates integer overflow)
			if (nums[mid] == target)
				return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return -1;
    }

    public int search2(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low + 1) / 2; // round up (eliminates integer overflow)
			if (nums[mid] == target)
				return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return -1;
    }

    public int search3(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // round down (eliminates integer overflow)
			if (nums[mid] == target)
				return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return -1;
    }

    public int search4(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while (low < high) { // notice we do not compare element at mid with our target
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target)
                high = mid;
            else
                low = mid + 1;
        }
        
		 /* at this point our search space has shrinked to 
		only one element if current element is the target element
		then return its index else we can safely assume that element was not found*/
		
        return nums[low] == target ? low : -1; // low == high
    }

    public int search5(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while (low < high) { // notice we do not compare element at mid with our target
            int mid = low + (high - low + 1) / 2;
            if (nums[mid] <= target)
                low = mid;
            else
                high = mid - 1;
        }
		
        /* at this point our search space has shrinked to 
		only one element if current element is the target element
		then return its index else we can safely assume that element was not found*/
		
		return nums[low] == target ? low : -1;  // low == high
    }
}
