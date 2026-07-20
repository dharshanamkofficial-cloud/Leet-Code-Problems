class Solution {
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < digits.length; i++)
            for (int j = 0; j < digits.length; j++)
                for (int k = 0; k < digits.length; k++)
                    if (i != j && j != k && i != k &&
                        digits[i] != 0 && digits[k] % 2 == 0)
                        set.add(digits[i] * 100 + digits[j] * 10 + digits[k]);

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
