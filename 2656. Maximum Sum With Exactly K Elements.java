class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();

        return (max * 2 + k - 1) * k / 2;
    }
}