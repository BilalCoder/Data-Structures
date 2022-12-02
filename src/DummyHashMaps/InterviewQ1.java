package DummyHashMaps;


// Get the first non repeating character from the string

import java.util.HashMap;
import java.util.Map;

public class InterviewQ1 {

    public static void main(String[] args) {
        findFirstNonRepeatingCharacter("a green apple");
        findFirstNonRepeatingCharacter("aabbccdd");
    }

    public static void findFirstNonRepeatingCharacter(String string) {
        char[] charArray = string.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i)))
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
            else
                map.put(string.charAt(i), 1);
        }
        for (char c : charArray) {
            if (map.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("No non repeating character found");
    }
}
