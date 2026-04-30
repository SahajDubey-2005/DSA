import java.util.*;
public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int first = nums[i];
            int second = target-first;

            if(map.containsKey(second)) {
                return new int[]{map.get(second), i};
            }
            map.put(first,i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String args[]) {
        TwoSum_1 obj = new TwoSum_1();
        int nums[] = {2,7,8,11,15};
        int target = 10;
        int result[] = obj.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
}
}