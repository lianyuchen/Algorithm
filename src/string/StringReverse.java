package string;

import java.util.Stack;

/**
 * Created by lianyuchen on 18/1/11.
 */
public class StringReverse {


    /**
     * 采用数组方式，顺序遍历
     * @param str
     * @return
     */
    public static String stringReverseByArray(String str){
        if (null == str) return null;
        int len = str.length();
        char[] chars = new char[len];
        for (int i = 0; i < len / 2;  i++){
            chars[i] = str.charAt(len -1 -i);
            chars[len -1 -i] = str.charAt(i);
        }
        return new String(chars);
    }
    /**
     * 采用数组的方式,逆序遍历
     * @param str
     * @return
     */
    public static String stringReverseByArrayTwo(String str){
        if (str == null) return null;
        int len = str.length();
        char[] chars = new char[len];
        for (int i = len - 1; i >= 0; i--){
            chars[len - 1 - i] = str.charAt(i);
        }
        return new String(chars);
    }

    /**
     * 采用栈的方式
     * @param str
     * @return
     */
    public static String stringReverseByStack(String str){
        if (str == null) return null;
        int len = str.length();
        Stack<Character> stack = new Stack<>();
        char[] chars = new char[len];
        for (int i= 0; i < len; i++){
            stack.push(str.charAt(i));
        }
        for (int i= 0; i < len; i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args){

        String str = "abcde456";

        System.out.println(StringReverse.stringReverseByArray(str));

        System.out.println(StringReverse.stringReverseByArrayTwo(str));

        System.out.println(StringReverse.stringReverseByStack(str));
    }
}
