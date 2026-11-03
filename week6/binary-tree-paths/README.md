# Binary Tree Paths

I used recursion to traverse the tree and build path strings. Base case: If node is null, return. Append current node value to path string using arrow notation. If node is a leaf, add path to result list.

Tracing Example:
Input: root = [1, 2, 3, null, 5]

Call helper(1, ""):
- Path becomes "1"
- Go left to node 2:
  - Path becomes "1->2"
  - Go right to node 5:
    - Path becomes "1->2->5" (leaf node) -> add "1->2->5" to result
- Go right to node 3:
  - Path becomes "1->3" (leaf node) -> add "1->3" to result

Final output: ["1->2->5", "1->3"]

Time and space complexity
- Time: O(n) - we visit every node in the tree once.
- Space: O(n) - stack space used for recursion.