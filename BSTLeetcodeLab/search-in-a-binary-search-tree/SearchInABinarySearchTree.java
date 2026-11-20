public class SearchInABinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            if (val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        SearchInABinarySearchTree solution = new SearchInABinarySearchTree();

        // cобираем дерево [4, 2, 7, 1, 3]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode found = solution.searchBST(root, 2);
        System.out.println("Search 2: " + (found != null ? found.val : "null"));

        TreeNode notFound = solution.searchBST(root, 5);
        System.out.println("Search 5: " + (notFound != null ? notFound.val : "null"));
}