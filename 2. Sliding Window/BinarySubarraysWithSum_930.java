import java.util.HashMap;

public class BinarySubarraysWithSum_930 {

    public static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        // base case: sum 0 ek baar aaya hai
        map.put(0, 1);

        for (int num : nums) {
            sum += num;

            // agar (sum - goal) pehle se exist karta hai
            if (map.containsKey(sum - goal)) {
                count += map.get(sum - goal);
            }

            // current sum store karo
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;

        System.out.println(numSubarraysWithSum(nums, goal)); // Output: 4
    }
}