# Minimum Depth of Binary Tree

I used recursion with if-else checks to find the shortest path to a leaf node. Base case: If node is null, return 0. If one child is null, recurse on the non-null child. If both exist, return the smaller depth plus 1.

Tracing Example:
Input: root = [3, 9, 20, null, null, 15, 7]

Call minDepth(3):
- Left child 9: both children null -> returns 1
- Right child 20: left is 15, right is 7 -> returns 2
- Node 3: left is 1, right is 2. Since 1 < 2, returns 1 + 1 = 2

Final output: 2

Time and space complexity
- Time: O(n) - we visit nodes until we find the nearest leaf.
- Space: O(n) - call stack space for recursion.