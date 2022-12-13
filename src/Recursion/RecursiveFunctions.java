package Recursion;

public class RecursiveFunctions {
    public int calculateExponent(int number, int power) {
        if(power == 0)
            return 1;
        return number * calculateExponent(number, power-1);
    }

    public String reverseString(String str) {
        if(str.equals(""))
            return "";
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
