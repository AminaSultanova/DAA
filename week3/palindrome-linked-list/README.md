# Palindrome Linked List

1. Problem
   Check if a linked list reads the same forward and backward.

2. Approach
1. Find middle of list using slow and fast pointers.
2. Reverse the second half of the list.
3. Compare first half and reversed second half node by node.

Tracing Example:
Input: 1 -> 2 -> 2 -> 1
- Middle: slow stops at second 2.
- Reverse second half: 2 -> 1 becomes 1 -> 2.
- Compare: first half (1 -> 2) matches second half (1 -> 2).

Result: true

Challenges Faced:
Copying values to an ArrayList was easy, but used O(n) extra space. Reversing in-place keeps space at O(1).

3. Time & Space Complexity
- Time Complexity: O(n) — we traverse the list a few times.
- Space Complexity: O(1) — modified in-place without extra list.

4. Reflection / Improvement
   Time and space complexities are optimal.