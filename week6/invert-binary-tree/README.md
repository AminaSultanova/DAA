# Invert Binary Tree

I used a simple recursive DFS approach. Base case: If current node is null, return null. Swap the left and right children using a temporary variable, then recursively invert both left and right subtrees.

Tracing Example:
Input: root = [4, 2, 7]

Call invertTree(4):
- Swap left child (2) and right child (7) -> tree becomes [4, 7, 2]
- Call invertTree(7): children are null -> returns 7
- Call invertTree(2): children are null -> returns 2

Final output: [4, 7, 2]

Time and space complexity
- Time: O(n) - we visit every node in the tree once.
- Space: O(n) - stack space used for recursion (O(n) in worst case for a skewed tree).