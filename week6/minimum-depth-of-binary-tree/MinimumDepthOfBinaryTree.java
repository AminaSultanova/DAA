class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return minDepth(root.right) + 1;
        }

        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left < right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }
}