import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findFinalValue(int[] nums, int original) {

        Set<Integer> set = new HashSet<>();

        // Store all elements in the HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Keep doubling until original is not found
        while (set.contains(original)) {
            original = original * 2;
        }

        return original;
    }
}
