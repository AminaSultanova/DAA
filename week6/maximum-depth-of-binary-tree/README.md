# Maximum Depth of Binary Tree

I used a simple recursive DFS approach. Base case: If current node is null, return 0. Recursively find max depth of left and right subtrees, then return 1 + max(left, right).

Tracing Example:
Input: root = [3, 9, 20, null, null, 15, 7]

Call maxDepth(3):
- Left child 9: maxDepth(9) -> left is null (0), right is null (0) -> returns 1
- Right child 20:
    - Left child 15 -> returns 1
    - Right child 7 -> returns 1
    - Node 20 returns 1 + max(1, 1) = 2
- Node 3 returns 1 + max(1, 2) = 3

Final output: 3

Time and space complexity
- Time: O(n) - we visit every node in the tree once.
- Space: O(n) - stack space used for recursion (O(n) in worst case for a skewed tree).