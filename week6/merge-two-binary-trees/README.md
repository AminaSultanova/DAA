# Merge Two Binary Trees

I used recursion to merge two binary trees node by node. Base case: If one node is null, return the other node. If both nodes exist, sum their values, then recursively merge their left and right children.

Tracing Example:
Input: root1 = [1, 3, 2, 5], root2 = [2, 1, 3, null, 4, null, 7]

Call mergeTrees(1, 2):
- Merged node value = 1 + 2 = 3
- Merge left: mergeTrees(3, 1) -> value = 3 + 1 = 4
  - Merge left: mergeTrees(5, null) -> returns 5
  - Merge right: mergeTrees(null, 4) -> returns 4
- Merge right: mergeTrees(2, 3) -> value = 2 + 3 = 5
  - Merge right: mergeTrees(null, 7) -> returns 7

Final output tree: [3, 4, 5, 5, 4, null, 7]

Time and space complexity
- Time: O(min(n, m)) - we only visit nodes that exist in both trees.
- Space: O(min(n, m)) - stack space used for recursion depth.