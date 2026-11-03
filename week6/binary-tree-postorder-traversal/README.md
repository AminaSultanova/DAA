# Binary Tree Postorder Traversal

I used a simple recursive helper method. Base case: If current node is null, stop recursion. Recursively visit the left child first, then recursively visit the right child, and finally add current node value to result list.

Tracing Example:
Input: root = [1, null, 2, 3]

Call helper(1):
- Go left from 1: null
- Go right to node 2:
  - Go left to node 3:
    - Go left from 3: null
    - Go right from 3: null
    - Add 3: result = [3]
  - Go right from 2: null
  - Add 2: result = [3, 2]
- Add 1: result = [3, 2, 1]

Final output: [3, 2, 1]

Time and space complexity
- Time: O(n) - we visit every node in the tree once.
- Space: O(n) - stack space used for recursion (O(n) in worst case for a skewed tree).