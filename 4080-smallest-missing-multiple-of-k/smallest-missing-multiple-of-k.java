class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean arr[] = new boolean[101];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                int m = nums[i] / k;
                arr[m] = true;
            }
        }
        int ans=0;
        for (int i = 1; i <= 100; i++) {
            if (arr[i] == false) {
                ans = i;
                return k * ans;
            }
        }
        return k * 101;
    }
}