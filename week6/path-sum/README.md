# Path Sum

I used recursion to check if any root to leaf path equals targetSum. Base case: If node is null return false. If node is a leaf check if remaining sum equals node value. Otherwise subtract current node value and check left or right children.

Tracing Example:
Input: root = [5, 4, 8, 11, null, 13, 4, 7, 2], targetSum = 22

Call hasPathSum(5, 22):
- Subtract 5: remaining = 17
- Check left node 4 with target 17:
  - Subtract 4: remaining = 13
  - Check left node 11 with target 13:
    - Subtract 11: remaining = 2
    - Check left node 7 (remaining 2): leaf node, 7 != 2 -> false
    - Check right node 2 (remaining 2): leaf node, 2 == 2 -> true

Final output: true

Time and space complexity
- Time: O(n) - we visit every node in the worst case.
- Space: O(n) - recursion stack space.