# Binary Tree Preorder Traversal

I used a simple recursive helper method. Base case: If current node is null, stop recursion. Add current node value to result list first, then recursively visit the left child, and finally visit the right child.

Tracing Example:
Input: root = [1, null, 2, 3]

Call helper(1):
- Add 1: result = [1]
- Go left from 1: null
- Go right to node 2:
  - Add 2: result = [1, 2]
  - Go left to node 3:
    - Add 3: result = [1, 2, 3]
    - Go left from 3: null
    - Go right from 3: null
  - Go right from 2: null

Final output: [1, 2, 3]

Time and space complexity
- Time: O(n) - we visit every node in the tree once.
- Space: O(n) - stack space used for recursion (O(n) in worst case for a skewed tree).