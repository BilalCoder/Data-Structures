package hashMaps;

import java.util.HashSet;
import java.util.Set;

public class InterviewQ2 {
    public static void main(String[] args) {
        System.out.println(findFirstRepeatedChar("green apple"));
        System.out.println(findFirstRepeatedChar(""));
        System.out.println(findFirstRepeatedChar("a dog is an animal"));
        System.out.println(findFirstRepeatedChar("aabbcc"));
        System.out.println(findFirstRepeatedChar("abcdef"));
    }
    public static char findFirstRepeatedChar(String st) {
        Set<Character> set = new HashSet<>();
        for(char c : st.toCharArray()) {
            if(set.contains(c))
                return c;
            set.add(c);
        }
        return Character.MIN_VALUE;
    }
}
