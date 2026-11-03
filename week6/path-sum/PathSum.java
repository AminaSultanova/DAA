class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                return true;
            } else {
                return false;
            }
        }

        int remainingSum = targetSum - root.val;
        boolean leftResult = hasPathSum(root.left, remainingSum);
        boolean rightResult = hasPathSum(root.right, remainingSum);

        if (leftResult || rightResult) {
            return true;
        } else {
            return false;
        }
    }
}