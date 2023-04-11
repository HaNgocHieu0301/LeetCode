package Strings;

import java.lang.reflect.Array;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 132;
        System.out.println(reverse(132));
    }

    public static int reverse(int x) {
        int result = 0;
        int h = 10;
        while (x != 0) {
            int tmp = x % 10;
            if(result > Integer.MAX_VALUE /10 || result < Integer.MIN_VALUE/10){
                return 0;
            }
            result = result*h + tmp;
            x /= 10;
        }
        return result;
    }
}
