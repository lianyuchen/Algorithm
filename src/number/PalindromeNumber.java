package number;

/**
 * Created by lianyuchen on 18/1/2.
 */
public class PalindromeNumber {
    /**
     * Determine whether an integer is a palindrome. Do this without extra space.
     * 判断是否是回文数
     */
    public static void main(String[] args){

    }

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int copyX = x, res = 0;
        while(copyX != 0){
            res = res * 10 + copyX % 10;
            copyX /= 10;
        }
        return x == res;
    }
}
