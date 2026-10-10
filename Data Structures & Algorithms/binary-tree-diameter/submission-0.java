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

    private int best = 0;
    private TreeNode top = null;

    public int diameterOfBinaryTree(TreeNode root) {
        if (top == null) top = root;
        if(root == null){
            return 0;
        }

        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        best = Math.max(best, left + right);

        if ( root == top) return best;
        return 1 + Math.max(left, right);

    
    }
}
