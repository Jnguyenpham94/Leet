package Recursive;

public class ReverseString {

    public void helper(char[] s, int left, int right) {
        if (left >= right)
            return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        helper(s, left, right);
    }

    /**
     * recursively done
     * 
     * @param s a string to be outputted in reverse 
     * s = h e l l o 
     * s = o l l e h
     */
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
}
