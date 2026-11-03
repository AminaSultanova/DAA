# Sum of Left Leaves

I used recursion to traverse the tree and identify left leaves. Base case: If node is null, return 0. If the left child exists and has no children, add its value to sum. Otherwise, recurse on both left and right subtrees.

Tracing Example:
Input: root = [3, 9, 20, null, null, 15, 7]

Call sumOfLeftLeaves(3):
- Left child 9 is a leaf -> add 9
- Right child 20 is not a leaf:
  - Left child 15 is a leaf -> add 15
  - Right child 7 is a leaf, but it is a right child -> ignore
  - Returns 15 for node 20
- Total sum = 9 + 15 = 24

Final output: 24

Time and space complexity
- Time: O(n) - we visit every node in the tree once.
- Space: O(n) - stack space used for recursion.