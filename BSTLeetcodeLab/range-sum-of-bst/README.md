## 938. Range Sum of BST

## Problem
Given the root of a Binary Search Tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range from low to high.


Instead of checking every single node in the tree, we use the Binary Search Tree rules to skip unnecessary branches:
1. If the current node is null, return 0.
2. If the node value is less than low, everything in its left subtree is also too small. We skip the left side and only check the right subtree.
3. If the node value is greater than high, everything in its right subtree is too large. We skip the right side and only check the left subtree.
4. If the node value is within the range, we take its value and add the results from both the left and right subtrees.

## Complexity
Time: O(N) in the worst case if all nodes fall inside the range
Space: O(H) where H is the height of the tree due to the recursion call stack (O(log N) for a balanced tree, O(N) for a skewed tree).