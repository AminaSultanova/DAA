## 108. Convert Sorted Array to Binary Search Tree

## Problem
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

To make the binary search tree height-balanced, both subtrees of every node need to have roughly the same number of elements. Since the array is already sorted, the best choice for the root is always the middle element:
1. Find the middle index of the current array segment and create a root node with that value.
2. Recursively build the left subtree using the left half of the segment (from left to mid - 1).
3. Recursively build the right subtree using the right half of the segment (from mid + 1 to right).
4. If the left pointer passes the right pointer (left > right), return null.

## Complexity
Time: O(N) because we visit every element in the array once to create a tree node.
Space: O(log N) for the recursion call stack