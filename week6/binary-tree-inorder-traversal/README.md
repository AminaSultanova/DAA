# Binary Tree Inorder Traversal

I used a simple recursive helper method. Base case: If current node is null, stop recursion. Recursively visit the left child. Add current node value to result list. Recursively visit the right child.

Tracing Example:
Input: root = [1, null, 2, 3] (1 has right child 2, node 2 has left child 3)

Call helper(1). Go left from 1: null. Add 1: result = [1]. Go right to node 2. Go left from 2 to node 3. Go left from 3: null. Add 3: result = [1, 3]. Go right from 3: nul. Add 2: result = [1, 3, 2]. Go right from 2: null

Final output: [1, 3, 2]

Time and space complexity
- Time: O(n) - we visit every node in the tree once.
- Space: O(n) - stack space used for recursion (O(n) in worst case for a skewed tree).