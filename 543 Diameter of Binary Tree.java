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
    int maxDiam = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiam;
        
    }
    private int maxDepth(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);
        maxDiam = Math.max(maxDiam, (left + right));
        return Math.max(left, right);
    }
    
}