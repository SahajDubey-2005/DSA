import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public int lengthOfLongestSubstring(String s) {
        int res = 0, left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if(map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);
            res = Math.max(res, right - left + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters_3 obj =
            new LongestSubstringWithoutRepeatingCharacters_3();

        String s = "abcabcbb"; // test input

        int result = obj.lengthOfLongestSubstring(s);

        System.out.println("Answer: " + result);
    }
}