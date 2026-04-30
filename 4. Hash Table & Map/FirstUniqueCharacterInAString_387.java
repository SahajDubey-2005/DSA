import java.util.*;

public class FirstUniqueCharacterInAString_387 {

    public int firstUniqChar(String s) {
        Map<Character, Integer> counts = new HashMap<>();

        // Step 1: count frequency
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Step 2: find first unique
        for (int i = 0; i < s.length(); i++) {
            if (counts.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString_387 obj =
            new FirstUniqueCharacterInAString_387();

        String s = "leetcode";   // test input
        int result = obj.firstUniqChar(s);

        System.out.println("Answer: " + result);
    }
}