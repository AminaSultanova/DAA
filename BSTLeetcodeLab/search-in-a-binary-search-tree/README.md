# 700. Search in a Binary Search Tree

## Problem
Given the root of a Binary Search Tree (BST) and an integer val, find the node with value val and return the subtree rooted at that node. If the node does not exist, return null.

We use the core property of a BST: all values in the left subtree are less than the node, and all values in the right subtree are greater.
Instead of checking every node, we compare val with the current node at each step:
1. If val == root.val - target found, return the current node.
2. If val < root.val - go left (root.left).
3. If val > root.val - go right (root.right).
4. If we reach null - the value is not in the tree, return null.
This is standard binary search applied to a tree.

## Complexity
* Time: O(H)
* Space: O(1)