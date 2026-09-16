/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        treeSum(root);

        List<Integer> list = new ArrayList<>();

        for (int x : map.keySet()) {
            if (map.get(x) == max) {
                list.add(x);
            }
        }

        int[] ans = new int[list.size()];

        int i = 0;
        for (int x : list) {
            ans[i++] = x;
        }

        return ans;
    }

    public int treeSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = treeSum(root.left);
        int right = treeSum(root.right);

        int sum = root.val + left + right;

        int count = 1;

        if (map.containsKey(sum)) {
            count = map.get(sum) + 1;
        }

        map.put(sum, count);

        if (count > max) {
            max = count;
        }

        return sum;
    }
}