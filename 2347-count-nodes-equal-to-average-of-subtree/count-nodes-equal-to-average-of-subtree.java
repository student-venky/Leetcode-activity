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
    int cnt=0;
    public int averageOfSubtree(TreeNode root) {
        if(root==null){
            return 0;
        }
        findcount(root);
        return cnt;
    }
    public int findcount(TreeNode root){
        if(root==null){
            return 0;
        }
        int prev=root.val;
        root.val=root.val+findcount(root.left)+findcount(root.right);
        if(root.val/numbers(root)==prev){
            cnt+=1;
        }
        return root.val;
    }
    public int numbers(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+numbers(root.left)+numbers(root.right);
    }
}