package number;

/**
 * Created by lianyuchen on 18/1/2.
 */
public class ReverseInteger {
    /**
     * Given a 32-bit signed integer, reverse digits of an integer.

     Example 1:

     Input: 123
     Output:  321
     Example 2:

     Input: -123
     Output: -321
     Example 3:

     Input: 120
     Output: 21
     Note:
     Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     */

    public static void main(String[] args){

    }

    public int reverse(int x) {
        long res= 0;
        for( ; x != 0; x /= 10){
            res = res * 10 + x % 10;
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}
